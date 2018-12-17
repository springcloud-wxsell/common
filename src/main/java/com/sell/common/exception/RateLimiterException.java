package com.sell.common.exception;

import com.sell.common.enums.ResultEnum;

/**
 * @author WangWei
 * @Title: RateLimiterException
 * @ProjectName common
 * @date 2018/12/17 17:30
 * @description: 限流异常
 */
public class RateLimiterException extends RuntimeException {

    private Integer code;

    public RateLimiterException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public RateLimiterException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
