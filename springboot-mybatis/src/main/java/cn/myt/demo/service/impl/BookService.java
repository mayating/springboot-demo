package cn.myt.demo.service.impl;

import cn.myt.demo.mapper.BookMapper;
import cn.myt.demo.model.Book;
import cn.myt.demo.service.IBookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: mayating
 * @date: 2022/1/9
 */
@Service
public class BookService implements IBookService {

    @Resource
    private BookMapper bookMapper;

    @Override
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int updateBook(Book book) {
        return bookMapper.updateBookById(book);
    }

    @Override
    public int deleteBookById(Integer id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public Book getBookById(Integer id) {
        return bookMapper.getBookById(id);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookMapper.getAllBooks();
    }
}
