package com.doudian.open.utils;

import com.doudian.open.exception.DoudianOpException;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class CommonUtil {
    public static String readAllFromInputStream(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buffer = new byte[4096];
        int len = 0;
        try {
            while ((len = inputStream.read(buffer)) > 0) {
                out.write(buffer, 0, len);
            }
            return out.toString("utf-8");
        } catch (Exception e){
            throw new DoudianOpException(e);
        }
    }

    public static <T> T getOrDefault(T obj, T def) {
        return obj == null ? def : obj;
    }
}
