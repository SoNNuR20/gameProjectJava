package gameProject.concrete;

import gameProject.abstracts.GameService;
import gameProject.entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Added Game : " + game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Deleted Game: " + game.getGameName());
		
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Updated Game : " + game.getGameName());
		
		
	}

}
