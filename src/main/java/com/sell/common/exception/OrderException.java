package com.sell.common.exception;


import com.sell.common.enums.ResultEnum;

/**
 * @author WangWei
 * @Title: OrderException
 * @ProjectName common
 * @date 2018/12/3 20:50
 * @description:
 */
public class OrderException extends RuntimeException {

    public Integer code;

    public OrderException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
