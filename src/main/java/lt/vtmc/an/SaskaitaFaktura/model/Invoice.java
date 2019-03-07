package lt.vtmc.an.SaskaitaFaktura.model;

import io.swagger.annotations.Api;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
public class Invoice {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String issuingCompany;
    private String recipient;
    private String number;
    private Date dateIssued;
    //private Collection<?> items;

    public Invoice(String issuingCompany, String recipient, String number, Date dateIssued) {
        this.number = number;
        this.dateIssued = dateIssued;
        this.issuingCompany = issuingCompany;
        this.recipient = recipient;
    }


}
