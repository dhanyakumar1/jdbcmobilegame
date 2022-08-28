package com.mobilegames.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mobilegames.model.Games;
@Repository
public class GamesRepositoryImpl implements IGamesRepository {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public GameRepositoryImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addGames(Games game) {
		Object[] gameArray= {
				game.getTitle(),game.getGameId(),game.getType(),game.getPrice(),game.setAgeGroup()
		};
		jdbcTemplate.update(DbQuery.addGames,gameArray);		
	}
	@Override
	public void updateGames(int gameId, double price) {
jdbcTemplate.update( DbQuery.updateQuery,price,gameId);
		
	}

	@Override
	public void deleteGames(int gameId) {
		jdbcTemplate.update( DbQuery.deleteGames,gameId);
	}

	@Override
	public List<Games> findall() {
		List<Games> games=jdbcTemplate.query(DbQuery.selectQuery, new RowMapper<Games>() {
		
			@Override
			public Games mapRow(ResultSet rs, int rowNum) throws SQLException {
				Games game=new Games();
				game.setTitle(rs.getString("title"));
				game.setGameId(rs.getInt("game_id"));
				game.setType(rs.getString("type"));
				game.setPrice(rs.getDouble("price"));
				game.setAgeGroup(rs.getInt("age_group"));
				return game;
			}
		});
		return games;
	}
	@Override
	public List<Games> findByTitle(String name) {
		List<Games> games=jdbcTemplate.query(DbQuery.selectBytital, new RowMapper<Games>() {
			
			@Override
			public Games mapRow(ResultSet rs, int rowNum) throws SQLException {
				Games game=new Games();
				game.setTitle(rs.getString("title"));
				game.setGameId(rs.getInt("game_id"));
				game.setType(rs.getString("type"));
				game.setPrice(rs.getDouble("price"));
				game.setAgeGroup(rs.getInt("age_group"));
				return game;
			}
		},name);
		return games;
	}

	@Override
	public List<Games> findByAgeGroup(int age) {
		List<Games> games=jdbcTemplate.query(DbQuery.selectByAgeGroup, new RowMapper<Games>() {

		@Override
		public Games mapRow(ResultSet rs, int rowNum) throws SQLException {
			Games game=new Games();
			game.setTitle(rs.getString("title"));
			game.setGameId(rs.getInt("game_id"));
			game.setType(rs.getString("type"));
			game.setPrice(rs.getDouble("price"));
			game.setAgeGroup(rs.getInt("age_group"));
			return game;
		}
	},age);
	return games;
}


	@Override
	public List<Games> findByType(String type) {
		List<Games> games=jdbcTemplate.query(DbQuery.selectByType, new RowMapper<Games>() {
		
			@Override
			public Games mapRow(ResultSet rs, int rowNum) throws SQLException {
				Games game=new Games();
				game.setTitle(rs.getString("title"));
				game.setGameId(rs.getInt("game_id"));
				game.setType(rs.getString("type"));
				game.setPrice(rs.getDouble("price"));
				game.setAgeGroup(rs.getInt("age_group"));
				return game;
			}
		},type);
		return games;
	}
	@Override
	public List<Games> findByPrice(double price) {
		List<Games> games=jdbcTemplate.query(DbQuery.selectByPrice, new RowMapper<Games>() {
			
			@Override
			public Games mapRow(ResultSet rs, int rowNum) throws SQLException {
				Games game=new Games();
				game.setTitle(rs.getString("title"));
				game.setGameId(rs.getInt("game_id"));
				game.setType(rs.getString("type"));
				game.setPrice(rs.getDouble("price"));
				game.setAgeGroup(rs.getInt("age_group"));
				return game;
			}
		},price);
		return games;
	}
	@Override
	public Games getById(int gameId) {
		Games games=jdbcTemplate.queryForObject(DbQuery.selectById, new RowMapper<Games>() {
			
			@Override
			public Games mapRow(ResultSet rs, int rowNum) throws SQLException {
				Games game=new Games();
				game.setTitle(rs.getString("title"));
				game.setGameId(rs.getInt("game_id"));
				game.setType(rs.getString("type"));
				game.setPrice(rs.getDouble("price"));
				game.setAgeGroup(rs.getInt("age_group"));
				return game;
			}
		},gameId);
		return games;
	}
	
	
}
