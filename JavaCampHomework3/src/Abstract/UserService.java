package Abstract;

import java.util.Date;

import Entity.User;

public interface UserService {
	
	void save(User user);
	void update(User user,String firstName, String lastName, Date dateOfBirth,String nationalityID);
	void delete(User user);
}
