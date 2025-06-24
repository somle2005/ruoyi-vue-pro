package com.jd.open.api.sdk.domain.ware.KeeperAuditResultService.request.detail;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Map;

public class I18nParam implements Serializable {
   private Map<String, Integer> extendAttr;

   @JsonProperty("extendAttr")
   public void setExtendAttr(Map<String, Integer> extendAttr) {
      this.extendAttr = extendAttr;
   }

   @JsonProperty("extendAttr")
   public Map<String, Integer> getExtendAttr() {
      return this.extendAttr;
   }
}
