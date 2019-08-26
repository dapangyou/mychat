package com.hujia.service;

public interface UserService {

    /**
     * 查询用户名或者密码是否存在
     */
    public boolean queryUsernameIsExist(String username);
}
