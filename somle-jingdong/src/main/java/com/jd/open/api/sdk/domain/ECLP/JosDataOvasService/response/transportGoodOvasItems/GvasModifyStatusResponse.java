package com.jd.open.api.sdk.domain.ECLP.JosDataOvasService.response.transportGoodOvasItems;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class GvasModifyStatusResponse implements Serializable {
   private String goodsNo;
   private Boolean result;
   private String serviceCode;
   private String message;
   private String deptNo;

   @JsonProperty("goodsNo")
   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   @JsonProperty("goodsNo")
   public String getGoodsNo() {
      return this.goodsNo;
   }

   @JsonProperty("result")
   public void setResult(Boolean result) {
      this.result = result;
   }

   @JsonProperty("result")
   public Boolean getResult() {
      return this.result;
   }

   @JsonProperty("serviceCode")
   public void setServiceCode(String serviceCode) {
      this.serviceCode = serviceCode;
   }

   @JsonProperty("serviceCode")
   public String getServiceCode() {
      return this.serviceCode;
   }

   @JsonProperty("message")
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty("message")
   public String getMessage() {
      return this.message;
   }

   @JsonProperty("deptNo")
   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   @JsonProperty("deptNo")
   public String getDeptNo() {
      return this.deptNo;
   }
}
