package com.jd.open.api.sdk.domain.B2B.PurchaseOrderErpService.response.findPurchaseOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class OrderSku implements Serializable {
   private Long jdSkuId;
   private String imagePath;
   private BigDecimal price;
   private Integer num;
   private String name;
   private Integer wareType;

   @JsonProperty("jdSkuId")
   public void setJdSkuId(Long jdSkuId) {
      this.jdSkuId = jdSkuId;
   }

   @JsonProperty("jdSkuId")
   public Long getJdSkuId() {
      return this.jdSkuId;
   }

   @JsonProperty("imagePath")
   public void setImagePath(String imagePath) {
      this.imagePath = imagePath;
   }

   @JsonProperty("imagePath")
   public String getImagePath() {
      return this.imagePath;
   }

   @JsonProperty("price")
   public void setPrice(BigDecimal price) {
      this.price = price;
   }

   @JsonProperty("price")
   public BigDecimal getPrice() {
      return this.price;
   }

   @JsonProperty("num")
   public void setNum(Integer num) {
      this.num = num;
   }

   @JsonProperty("num")
   public Integer getNum() {
      return this.num;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("wareType")
   public void setWareType(Integer wareType) {
      this.wareType = wareType;
   }

   @JsonProperty("wareType")
   public Integer getWareType() {
      return this.wareType;
   }
}
