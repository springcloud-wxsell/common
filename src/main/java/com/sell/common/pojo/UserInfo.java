package com.sell.common.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class UserInfo {
    /**
     * 主键
     */
    private String id;

    /**
     * 用户名
     */
    private String username;

    /**
     *  密码
     */
    private String password;
    /**
     * 微信openid
     */
    private String openid;

    /**
     * 角色
     */
    private Byte role;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;
}