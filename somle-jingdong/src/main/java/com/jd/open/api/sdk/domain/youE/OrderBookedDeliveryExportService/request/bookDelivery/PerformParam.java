package com.jd.open.api.sdk.domain.youE.OrderBookedDeliveryExportService.request.bookDelivery;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PerformParam implements Serializable {
   private String venderCode;
   private String appId;
   private String createBy;
   private String token;
   private BookDeliveryParam data;

   @JsonProperty("venderCode")
   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   @JsonProperty("venderCode")
   public String getVenderCode() {
      return this.venderCode;
   }

   @JsonProperty("appId")
   public void setAppId(String appId) {
      this.appId = appId;
   }

   @JsonProperty("appId")
   public String getAppId() {
      return this.appId;
   }

   @JsonProperty("createBy")
   public void setCreateBy(String createBy) {
      this.createBy = createBy;
   }

   @JsonProperty("createBy")
   public String getCreateBy() {
      return this.createBy;
   }

   @JsonProperty("token")
   public void setToken(String token) {
      this.token = token;
   }

   @JsonProperty("token")
   public String getToken() {
      return this.token;
   }

   @JsonProperty("data")
   public void setData(BookDeliveryParam data) {
      this.data = data;
   }

   @JsonProperty("data")
   public BookDeliveryParam getData() {
      return this.data;
   }
}
