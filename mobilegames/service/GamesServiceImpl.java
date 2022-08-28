package com.games.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.games.dao.IgamesDAO;
import com.games.exceptions.GameNotFoundException;
import com.games.exceptions.IdNotFoundException;
import com.mobilegames.model.Games;
@Service
public class GamesServiceImpl implements IGamesService {
private IGamesRepository gamesRepository;
	
	@Autowired
	public GamesServiceImpl(IGamesRepository gamesRepository) {
		super();
		this.gamesRepository = gamesRepository;
	}
	@Override
	public List<Games> getall() {
		List<Games> games = gamesRepository.findAll();
		return games;
	}
	@Override
	public List<Games> getByTitle(String name) throws GameNotFoundException {
		List<Games> games = gamesRepository.findByTitle(name);
		if (games.isEmpty()) {
			throw new GameNotFoundException();
		}
		return games;
	}

	@Override
	public List<Games> getByAgeGroup(int age) throws GameNotFoundException {
		List<Games> games = gamesRepository.findByAgeGroup(age);
		if (games.isEmpty()) {
			throw new GameNotFoundException();
		}
		return games;
	}
	@Override
	public List<Games> getByType(String type) throws GameNotFoundException {
		List<Games> games = gamesRepository.findByType(type);
		if (games.isEmpty()) {
			throw new GameNotFoundException();
		}
		return games;
	}
	@Override
	public List<Games> getByPrice(double price) throws GameNotFoundException {
		List<Games> games = gamesRepository.findByPrice(price);
		if (games.isEmpty()) {
			throw new GameNotFoundException();
		}
		return games;
	}
	@Override
	public Games getById(int gameId) throws IdNotFoundException {
		Games games = gamesDAO.findById(gameId);
		if (games != null) {
			return games; 
		}
		throw new IdNotFoundException();
	}

	@Override
	public void addGames(Games games) {
		gamesRepository.addGames(games);
	}

	@Override
	public void updateGames(int gameId, double price) {
		gamesRepository.updateGames(gameId,price);
	}

	@Override
	public void deleteGames(int gameId) {
		gamesRepository.deleteGames(gameId);
	}

}
