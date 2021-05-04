import java.util.Date;

import Adapter.MernisServiceAdapter;
import Concrete.*;
import Entity.*;

public class Main {

	public static void main(String[] args) {
		UserManager userManager = new UserManager(new MernisServiceAdapter());
		GameSaleManager gameSaleManager = new GameSaleManager();
		GameManager gameManager = new GameManager();
		CampaignManager campaignManager = new CampaignManager();
		
		User user1 = new User(1,"Mustafa Tunahan","Tuna",new Date(1998,8,5),"46003555154");
		User user2 = new User(2,"Leyla","Tuna",new Date(1973,2,1),"46012554872");
		
		
		userManager.save(user1);
		userManager.save(user2);
		System.out.println();
		System.out.println("<------------------------------------------------------->");
		userManager.update(user1,"Mehmet Teoman","Tuna",new Date(2003,1,2),"1609887362");
		System.out.println("<------------------------------------------------------->");
		
		
		System.out.println();
		
		Game halfLife = new Game(1,"Half-Life","30");
		System.out.println("<------------------------------------------------------->");
		gameManager.gameAdd(halfLife);
		
		gameSaleManager.gameBuy(user1, halfLife);
		userManager.delete(user1);
		System.out.println("<-------------------------------------------------------->");
		System.out.println();
		Campaign campaign1 = new Campaign();
		campaignManager.campaignAdd(campaign1, 1, "Bahar Kampanyasi %30 Indirim", 30);
		gameSaleManager.gameBuy(user2, campaign1, halfLife);
		System.out.println();
		campaignManager.campaignUpdate(campaign1, "Kis Indirimi",25);
		gameSaleManager.gameBuy(user2, campaign1, halfLife);
		System.out.println();
		campaignManager.campaignDelete(campaign1);
		System.out.println();
		
		gameManager.gameUpdate(halfLife, "Half-Life2", "50");
		gameManager.gameDelete(halfLife);

	}

}
