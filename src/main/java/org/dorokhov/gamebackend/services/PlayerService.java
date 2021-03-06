package org.dorokhov.gamebackend.services;

import org.dorokhov.gamebackend.entities.Player;

import java.math.BigInteger;
import java.util.List;

public interface PlayerService {

    Player addPlayer(Player player);
    void deletePlayerById(BigInteger id);
    void updatePlayer(Player player);
    List<Player> gelAllPlayers();

}
