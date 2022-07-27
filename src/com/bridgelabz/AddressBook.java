package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
	public static void main(String[] args) {
		System.out.println("Welcome To Address Book Program ");
		AddressBookOperations add = new AddressBookOperations();
		Scanner sc = new Scanner(System.in);
		boolean exit = true;
		do {
			System.out.println("Enter options:\n1 To add contact\n2 To edit Contact\n3 To delete contact\n4 To add Multiple Contact\n5 Display Contact\n6 To exit");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				add.addContact();
				break;
			case 2:
				add.editContact();
				break;
			case 3:
				add.deleteContact();
				break;
			case 4:
				add.addMultiplePerson();
				break;
			case 5:
				add.displayContacts();
				break;
			case 6:
				exit = false;
			default:
				break;
			}
		}while(exit);

	}
}
