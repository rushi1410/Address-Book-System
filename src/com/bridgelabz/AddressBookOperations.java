package com.bridgelabz;

import java.util.Scanner;

public class AddressBookOperations {
	Contact contact = new Contact();
	Scanner sc = new Scanner(System.in);

	public void addContact() {

		System.out.println("Enter first name:");
		contact.setFirstName(sc.next());
		System.out.println("Enter last name:");
		contact.setLastName(sc.next());
		System.out.println("Enter address:");
		contact.setAddress(sc.next());
		System.out.println("Enter city:");
		contact.setCity(sc.next());
		System.out.println("Enter state:");
		contact.setState(sc.next());
		System.out.println("Enter Zipcode:");
		contact.setZip(sc.next());
		System.out.println("Enter phone Number:");
		contact.setPhoneNumber(sc.next());
		System.out.println("Enter email Id:");
		contact.setEmailId(sc.next());

	}

	Contact display() {
		return contact;
	}
}
