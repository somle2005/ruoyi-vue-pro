package com.jd.open.api.sdk.internal.util;

import java.util.HashMap;
import java.util.Map;

public class JdHashMap extends HashMap<String, String> {
   private static final long serialVersionUID = 1391568378542671698L;

   public JdHashMap() {
   }

   public JdHashMap(Map<? extends String, ? extends String> m) {
      super(m);
   }

   public String put(String key, String value) {
      return StringUtil.areNotEmpty(key, value) ? (String)super.put(key, value) : null;
   }
}
