package main;

public class Contact {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	
	public Contact(String name, String lastName, String phoneNumber) {
		super();
		this.firstName = name;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}
	
	
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void validateName() {
		if(firstName == null) {
			throw new RuntimeException("First name cannot be null or empty");
		}
	}
	public void validateLastName() {
		if(firstName == null) {
			throw new RuntimeException("Last name cannot be null or empty");
		}
	}
	public void validatePhoneNumber() {
		if(firstName== null) {
			throw new RuntimeException("Phone neumber cannot be null or empty");
		}
	}

	

}
