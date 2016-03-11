package Shop;

public abstract class Person {

		String FirstName;
		String LastName;
		String Address;
		String EmailAddress;
		String PhoneNumber;
	
	
	//Constructor For Person
	Person(String FirstName, String LastName, String Address, String EmailAddress, String PhoneNumber) {
		
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Address = Address;
		this.EmailAddress = EmailAddress;
		this.PhoneNumber = PhoneNumber;

	
		}
	
		public String getFirstName ()	{
			return FirstName;
		}
		public String getLastName () 	{
			return LastName;
		}
		public String getAddress () 	{
			return Address;
		}
		public String getEmailAddress (){
			return EmailAddress;
		}
		public String getPhoneNumber () {
			return PhoneNumber;
		}
	

	
	
}
