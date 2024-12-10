package com.somle.esb.util;

import cn.hutool.extra.pinyin.PinyinUtil;

/**
 * @author: Wqh
 * @date: 2024/12/6 17:30
 * @description: 汉字转拼音
 */
public class PinyinConverter {
    /**
    * @Author Wqh
    * @Description 将中文名字转为英文，并有.将姓和名分割开，默认第一个字符为姓，剩余部分为名称
    * @Date 8:45 2024/12/9
    * @Param [name]
    * @return java.lang.String
    **/
    public static String convertToPinyin(String name) {
        // 拆分姓和名
        // 姓总是第一个字
        String firstName = name.substring(0, 1);
        // 名是剩余的所有字
        String lastName = name.substring(1);
        // 转换为拼音
        String firstNamePinyin = PinyinUtil.getPinyin(firstName);
        String lastNamePinyin = PinyinUtil.getPinyin(lastName);
        //将名的拼音去除空格
        // 返回格式化的拼音
        return firstNamePinyin + "." + lastNamePinyin.replaceAll("\\s+", "");
    }

}
