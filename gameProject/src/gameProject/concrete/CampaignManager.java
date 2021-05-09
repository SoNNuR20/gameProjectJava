package gameProject.concrete;

import gameProject.abstracts.CampaignService;
import gameProject.entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Added Campaign " + campaign.getDiscount());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Deleted Campaign " + campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Updated Campaign " + campaign.getCampaignName());
		
	}

}
