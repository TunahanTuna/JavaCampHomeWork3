package Concrete;

import Abstract.UserCheckService;
import Entity.User;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean checkIfRealUser(User user) {
		System.out.println("Kontrol Islemi Yapilmaden Eklendi!!");
		return true;
	}

}
