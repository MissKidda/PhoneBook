package phoneBook;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

public class Application extends Person{
	

		
		public static void main(String[] args) {
			
	ArrayList<Person> contacts = new ArrayList<>();
			Scanner sc = new Scanner(System.in);
			Scanner input = new Scanner(System.in);
			int option = 0;
			addContact phoneBook = new addContact();
			
			do {
			System.out.println("1. Add a contact");
			System.out.println("2. Delete a contact");
			System.out.println("3. Search a contact");
			System.out.println("4. Exit");
			option = sc.nextInt();
			
			switch (option) {
			case 1:
				Person p = new Person();
				Address newAd = new Address();
				
				System.out.println("enter contact first name");
			p.setFirstName(sc.nextLine());
			System.out.println("enter contact last name");
			p.setLastName(sc.nextLine());
			System.out.println("enter contact address begining with street ");
					newAd.setStreet(sc.nextLine());
					System.out.println("enter  city");
					newAd.setCity(sc.nextLine());
					System.out.println("enter  state");
					newAd.setState(sc.nextLine());
					System.out.println("enter  zip");
					newAd.setZip(sc.nextLine());
					p.setAddress(newAd);
			System.out.println("enter contact phone number");
			p.setContact(sc.nextLine());
			contacts.add(p);
			
			System.out.println(contacts.size() +" "+ p);
			
				break;

			
				
			case 2: 
					System.out.println("enter the phone number you want to delete: ");
					
					String pDel = input.nextLine();
					phoneBook.removeRecord(pDel);
							break;

						
					
			case 3:
				System.out.println("What's the first name you would like to search ");
				String searchName = input.nextLine();
				phoneBook.searchName(searchName);
				break;
				
			default:
				
				break;
			}
			
		
			}while(option != 4);
			
		}

	}



