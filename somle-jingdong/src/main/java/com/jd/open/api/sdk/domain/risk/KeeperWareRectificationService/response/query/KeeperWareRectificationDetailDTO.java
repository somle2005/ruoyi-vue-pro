package com.jd.open.api.sdk.domain.risk.KeeperWareRectificationService.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class KeeperWareRectificationDetailDTO implements Serializable {
   private String reason;
   private String fieldName;
   private String way;

   @JsonProperty("reason")
   public void setReason(String reason) {
      this.reason = reason;
   }

   @JsonProperty("reason")
   public String getReason() {
      return this.reason;
   }

   @JsonProperty("fieldName")
   public void setFieldName(String fieldName) {
      this.fieldName = fieldName;
   }

   @JsonProperty("fieldName")
   public String getFieldName() {
      return this.fieldName;
   }

   @JsonProperty("way")
   public void setWay(String way) {
      this.way = way;
   }

   @JsonProperty("way")
   public String getWay() {
      return this.way;
   }
}
