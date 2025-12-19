package Contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {
	
	@Test
	void testValidContact() {
		Contact contact = new Contact("123", "Kaleigh", "Pickle", "5554442222", "123 Test Lane");
		
		assertEquals("123", contact.getId());
		assertEquals("Kaleigh", contact.getFirstName());
		assertEquals("Pickle", contact.getLastName());
		assertEquals("5554442222", contact.getPhone());
		assertEquals("123 Test Lane", contact.getAddress());		
	}
	
	@Test
	void testUpdateFirstName() {
		Contact contact = new Contact("123", "Kaleigh", "Pickle", "5554442222", "123 Test Lane");
		contact.setFirstName("Sara");
		assertEquals("Sara", contact.getFirstName(), "First Name updated to Sara");
	}
	
	@Test
	void testUpdateLastName() {
		Contact contact = new Contact("123", "Kaleigh", "Pickle", "5554442222", "123 Test Lane");
		contact.setLastName("Jones");
		assertEquals("Jones", contact.getLastName(), "Last Name updated to Jones");
	}
	
	@Test
	void testUpdatePhone() {
		Contact contact = new Contact("123", "Kaleigh", "Pickle", "5554442222", "123 Test Lane");
		contact.setPhone("1234445555");
		assertEquals("1234445555", contact.getPhone(), "Phone number updated to 1234445555");
	}
		
		@Test
		void testUpdateAddress() {
			Contact contact = new Contact("123", "Kaleigh", "Pickle", "5554442222", "123 Test Lane");
			contact.setAddress("147 New Drive");
			assertEquals("147 New Drive", contact.getAddress(), "Address updated to 147 New Drive");			
		}		
	}
