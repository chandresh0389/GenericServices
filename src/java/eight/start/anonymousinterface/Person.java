package java.eight.start.anonymousinterface;

public class Person {

	String firstName, lastName;

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

		public String getLastName() {
		return lastName;
	}
 @Override
 public String toString(){
	 
	return firstName+"--"+lastName;
	 
 }


}

