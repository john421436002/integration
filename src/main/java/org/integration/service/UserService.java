package org.integration.service;

import org.integration.entity.User;

/**
 * Created by hxk on 2016/11/4.
 */
public interface UserService {
    public int addUser(User user);

    public  User findUserById(User user);

    /**
     * 根据用户名查询用户是否存在
     * @param username
     * @return
     */
    public User findUserByUsername(String username);
}
