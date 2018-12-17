package phoneBook;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Person {
	
	private String firstName;
	private String lastName;
	private Address address = new Address();
	private String contact;
	
	
	

	public Person() {
		super();
	}
	
	public String toString() {
		return this.firstName+","+this.lastName+","+ this.address+","+ this.contact;
	}
	public Person(String firstName, String lastName, Address address, String contact) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.contact = contact;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address string) {
		this.address = string;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	

}
