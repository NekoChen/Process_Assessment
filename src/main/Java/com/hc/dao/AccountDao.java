package com.hc.dao;

import com.hc.domain.test_Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {
    @Select("select * from account")
    public List<test_Account> findAll();

    @Insert("insert into account (name,money) value(#{name},#{money})")
    public void saveAccount(test_Account account);
}
