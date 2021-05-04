package manager;

import Entities.Game;
import interfaces.IGameService;

public class GameManager implements IGameService{

	@Override
	public void add(Game game) {
		System.out.println("Game was added: " + game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game was deleted: " + game.getGameName());
		
	}

	@Override
	public void update(Game game) {
	
		System.out.println("Game was updated: "+ game.getGameName() + game.getPrice());
	}

}
