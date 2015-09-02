package com.chriskrone.fantasysoccerweb.db.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "manager",
    indexes = @Index(columnList = "email"))
public class Manager {
	
	@Id
	@Column(name = "manager_id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	Long id;
	
	@Column(name = "email", unique = true, nullable = false, length = 50)
	private String email;
	
	@Column(name = "first_name", nullable = false, updatable = true, length = 50)
	private String firstName;
	
	@Column(name = "last_name", nullable = false, updatable = true, length = 50)
	private String lastName;
	
	@ManyToMany
	@JoinTable(name = "league_manager", joinColumns = { 
			@JoinColumn(name = "manager_id", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "league_id", 
					nullable = false, updatable = false) })
	private Set<League> leagues;

}
