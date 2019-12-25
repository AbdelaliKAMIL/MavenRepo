package com.springaop.www.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDao {

	
	public void addAccount() {
		System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
	}
	
}
