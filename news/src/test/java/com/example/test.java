package com.example;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.Month;
import cn.hutool.core.util.IdUtil;
import org.junit.jupiter.api.Test;

import java.util.Locale;

public class test {


    @Test
    public void test1(){
        System.out.println(DateUtil.getZodiac(Month.JANUARY.getValue(),18));
        System.out.println(DateUtil.getChineseZodiac(2002));
        System.out.println(DateUtil.now());
        System.out.println(IdUtil.simpleUUID());
        System.out.println(IdUtil.simpleUUID().toUpperCase(Locale.ROOT));
    }
}
