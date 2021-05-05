package kodlama.io;

import Abstract.ConfirmationSystem;

public class SmsConfirmation implements ConfirmationSystem {

	@Override
	public void confirm(String message) {
		
		System.out.println(message + " is confirmed By SMS");
		
	}
	

}
