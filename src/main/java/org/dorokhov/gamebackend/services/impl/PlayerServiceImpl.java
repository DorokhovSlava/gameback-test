package org.dorokhov.gamebackend.services.impl;

import org.dorokhov.gamebackend.entities.Player;
import org.dorokhov.gamebackend.repository.PlayerRepository;
import org.dorokhov.gamebackend.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerServiceImpl(PlayerRepository repository) {
        this.playerRepository = repository;
    }

    @Override
    public Player addPlayer(Player player) {
            playerRepository.saveAndFlush(player);
        return player;
    }

    @Override
    public void deletePlayerById(BigInteger id) {
        playerRepository.deleteById(id);
    }

    @Override
    public void updatePlayer(Player player) {
        playerRepository.save(player);
    }

    @Override
    public List<Player> gelAllPlayers() {
        return playerRepository.findAll();
    }
}
