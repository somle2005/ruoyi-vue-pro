package com.jd.open.api.sdk.domain.B2B.ServiceErpService.response.queryServiceList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class OrderSku implements Serializable {
   private String name;
   private String imagePath;
   private Long jdSkuId;
   private BigDecimal price;
   private Integer num;

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("imagePath")
   public void setImagePath(String imagePath) {
      this.imagePath = imagePath;
   }

   @JsonProperty("imagePath")
   public String getImagePath() {
      return this.imagePath;
   }

   @JsonProperty("jdSkuId")
   public void setJdSkuId(Long jdSkuId) {
      this.jdSkuId = jdSkuId;
   }

   @JsonProperty("jdSkuId")
   public Long getJdSkuId() {
      return this.jdSkuId;
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
}
