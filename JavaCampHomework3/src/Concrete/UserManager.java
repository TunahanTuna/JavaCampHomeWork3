package Concrete;

import Abstract.BaseUserManager;
import Abstract.UserCheckService;
import Entity.User;

public class UserManager extends BaseUserManager{
	
	UserCheckService _userCheckService;
	
	public UserManager(UserCheckService _userCheckService) {
		super();
		this._userCheckService = _userCheckService;
	}
	@Override
	public void save(User user) {
		if (_userCheckService.checkIfRealUser(user)) {
			System.out.println("<<<<<<<<<<<<<<<<<<<<<Mernis Kontrolu yapildi>>>>>>>>>>>>>>>>>>>> ");
			super.save(user);
		}
		
		else {
			System.out.println(user.getFirstName() + " gercek bir insan degil!");
		}
		
	}

}
