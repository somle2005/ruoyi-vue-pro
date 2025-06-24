package com.jd.open.api.sdk.domain.yjs.StoreClient.response.queryStorePageDetailData;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class StorePageDetailResponse implements Serializable {
   private List<StoreRecommendSku> storeRecommendSkuList;
   private String msg;
   private Integer code;
   private StoreInfo storeInfo;
   private String nearbyStoreUrl;

   @JsonProperty("storeRecommendSkuList")
   public void setStoreRecommendSkuList(List<StoreRecommendSku> storeRecommendSkuList) {
      this.storeRecommendSkuList = storeRecommendSkuList;
   }

   @JsonProperty("storeRecommendSkuList")
   public List<StoreRecommendSku> getStoreRecommendSkuList() {
      return this.storeRecommendSkuList;
   }

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("code")
   public void setCode(Integer code) {
      this.code = code;
   }

   @JsonProperty("code")
   public Integer getCode() {
      return this.code;
   }

   @JsonProperty("storeInfo")
   public void setStoreInfo(StoreInfo storeInfo) {
      this.storeInfo = storeInfo;
   }

   @JsonProperty("storeInfo")
   public StoreInfo getStoreInfo() {
      return this.storeInfo;
   }

   @JsonProperty("nearbyStoreUrl")
   public void setNearbyStoreUrl(String nearbyStoreUrl) {
      this.nearbyStoreUrl = nearbyStoreUrl;
   }

   @JsonProperty("nearbyStoreUrl")
   public String getNearbyStoreUrl() {
      return this.nearbyStoreUrl;
   }
}
