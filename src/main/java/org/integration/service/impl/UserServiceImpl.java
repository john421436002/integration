package org.integration.service.impl;

import org.integration.dao.UserDao;
import org.integration.entity.User;
import org.integration.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by hxk on 2016/11/4.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    public int addUser(User user) {
        return userDao.addUser(user);
    }

    public User findUserById(User user) {
        return userDao.findUserById(user);
    }

    /**
     * 根据用户名和密码查询用户是否存在
     * @param username
     * @return
     */
    public User findUserByUsername(String username) {
        return userDao.findUserByUsername(username);
    }
}
