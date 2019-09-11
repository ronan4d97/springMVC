package com.springmvcone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginService {

	@Autowired
	private LoginDAO loginDao;

	public boolean check(String userName, String password) {

		List<User> users = loginDao.findAll();

		for (User user : users) {

			if (userName.equals(user.getUserName()) && password.equals(user.getPassword())) 
				return true;
		}
		
		return false;
	}
}
