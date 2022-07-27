package com.bridgelabz;

public class AddressBook {
	public static void main(String[] args) {
		System.out.println("Welcome To Address Book Program ");
		AddressBookOperations add = new AddressBookOperations();
		System.out.println("Create Contact");
		add.addContact();
		System.out.println(add.display());

	}
}
