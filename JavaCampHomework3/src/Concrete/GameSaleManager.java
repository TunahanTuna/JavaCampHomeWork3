package Concrete;

import Abstract.GameSaleService;
import Entity.Campaign;
import Entity.Game;
import Entity.User;

public class GameSaleManager implements GameSaleService {

	@Override
	public void gameBuy(User user, Game game) {
		System.out.println(user.getFirstName() + " "+ game.getGameName()+ " Adlý Oynunu "+ game.getGamePrice() + " TL'ye Aldi");
		
	}

	@Override
	public void gameBuy(User user, Campaign campaign, Game game) {
		double result = Double.parseDouble(game.getGamePrice()) - (Double.parseDouble(game.getGamePrice())*campaign.getCampaignRate()/100);
		System.out.println(user.getFirstName() + " "+ game.getGameName()+ " Adlý Oynunu "+ result + " TL'ye Aldi");

		
	}

}
