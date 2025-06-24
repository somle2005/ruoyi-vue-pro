package com.jd.open.api.sdk.internal.parser;

import com.jd.open.api.sdk.JdException;
import com.jd.open.api.sdk.response.AbstractResponse;

public class XmlParser implements Parser {
   public <T extends AbstractResponse> T parse(String formatString, Class<T> responseClass, String apiName) throws JdException {
      return null;
   }
}
