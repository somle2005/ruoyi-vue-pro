package com.jd.open.api.sdk.domain.order.SnUploadJosService.request.upload;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class SnUploadReq implements Serializable {
   private Long orderId;
   private Integer serialCodeType;
   private String serialCode;
   private Long skuId;
   private List<SerialCode> serialCodeList;

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("serialCodeType")
   public void setSerialCodeType(Integer serialCodeType) {
      this.serialCodeType = serialCodeType;
   }

   @JsonProperty("serialCodeType")
   public Integer getSerialCodeType() {
      return this.serialCodeType;
   }

   @JsonProperty("serialCode")
   public void setSerialCode(String serialCode) {
      this.serialCode = serialCode;
   }

   @JsonProperty("serialCode")
   public String getSerialCode() {
      return this.serialCode;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("serialCodeList")
   public void setSerialCodeList(List<SerialCode> serialCodeList) {
      this.serialCodeList = serialCodeList;
   }

   @JsonProperty("serialCodeList")
   public List<SerialCode> getSerialCodeList() {
      return this.serialCodeList;
   }
}
