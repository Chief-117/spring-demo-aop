package com.noah.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.noah.aopdemo.dao.AccountDAO;
import com.noah.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		//read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		//get bean
		AccountDAO accountDAO = 
				context.getBean("accountDAO",AccountDAO.class);
		MembershipDAO membershipdao = 
				context.getBean("membershipDAO",MembershipDAO.class);
		//call business method
		Account account = new Account() ;
		accountDAO.addAccount(account,true); 
		membershipdao.addAccount();
		accountDAO.doWork();
		membershipdao.doSleep();
		//do it again
//		System.out.println("再一次");
//		accountDAO.addAccount();
		//close
		context.close();
	}

}
