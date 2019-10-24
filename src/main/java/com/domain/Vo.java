package com.domain;

import java.util.List;

/**
 * @author JinLu
 * @date 2019/10/24
 */
public class Vo {
    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "Vo{" +
                "userList=" + userList +
                '}';
    }
}
