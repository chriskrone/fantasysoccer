package com.chriskrone.fantasysoccerweb.db.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "waiver_claim")
public class WaiverClaim {
  
  @Id
  @Column(name = "waiver_claim_id")
  @GeneratedValue(generator = "increment")
  @GenericGenerator(name = "increment", strategy = "increment")
  private Long id;
  
  @Column(name = "waiver_week_id")
  private WaiverWeek waiverWeek;
  
  @Column(name = "manager_id")
  private Manager manager;

  @Column(name = "waiver_request_id")
  @JoinColumn(name = "waiver_request_id")
  private WaiverRequest waiverRequest;
  
  @OneToMany
  private Set<PlayerClaim> playerClaims;
  
  @OneToMany
  private Set<PlayerDrop> playerDrops;

  
}
