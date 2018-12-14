package com.sell.common.exception;

import com.sell.common.enums.ResultEnum;

/**
 * @author WangWei
 * @Title: ProductException
 * @ProjectName common
 * @date 2018/12/6 21:03
 * @description:
 */
public class ProductException extends RuntimeException {

    private Integer code;

    public ProductException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
