package com.lj.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lj.common.domin.User;
import com.lj.common.service.UserService;
import com.lj.provider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

@Service(version = "1.0.0")
public class UserImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUser() {
        User user = userMapper.getOne(1L);
        return user;
    }
}
