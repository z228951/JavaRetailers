package com.miaosha.service;


import com.miaosha.entity.User;

import javax.servlet.http.HttpServletRequest;

public interface UserService {

    User getById(long id);
    //HttpServletResponse response, String token
    User getByToken(HttpServletRequest request,String token);

    String login(HttpServletRequest request,String   );
}
