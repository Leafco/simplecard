package com.lcy.simplecard.service.impl;

import com.lcy.simplecard.entity.TSNotice;
import com.lcy.simplecard.mapper.TSNoticeMapper;
import com.lcy.simplecard.service.ITSNoticeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 通知公告表 服务实现类
 * </p>
 *
 * @author caolf
 * @since 2019-07-21
 */
@Service
public class TSNoticeServiceImpl extends ServiceImpl<TSNoticeMapper, TSNotice> implements ITSNoticeService {
}
