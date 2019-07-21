/**
 * 文 件 名：  TestDao
 * 版    权： Copyright 2015 南京宝玮科技有限公司,  All rights reserved
 * 描    述： <描述>
 * 版    本： <版本号>
 * 创 建 人： 操陆峰
 * 创建时间： 2019/07/20 21:48
 */
package com.lcy.simplecard.mapper;

import com.lcy.simplecard.entity.TSNotice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author 操陆峰
 * @version [版本号, 2019/07/20 21:48]
 * @see  [相关类/方法]
 * @since [产品/模块版本]
 */
@Mapper
public interface TestDao
{
    List<TSNotice> getNoteList();

}
