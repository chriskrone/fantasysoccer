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
@Table(name = "waiver_week")
public class WaiverWeek {
  
  @Id
  @Column(name = "waiver_week_id")
  @GeneratedValue(generator = "increment")
  @GenericGenerator(name = "increment", strategy = "increment")
  private Long id;
  
  @ManyToOne
  @JoinColumn(name = "waiver_wire_id")
  private WaiverWire waiverWire;
  
  @OneToMany
  private Set<WaiverClaim> waiverClaims;
  
  @Column(name = "waiver_week_number")
  private Integer waiverWeekNumber;
}
