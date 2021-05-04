package Entity;

public class Game {
	
	private int gameID;
	private String gameName;
	private String gamePrice;
	
	public Game(int gameID, String gameName, String gamePrice) {
		this.gameID = gameID;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
	}

	public int getGameID() {
		return gameID;
	}

	public void setGameID(int gameID) {
		this.gameID = gameID;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(String gamePrice) {
		this.gamePrice = gamePrice;
	}
}
