package com.games.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.games.exceptions.GameNotFoundException;
import com.games.exceptions.IdNotFoundException;
import com.mobilegames.model.Games;
@Service
public interface IGamesService {
	
	void addGames(Games games);
	void updateGames(int gameId, double price);
	void deleteGames(int gameId);
	
	public List<Games> getall() throws GameNotFoundException;
	public List<Games> getByTitle(String name) throws GameNotFoundException;
	public List<Games> getByAgeGroup(int age) throws GameNotFoundException;
	public List<Games> getByType(String type) throws GameNotFoundException;
	public List<Games> getByPrice(double price) throws GameNotFoundException;
	
	public Games getById(int gameId) throws IdNotFoundException;
	
}
