package com.hc.service.Impl;

import com.hc.dao.AccountDao;
import com.hc.domain.test_Account;
import com.hc.service.test_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("test_Service")
public class test_Impl implements test_Service {

     @Autowired
     private AccountDao accountDao;

    @Override
    public List<test_Account> findAll() {
        System.out.println("Service业务层：查询所有账户...");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(test_Account account) {
        System.out.println("Service业务层：保存帐户...");
        accountDao.saveAccount(account);
    }
}
