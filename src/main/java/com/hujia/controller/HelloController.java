package com.hujia.controller;

import com.hujia.pojo.Users;
import com.hujia.utils.ResponseObject;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HelloController {

    @RequestMapping("/registerOrLogin")
    public ResponseObject registerOrLogin(@RequestBody Users user){

        //1.判断用户名和密码不能为空
        if(StringUtils.isEmpty(user.getUsername()) || StringUtils.isEmpty(user.getPassword())){
            return  ResponseObject.errorMsg("用户名或者密码不能为空.......");
        }
        return null;
    }
}
