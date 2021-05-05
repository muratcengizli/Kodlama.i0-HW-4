package kodlama.io;

import Abstract.CampainService;

public class InternetCampain implements CampainService	{

	@Override
	public void campainService(String message) {

		System.out.println(message + " isimli kampanya uygulandý.");
		
	}
	
	

}
