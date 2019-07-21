package com.lcy.simplecard.entity;

import lombok.Data;

import java.util.Date;

@Data
public class TSNotice {

  private String id;
  private String noticeTitle;
  private String noticeContent;
  private String noticeType;
  private String noticeLevel;
  private Date noticeTerm;
  private String createUser;
  private Date createTime;

}
