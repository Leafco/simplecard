package com.lcy.simplecard;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@MapperScan({"com.baomidou.mybatisplus.samples.quickstart.mapper"})
public class SimplecardApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SimplecardApplication.class, args);
    }

}
