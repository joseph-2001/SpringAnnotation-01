package com.atguigu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.atguigu.dao.BookDAO;

@Service
public class BookService {
    @Autowired(required = false)
    @Qualifier("bookDAO")
    private BookDAO bookDAO;

    public void print() {
        System.out.println(bookDAO);
    }
}
