package com.bridgelabz;

public class Contact {
	public Contact(String firstName, String lastName, String address, String city, String state,Long zip,
			Long phoneNumber, String emailId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private Long zip;
	private Long phoneNumber;
	private String emailId;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getZip() {
		return zip;
	}
	public void setZip(Long zip) {
		this.zip = zip;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Contact))
			return false;

		Contact other = (Contact) obj;
		if (!(firstName.equalsIgnoreCase(other.getFirstName())))
			return false;
		if (!(lastName .equalsIgnoreCase(other.getLastName())))
			return false;
		if (!(address.equalsIgnoreCase(other.getAddress())))
			return false;
		if (!(city.equalsIgnoreCase(other.getCity())))
			return false;
		if (!state.equalsIgnoreCase(other.getState()))
			return false;
		if (!zip.equals(other.getZip()))
			return false;
		if (!(phoneNumber.equals(other.getPhoneNumber())))
			return false;
		return emailId .equals(other.getEmailId());
	}

	@Override
	public String toString() {
		return "Contacts [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", phoneNumber=" + phoneNumber + ", emailId=" + emailId + "]";
	}

}
