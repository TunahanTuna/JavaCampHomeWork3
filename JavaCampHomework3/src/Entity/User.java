package Entity;

import java.util.Date;

public class User {
	
	private int userID;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String nationaltyID;
	
	
	public User() {
		
	}

	public User(int userID, String firstName, String lastName, Date dateOfBirth, String nationaltyID) {

		this.userID = userID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationaltyID = nationaltyID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationaltyID() {
		return nationaltyID;
	}

	public void setNationaltyID(String nationaltyID) {
		this.nationaltyID = nationaltyID;
	}

}
