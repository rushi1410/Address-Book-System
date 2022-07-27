package com.bridgelabz;

public class AddressBook {
	public static void main(String[] args) {
		System.out.println("Welcome To Address Book Program ");
		AddressBookOperations add = new AddressBookOperations();

		add.addContact();
		System.out.println(add.display());
		add.editContact();
		System.out.println(add.display());

	}
}
