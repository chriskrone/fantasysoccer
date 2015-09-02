package com.chriskrone.fantasysoccerweb.db.entities.enums;

public enum PlayerType {
	
	KEEP("Goalkeeper"),
	MID("Midfielder"),
	DEF("Defender"),
	FWD("Forward");
	
	private String displayName;
	
	private PlayerType(String displayName){
		this.displayName = displayName;
	}
	
	public String getDisplayName(){
		return displayName;
	}
	
	public String toString(){
		return displayName;
	}

}
