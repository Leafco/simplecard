/**
 * 文 件 名：  TestServiceImpl
 * 版    权： Copyright 2015 南京宝玮科技有限公司,  All rights reserved
 * 描    述： <描述>
 * 版    本： <版本号>
 * 创 建 人： 操陆峰
 * 创建时间： 2019/07/20 21:45
 */
package com.lcy.simplecard.service.impl;

import com.lcy.simplecard.mapper.TestDao;
import com.lcy.simplecard.entity.TSNotice;
import com.lcy.simplecard.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author 操陆峰
 * @version [版本号, 2019/07/20 21:45]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
@Service
public class TestServiceImpl implements TestService
{
    @Autowired
    private TestDao testDao;

    @Override public List<TSNotice> getNoteList()
    {
        return testDao.getNoteList();
    }
}
