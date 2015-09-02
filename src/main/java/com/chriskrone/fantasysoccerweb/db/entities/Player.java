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

import com.chriskrone.fantasysoccerweb.db.entities.enums.PlayerType;

@Entity
@Table(name = "players")
public class Player {
	@Id
	@Column(name = "player_id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	Long id;

	@Column(name = "fantasy_site_id")
	private Long fantasySiteId;

	@Column(name = "first_name", nullable = true, updatable = true, length = 50)
	private String firstName;

	@Column(name = "last_name", nullable = true, updatable = true, length = 50)
	private String lastName;

	@Column(name = "web_name", nullable = true, updatable = true, length = 50)
	private String webName;

	@ManyToOne
	@Column(name = "club_id", nullable = false, updatable = true)
	@JoinColumn(name = "club_id")
	private Club club;

	@Column(name = "player_type", nullable = true, updatable = true, length = 50)
	private PlayerType type;

	@Column(name = "status")
	private String status;

	@Column(name = "total_points")
	private Integer totalPoints;

	@Column(name = "chance_of_playing_this_round")
	private Integer chanceOfPlayingThisRound;

	@Column(name = "chance_of_playing_next_round")
	private Integer chanceOfPlayingNextRound;

	@Column(name = "goals_scored")
	private Integer goalsScored;

	@Column(name = "assists")
	private Integer assists;

	@Column(name = "clean_sheets")
	private Integer cleanSheets;

	@Column(name = "goals_conceded")
	private Integer goalsConceded;

	@Column(name = "own_goals")
	private Integer ownGoals;

	@Column(name = "penalties_saved")
	private Integer penaltiesSaved;

	@Column(name = "penalties_missed")
	private Integer penaltiesMissed;

	@Column(name = "yellow_cards")
	private Integer yellowCards;

	@Column(name = "red_cards")
	private Integer redCards;

	@Column(name = "saves")
	private Integer saves;

	@Column(name = "bonus")
	private Integer bonus;

	@OneToMany
	private List<PlayerGameweek> gameweeks;
	
	@Column(name = "epl_player")
	private Boolean eplPlayer;


}
