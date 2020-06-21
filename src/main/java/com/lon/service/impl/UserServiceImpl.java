package com.lon.service.impl;
import com.lon.dao.UserDao;
import com.lon.model.UserEntity;
import com.lon.service.UserService;
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    public UserDao getUserDao() {
        return userDao;
    }
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public UserEntity getUser(int id) {
        UserEntity userEntity = userDao.getUser(id);
        return userEntity;
    }
}

