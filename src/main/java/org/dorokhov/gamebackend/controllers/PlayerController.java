package org.dorokhov.gamebackend.controllers;

import org.dorokhov.gamebackend.entities.Player;
import org.dorokhov.gamebackend.services.impl.PlayerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.math.BigInteger;
import java.util.List;

@RestController
public class PlayerController {

    private final PlayerServiceImpl playerService;

    @Autowired
    public PlayerController(PlayerServiceImpl playerService) {
        this.playerService = playerService;
    }

    @RequestMapping(value = "/add/player", method = RequestMethod.POST)
    public Player addPlayer(@RequestBody Player player) {
        return playerService.addPlayer(player);
    }

    @RequestMapping(value = "/all/players", method = RequestMethod.GET)
    public List<Player> allPlayer() {
        return playerService.gelAllPlayers();
    }

    @RequestMapping(value = "/delete/player/{id}", method = RequestMethod.DELETE)
    public void deletePlayerById(@PathVariable(value = "id") BigInteger id) {
        playerService.deletePlayerById(id);
    }

    @RequestMapping(value = "updale/player", method = RequestMethod.PUT)
    public void updatePlayer(@RequestBody Player player) { playerService.updatePlayer(player);}

}