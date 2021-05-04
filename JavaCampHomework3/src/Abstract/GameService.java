package Abstract;

import Entity.Game;

public interface GameService {

	void gameAdd(Game game);
	void gameUpdate(Game game,String gameName,String gamePrice);
	void gameDelete(Game game);
	
}
