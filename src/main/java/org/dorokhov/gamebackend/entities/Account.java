package org.dorokhov.gamebackend.entities;

import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private BigInteger id;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id", unique = true,nullable = false)
    private Player player;
}
