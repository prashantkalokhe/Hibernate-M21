package com.cg.service;

import com.cg.entities.User;

public interface IUserService {
	void addNewUser(User user);
	void updateUser(User user);
	void login(User user);
	void logOut();

}
