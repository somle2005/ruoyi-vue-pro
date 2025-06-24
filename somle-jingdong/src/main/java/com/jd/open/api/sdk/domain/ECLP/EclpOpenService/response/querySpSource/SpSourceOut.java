package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.querySpSource;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class SpSourceOut implements Serializable {
   private String[] spSourceNo;
   private String[] spSourceName;
   private String[] website;
   private String[] reserve1;
   private String[] reserve2;
   private String[] reserve3;
   private String[] reserve4;
   private String[] reserve5;

   @JsonProperty("spSourceNo")
   public void setSpSourceNo(String[] spSourceNo) {
      this.spSourceNo = spSourceNo;
   }

   @JsonProperty("spSourceNo")
   public String[] getSpSourceNo() {
      return this.spSourceNo;
   }

   @JsonProperty("spSourceName")
   public void setSpSourceName(String[] spSourceName) {
      this.spSourceName = spSourceName;
   }

   @JsonProperty("spSourceName")
   public String[] getSpSourceName() {
      return this.spSourceName;
   }

   @JsonProperty("website")
   public void setWebsite(String[] website) {
      this.website = website;
   }

   @JsonProperty("website")
   public String[] getWebsite() {
      return this.website;
   }

   @JsonProperty("reserve1")
   public void setReserve1(String[] reserve1) {
      this.reserve1 = reserve1;
   }

   @JsonProperty("reserve1")
   public String[] getReserve1() {
      return this.reserve1;
   }

   @JsonProperty("reserve2")
   public void setReserve2(String[] reserve2) {
      this.reserve2 = reserve2;
   }

   @JsonProperty("reserve2")
   public String[] getReserve2() {
      return this.reserve2;
   }

   @JsonProperty("reserve3")
   public void setReserve3(String[] reserve3) {
      this.reserve3 = reserve3;
   }

   @JsonProperty("reserve3")
   public String[] getReserve3() {
      return this.reserve3;
   }

   @JsonProperty("reserve4")
   public void setReserve4(String[] reserve4) {
      this.reserve4 = reserve4;
   }

   @JsonProperty("reserve4")
   public String[] getReserve4() {
      return this.reserve4;
   }

   @JsonProperty("reserve5")
   public void setReserve5(String[] reserve5) {
      this.reserve5 = reserve5;
   }

   @JsonProperty("reserve5")
   public String[] getReserve5() {
      return this.reserve5;
   }
}
