package com.springaop.www.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDao {
	
	public void addAccount() {
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
	}
	
	public void deleteAccount() {
		System.out.println(getClass() + ": DOING MY DB WORK: DELETING AN ACCOUNT");
	}

}
