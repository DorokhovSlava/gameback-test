package org.dorokhov.gamebackend.entities;


import lombok.Data;
import javax.persistence.*;
import java.math.BigInteger;

@Data
@Entity
@Table(name = "player")
public class Player {

    @Id
    @Column(name = "id")
    private BigInteger id;
    @Column(name = "name")
    private String name;
}
