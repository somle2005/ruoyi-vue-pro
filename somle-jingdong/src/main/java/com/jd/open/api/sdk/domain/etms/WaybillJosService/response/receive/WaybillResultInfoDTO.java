package com.jd.open.api.sdk.domain.etms.WaybillJosService.response.receive;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class WaybillResultInfoDTO implements Serializable {
   private Integer resultCode;
   private String resultMessage;
   private String orderId;
   private String deliveryId;
   private Integer promiseTimeType;
   private PreSortResult preSortResult;
   private Integer transType;
   private Boolean needRetry;
   private Integer expressOperationMode;
   private String salesThrOrderId;

   @JsonProperty("resultCode")
   public void setResultCode(Integer resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public Integer getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("resultMessage")
   public void setResultMessage(String resultMessage) {
      this.resultMessage = resultMessage;
   }

   @JsonProperty("resultMessage")
   public String getResultMessage() {
      return this.resultMessage;
   }

   @JsonProperty("orderId")
   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public String getOrderId() {
      return this.orderId;
   }

   @JsonProperty("deliveryId")
   public void setDeliveryId(String deliveryId) {
      this.deliveryId = deliveryId;
   }

   @JsonProperty("deliveryId")
   public String getDeliveryId() {
      return this.deliveryId;
   }

   @JsonProperty("promiseTimeType")
   public void setPromiseTimeType(Integer promiseTimeType) {
      this.promiseTimeType = promiseTimeType;
   }

   @JsonProperty("promiseTimeType")
   public Integer getPromiseTimeType() {
      return this.promiseTimeType;
   }

   @JsonProperty("preSortResult")
   public void setPreSortResult(PreSortResult preSortResult) {
      this.preSortResult = preSortResult;
   }

   @JsonProperty("preSortResult")
   public PreSortResult getPreSortResult() {
      return this.preSortResult;
   }

   @JsonProperty("transType")
   public void setTransType(Integer transType) {
      this.transType = transType;
   }

   @JsonProperty("transType")
   public Integer getTransType() {
      return this.transType;
   }

   @JsonProperty("needRetry")
   public void setNeedRetry(Boolean needRetry) {
      this.needRetry = needRetry;
   }

   @JsonProperty("needRetry")
   public Boolean getNeedRetry() {
      return this.needRetry;
   }

   @JsonProperty("expressOperationMode")
   public void setExpressOperationMode(Integer expressOperationMode) {
      this.expressOperationMode = expressOperationMode;
   }

   @JsonProperty("expressOperationMode")
   public Integer getExpressOperationMode() {
      return this.expressOperationMode;
   }

   @JsonProperty("salesThrOrderId")
   public void setSalesThrOrderId(String salesThrOrderId) {
      this.salesThrOrderId = salesThrOrderId;
   }

   @JsonProperty("salesThrOrderId")
   public String getSalesThrOrderId() {
      return this.salesThrOrderId;
   }
}
