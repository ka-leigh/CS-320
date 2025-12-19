package Contact;

public class Contact {
	
	//set ID that can not be changed
	private final String id;
	
	// rest of the contact info can be updated
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	
	
	public Contact(String id, String firstName, String lastName, String phone, String address) {
		
		// check for invalid input
		if(id == null || id.trim().length() <1 || id.length()>10) {
			System.out.println("Invalid ID");
		}
		this.id = id;
		
		if(firstName == null || firstName.length() < 1 || firstName.length() >10) {
			System.out.println("Invalid First Name");
		}
		this.firstName = firstName;
		
		if(lastName == null || lastName.length() < 1 || lastName.length() >10) {
			System.out.println("Invalid Last Name");
		}
		this.lastName = lastName;
		
		if(phone == null || phone.length() != 10) {
			System.out.println("Invalid Phone Number");
		}
		this.phone = phone;
		
		if(address == null || address.length() < 1 || firstName.length() > 30) {
			System.out.println("Invalid Address");
		}
		this.address = address;
	}

// getters and setters
	
	public String getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		if(firstName == null || firstName.length() < 1 || firstName.length() >10) {
			System.out.println("Invalid First Name");
		} else {
			
		this.firstName = firstName;
		}
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		if(lastName == null || lastName.length() < 1 || lastName.length() >10) {
			System.out.println("Invalid Last Name");
		} else {
		this.lastName = lastName;
		}
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		if(phone == null || phone.length() != 10) {
			System.out.println("Invalid Phone Number");
		} else {
		this.phone = phone;
		}
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		if(address == null || address.length() < 1 || firstName.length() > 30) {
			System.out.println("Invalid Address");
		} else {
		this.address = address;
		}
	}
}
