/**
 * 文 件 名：  TestController
 * 版    权： Copyright 2015 南京宝玮科技有限公司,  All rights reserved
 * 描    述： <描述>
 * 版    本： <版本号>
 * 创 建 人： 操陆峰
 * 创建时间： 2019/07/20 21:00
 */
package com.lcy.simplecard.controller;

import com.lcy.simplecard.entity.TSNotice;
import com.lcy.simplecard.service.TestService;
import com.lcy.simplecard.utils.RestResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author 操陆峰
 * @version [版本号, 2019/07/20 21:00]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
@CrossOrigin
@RestController
@RequestMapping("/api/v1/simplecard/test")
@Api(value = "测试接口")
@Log4j2
public class TestController
{
    @Autowired
    private TestService testService;

    @ApiOperation(value = "查询所有note", httpMethod = "GET", produces = "application/json")
    @GetMapping("/getNoteList")
    @ResponseBody
    public RestResult getNoteList() {
        List<TSNotice> noteList = new ArrayList<>();
        try
        {
            noteList = testService.getNoteList();
        } catch (Exception e) {
            log.error("查询列表时exception", e);
        }
        return RestResult.success(noteList);
    }
}
