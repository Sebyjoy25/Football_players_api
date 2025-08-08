package com.pl.player_zone.player;


import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component

public class PlayerService {
    private final PlayerRepository playerRepository;


    @Autowired
    public PlayerService(PlayerRepository playerRepository){
        this.playerRepository =playerRepository;
    }

    public List<Player> getAllPlayers(){
        return playerRepository.findAll();
    }

    public List<Player> getPlayersByOvrRating(Integer ovrRating) {
        return playerRepository.findAllByOverallRating(ovrRating);
    }

    public Player searchPlayerByExactName(String name) {
        return playerRepository.findByPlayerNameIgnoreCase(name)
                .orElseThrow(() -> new EntityNotFoundException("Player not found with name: " + name));
    }

    public List<Player> getPlayersByPosition(String position) {
        return playerRepository.findByPositionIgnoreCase(position);
    }


    public Player addPlayer(Player player) {
        playerRepository.save(player);
        return player;
    }

    public List<Player> findByNameAndPosition(String name, String position) {
        return playerRepository.findByPlayerNameContainingIgnoreCaseAndPositionIgnoreCase(name, position);
    }




    public Player updatePlayerByName(String name, Player player) {
        Player existingPlayer = playerRepository.findByPlayerNameIgnoreCase(name)
                .orElseThrow(() -> new EntityNotFoundException("Player not found with name: " + name));

        // Update fields
        existingPlayer.setPosition(player.getPosition());
        existingPlayer.setOverallRating(player.getOverallRating());
        existingPlayer.setPaceRating(player.getPaceRating());
        existingPlayer.setShootRating(player.getShootRating());
        existingPlayer.setPassRating(player.getPassRating());
        existingPlayer.setDribRating(player.getDribRating());
        existingPlayer.setDefenseRating(player.getDefenseRating());
        existingPlayer.setPhysicalRating(player.getPhysicalRating());


        return playerRepository.save(existingPlayer);
    }





    @Transactional
    public void deletePlayerByName(String name) {
      Player player = playerRepository. findByPlayerNameIgnoreCase(name)
                .orElseThrow(() -> new EntityNotFoundException("Player not found with name: " + name));

        playerRepository.delete(player);
    }









    }




