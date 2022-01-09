package cn.myt.demo.mapper;

import cn.myt.demo.model.Book;

import java.util.List;

/**
 * @author: mayating
 * @date: 2022/1/9
 */
public interface BookMapper {

    int addBook(Book book);

    int deleteBookById(Integer id);

    int updateBookById(Book book);

    Book getBookById(Integer id);

    List<Book> getAllBooks();
}
