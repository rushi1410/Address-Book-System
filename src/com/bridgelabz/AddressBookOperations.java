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
	public void editContact() {
		System.out.println("Enter the first name of person to edit:");
		String firstName = sc.next();
		if (firstName.equals(contact.getFirstName())) {
			System.out.println("Edit the details of person");
			System.out.println("Enter first name:");
			contact.setFirstName(sc.next());

			System.out.println("Enter last Name:");
			contact.setLastName(sc.next());

			System.out.println("Enter address:");
	        contact.setAddress(sc.next());
	        
			System.out.println("Enter city:");
			contact.setCity(sc.next());

			System.out.println("Enter state:");
			contact.setState(sc.next());

			System.out.println("Enter zip Code:");
			contact.setZip(sc.next());
			
			System.out.println("Enter phone number:");
			contact.setPhoneNumber(sc.next());

			System.out.println("Enter EmailId:");
			contact.setEmailId(sc.next());

		} else {
			System.out.println("Person not found");
		}
	}

	Contact display() {
		return contact;
	}
}
