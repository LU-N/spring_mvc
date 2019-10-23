package com.service.impl;


import com.dao.UserDao;
import com.service.UserService;

/**
 * @author JinLu
 * @date 2019/10/22
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        userDao.save();
    }
}
