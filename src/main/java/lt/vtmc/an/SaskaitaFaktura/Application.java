package lt.vtmc.an.SaskaitaFaktura;

import lt.vtmc.an.SaskaitaFaktura.model.Invoice;
import lt.vtmc.an.SaskaitaFaktura.repository.InvoiceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Bean
	public CommandLineRunner demo(InvoiceRepository invoiceRepository) {
		return (args) -> {
			// make entries to database
			invoiceRepository.save(new Invoice("Senukai", "VTMC", "8489--5", new Date(2019-02-1)));
			invoiceRepository.save(new Invoice("Katpedele",  "VTMC", "AC5564658", new Date(2019-03-01)));
			invoiceRepository.save(new Invoice("Sigmute", "VTMC", "116565",new Date(2019-03-06)));
			invoiceRepository.save(new Invoice("Vilpra", "VTMC","00115", new Date(2019-02-02)));
		};
	}

}
