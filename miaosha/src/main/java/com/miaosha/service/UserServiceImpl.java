package com.miaosha.service;


import com.miaosha.entity.User;
import com.miaosha.util.LoginVo;

import javax.servlet.http.HttpServletRequest;

public class UserServiceImpl  implements  UserService {




    @Override
    public User getById(long id) {
        return null;
    }

    @Override
    public User getByToken(HttpServletRequest request, String token) {
        return null;
    }

    @Override
    public String login(HttpServletRequest request, LoginVo loginVo) {
        return null;
    }
}
