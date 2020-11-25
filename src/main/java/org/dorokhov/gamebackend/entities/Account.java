package org.dorokhov.gamebackend.entities;

import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


@Data
@Entity
@Table(name = "account_table")
public class Account {

    @javax.persistence.Id
    @GeneratedValue
    @Column(name = "account_id")
    private BigInteger accId;
    @Column(name = "account_login")
    private String accLogin;
    @Column(name = "account_password")
    private String accPassword;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "player_id")
    private List<Player> playerList = new ArrayList<>();
}
