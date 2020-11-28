package org.dorokhov.gamebackend.controllers;


import org.dorokhov.gamebackend.entities.Player;
import org.dorokhov.gamebackend.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
public class PlayerController {

    private final PlayerRepository playerRepository;
    @Autowired
    public PlayerController( PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;

    }

    @RequestMapping(value = "/add/player", method = RequestMethod.POST)
    public Player addPlayer(@RequestBody Player player){
        return playerRepository.saveAndFlush(player);
    }

    @RequestMapping(value = "/all/players", method = RequestMethod.GET)
    public List<Player> allPlayer(){
        return playerRepository.findAll();
    }

    @RequestMapping(value = "/delete/player/{id}", method = RequestMethod.DELETE)
    public void deletePlayerById (@PathVariable(value = "id") BigInteger id){
        playerRepository.deleteById(id);
    }

    @RequestMapping(value = "updale/player", method = RequestMethod.PUT)
    public Player updatePlayer(@RequestBody Player player){
        playerRepository.saveAndFlush(player);
        return player;
    }



}
