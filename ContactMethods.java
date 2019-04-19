package phoneBook;

import java.util.ArrayList;
import java.util.Scanner;



public class ContactMethods {
public static ArrayList<Person>contacts=new ArrayList<Person>();
	
	public Person searchContact (String fName) {
	Person searchResult=null;
	for(Person p : contacts) {
		if(p.getFirstName().contentEquals(fName)){
			searchResult=p;
		}
	}
	
	return searchResult;
	}	
	
	public void removeContact(String phoneNum) {
		String message="Contact has been removed";
		for (Person p:contacts) {
			if(p.getContact().contentEquals(phoneNum)) {
				contacts.remove(p);
			}
		}
		System.out.println(message);
	}
	public  ArrayList<Person> addContact(String phoneNum) {
	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Person newContact=new Person();
	
				System.out.println("enter phone number");
				newContact.setContact(sc.next());
				System.out.println("enter first name");
				newContact.setFirstName(sc.next());
				System.out.println("enter last name");
				newContact.setLastName(sc.next());
				System.out.println("enter full address");
				
				newContact.setAddress(sc.next());
				
				contacts.add(newContact);
			
			System.out.println("Contact "+phoneNum+" has beeen added");
		
		return contacts;
		
	}
}
