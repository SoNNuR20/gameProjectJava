package gameProject.concrete;

import gameProject.abstracts.SaleService;
import gameProject.entities.Campaign;
import gameProject.entities.Game;
import gameProject.entities.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void sale(Game game, Gamer gamer) {
	  System.out.println(gamer.getFirstName() + " bought " + game.getGameName() + " " + game.getUnitPrice() + " $  ");
		
	}

	@Override
	public void campaignSale(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(gamer.getFirstName() + " " + game.getGameName() + " " + 
				campaign.getCampaignName() + " with %" + campaign.getDiscount() + " discount " + game.getUnitPrice()/2 + " $ bought");
		
	}


    
}
