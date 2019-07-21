/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2019/7/20 19:17:01                           */
/*==============================================================*/


drop table if exists t_card;

drop table if exists t_template;

drop table if exists t_template_element;

drop table if exists t_user;

drop table if exists t_user_card;

/*==============================================================*/
/* Table: t_card                                                */
/*==============================================================*/
create table t_card
(
   id                   int(11) not null auto_increment comment '主键',
   user_id              int(11) not null comment '用户id',
   template_id          int(11) comment '名片模板id',
   name                 varchar(50) comment '姓名',
   phone_no             varchar(11) comment '手机号码',
   company_name         varchar(200) comment '公司名称',
   tel_no               varchar(20) comment '公司电话',
   role_name            varchar(500) comment '职责（多个职责以英文逗号隔开）',
   company_address      varchar(1000) comment '公司详细地址',
   email                varchar(100) comment '邮箱',
   wx_account_id        varchar(100) comment '微信号',
   qr_code              varchar(500) comment '二维码图片地址',
   avatar               varchar(500) comment '名片头像地址',
   introduction         blob comment '个人介绍',
   obverse_path         varchar(500) comment '生成名片正面地址',
   reverse_path         varchar(500) comment '生成名片反面地址',
   status               int(1) comment '状态，0：审核中，1：审核通过，2：审核不通过',
   fail_reason          varchar(100) comment '审核不通过原因',
   views                int(11) comment '浏览量',
   uses                 int(11) comment '使用量',
   create_time          datetime comment '创建日期',
   update_time          datetime comment '更新日期',
   primary key (id)
);

alter table t_card comment '名片';

/*==============================================================*/
/* Table: t_template                                            */
/*==============================================================*/
create table t_template
(
   id                   int(11) not null auto_increment comment '主键',
   code                 varchar(50) comment '模板编码',
   name                 varchar(100) comment '模板名称',
   create_user          int(11) comment '创作人',
   upload_user          int(11) comment '上传人',
   type                 int(1) comment '模板类型，0：免费，1：限时免费，2：收费',
   price                double(6,2) comment '价格',
   obverse_path         varchar(500) comment '模板正面图片地址',
   reverse_path         varchar(500) comment '模板反面图片地址',
   status               int(1) comment '模板状态，0：上架，1：下架',
   uses                 int(11) comment '模板使用次数',
   able                 int(1) default 1 comment '是否可用，0：不可用，1：可用',
   primary key (id)
);

alter table t_template comment '模板';

/*==============================================================*/
/* Table: t_template_element                                    */
/*==============================================================*/
create table t_template_element
(
   id                   int(11) not null auto_increment comment '主键',
   template_d           int(11) comment '模板id',
   name                 varchar(50) comment '元素名',
   x_position           int(11) comment 'X坐标（单位：px）',
   y_position           int(11) comment 'Y坐标（单位：px）',
   pic_propo            varchar(10) comment '图片比例（宽高比，单位：px）',
   word_size            int(11) comment '文字大小（单位：px）',
   primary key (id)
);

alter table t_template_element comment '模板元素';

/*==============================================================*/
/* Table: t_user                                                */
/*==============================================================*/
create table t_user
(
   id                   int(11) not null auto_increment comment '主键',
   open_id              varchar(36) comment '微信用户id',
   union_id             varchar(36) comment '微信平台唯一id',
   wx_account_id        varchar(100) comment '微信号',
   real_name            varchar(20) comment '真实姓名',
   nick_name            varchar(36) comment '昵称',
   phone_no             varchar(11) comment '手机号码',
   email                varchar(50) comment '邮箱',
   gender               int(1) comment '性别，0：男，1：女，2：未知',
   wx_avatar            varchar(500) comment '微信头像路径',
   type                 int(1) comment '用户类型，0：普通用户，1：VIP用户',
   status               int(1) comment '用户状态，0：正常，1：停用，2：锁定',
   introduction         blob comment '个人介绍',
   create_time          datetime comment '创建时间',
   update_time          datetime comment '更新时间',
   latest_ip            varchar(100) comment '最近一次登录IP',
   latest_time          datetime comment '最近一次登录时间',
   primary key (id)
);

alter table t_user comment '用户';

/*==============================================================*/
/* Table: t_user_card                                           */
/*==============================================================*/
create table t_user_card
(
   id                   int(11) not null auto_increment comment '主键',
   user_id              int(11) comment '用户id',
   card_id              int(11) comment '名片id',
   type                 int(1) comment '名片类型，0：普通名片，1：感兴趣名片',
   primary key (id)
);

alter table t_user_card comment '用户名片';

