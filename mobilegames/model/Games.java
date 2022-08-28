package com.mobilegames.model;

public class Games {
private String title;
private int ageGroup;
private int gameId;
private String type; 
private double price;
public Games(String title, int ageGroup, int gameId, String type, double price) {
	super();
	this.title = title;
	this.ageGroup = ageGroup;
	this.gameId = gameId;
	this.type = type;
	this.price = price;
}
public Games() {
	super();
	// TODO Auto-generated constructor stub
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getAgeGroup() {
	return ageGroup;
}
public void setAgeGroup(int ageGroup) {
	this.ageGroup = ageGroup;
}
public int getGameId() {
	return gameId;
}
public void setGameId(int gameId) {
	this.gameId = gameId;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Games [title=" + title + ", ageGroup=" + ageGroup + ", gameId=" + gameId + ", type=" + type + ", price="
			+ price + "]";
}

}
