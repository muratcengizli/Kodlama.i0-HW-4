package kodlama.io;

import Abstract.GameSalesService;
import Entities.Player;

public class InternetSale implements GameSalesService {

	@Override
	public void sales(Player player) {
		
		System.out.println("Game is bought by internet by " + player.getFirstName() + player.getLastName());
		
	}
	
	

}
