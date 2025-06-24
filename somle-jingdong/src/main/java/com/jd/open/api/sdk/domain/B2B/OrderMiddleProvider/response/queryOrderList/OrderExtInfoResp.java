package com.jd.open.api.sdk.domain.B2B.OrderMiddleProvider.response.queryOrderList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class OrderExtInfoResp implements Serializable {
   private Map extInfo;

   @JsonProperty("extInfo")
   public void setExtInfo(Map extInfo) {
      this.extInfo = extInfo;
   }

   @JsonProperty("extInfo")
   public Map getExtInfo() {
      return this.extInfo;
   }
}
