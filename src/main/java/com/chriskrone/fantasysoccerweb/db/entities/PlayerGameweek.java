package com.chriskrone.fantasysoccerweb.db.entities;

import java.util.List;

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
@Table (name = "player_gameweek")
public class PlayerGameweek {
	
	@Id
	@Column(name = "player_gameweek_id")
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "player_id")
	Player player;
	
	@OneToMany
	List<GameEvent> events;
	
	@ManyToOne
	@JoinColumn(name = "gameweek_id")
	Gameweek gameweek;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public List<GameEvent> getEvents() {
		return events;
	}

	public void setEvents(List<GameEvent> events) {
		this.events = events;
	}
	
}
