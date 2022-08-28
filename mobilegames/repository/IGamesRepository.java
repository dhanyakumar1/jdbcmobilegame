package com.mobilegames.repository;

import java.util.List;

import com.mobilegames.model.Games;

public interface IGamesRepository {
	void addGames(Games game);
	void updateGames(int gameId, double price);
	void deleteGames(int gameId);
	
	public List<Games> findall();
	public List<Games> findByTitle(String name) throws GameNotFoundException;
	public List<Games> findByAgeGroup(int age) throws GameNotFoundException;
	public List<Games> findByType(String type) throws GameNotFoundException;
	public List<Games> findByPrice(double price) throws GameNotFoundException;
	
	public Games getById(int gameId) throws IdNotFoundException;
	
}