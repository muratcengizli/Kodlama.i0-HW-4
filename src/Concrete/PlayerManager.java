package Concrete;

import Abstract.ConfirmationSystem;
import Entities.Player;

public class PlayerManager {
		
	private ConfirmationSystem confirmationSystem;
	
	public PlayerManager (ConfirmationSystem confirmationSystem)	{
		this.confirmationSystem = confirmationSystem;
	}

	public void add(Player player)	{
		
		System.out.println("player is added");
		
		this.confirmationSystem.confirm(player.getFirstName() + player.getLastName());
		System.out.println("*********************************************");
	}
	
	public void update(Player player)	{
		
		System.out.println("player is updated.");
		
		this.confirmationSystem.confirm(player.getFirstName() + player.getLastName());
		System.out.println("*********************************************");
	}
	
	public void delete(Player player)	{
		
		System.out.println("player is deleted.");
		
		this.confirmationSystem.confirm(player.getFirstName() + player.getLastName());
		System.out.println("*********************************************");
	}
}
