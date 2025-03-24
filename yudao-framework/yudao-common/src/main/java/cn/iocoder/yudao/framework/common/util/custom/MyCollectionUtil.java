package cn.iocoder.yudao.framework.common.util.custom;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: LaoSan
 * @create: 2025-03-24 11:10
 **/
public class MyCollectionUtil {

    public static <T> List<List<T>> splitList(List<T> list, int chunkSize) {
        List<List<T>> result = new ArrayList<>();
        if (list == null || list.isEmpty() || chunkSize <= 0) {
            return result;
        }

        for (int i = 0; i < list.size(); i += chunkSize) {
            int end = Math.min(i + chunkSize, list.size());
            result.add(new ArrayList<>(list.subList(i, end)));
        }

        return result;
    }

}
