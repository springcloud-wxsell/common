package com.sell.common.dto;

import com.sell.common.enums.OrderStatusEnum;
import com.sell.common.enums.PayStatusEnum;
import com.sell.common.pojo.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author WangWei
 * @Title: OrderDTO
 * @ProjectName common
 * @date 2018/12/3 18:40
 * @description: 订单的传输对象(包括订单和详情）
 */
@Data
public class OrderDTO {

    /** 订单id. */
    private String orderId;

    /** 买家名称. */
    private String buyerName;

    /** 买家电话. */
    private String buyerPhone;

    /** 买家地址. */
    private String buyerAddress;

    /** 买家微信openid. */
    private String buyerOpenid;

    /** 订单总金额. */
    private BigDecimal orderAmount;

    /** 订单状态, 默认为新下单 */
    private Byte orderStatus = (byte) OrderStatusEnum.NEW.getCode().intValue();

    /** 支付状态, 默认为未支付 */
    private Byte payStatus = (byte) PayStatusEnum.WAIT.getCode().intValue();

    /** 订单详情. */
    private List<OrderDetail> orderDetailList;
}
