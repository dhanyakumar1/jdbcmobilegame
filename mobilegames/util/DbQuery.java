package com.mobilegames.util;

public class DbQuery {

	public static final String addGames="insert into games(tital,age_group,type,price) values(?,?,?,?)";
	
	public static final String updateQuery="update games set price=? where game_id=?";
	
	public static final String deleteGames= "delete from games where game_id=?";
	
	 public static final String selectQuery="select * from games";
	 public static final String selectBytital="select * from games where tital =?";
	 public static final String selectByAgeGroup="select * from games where age_group =?";
	 public static final String selectByType="select * from games where type =?";
	 public static final String selectByPrice="select * from games where price =?";
	 public static final String selectById= "select * from games where game_id=?";
	
	
	
}




