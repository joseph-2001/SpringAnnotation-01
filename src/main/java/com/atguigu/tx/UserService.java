package com.atguigu.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    @Transactional
    public void insertUser() {
        userDAO.insert();
        int a = 10 / 0;
        System.out.println("插入完成...");
    }
}
