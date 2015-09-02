package com.chriskrone.fantasysoccerweb.db.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "gameweek")
public class Gameweek {
  
  @Id
  @Column(name = "gameweek_id")
  @GeneratedValue(generator = "increment")
  @GenericGenerator(name = "increment", strategy = "increment")
  Long id;
  
  @ManyToOne
  @JoinColumn(name = "league_id")
  private League league;
  
  @Column(name = "gameweek_number")
  private Integer gameweekNumber;
  
  @OneToMany
  private Set<GameweekRoster> rosters;

}
