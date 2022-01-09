package cn.myt.demo.service;

import cn.myt.demo.model.Book;

import java.util.List;

/**
 * @author: mayating
 * @date: 2022/1/9
 */
public interface IBookService {

    /**
     * 新增
     *
     * @param book
     * @return
     */
    int addBook(Book book);

    /**
     * 更新
     *
     * @param book
     * @return
     */
    int updateBook(Book book);

    /**
     * 根据ID删除
     *
     * @param id
     * @return
     */
    int deleteBookById(Integer id);

    /**
     * 根据ID获取book信息
     *
     * @param id
     * @return
     */
    Book getBookById(Integer id);

    /**
     * 查询列表
     *
     * @return
     */
    List<Book> getAllBooks();
}
