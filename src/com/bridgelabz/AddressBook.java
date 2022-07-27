package com.bridgelabz;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
	public static void main(String[] args) {
		HashMap<String, AddressBookOperations> map = new HashMap<>();
		System.out.println("Welcome To Address Book Program ");
		Scanner sc = new Scanner(System.in);

		boolean exit = true;
		while(exit){
			AddressBookOperations add = new AddressBookOperations();
			System.out.println("Enter address book name");
			String addressBookName = sc.next().toLowerCase();
			if(map.containsKey(addressBookName)){
				System.out.println("address book already exist");
			}
			else {
				map.put(addressBookName, add);
			}
			System.out.println("Enter options:\n1 To add contact\n2 To edit Contact\n3 To delete contact\n4 To add Multiple Contact\n5 Display Contact\n6 To exit");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				map.get(addressBookName).addContact();	
				break;
			case 2:
				map.get(addressBookName).editContact();
				break;
			case 3:
				map.get(addressBookName).deleteContact();
				break;
			case 4:
				map.get(addressBookName).addMultiplePerson();
				break;
			case 5:
				map.get(addressBookName).displayContacts();
				break;
			case 6:
				exit = false;
			default:
				break;
			}
		}
		System.out.println(map);
	}
}
