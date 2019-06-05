package com.myk.learning.shiro.dao;

import com.myk.learning.shiro.model.UserInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * The interface User info dao.
 *
 * @author myk
 */
public interface UserInfoDao extends CrudRepository<UserInfo, Long> {
    /**
     * 通过username查找用户信息; @param username the username
     *
     * @param username the username
     * @return the user info
     */
    UserInfo findByUsername(String username);

    /**
     * Find by username and password user info.
     * 校验账号密码
     *
     * @param username the username
     * @param password the password
     * @return the user info
     */
    UserInfo findByUsernameAndPassword(String username, String password);

}