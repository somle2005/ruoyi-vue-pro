package com.jd.open.api.sdk.domain.seller.VenderBasicSafService.response.getBasicVenderInfoByVenderId;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VenderBasicVO implements Serializable {
   private Long id;
   private Integer status;
   private String shopName;
   private Long shopId;
   private String venderCode;
   private Integer venderType;

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("shopName")
   public void setShopName(String shopName) {
      this.shopName = shopName;
   }

   @JsonProperty("shopName")
   public String getShopName() {
      return this.shopName;
   }

   @JsonProperty("shopId")
   public void setShopId(Long shopId) {
      this.shopId = shopId;
   }

   @JsonProperty("shopId")
   public Long getShopId() {
      return this.shopId;
   }

   @JsonProperty("venderCode")
   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   @JsonProperty("venderCode")
   public String getVenderCode() {
      return this.venderCode;
   }

   @JsonProperty("venderType")
   public void setVenderType(Integer venderType) {
      this.venderType = venderType;
   }

   @JsonProperty("venderType")
   public Integer getVenderType() {
      return this.venderType;
   }
}
