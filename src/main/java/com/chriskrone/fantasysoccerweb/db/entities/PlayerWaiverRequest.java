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
@Table(name = "player_waiver_request")
public class PlayerWaiverRequest {
  
  @Id
  @Column(name = "club_id")
  @GeneratedValue(generator = "increment")
  @GenericGenerator(name = "increment", strategy = "increment")
  private Long id;
  
  @ManyToOne
  @Column (name = "waiver_request_id")
  @JoinColumn (name = "waiver_request_id")
  private WaiverRequest waiverRequest;
  
  @Column(name = "order")
  private Integer order;
  
  @Column (name = "player_id")
  private Player player;

}
