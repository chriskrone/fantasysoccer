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
@Table(name = "waiver_request")
public class WaiverRequest {
  
  @Id
  @Column(name = "waiver_request_id")
  @GeneratedValue(generator = "increment")
  @GenericGenerator(name = "increment", strategy = "increment")
  private Long id;
  
  @OneToMany
  private Set<PlayerWaiverRequest> playerWaiverRequests;
  
  @Column(name = "waiver_claim_id")
  @JoinColumn(name = "waiver_claim_id")
  private WaiverClaim waiverClaim;

}
