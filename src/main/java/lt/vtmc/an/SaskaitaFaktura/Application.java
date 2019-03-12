package lt.vtmc.an.SaskaitaFaktura;

import lt.vtmc.an.SaskaitaFaktura.model.Invoice;
import lt.vtmc.an.SaskaitaFaktura.model.Item;
import lt.vtmc.an.SaskaitaFaktura.repository.InvoiceRepository;
import lt.vtmc.an.SaskaitaFaktura.repository.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.Date;

@EnableSwagger2
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Bean
    public Docket api() {


        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("VTMC AN REST Documentation for InvoiceExercise")
                .version("0.0.1-SNAPSHOT")
                .build();
    }

    @Bean
    public CommandLineRunner demo(InvoiceRepository invoiceRepository, ItemRepository itemRepository) {
        return (args) -> {
            // make entries to database
            Invoice senukai = new Invoice("Senukai", "VTMC", "8489--5", new Date(2019 - 02 - 1));
            Invoice katpedele = new Invoice("Katpedele", "VTMC", "AC5564658", new Date(2019 - 03 - 01));
            Invoice vilpra = new Invoice("Vilpra", "VTMC", "00115", new Date(2019 - 02 - 02));

            Item kastuvas = new Item("kastuvas", 16, 17.88);
            Item muiline = new Item("muiline", 10, 6.00);
            Item pjuklelis = new Item("pjuklelis", 3, 9.09);
           Item krapstukai = new Item("krapstukai", 123, 1.99);
            Invoice sigmute = new Invoice("Sigmute", "VTMC", "116565", new Date(2019 - 03 - 06), kastuvas);

       vilpra.setItem(krapstukai);
            invoiceRepository.save(vilpra);
            invoiceRepository.save(senukai);
            invoiceRepository.save(sigmute);
            invoiceRepository.save(katpedele);

            pjuklelis.setInvoice(vilpra);

            itemRepository.save(pjuklelis);
            itemRepository.save(krapstukai);
            itemRepository.save(muiline);
            itemRepository.save(kastuvas);
        };
    }


}
