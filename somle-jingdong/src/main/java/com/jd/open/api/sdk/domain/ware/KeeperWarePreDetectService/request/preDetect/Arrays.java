package com.jd.open.api.sdk.domain.ware.KeeperWarePreDetectService.request.preDetect;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Arrays implements Serializable {
   private Integer marketingId1;
   private Integer marketingId2;
   private Integer marketingId3;
   private String marketingName1;
   private String marketingName2;
   private String marketingName3;

   @JsonProperty("marketingId1")
   public void setMarketingId1(Integer marketingId1) {
      this.marketingId1 = marketingId1;
   }

   @JsonProperty("marketingId1")
   public Integer getMarketingId1() {
      return this.marketingId1;
   }

   @JsonProperty("marketingId2")
   public void setMarketingId2(Integer marketingId2) {
      this.marketingId2 = marketingId2;
   }

   @JsonProperty("marketingId2")
   public Integer getMarketingId2() {
      return this.marketingId2;
   }

   @JsonProperty("marketingId3")
   public void setMarketingId3(Integer marketingId3) {
      this.marketingId3 = marketingId3;
   }

   @JsonProperty("marketingId3")
   public Integer getMarketingId3() {
      return this.marketingId3;
   }

   @JsonProperty("marketingName1")
   public void setMarketingName1(String marketingName1) {
      this.marketingName1 = marketingName1;
   }

   @JsonProperty("marketingName1")
   public String getMarketingName1() {
      return this.marketingName1;
   }

   @JsonProperty("marketingName2")
   public void setMarketingName2(String marketingName2) {
      this.marketingName2 = marketingName2;
   }

   @JsonProperty("marketingName2")
   public String getMarketingName2() {
      return this.marketingName2;
   }

   @JsonProperty("marketingName3")
   public void setMarketingName3(String marketingName3) {
      this.marketingName3 = marketingName3;
   }

   @JsonProperty("marketingName3")
   public String getMarketingName3() {
      return this.marketingName3;
   }
}
