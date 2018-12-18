package com.sell.common.enums;

import lombok.Getter;

/**
 * @author WangWei
 * @Title: RoleEnum
 * @ProjectName common
 * @date 2018/12/18 14:18
 * @description:
 */
@Getter
public enum  RoleEnum {

    BUYER(0, "买家"),

    SELLER(1, "卖家"),

    ;
    private Integer code;

    private String message;

    RoleEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
