package kodlama.io;

import Abstract.GameSalesService;
import Entities.Player;

public class PhoneSales implements GameSalesService	{

	@Override
	public void sales(Player player) {
		
		System.out.println("Game is bought by phone by " + player.getFirstName() + player.getLastName());
		
	}
	
	

}
