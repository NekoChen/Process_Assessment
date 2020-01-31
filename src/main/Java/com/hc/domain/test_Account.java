package com.hc.domain;

import java.io.Serializable;

public class test_Account implements Serializable {
    private Integer id;
    private String name;
    private Double money;

    @Override
    public String toString() {
        return "test_Account{" + " id =" + id + " | name ="+ name + " | money =" + money + "}";
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getMoney() {
        return money;
    }
}
