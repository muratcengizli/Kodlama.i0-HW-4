package kodlama.io;

import Abstract.CampainService;

public class PhoneCampain implements CampainService {

	@Override
	public void campainService(String message) {

		System.out.println(message + " isimli kampanya uygulandý.");
		
	}
	
	

}
