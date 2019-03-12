package lt.vtmc.an.SaskaitaFaktura.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Data
@NoArgsConstructor
@Entity
public class Invoice {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @JoinColumn
    private Long id;
    private String issuingCompany;
    private String recipient;
    private String number;
    @Temporal(TemporalType.DATE)
    private Date dateIssued;
    @OneToOne(mappedBy = "invoice", cascade = CascadeType.ALL)
    private Item item;

    public Invoice(String issuingCompany, String recipient, String number, Date dateIssued) {
        this.number = number;
        this.dateIssued = dateIssued;
        this.issuingCompany = issuingCompany;
        this.recipient = recipient;

    }

    public Invoice(String issuingCompany, String recipient, String number, Date dateIssued, Item invoiceItem) {
        this.number = number;
        this.dateIssued = dateIssued;
        this.issuingCompany = issuingCompany;
        this.recipient = recipient;
            this.item=item;
        }
    }