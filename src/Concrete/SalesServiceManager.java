package Concrete;

import Abstract.GameSalesService;
import Entities.Player;

public class SalesServiceManager {
	
	private GameSalesService gameSalesService;
	
	public SalesServiceManager(GameSalesService gameSalesService)	{
		
		this.gameSalesService = gameSalesService;
	}
	
	public void buyingGame(Player player)	{
		
		this.gameSalesService.sales(player);
	}
	

}
