package kg.megacom.Auction.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "bids")
public class Bids {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bids_id")

    private Long id;
    private LocalDate add_date;
    private double bidValue;

    private  boolean active;

    @ManyToOne
    @JoinColumn(name = "lot_id")
    private Lots lot;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private  Customer customer;
}
