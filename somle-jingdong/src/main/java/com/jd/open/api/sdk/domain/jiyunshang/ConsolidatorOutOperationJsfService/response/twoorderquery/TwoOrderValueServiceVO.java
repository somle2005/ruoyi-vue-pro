package com.jd.open.api.sdk.domain.jiyunshang.ConsolidatorOutOperationJsfService.response.twoorderquery;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class TwoOrderValueServiceVO implements Serializable {
   private Long twoOrderId;
   private Long serviceId;
   private String serviceName;
   private Long serviceFee;
   private String serviceRemark;
   private Long returnAmount;
   private Long actualAmount;
   private String extStr;

   @JsonProperty("twoOrderId")
   public void setTwoOrderId(Long twoOrderId) {
      this.twoOrderId = twoOrderId;
   }

   @JsonProperty("twoOrderId")
   public Long getTwoOrderId() {
      return this.twoOrderId;
   }

   @JsonProperty("serviceId")
   public void setServiceId(Long serviceId) {
      this.serviceId = serviceId;
   }

   @JsonProperty("serviceId")
   public Long getServiceId() {
      return this.serviceId;
   }

   @JsonProperty("serviceName")
   public void setServiceName(String serviceName) {
      this.serviceName = serviceName;
   }

   @JsonProperty("serviceName")
   public String getServiceName() {
      return this.serviceName;
   }

   @JsonProperty("serviceFee")
   public void setServiceFee(Long serviceFee) {
      this.serviceFee = serviceFee;
   }

   @JsonProperty("serviceFee")
   public Long getServiceFee() {
      return this.serviceFee;
   }

   @JsonProperty("serviceRemark")
   public void setServiceRemark(String serviceRemark) {
      this.serviceRemark = serviceRemark;
   }

   @JsonProperty("serviceRemark")
   public String getServiceRemark() {
      return this.serviceRemark;
   }

   @JsonProperty("returnAmount")
   public void setReturnAmount(Long returnAmount) {
      this.returnAmount = returnAmount;
   }

   @JsonProperty("returnAmount")
   public Long getReturnAmount() {
      return this.returnAmount;
   }

   @JsonProperty("actualAmount")
   public void setActualAmount(Long actualAmount) {
      this.actualAmount = actualAmount;
   }

   @JsonProperty("actualAmount")
   public Long getActualAmount() {
      return this.actualAmount;
   }

   @JsonProperty("extStr")
   public void setExtStr(String extStr) {
      this.extStr = extStr;
   }

   @JsonProperty("extStr")
   public String getExtStr() {
      return this.extStr;
   }
}
