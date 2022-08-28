package com.mobilegames;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.games.service.IGamesService;

@SpringBootApplication
public class SpringMobilegamesBasicsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringMobilegamesBasicsApplication.class, args);
	}
	
	
	@Autowired
	IGamesRepository gamesRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Games game= new Games("snake", 8, 101, "brick", 250.00);
		gamesRepository.addGames(game);
		gamesRepository.updateGames(101,350);
		// gamesRepository.deleteGames(101);
		
		gamesRepository.findall().forEach(System.out::println);
		System.out.println();
		gamesRepository.findByTitle("snake").forEach(System.out::println);
		System.out.println();
		gamesRepository.findByAgeGroup(8).forEach(System.out::println);
		System.out.println();
		gamesRepository.findByType("brick").forEach(System.out::println);
		System.out.println();
		gamesRepository.findByPrice(350).forEach(System.out::println);
		System.out.println();
		System.out.println(gamesRepository.getById(101));
		
}
}