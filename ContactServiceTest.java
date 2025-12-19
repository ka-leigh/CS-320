package Contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
	
	@Test
	void testAddContact() {
		
		//create new contact service
		ContactService service = new ContactService();
		
		// create new contact
		Contact contact = new Contact ("1", "Kaleigh", "Pickle", "1112223333", "1234 Test Lane");
		
		//add contact to the list
		boolean added = service.addContact(contact);
		
		// check that it was added
		assertTrue(added, "This contact was added");
		
		// check that the first name matches
		assertEquals("Kaleigh", contact.getFirstName(), "First name is Kaleigh");
		
		// check that contact ID is correct
		assertEquals("1", contact.getId(), "Contact ID is 1");
	}
	
	@Test
	void testAddDuplicateId() {
		ContactService service = new ContactService();
		
		Contact test1 = new Contact("1", "Kaleigh", "Pickle", "1112223333", "1234 Test Lane");
		Contact test2 = new Contact("1", "Sara", "Smith", "3332221111", "321 Harvard Ave");
		service.addContact(test1);
		
		// adding contact with dupicate id should fail
		boolean added = service.addContact(test2);
		assertFalse(added, "Can not add contact with duplicate ID");
	}
	
	@Test
	void testDeleteContact() {
		ContactService service = new ContactService();
		Contact contact = new Contact("1", "Kaleigh", "Pickle", "1112223333", "1234 Test Lane");
		
		service.addContact(contact);
		
		// delete by id
		boolean deleted = service.deleteContact("1");
		
		// verify delete worked
		assertTrue(deleted, "Contact has been deleted");
	}
		
		@Test
		void testUpdateFirstName() {
			ContactService service = new ContactService();
			Contact contact = new Contact("1", "Kaleigh", "Pickle", "1112223333", "1234 Test Lane");
			service.addContact(contact);
			
			//update first name
			boolean updated = service.updateFirstName("1", "Tom");
			
			// check update was successful
			assertTrue(updated, "First name has been updated");
			
			// verify name is correct
			assertEquals("Tom", contact.getFirstName(), "First name has been updated to Tom");
		}
		
		@Test
		void testUpdateLastName() {
			ContactService service = new ContactService();
			Contact contact = new Contact("1", "Kaleigh", "Pickle", "1112223333", "1234 Test Lane");
			service.addContact(contact);
			
			//update last name
			boolean updated = service.updateLastName("1", "Smith");
			
			// check update was successful
			assertTrue(updated, "Last name has been updated");
			
			// verify name is correct
			assertEquals("Smith", contact.getLastName(), "Last name has been updated to Smith");
		}
		
		@Test
		void testUpdatePhone() {
			ContactService service = new ContactService();
			Contact contact = new Contact("1", "Kaleigh", "Pickle", "1112223333", "1234 Test Lane");
			service.addContact(contact);
			
			//update phone
			boolean updated = service.updatePhone("1", "7775554444");
			
			// check update was successful
			assertTrue(updated, "Phone number has been updated");
			
			// verify name is correct
			assertEquals("7775554444", contact.getPhone(), "Phone number has been updated to 7775554444");
		}
		
		@Test
		void testUpdateAddress() {
			ContactService service = new ContactService();
			Contact contact = new Contact("1", "Kaleigh", "Pickle", "1112223333", "1234 Test Lane");
			service.addContact(contact);
			
			//update address
			boolean updated = service.updateAddress("1", "789 Tired Road");
			
			// check update was successful
			assertTrue(updated, "Address has been updated");
			
			// verify name is correct
			assertEquals("789 Tired Road", contact.getAddress(), "First name has been updated to Tom");
		}
}
