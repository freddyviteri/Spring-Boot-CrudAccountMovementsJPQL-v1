package com.myshop.accounts.controller;

import com.myshop.accounts.model.Account;
import com.myshop.accounts.service.AccountServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/accounts")
@CrossOrigin(origins = "*")
public class AccountController extends BaseControllerImpl<Account, AccountServiceImpl> {
}
