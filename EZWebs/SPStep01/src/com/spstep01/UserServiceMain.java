package com.spstep01;

public class UserServiceMain {

	public static void main(String[] args) {
		UserService user = new UserServiceImpl();
		user.setName("스프링");
		user.setAge(5);
		user.hiUser();
	}
}
