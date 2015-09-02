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
@Table(name = "game_event")
public class GameEvent {

	@Id
	@Column(name = "game_event_id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "player_gameweek_id")
	private PlayerGameweek playerGameweek;

	@Column(name = "description", nullable = true, updatable = true)
	private String description;

	@Column(name = "quantity", nullable = true, updatable = true)
	private Long quantity;

	@Column(name = "points", nullable = true, updatable = true)
	private Long points;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PlayerGameweek getPlayerGameweek() {
		return playerGameweek;
	}

	public void setPlayerGameweek(PlayerGameweek playerGameweek) {
		this.playerGameweek = playerGameweek;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getPoints() {
		return points;
	}

	public void setPoints(Long points) {
		this.points = points;
	}
}
