package common;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Vladimir Danilov on 05/05/2017 : 01:44.
 */
public class Ticket extends Data implements Serializable {
	
	private int id;
	private String name, surname, passportNo;
	private boolean business;
	private Flight flight;
	
	public Ticket() {}
	
	public Ticket(String name, String surname, String passportNo, boolean business, Flight flight) {
		this.name = name;
		this.surname = surname;
		this.passportNo = passportNo;
		this.business = business;
		this.flight = flight;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getPassportNo() {
		return passportNo;
	}
	
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	
	public Flight getFlight() {
		return flight;
	}
	
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
	public String getClassToString(){
		return business ? "Business" : "Economy";
	}
	
	@Override
	public String toString() {
		return name + " " + surname + " " + passportNo + " " + flight;
	}
}
