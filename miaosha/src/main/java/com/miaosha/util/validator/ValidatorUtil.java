package com.miaosha.util.validator;

import org.apache.commons.lang3.StringUtils;

import javax.management.monitor.Monitor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/***
 *
 *  正则表达式
 * @author zhangwe
 * @Date 2018-06-19
 */
public class ValidatorUtil {

    //验证手机号是否是1开头的
    private static final Pattern mobile_pattern = Pattern.compile("1\\d{10}");

    /***
     * 验证手机号是否为空
     * 手机号是以1开头
     * @param mobile
     * @return
     */
    public static boolean isMobile(String mobile) {
        if (StringUtils.isEmpty(mobile)) {
            return false;
        }
        Matcher matcher=mobile_pattern.matcher(mobile);
        return matcher.matches();
    }
}
