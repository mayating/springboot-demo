package cn.myt.demo.controller;

import cn.myt.demo.mapper1.BookMapper;
import cn.myt.demo.mapper2.BookMapper2;
import cn.myt.demo.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: mayating
 * @date: 2022/1/9
 */
@RestController
public class BookController {

    // 简便起见，这里直接将 Mapper注入Controller中
    @Resource
    private BookMapper bookMapper;
    @Resource
    private BookMapper2 bookMapper2;

    @GetMapping("/test1")
    public void test1() {
        List<Book> books1 = bookMapper.getAllBooks();
        List<Book> books2 = bookMapper2.getAllBooks();
        System.out.println("books1:" + books1);
        System.out.println("books2:" + books2);
    }
}
