package com.sell.common.utils;

import java.util.Random;

/**
 * @author WangWei
 * @Title: KeyUtils
 * @ProjectName common
 * @date 2018/12/3 18:55
 * @description: 生成唯一主键
 */
public class KeyUtils {

    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
