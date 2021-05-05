package Entities;

public class Campain {
	
	private String campainId;
	private String campainName;
	
	private Campain()	{
		
	}
	
	public Campain(String campainId, String campainName) {
		super();
		this.campainId = campainId;
		this.campainName = campainName;
	}
	
	public String getCampainId() {
		return campainId;
	}
	public void setCampainId(String campainId) {
		this.campainId = campainId;
	}
	public String getCampainName() {
		return campainName;
	}
	public void setCampainName(String campainName) {
		this.campainName = campainName;
	}
	
	
	
}
