package lt.vtmc.an.SaskaitaFaktura.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Collection;
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
    //private Collection<Item> items = new ArrayList<>();

    public Invoice(String issuingCompany, String recipient, String number, Date dateIssued) {
        this.number = number;
        this.dateIssued = dateIssued;
        this.issuingCompany = issuingCompany;
        this.recipient = recipient;
    }


}
