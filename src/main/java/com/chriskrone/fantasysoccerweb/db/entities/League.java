package com.chriskrone.fantasysoccerweb.db.entities;

import java.util.List;
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
@Table(name = "league")
public class League {
  
  @Id
  @Column(name = "league_id")
  @GeneratedValue(generator = "increment")
  @GenericGenerator(name = "increment", strategy = "increment")
  private Long id;

  @Column(name = "league_name", length = 100)
  private String leagueName;
  
  @ManyToMany
  @JoinTable(name = "league_manager", joinColumns = {@JoinColumn(name = "league_id",
      nullable = false, updatable = false)}, inverseJoinColumns = {@JoinColumn(name = "manager_id",
      nullable = false, updatable = false)})
  private Set<Manager> managers;

  @ManyToMany
  @JoinTable(name = "league_admin", joinColumns = {@JoinColumn(name = "league_id",
      nullable = false, updatable = false)}, inverseJoinColumns = {@JoinColumn(name = "manager_id",
      nullable = false, updatable = false)})
  private Set<Manager> admins;

  @Column(name = "active", nullable = false, updatable = true)
  private Boolean active;
}
