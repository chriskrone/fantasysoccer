package com.chriskrone.fantasysoccerweb.db.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "gameweek_score")
public class GameweekScore {
  
  @Id
  @Column(name = "gameweek_score_id")
  @GeneratedValue(generator = "increment")
  @GenericGenerator(name = "increment", strategy = "increment")
  private Long id;
  
  @ManyToOne
  @JoinColumn(name = "manager_id")
  private Manager manager;
  
  @ManyToOne
  @JoinColumn(name = "league_id")
  private League league;
  
  @Column(name = "score", nullable = false, updatable = true)
  private Integer score;
  
  @Column(name = "finalized", nullable = false, updatable = true)
  private Boolean finalized;
  
}
