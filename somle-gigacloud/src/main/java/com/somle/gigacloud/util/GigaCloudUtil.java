package com.somle.lingxing.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Slf4j
public class GigaCloudUtil {

    /**
     * 使用Java标准库实现签名生成
     * @param token 用户令牌
     * @param timestamp 时间戳（格式：yyyy-MM-dd HH:mm:ss）
     * @param sk 用户密钥
     * @return 32位小写MD5签名
     */
    public static String generateSignatureStandard(String token, String timestamp, String sk)
        throws NoSuchAlgorithmException {
        // 1. 拼接字符串
        String rawString = token + timestamp + sk;

        // 2. 创建MD5加密实例
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(rawString.getBytes());

        // 3. 获取加密字节并转换为十六进制
        byte[] digest = md.digest();
        StringBuilder hexString = new StringBuilder();
        for (byte b : digest) {
            hexString.append(String.format("%02x", b));
        }
        return hexString.toString();
    }

    /**
     * 使用Apache Commons Codec实现（更简洁）
     * @param token 用户令牌
     * @param timestamp 时间戳
     * @param sk 用户密钥
     * @return 32位小写MD5签名
     */
    public static String generateSignatureWithCommons(String token, String timestamp, String sk) {
        return DigestUtils.md5Hex(token + timestamp + sk);
    }

}
