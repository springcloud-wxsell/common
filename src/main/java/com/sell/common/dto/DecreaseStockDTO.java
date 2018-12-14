package com.sell.common.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author WangWei
 * @Title: DecreaseStockDTO
 * @ProjectName common
 * @date 2018/12/5 20:48
 * @description: 减库存入参
 */
@Data
public class DecreaseStockDTO implements Serializable {

    private String productId;

    private Integer productQuantity;

    public DecreaseStockDTO() {
    }

    public DecreaseStockDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
