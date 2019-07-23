#https://zhangjia.io/852.html
show tables;

#用户表
drop table if exists wl_user ;
CREATE TABLE wl_user (
                         user_id int(9) PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
                         user_ip varchar(20) COMMENT '用户ip',
                         user_name varchar(32) NOT NULL UNIQUE COMMENT '用户名',
                         user_password varchar(120) NOT NULL COMMENT '用户密码',
                         user_salt varchar(32) NOt NULL NOT NULL COMMENT '盐',
                         user_email varchar(30) NOT NULL UNIQUE COMMENT '用户邮箱',
                         user_profile_photo varchar(255) NOT NULL default '/' COMMENT '用户头像',
                         user_registration_time date NOT NULL DEFAULT NOW() COMMENT '注册时间',
                         user_birthday date DEFAULT NULL COMMENT '用户生日',
                         user_age tinyint(4) DEFAULT NULL COMMENT '用户年龄',
                         user_telephone_number int(11) COMMENT '用户手机号',
                         user_nickname varchar(20)  COMMENT '用户昵称',
                         user_Frozen int(1) NOT NULL DEFAULT 0 COMMENT '0否，1冻结',
                         user_lock int(1) NOT NULL DEFAULT 0 COMMENT '0否，1锁',
                         user_update_time date COMMENT '修改时间',
                         user_login_time date COMMENT '上次登入时间'
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;

insert into wl_user (user_name,user_password,user_salt,user_email) values ('laowang','123456','md5','123@qq.com');

#角色
DROP TABLE IF EXISTS wl_role ;
CREATE TABLE wl_role (
                             role_id int(9) PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
                             role varchar(32) NOT NULL COMMENT '角色'
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

insert into wl_role (role) values ('超级用户'),('运营'),('游客');
select * from wl_role;

#用户 ～ 角色
DROP TABLE IF EXISTS wl_user_role ;
CREATE TABLE wl_use_role (
                            user_name int(9) NOT NULL COMMENT '用户名',
                            role_id int(9) NOT NULL COMMENT '角色_id'
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

#权限
DROP TABLE IF EXISTS wl_permission ;
CREATE TABLE wl_permission (
                             permission_id int(9) PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
                             permission varchar(32) NOT NULL COMMENT '权限'
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

insert into wl_permission (permission) values ('all'),('delete'),('insert'),('update'),('select'),('thisSelect');
select * from wl_permission ;

#角色 ～ 权限
DROP TABLE IF EXISTS wl_role_permission ;
CREATE TABLE wl_role_permission (
                                    role_id int(9) NOT NULL COMMENT '角色_id',
                                    permission_id int(9) NOT NULL COMMENT '权限_id'
) ENGINE = InnoDB DEFAULT CHARSET = utf8;
insert into wl_role_permission values(3,6);

#博文
DROP TABLE IF EXISTS wl_article;
CREATE TABLE wl_article (
                         article_id bigint(255) NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
                         user_id bigint(20) NOT NULL unique COMMENT '外键 关联user',
                         article_title text NOT NULL COMMENT '标题',
                         article_content longtext NOT NULL COMMENT '内容',
                         article_views bigint(20) NOT NULL default 0 COMMENT '查看量',
                         article_comment_count bigint(20) NOT NULL default 0 COMMENT '评论总数',
                         article_date datetime NOT NULL COMMENT '评论时间',
                         article_like_count bigint(20) NOT NULL DEFAULT 0 COMMENT '点赞数量'
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

