package com.pl.player_zone.player;


import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/player")
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public List<Player> getPlayers(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String position
    ) {
        if (name != null && position != null) {
            return playerService.findByNameAndPosition(name, position);
        } else if (name != null) {
            return List.of(playerService.searchPlayerByExactName(name));
        } else if (position != null) {
            return playerService.getPlayersByPosition(position);
        } else {
            return playerService.getAllPlayers();
        }

    }

    @PostMapping
    public ResponseEntity<Player> createPlayer(@RequestBody Player player) {
        Player savedPlayer = playerService.addPlayer(player);
        return new ResponseEntity<>(savedPlayer, HttpStatus.CREATED);
    }

    @PutMapping("/update-ratings/{name}")
    public ResponseEntity<Player> updatedPlayer(@PathVariable String name, @RequestBody Player player) {
        try {
            Player updatedPlayer = playerService.updatePlayerByName(name, player);
             return new ResponseEntity<>(updatedPlayer,HttpStatus.OK); // 200 OK
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }


    }

    @DeleteMapping("/{playername}")
    public ResponseEntity<String> deletePlayer(@PathVariable String playerName){
        try {
            playerService.deletePlayerByName(playerName);
            return new ResponseEntity<>("Player deleted successfully", HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>("Player not found", HttpStatus.NOT_FOUND);
        }

    }








    }
