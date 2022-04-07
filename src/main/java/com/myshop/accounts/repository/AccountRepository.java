package com.myshop.accounts.repository;

import com.myshop.accounts.model.Account;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends BaseRepository<Account,Long> {
}
