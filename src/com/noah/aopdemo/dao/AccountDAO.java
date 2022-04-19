package com.noah.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	public void addAccount() {
		System.out.println(getClass()+" 資料庫執行 : 新增帳戶");
	}
}
