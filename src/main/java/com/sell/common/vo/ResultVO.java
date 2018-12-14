package com.sell.common.vo;

import lombok.Data;

/**
 * @author WangWei
 * @Title: ResultVo
 * @ProjectName common
 * @date 2018/12/1 18:59
 * @description: http请求返回的最外层对象
 */
@Data
public class ResultVO<T> {
    /**
     * 错误码
     */
    private Integer code;
    /**
     * 提示信息
     */
    private String message;
    /**
     * 具体数据
     */
    private T data;
}
