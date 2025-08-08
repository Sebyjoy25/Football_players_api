package com.pl.player_zone.player;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Long> {

    void deleteByPlayerName(String playerName);

    Optional<Player> findByPlayerNameIgnoreCase(String playerName);

    List<Player> findByPlayerNameContainingIgnoreCaseAndPositionIgnoreCase(String name, String position);

    List<Player> findAllByOverallRating(Integer overallRating);

    List<Player> findByPositionIgnoreCase(String position);



}
