package com.chriskrone.fantasysoccerweb.db.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "player_drop")
public class PlayerDrop {
  
  @Id
  @Column(name = "player_drop_id")
  @GeneratedValue(generator = "increment")
  @GenericGenerator(name = "increment", strategy = "increment")
  private Long id;

  @Column(name = "waiver_week_id")
  @JoinColumn(name = "waiver_week_id")
  private WaiverWeek waiverWeek;

  @Column(name = "waiver_claim_id")
  @JoinColumn(name = "waiver_claim_id")
  private WaiverClaim waiverClaim;

  @Column(name = "player_id")
  @JoinColumn(name = "player_id")
  private Player player;

}
