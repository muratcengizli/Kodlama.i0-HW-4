package kodlama.io;

import Abstract.ConfirmationSystem;

public class EdevletConfirmation implements ConfirmationSystem {

	@Override
	public void confirm(String message) {
		
		System.out.println(message + " is confirmed By Edevlet");
		
	}

}
