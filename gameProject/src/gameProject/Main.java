package gameProject;

import gameProject.adapters.MernisServiceAdapter;
import gameProject.concrete.CampaignManager;
import gameProject.concrete.GameManager;
import gameProject.concrete.GamerManager;
import gameProject.concrete.SaleManager;
import gameProject.entities.Campaign;
import gameProject.entities.Game;
import gameProject.entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(new Gamer(1, "Sonnur", "Tayfuroðlu", 1995, "11111111111"));
		
		System.out.println("                                                  ");
		
		GameManager gameManager = new GameManager();
		gameManager.add(new Game(1,"Game of Thorones: Conquest",80));
		
		System.out.println("                                                  ");
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(new Campaign(1, "New Year Campaign",50));
		
		System.out.println("                                                  ");
		System.out.println("                                                  ");
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(new Game(1,"Game of Thorones: Conquest",80), new Gamer(1, "Sonnur", "Tayfuroðlu", 1995, "11111111111"));
		saleManager.campaignSale(
				
			         new Game(1,"Game of Thorones: Conquest",80),
			         new Gamer(1, "Sonnur", "Tayfuroðlu", 1995, "11111111111"),
			         new Campaign(1, "New Year Campaign",50)
			         );
		System.out.println("                                                  ");
		
	}

}
