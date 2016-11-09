package org.integration.dao;


import org.integration.entity.User;

/**
 * Created by hxk on 2016/11/4.
 */
public interface UserDao {
    public int addUser(User user);

    public User findUserById(User user);

    public int updateUser(User user);

    public int deleteUserById(Integer id);

    /**
     * 根据用户名和密码查询用户是否存在
     * @param username
     * @return
     */
    public User findUserByUsername(String username);
}
