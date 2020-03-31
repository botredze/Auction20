package kg.megacom.Auction.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "lots")
public class Lots {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "lot_id")
    private  Long id;

    private String name;
    private double maxPrice;
    private double minPrice;
    private double step;

    private LocalDate start_Date;
    private LocalDate endDate;


    @ManyToOne
    @JoinColumn(name = "status_id")
    private Statuses statuses;

}
