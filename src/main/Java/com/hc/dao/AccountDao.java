package com.hc.dao;

import com.hc.domain.test_Account;

import java.util.List;

public interface AccountDao {
    public List<test_Account> findAll();

    public void saveAccount(test_Account account);
}
