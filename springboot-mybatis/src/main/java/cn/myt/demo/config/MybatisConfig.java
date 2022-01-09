package cn.myt.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: mayating
 * @date: 2022/1/9
 */
@MapperScan("cn.myt.demo.mapper")
@Configuration
public class MybatisConfig {
}
