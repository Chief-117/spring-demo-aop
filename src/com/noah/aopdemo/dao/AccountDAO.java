package com.noah.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.noah.aopdemo.Account;

@Component
public class AccountDAO {
	public void addAccount(Account account,boolean vipFlag) {
		System.out.println(getClass()+" 資料庫執行 : 新增帳戶");
	}
	
	public boolean doWork() {
		System.out.println(getClass()+"DOING WORK");
		return true;
	}
}
