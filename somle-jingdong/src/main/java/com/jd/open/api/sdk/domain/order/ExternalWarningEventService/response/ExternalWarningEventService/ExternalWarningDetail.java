package com.jd.open.api.sdk.domain.order.ExternalWarningEventService.response.ExternalWarningEventService;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ExternalWarningDetail implements Serializable {
   private Long orderId;
   private Integer abnormalType;
   private String expressCompanyStr;
   private String abnormalTypeStr;
   private Integer abnormalReason;
   private String operableTime;
   private Integer eventType;
   private String expectedLatestStockOutTime;
   private String orderCreateDate;
   private String eventTypeStr;
   private String waybill;
   private String abnormalReasonStr;
   private String expectedLatestTakingExpressTime;
   private Long id;
   private String errorReasonStr;
   private String deliveryDate;
   private Integer expressCompanyId;
   private String createDate;
   private Integer yn;

   @JsonProperty("orderId")
   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   @JsonProperty("orderId")
   public Long getOrderId() {
      return this.orderId;
   }

   @JsonProperty("abnormalType")
   public void setAbnormalType(Integer abnormalType) {
      this.abnormalType = abnormalType;
   }

   @JsonProperty("abnormalType")
   public Integer getAbnormalType() {
      return this.abnormalType;
   }

   @JsonProperty("expressCompanyStr")
   public void setExpressCompanyStr(String expressCompanyStr) {
      this.expressCompanyStr = expressCompanyStr;
   }

   @JsonProperty("expressCompanyStr")
   public String getExpressCompanyStr() {
      return this.expressCompanyStr;
   }

   @JsonProperty("abnormalTypeStr")
   public void setAbnormalTypeStr(String abnormalTypeStr) {
      this.abnormalTypeStr = abnormalTypeStr;
   }

   @JsonProperty("abnormalTypeStr")
   public String getAbnormalTypeStr() {
      return this.abnormalTypeStr;
   }

   @JsonProperty("abnormalReason")
   public void setAbnormalReason(Integer abnormalReason) {
      this.abnormalReason = abnormalReason;
   }

   @JsonProperty("abnormalReason")
   public Integer getAbnormalReason() {
      return this.abnormalReason;
   }

   @JsonProperty("operableTime")
   public void setOperableTime(String operableTime) {
      this.operableTime = operableTime;
   }

   @JsonProperty("operableTime")
   public String getOperableTime() {
      return this.operableTime;
   }

   @JsonProperty("eventType")
   public void setEventType(Integer eventType) {
      this.eventType = eventType;
   }

   @JsonProperty("eventType")
   public Integer getEventType() {
      return this.eventType;
   }

   @JsonProperty("expectedLatestStockOutTime")
   public void setExpectedLatestStockOutTime(String expectedLatestStockOutTime) {
      this.expectedLatestStockOutTime = expectedLatestStockOutTime;
   }

   @JsonProperty("expectedLatestStockOutTime")
   public String getExpectedLatestStockOutTime() {
      return this.expectedLatestStockOutTime;
   }

   @JsonProperty("orderCreateDate")
   public void setOrderCreateDate(String orderCreateDate) {
      this.orderCreateDate = orderCreateDate;
   }

   @JsonProperty("orderCreateDate")
   public String getOrderCreateDate() {
      return this.orderCreateDate;
   }

   @JsonProperty("eventTypeStr")
   public void setEventTypeStr(String eventTypeStr) {
      this.eventTypeStr = eventTypeStr;
   }

   @JsonProperty("eventTypeStr")
   public String getEventTypeStr() {
      return this.eventTypeStr;
   }

   @JsonProperty("waybill")
   public void setWaybill(String waybill) {
      this.waybill = waybill;
   }

   @JsonProperty("waybill")
   public String getWaybill() {
      return this.waybill;
   }

   @JsonProperty("abnormalReasonStr")
   public void setAbnormalReasonStr(String abnormalReasonStr) {
      this.abnormalReasonStr = abnormalReasonStr;
   }

   @JsonProperty("abnormalReasonStr")
   public String getAbnormalReasonStr() {
      return this.abnormalReasonStr;
   }

   @JsonProperty("expectedLatestTakingExpressTime")
   public void setExpectedLatestTakingExpressTime(String expectedLatestTakingExpressTime) {
      this.expectedLatestTakingExpressTime = expectedLatestTakingExpressTime;
   }

   @JsonProperty("expectedLatestTakingExpressTime")
   public String getExpectedLatestTakingExpressTime() {
      return this.expectedLatestTakingExpressTime;
   }

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("errorReasonStr")
   public void setErrorReasonStr(String errorReasonStr) {
      this.errorReasonStr = errorReasonStr;
   }

   @JsonProperty("errorReasonStr")
   public String getErrorReasonStr() {
      return this.errorReasonStr;
   }

   @JsonProperty("deliveryDate")
   public void setDeliveryDate(String deliveryDate) {
      this.deliveryDate = deliveryDate;
   }

   @JsonProperty("deliveryDate")
   public String getDeliveryDate() {
      return this.deliveryDate;
   }

   @JsonProperty("expressCompanyId")
   public void setExpressCompanyId(Integer expressCompanyId) {
      this.expressCompanyId = expressCompanyId;
   }

   @JsonProperty("expressCompanyId")
   public Integer getExpressCompanyId() {
      return this.expressCompanyId;
   }

   @JsonProperty("createDate")
   public void setCreateDate(String createDate) {
      this.createDate = createDate;
   }

   @JsonProperty("createDate")
   public String getCreateDate() {
      return this.createDate;
   }

   @JsonProperty("yn")
   public void setYn(Integer yn) {
      this.yn = yn;
   }

   @JsonProperty("yn")
   public Integer getYn() {
      return this.yn;
   }
}
