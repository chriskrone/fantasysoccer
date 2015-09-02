package com.chriskrone.fantasysoccerweb.db.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "roster")
public class Roster {
  
  @Id
  @Column(name = "roster_id")
  @GeneratedValue(generator = "increment")
  @GenericGenerator(name = "increment", strategy = "increment")
  private Long id;

  @Column(name = "manager_id")
  @JoinColumn(name = "manager_id")
  private Manager manager;
  
  @Column(name = "league_id")
  @JoinColumn(name = "league_id")
  private League league;
  
  @ManyToMany
  @JoinTable(name = "roster_player", joinColumns = {@JoinColumn(name = "roster_id",
      nullable = false, updatable = true)}, inverseJoinColumns = {@JoinColumn(name = "player_id",
      nullable = false, updatable = true)})
  private Set<Player> players;

}
