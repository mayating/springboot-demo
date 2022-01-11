package cn.myt.demo.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: mayating
 * @date: 2022/1/11
 */
@Data
public class Book implements Serializable {

    private static final long serialVersionUID = 759109819057316071L;

    private Integer id;
    private String name;
    private String author;
}
