package lt.vtmc.an.SaskaitaFaktura.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor

public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    private String name;
    private int quantity;
    private double price;

      @OneToOne(mappedBy="item")
      @JsonIgnore
      private Invoice invoice;


    public Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }


}

