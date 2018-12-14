package com.sell.common.dto;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author WangWei
 * @Title: ProductInfoDTO
 * @ProjectName common
 * @date 2018/12/5 20:48
 * @description:
 */
@Data
@Slf4j
public class ProductInfoDTO implements Serializable {
    private String productId;

    /** 名字. */
    private String productName;

    /** 单价. */
    private BigDecimal productPrice;

    /** 库存. */
    private Integer productStock;

    /** 描述. */
    private String productDescription;

    /** 小图. */
    private String productIcon;

    /** 状态, 0正常1,下架. */
    private Integer productStatus;

    /** 类目编号. */
    private Integer categoryType;

}
