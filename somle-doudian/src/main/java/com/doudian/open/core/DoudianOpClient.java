package com.doudian.open.core;

import java.util.concurrent.Future;

public interface DoudianOpClient {

    /**
     * 发起open api请求
     *
     * @param request 请求入参数
     * @param accessToken 请求令牌
     * @return 请求结果
     */
    <T, R> DoudianOpResponseWrapper<T> request(DoudianOpRequest<R> request, AccessToken accessToken);

    /**
     *
     * 发起异步open api请求
     *
     * @param request 请求入参数
     * @param accessToken 请求令牌
     * @return 请求结果
     */
    <T, R> Future<DoudianOpResponseWrapper<T>> asyncRequest(DoudianOpRequest<R> request, AccessToken accessToken);
}
