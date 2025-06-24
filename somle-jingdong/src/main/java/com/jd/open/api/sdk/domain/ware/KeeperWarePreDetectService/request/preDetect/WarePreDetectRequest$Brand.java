package com.jd.open.api.sdk.domain.ware.KeeperWarePreDetectService.request.preDetect;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class WarePreDetectRequest$Brand implements Serializable {
   private String cn;
   private String en;
   private String full;

   @JsonProperty("cn")
   public void setCn(String cn) {
      this.cn = cn;
   }

   @JsonProperty("cn")
   public String getCn() {
      return this.cn;
   }

   @JsonProperty("en")
   public void setEn(String en) {
      this.en = en;
   }

   @JsonProperty("en")
   public String getEn() {
      return this.en;
   }

   @JsonProperty("full")
   public void setFull(String full) {
      this.full = full;
   }

   @JsonProperty("full")
   public String getFull() {
      return this.full;
   }
}
