package com.hc.service.Impl;

import com.hc.domain.test_Account;
import com.hc.service.test_Service;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("test_Service")
public class test_Impl implements test_Service {

    @Override
    public List<test_Account> findAll() {
        System.out.println("Service业务层：查询所有账户...");
        return null;
    }

    @Override
    public void saveAccount(test_Account account) {
        System.out.println("Service业务层：保存帐户...");
    }
}
