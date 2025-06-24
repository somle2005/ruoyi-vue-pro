package com.doudian.open.core;

import java.util.concurrent.Future;

public interface DoudianOpRequestExecutor {

    <R> R execute(AccessToken accessToken);

    <R> R execute();

    <R> Future<R> asyncExecute(AccessToken accessToken);
}
