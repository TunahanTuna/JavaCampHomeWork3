package Abstract;

import Entity.Game;

public abstract class BaseGameManager implements GameService {
	
	@Override
	public void gameAdd(Game game) {
		System.out.println(game.getGameName() + " Isimli oyun sisteme eklendi");
	}
	
	@Override
	public void gameUpdate(Game game,String gameName,String gamePrice) {
		System.out.println(game.getGameName() + " Isimli oyun sistemde g�ncellendi");
		game.setGameName(gameName);
		game.setGamePrice(gamePrice);
		
	}
	
	@Override
	public void gameDelete(Game game) {
		System.out.println(game.getGameName() + " Isimli oyun sistemden silindi");
	}


	
}

