package Entities;

public class Game {
	String gameName;
	int price;
	
	public Game(String gameName, int price) {
		super();
		this.gameName = gameName;
		this.price = price;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
