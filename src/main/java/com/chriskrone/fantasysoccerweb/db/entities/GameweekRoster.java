package com.chriskrone.fantasysoccerweb.db.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "gameweek_roster")
public class GameweekRoster {

  @ManyToMany
  @JoinTable(name = "manager_gameweek_roster", joinColumns = {@JoinColumn(name = "roster_id",
      nullable = false, updatable = false)}, inverseJoinColumns = {@JoinColumn(name = "manager_id",
      nullable = false, updatable = false)})
  private Manager manager;

  @ManyToOne
  @JoinColumn(name = "gameweek_id")
  private Gameweek gameweek;

  @ManyToMany
  @JoinTable(name = "gameweek_roster_player", joinColumns = {@JoinColumn(name = "roster_id",
      nullable = false, updatable = true)}, inverseJoinColumns = {@JoinColumn(name = "player_id",
      nullable = false, updatable = false)})
  private Set<Player> players;



}
