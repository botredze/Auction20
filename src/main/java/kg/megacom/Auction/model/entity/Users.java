package kg.megacom.Auction.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")

    private Long id;
    private String name;
    private String login;
    private String password;
    private boolean is_active;

}
