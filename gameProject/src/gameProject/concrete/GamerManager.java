package gameProject.concrete;

import gameProject.abstracts.GamerCheckService;
import gameProject.abstracts.GamerService;
import gameProject.entities.Gamer;

public class GamerManager implements GamerService{

	private GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if (gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Player Saved : " + gamer.getFirstName() + " Welcome :)");
		}else {
			System.out.println("Registration failed");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Player Deleted " + gamer.getFirstName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Player Updated " + gamer.getFirstName());
		
	}

}
