package com.jd.open.api.sdk.domain.seller.VenderInfoJosService.response.queryByPin;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VenderInfoResult implements Serializable {
   private Long venderId;
   private Integer colType;
   private Long shopId;
   private String shopName;
   private Long cateMain;

   @JsonProperty("vender_id")
   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("vender_id")
   public Long getVenderId() {
      return this.venderId;
   }

   @JsonProperty("col_type")
   public void setColType(Integer colType) {
      this.colType = colType;
   }

   @JsonProperty("col_type")
   public Integer getColType() {
      return this.colType;
   }

   @JsonProperty("shop_id")
   public void setShopId(Long shopId) {
      this.shopId = shopId;
   }

   @JsonProperty("shop_id")
   public Long getShopId() {
      return this.shopId;
   }

   @JsonProperty("shop_name")
   public void setShopName(String shopName) {
      this.shopName = shopName;
   }

   @JsonProperty("shop_name")
   public String getShopName() {
      return this.shopName;
   }

   @JsonProperty("cate_main")
   public void setCateMain(Long cateMain) {
      this.cateMain = cateMain;
   }

   @JsonProperty("cate_main")
   public Long getCateMain() {
      return this.cateMain;
   }
}
