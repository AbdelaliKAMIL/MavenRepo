package com.springaop.www;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springaop.www.dao.AccountDao;
import com.springaop.www.dao.MembershipDao;

public class MainDemoApp {
	public static void main(String[] args) {
		// Read sring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// Get the account bean from spring container
		AccountDao theAccountDao = context.getBean("accountDao", AccountDao.class);

		// Get the membership bean from spring container
		MembershipDao theMembershipDao = context.getBean("membershipDao", MembershipDao.class);

		// Call the business method addAccount()
		theAccountDao.addAccount();

		// Do it again
		System.out.println("\nLet's call it again!");
		// Call the business method addAccount() again
		theAccountDao.addAccount();

		// Call the business method deleteAccount()
		theAccountDao.deleteAccount();

		// Call the business method addAccount()
		theMembershipDao.addAccount();

		// Close the context
		context.close();

	}

}
