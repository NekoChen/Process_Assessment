package com.hc.service;

import com.hc.domain.test_Account;

import java.util.List;

public interface test_Service {
    public List<test_Account> findAll();

    public  void saveAccount(test_Account account);
}
