package com.sell.common.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @author WangWei
 * @Title: OrderForm
 * @ProjectName common
 * @date 2018/12/3 20:38
 * @description:
 */
@Data
public class OrderForm {

    @NotEmpty(message = "姓名必填")
    private String name;

    @NotEmpty(message = "手机号码必填")
    private String phone;

    @NotEmpty(message = "地址必填")
    private String address;

    @NotEmpty(message = "openid必填")
    private String openid;

    @NotEmpty(message = "购物车不能为空")
    private String items;
}
