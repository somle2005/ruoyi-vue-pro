package com.jd.open.api.sdk.internal.util;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;

public final class JsonUtil {
   private static final ObjectMapper mapper = new ObjectMapper();

   private JsonUtil() {
      throw new UnsupportedOperationException();
   }

   public static String toJson(Object obj) throws IOException {
      mapper.setSerializationInclusion(Include.NON_NULL);
      mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
      mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
      return mapper.writeValueAsString(obj);
   }
}
