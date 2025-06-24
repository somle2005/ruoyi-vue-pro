package com.jd.open.api.sdk.internal.parser;

import com.jd.open.api.sdk.JdException;
import com.jd.open.api.sdk.response.AbstractResponse;

public interface Parser {
   <T extends AbstractResponse> T parse(String var1, Class<T> var2, String var3) throws JdException;
}
