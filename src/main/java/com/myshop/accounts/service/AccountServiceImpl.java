package com.myshop.accounts.service;

import com.myshop.accounts.model.Account;
import com.myshop.accounts.repository.AccountRepository;
import com.myshop.accounts.repository.BaseRepository;

import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl extends BaseServiceImpl<Account,Long> implements AccountService{

    private final AccountRepository accountRepository;


    public AccountServiceImpl(BaseRepository<Account, Long> baseRepository, AccountRepository accountRepository) {
        super(baseRepository);
        this.accountRepository = accountRepository;
    }
}
