package main;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContactManager {

	Map<String,Contact> contactList = new ConcurrentHashMap<String, Contact>();
	
	public void addContact(String name, String lastName, String phoneNmber) {
		Contact contact = new Contact(name, lastName, phoneNmber);
		validateContact(contact);
		checkIfContactAlreadyExist(contact);
		contactList.put(generateKey(contact), contact);
		
	}
	
	public Collection<Contact> getAllContact() {
		return contactList.values();
	}

	private String generateKey(Contact contact) {
		return String.format("%s-%s", contact.getFirstName(),contact.getLastName());
	}

	private void checkIfContactAlreadyExist(Contact contact) {
		if(contactList.containsKey(generateKey(contact))) {
			throw new RuntimeException("Contact already exist");
		}
		
	}

	private void validateContact(Contact contact) {
		contact.validateName();
		contact.validateLastName();
		contact.validatePhoneNumber();
		
	}
}
