package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookOperations {
	ArrayList<Contact> list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	@Override
	public String toString() {
		return "AddressBookOperations [list=" + list + "]";
	}
	public void addContact() {
		Contact contact = new Contact();
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
		list.add(contact);
	}
	public void editContact() {

		System.out.println("Enter the first name of person to edit:");
		String firstName = sc.next().toLowerCase();
		boolean found = false;
		for (Contact contact : list){
			if(firstName.equals(contact.getFirstName().toLowerCase()))  {
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
				found=true;
				break;
			}
		} 
		if(!found){
			System.out.println("No Contact found");
		}
	}

	public void deleteContact(){

		System.out.println("Enter the first name of person to delete");
		String firstName = sc.next().toLowerCase();
		boolean found = false;
		for (Contact contact : list){

			if (firstName.equals(contact.getFirstName().toLowerCase())){
				list.remove(contact);
				found = true;
				System.out.println("Contact deleted successfully");
				break;
			}

		}
		if(!found) {
			System.out.println("No contact found");
		}
	}
	public void addMultiplePerson(){
		System.out.println("Enter the number of persons whose details you want "
				+ "to add to the address book");
		Scanner sc = new Scanner(System.in);
		int no_of_person = sc.nextInt();
		for (int i=1;i<=no_of_person;i++){

			addContact();
		}
	}

	public void displayContacts(){
		if(list.isEmpty()){
			System.out.println("No contacts to display");
		}
		else {
			for (Contact contact : list) {
				System.out.println(contact);
			}
		}

	}
}
