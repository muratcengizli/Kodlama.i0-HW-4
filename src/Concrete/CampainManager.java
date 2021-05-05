package Concrete;

import Abstract.CampainService;
import Entities.Campain;

public class CampainManager {
	
	private CampainService campainService;
	
	public CampainManager(CampainService campainService)	{
		this.campainService = campainService;
	}

	public void add(Campain campain)	{
		
		System.out.println("campain is added");
		this.campainService.campainService(campain.getCampainId() + " numaralý " +campain.getCampainName());
		
	}
	
	public void delete(Campain campain)	{
		
		System.out.println(campain.getCampainId() + " " + campain.getCampainName() + "campain is deleted");
		
		
	}
}
