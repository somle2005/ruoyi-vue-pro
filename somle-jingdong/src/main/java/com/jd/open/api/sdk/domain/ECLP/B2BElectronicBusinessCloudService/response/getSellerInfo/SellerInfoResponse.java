package com.jd.open.api.sdk.domain.ECLP.B2BElectronicBusinessCloudService.response.getSellerInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SellerInfoResponse implements Serializable {
   private String sellerNo;
   private List<ShopWarehouseInfo> shopWarehouseInfoList;

   @JsonProperty("sellerNo")
   public void setSellerNo(String sellerNo) {
      this.sellerNo = sellerNo;
   }

   @JsonProperty("sellerNo")
   public String getSellerNo() {
      return this.sellerNo;
   }

   @JsonProperty("shopWarehouseInfoList")
   public void setShopWarehouseInfoList(List<ShopWarehouseInfo> shopWarehouseInfoList) {
      this.shopWarehouseInfoList = shopWarehouseInfoList;
   }

   @JsonProperty("shopWarehouseInfoList")
   public List<ShopWarehouseInfo> getShopWarehouseInfoList() {
      return this.shopWarehouseInfoList;
   }
}
