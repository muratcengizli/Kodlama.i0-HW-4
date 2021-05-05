package Entities;

import java.sql.Date;
import java.text.DateFormat;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Player {
	
	private String nationaltiyNumber;
	private String firstName;
	private String lastName;
	private String dateOfBirhDate;
	
	
	private Player ()	{
		
	}
	
	public Player(String nationaltiyNumber, String firstName, String lastName, String dateOfBirhDate) {
		super();
		this.nationaltiyNumber = nationaltiyNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirhDate = dateOfBirhDate;
	}
	
	public String getNationaltiyNumber() {
		return nationaltiyNumber;
	}
	public void setNationaltiyNumber(String nationaltiyNumber) {
		this.nationaltiyNumber = nationaltiyNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirhDate() {
		return dateOfBirhDate;
	}
	public void setDateOfBirhDate(String dateOfBirhDate) {
		
		this.dateOfBirhDate = dateOfBirhDate;
	}
	
	

}
