package Abstract;

import java.util.Date;

import Entity.User;

public abstract class BaseUserManager implements UserService {

	@Override
	public void save(User user) {
	
		System.out.println("<-------- "+ user.getFirstName()+" "+ user.getLastName() + " Eklendi -------->");
	}
	@Override
	public void update(User user,String firstName, String lastName, Date dateOfBirth,String nationalityID) {
		System.out.println("<-------- "+ user.getFirstName()+" "+ user.getLastName() + " -------->");
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setDateOfBirth(dateOfBirth);
		user.setNationaltyID(nationalityID);
		System.out.println("<-------- "+ user.getFirstName()+" "+ user.getLastName() + " Olarak Deðiþti -------->");
		
	}
	@Override
	public void delete(User user) {
		System.out.println("<-------- "+ user.getFirstName()+" "+ user.getLastName() + " Silindi -------->");
	}
}
