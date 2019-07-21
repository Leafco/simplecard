/**
 * 文 件 名：  MybatisPlusConfig
 * 版    权： Copyright 2015 南京宝玮科技有限公司,  All rights reserved
 * 描    述： <描述>
 * 版    本： <版本号>
 * 创 建 人： 操陆峰
 * 创建时间： 2019/07/21 2:53
 */
package com.lcy.simplecard.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.optimize.JsqlParserCountOptimize;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * mybatis-plus配置类
 * <功能详细描述>
 *
 * @author 操陆峰
 * @version [版本号, 2019/07/21 2:53]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
@Configuration
@MapperScan("com.lcy.simplecard.mapper")
public class MybatisPlusConfig
{
    /**
     * @description 分页插件
     * @author 操陆峰
     * @date 2019/7/21 2:57
     * @param
     * @return com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor().setCountSqlParser(new JsqlParserCountOptimize(true));
    }

    /**
     * @description sql执行效率
     * @author 操陆峰
     * @date 2019/7/21 3:41
     * @param
     * @return com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor
     */
    @Bean
    public PerformanceInterceptor performanceInterceptor() {
        return new PerformanceInterceptor();
    }
}
