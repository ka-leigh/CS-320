package Contact;

import java.util.ArrayList;

public class ContactService {
	
	private ArrayList<Contact> contacts = new ArrayList<>();
	
	// add a contact
	public boolean addContact(Contact contact) {
		
		//loop through each contact
		for (Contact tempContact : contacts) {
			
			//If Id is already in use, it cannot be added
			if (tempContact.getId().equals(contact.getId())) {
				return false; // ID is already in use
			}
		}
		
		// if ID is new ID
		contacts.add(contact);
		return true;
	}
	
	// delete a contact
	public boolean deleteContact(String id) {
		// go through contacts
		for (Contact tempContact : contacts) {
			
			// if id matches current contact
			if (tempContact.getId().equals(id) ) {
				
				// delete
				contacts.remove(tempContact);
				return true; // successfully removed
			}
		}
		
		// if ID does not match current contact
		return false;
	}
	
	// find a contact
	private Contact searchContacts(String id) {
		
		// search all contacts
		for (Contact tempContact : contacts) {
			
			// if ID is found
			if (tempContact.getId().equals(id) ) {
				return tempContact;
			}
		}
		
		// if ID is not found
		return null;
	}
	
	// update first name
	
	public boolean updateFirstName(String id, String newFirstName) {
		Contact tempContact = searchContacts(id);
		
		// if contact is not found 
		if (tempContact == null) {
			return false;
		}
		
		// if contact is found, update contact first name
		tempContact.setFirstName(newFirstName);
		return true;
	}
	
	// update last name
	
	public boolean updateLastName(String id, String newLastName) {
		
		//search contact list
		Contact tempContact = searchContacts(id);
		
		// if contact is not found
		if (tempContact == null) {
			return false;
		}
		
		// if contact is found update last name
		tempContact.setLastName(newLastName);
		return true;
	}
	
	// update phone number
	
	public boolean updatePhone(String id, String newPhoneNumber) {
		
		// search contact list
		Contact tempContact = searchContacts(id);
		
		// if contact is not found
		if(tempContact == null) {
			return false;
		}
		
		// if contact is found update phone number
		tempContact.setPhone(newPhoneNumber);
		return true;
	}
	
	// update address
	public boolean updateAddress(String id, String newAddress) {
		
		// search contact list
		Contact tempContact = searchContacts(id);
		
		// if contact is not found
		if(tempContact == null) {
			return false;
		}
		
		// if contact is found update address
		tempContact.setAddress(newAddress);
		return true;
	}

}
