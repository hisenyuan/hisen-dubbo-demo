package com.hisen.service.impl;


import com.hisen.dao.BookDao;
import com.hisen.entity.Book;
import com.hisen.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by hisen on 17-4-24.
 * 必须使用阿里的service注解
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    public Book getById(long bookId) {
        return bookDao.queryById(bookId);
    }

    public List<Book> getList(int start, int pageNum) {
        return bookDao.queryAll(start, pageNum);
    }

    public int addBook(Book book) {
        return bookDao.addBook(book);
    }

    public int updateBook(Book book) {
        return bookDao.updateBook(book);
    }

    public int deleteBookById(long id) {
        return bookDao.deleteBookById(id);
    }
}
