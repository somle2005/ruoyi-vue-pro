package cn.iocoder.yudao.framework.common.util.custom;

import java.util.*;

/**
 * @description:
 * @author: LaoSan
 * @create: 2025-03-20 08:35
 **/
public class MyCollectionUtils {

    public static <T> Map<String, List<T>> analyzeCollections(List<T> collectionA, List<T> collectionB) {
        // 计算交集
        List<T> intersection = new ArrayList<>();
        for (T itemA : collectionA) {
            if (collectionB.contains(itemA)) {
                intersection.add(itemA);
            }
        }

        // 计算 A - 交集
        List<T> aMinusIntersection = new ArrayList<>(collectionA);
        aMinusIntersection.removeAll(intersection);

        // 计算 B - 交集
        List<T> bMinusIntersection = new ArrayList<>(collectionB);
        bMinusIntersection.removeAll(intersection);

        // 计算 并集，并去重
        Set<T> unionSet = new LinkedHashSet<>(collectionA);
        unionSet.addAll(collectionB);
        List<T> union = new ArrayList<>(unionSet);

        // 构建结果Map
        Map<String, List<T>> result = new HashMap<>();
        result.put("intersection", intersection);
        result.put("aMinusIntersection", aMinusIntersection);
        result.put("bMinusIntersection", bMinusIntersection);
        result.put("union", union);

        return result;
    }


}
