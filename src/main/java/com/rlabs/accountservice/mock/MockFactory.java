package com.rlabs.accountservice.mock;

import java.util.ArrayList;
import java.util.List;

import com.rlabs.accountservice.model.Account;

public class MockFactory {
	
	
	public static List<Account> getMockAccounts(){
		
		List<Account> mockList = new ArrayList<>();
		mockList.add(new Account(1, "Lakshitha", "Herath", "008611"));
		mockList.add(new Account(1, "Mark", "Anderson", "342211"));
		mockList.add(new Account(1, "Jhon", "Smith", "9900761"));
		
		return mockList;
	}
	

}
