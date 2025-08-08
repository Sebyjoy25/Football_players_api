package com.pl.player_zone.player;


import jakarta.persistence.*;

@Entity
@Table(name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "player_name", nullable = false)
    private String playerName;

    @Column(name = "position")
    private String position;

    @Column(name = "overall_rating")
    private Integer overallRating;

    @Column(name = "pace_rating")
    private Integer paceRating;

    @Column(name = "shoot_rating")
    private Integer shootRating;

    @Column(name = "pass_rating")
    private Integer passRating;

    @Column(name = "drib_rating")
    private Integer dribRating;

    @Column(name = "defense_rating")
    private Integer defenseRating;

    @Column(name = "physical_rating")
    private Integer physicalRating;

    public Player() {
    }

    public Player(Long id, String playerName, String position, Integer overallRating, Integer paceRating, Integer shootRating, Integer passRating, Integer dribRating, Integer defenseRating, Integer physicalRating) {
        this.id = id;
        this.playerName = playerName;
        this.position = position;
        this.overallRating = overallRating;
        this.paceRating = paceRating;
        this.shootRating = shootRating;
        this.passRating = passRating;
        this.dribRating = dribRating;
        this.defenseRating = defenseRating;
        this.physicalRating = physicalRating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(Integer overallRating) {
        this.overallRating = overallRating;
    }

    public Integer getPaceRating() {
        return paceRating;
    }

    public void setPaceRating(Integer paceRating) {
        this.paceRating = paceRating;
    }

    public Integer getShootRating() {
        return shootRating;
    }

    public void setShootRating(Integer shootRating) {
        this.shootRating = shootRating;
    }

    public Integer getPassRating() {
        return passRating;
    }

    public void setPassRating(Integer passRating) {
        this.passRating = passRating;
    }

    public Integer getDribRating() {
        return dribRating;
    }

    public void setDribRating(Integer dribRating) {
        this.dribRating = dribRating;
    }

    public Integer getDefenseRating() {
        return defenseRating;
    }

    public void setDefenseRating(Integer defenseRating) {
        this.defenseRating = defenseRating;
    }

    public Integer getPhysicalRating() {
        return physicalRating;
    }

    public void setPhysicalRating(Integer physicalRating) {
        this.physicalRating = physicalRating;
    }
}


