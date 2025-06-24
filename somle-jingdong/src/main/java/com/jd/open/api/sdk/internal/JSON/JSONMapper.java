package com.jd.open.api.sdk.internal.JSON;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class JSONMapper {
   private static ObjectMapper mapper = new ObjectMapper();

   public static String toJSONString(Object obj) {
      try {
         return mapper.writeValueAsString(obj);
      } catch (IOException e) {
         throw new RuntimeException(e);
      }
   }

   public static <T> T parseString(String jsonString, Class<T> clazz) {
      try {
         return (T)mapper.readValue(jsonString, clazz);
      } catch (IOException e) {
         throw new RuntimeException(e);
      }
   }
}
