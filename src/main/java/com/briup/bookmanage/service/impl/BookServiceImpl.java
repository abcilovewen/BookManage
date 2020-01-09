package com.briup.bookmanage.service.impl;

import com.briup.bookmanage.bean.Book;
import com.briup.bookmanage.bean.BookExample;
import com.briup.bookmanage.bean.Reader;
import com.briup.bookmanage.bean.ReaderExample;
import com.briup.bookmanage.bean.ex.BookEX;
import com.briup.bookmanage.mapper.BookMapper;
import com.briup.bookmanage.mapper.ReaderMapper;
import com.briup.bookmanage.mapper.ex.BookEXMapper;
import com.briup.bookmanage.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    private BookMapper bookMapper;
    @Autowired
    private BookEXMapper bookEXMapper;

    @Override
    public BookEX findStatus(int id) throws RuntimeException {
        return bookEXMapper.selectStatus(id);
    }

    @Override
    public void updateStatus(int id, String status) throws RuntimeException {
        bookEXMapper.updateStatus(id,status);
    }
    @Override
    public List<Book> findAll() throws RuntimeException {
        BookExample bookExample = new BookExample();
        List<Book> list = bookMapper.selectByExample(bookExample);
        return list;
    }

    @Override
    public void saveOrUpdate(Book book) throws RuntimeException {
        if (book == null) {
            throw new RuntimeException("参数为空");
        }
        if (book.getId() == null) {
            bookMapper.insert(book);
        } else {
            bookMapper.updateByPrimaryKey(book);
        }
    }

    @Override
    public void delectById(int id) throws RuntimeException {
        bookMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void delectBatch(int id) throws RuntimeException {
        bookMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Book selectById(int id) throws RuntimeException {
        Book book = bookMapper.selectByPrimaryKey(id);
        return book;
    }

    @Override
    public List<Book> selectByFirst(String word) throws RuntimeException {
        word = word == null ? "" : word;
        if (word == null && "".equals(word)) {
            return null;
        } else {
            word = "%" + word + "%";
            return  bookMapper.selectByFirst(word);
        }
    }
}


