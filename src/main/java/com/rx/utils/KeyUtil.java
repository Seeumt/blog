package com.rx.utils;

import java.util.Random;

public class KeyUtil {

    /**
     * 生成唯一主键
     * 格式：时间+随机数
     * @return
     */
    public static synchronized Integer genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return number;

    }
}
