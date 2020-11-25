package org.dorokhov.gamebackend.repository;

import org.dorokhov.gamebackend.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface PlayerRepository extends JpaRepository<Player, BigInteger> {


}
