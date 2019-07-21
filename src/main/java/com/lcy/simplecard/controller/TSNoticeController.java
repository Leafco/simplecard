package com.lcy.simplecard.controller;


import com.lcy.simplecard.entity.TSNotice;
import com.lcy.simplecard.service.ITSNoticeService;
import com.lcy.simplecard.service.impl.TSNoticeServiceImpl;
import com.lcy.simplecard.utils.RestResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 通知公告表 前端控制器
 * </p>
 *
 * @author caolf
 * @since 2019-07-21
 */
@RestController
@RequestMapping("/simplecard/t-snotice")
public class TSNoticeController {

    @Autowired
    private ITSNoticeService noticeService;

    @ApiOperation(value = "查询所有note", httpMethod = "GET", produces = "application/json")
    @GetMapping("/getAllNote")
    @ResponseBody
    public RestResult getAllNote() {
        List<TSNotice> data = noticeService.list();
        return RestResult.success(data);
    }
}
