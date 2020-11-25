package org.dorokhov.gamebackend.entities;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import java.math.BigInteger;

@Data
@Entity
@Table(name = "player")
public class Player {

    @javax.persistence.Id
    @GeneratedValue
    @Column(name = "player_id")
    private BigInteger player_id;
    @Column(name = "player_name")
    private String player_name;



}
