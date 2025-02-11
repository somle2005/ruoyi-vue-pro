package com.somle.framework.common.function;

/**
 * @author: LeeFJ
 * @date: 2025/2/11 13:28
 * @description:
 * Consumer 的变体，两个消费参数
 */
public interface PairConsumer<E,V> {
    void apply(E elem,V val);
}