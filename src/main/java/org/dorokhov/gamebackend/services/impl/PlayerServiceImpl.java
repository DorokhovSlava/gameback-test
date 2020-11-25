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
        Player playerAdd = playerRepository.saveAndFlush(player);
        return playerAdd;
    }

    @Override
    public void deletePlayerById(BigInteger player_Id) {
        playerRepository.deleteById(player_Id);
    }

    @Override
    public void updatePlayer(Player player) {
        playerRepository.saveAndFlush(player);
    }

    @Override
    public List<Player> gelAllPlayers() {
        return playerRepository.findAll();
    }
}
