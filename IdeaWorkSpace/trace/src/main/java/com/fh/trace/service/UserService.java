package com.fh.trace.service;

import com.fh.trace.dao.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    public List<User> queryAllUsers() ;
}
