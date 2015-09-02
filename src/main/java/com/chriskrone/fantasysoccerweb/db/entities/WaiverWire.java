package com.chriskrone.fantasysoccerweb.db.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "waiver_wire")
public class WaiverWire {
  
  @Id
  @Column(name = "waiver_wire_id")
  @GeneratedValue(generator = "increment")
  @GenericGenerator(name = "increment", strategy = "increment")
  private Long id;
  
  @Column(name = "league_id")
  private League league;
  

}
