package com.jd.open.api.sdk.response.im;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class POPGroup implements Serializable {
   private String shopName;
   private String shopUrl;
   private int waiterCount;
   private List<Waiter> waiterList;

   @JsonProperty("shopName")
   public void setShopName(String shopName) {
      this.shopName = shopName;
   }

   @JsonProperty("shopName")
   public String getShopName() {
      return this.shopName;
   }

   @JsonProperty("shopUrl")
   public void setShopUrl(String shopUrl) {
      this.shopUrl = shopUrl;
   }

   @JsonProperty("shopUrl")
   public String getShopUrl() {
      return this.shopUrl;
   }

   @JsonProperty("waiterCount")
   public void setWaiterCount(int waiterCount) {
      this.waiterCount = waiterCount;
   }

   @JsonProperty("waiterCount")
   public int getWaiterCount() {
      return this.waiterCount;
   }

   @JsonProperty("waiterList")
   public void setWaiterList(List<Waiter> waiterList) {
      this.waiterList = waiterList;
   }

   @JsonProperty("waiterList")
   public List<Waiter> getWaiterList() {
      return this.waiterList;
   }
}
