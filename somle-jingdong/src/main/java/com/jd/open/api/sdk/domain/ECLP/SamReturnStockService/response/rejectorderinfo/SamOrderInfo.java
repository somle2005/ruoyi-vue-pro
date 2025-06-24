package com.jd.open.api.sdk.domain.ECLP.SamReturnStockService.response.rejectorderinfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SamOrderInfo implements Serializable {
   private String id;
   private String orderId;
   private String saveTime;
   private List<SamSkuInfo> samSkuInfoList;

   @JsonProperty("id")
   public void setId(String id) {
      this.id = id;
   }

   @JsonProperty("id")
   public String getId() {
      return this.id;
   }

   @JsonProperty("order_id")
   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("order_id")
   public String getOrderId() {
      return this.orderId;
   }

   @JsonProperty("save_time")
   public void setSaveTime(String saveTime) {
      this.saveTime = saveTime;
   }

   @JsonProperty("save_time")
   public String getSaveTime() {
      return this.saveTime;
   }

   @JsonProperty("sam_sku_info_list")
   public void setSamSkuInfoList(List<SamSkuInfo> samSkuInfoList) {
      this.samSkuInfoList = samSkuInfoList;
   }

   @JsonProperty("sam_sku_info_list")
   public List<SamSkuInfo> getSamSkuInfoList() {
      return this.samSkuInfoList;
   }
}
