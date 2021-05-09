package gameProject.adapters;

import gameProject.abstracts.GamerCheckService;
import gameProject.entities.Gamer;

public class MernisServiceAdapter implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		System.out.println("Gamer Approved ");
		System.out.println("                                                  ");
		return true;
		
	}

	
}
