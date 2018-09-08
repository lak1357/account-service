package com.rlabs.accountservice.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rlabs.accountservice.mock.MockFactory;
import com.rlabs.accountservice.model.Account;

@RestController
public class AccountController {

	@RequestMapping("/accounts")
	public List<Account> getAccounts() {

		return MockFactory.getMockAccounts();

	}

}
