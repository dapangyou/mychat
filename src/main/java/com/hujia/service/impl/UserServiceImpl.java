package com.hujia.service.impl;

import com.hujia.mapper.UsersMapper;
import com.hujia.pojo.Users;
import com.hujia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public boolean queryUsernameIsExist(String username) {
        Users user = new Users();
        user.setUsername(username);
      //  usersMapper.sele
        return false;
    }
}
