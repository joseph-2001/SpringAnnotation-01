package com.atguigu.service;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.atguigu.dao.BookDAO;

@Service
public class BookService {
    //    @Autowired(required = false)
    //    @Qualifier("bookDAO")
    //@Resource
    @Inject
    private BookDAO bookDAO;

    public void print() {
        System.out.println(bookDAO);
    }
}
