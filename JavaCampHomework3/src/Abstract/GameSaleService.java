package Abstract;

import Entity.Campaign;
import Entity.Game;
import Entity.User;

public interface GameSaleService {
	void gameBuy(User user, Game game);
	void gameBuy(User user, Campaign campaign, Game game);

}
