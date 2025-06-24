package com.jd.open.api.sdk.domain.youE.OrderFinishExportService.request.orderFinish;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class FinishOrder implements Serializable {
   private String orderNo;
   private String remark;
   private Integer dealResult;
   private List<String> finishPics;
   private AfterSalesInfo afterSalesInfo;
   private DeviceInfo deviceInfo;
   private RecycleInfo recycleInfo;
   private String buyYear;
   private String receiveBrand;
   private MeasurementsInfo measurementsInfo;

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("dealResult")
   public void setDealResult(Integer dealResult) {
      this.dealResult = dealResult;
   }

   @JsonProperty("dealResult")
   public Integer getDealResult() {
      return this.dealResult;
   }

   @JsonProperty("finishPics")
   public void setFinishPics(List<String> finishPics) {
      this.finishPics = finishPics;
   }

   @JsonProperty("finishPics")
   public List<String> getFinishPics() {
      return this.finishPics;
   }

   @JsonProperty("afterSalesInfo")
   public void setAfterSalesInfo(AfterSalesInfo afterSalesInfo) {
      this.afterSalesInfo = afterSalesInfo;
   }

   @JsonProperty("afterSalesInfo")
   public AfterSalesInfo getAfterSalesInfo() {
      return this.afterSalesInfo;
   }

   @JsonProperty("deviceInfo")
   public void setDeviceInfo(DeviceInfo deviceInfo) {
      this.deviceInfo = deviceInfo;
   }

   @JsonProperty("deviceInfo")
   public DeviceInfo getDeviceInfo() {
      return this.deviceInfo;
   }

   @JsonProperty("recycleInfo")
   public void setRecycleInfo(RecycleInfo recycleInfo) {
      this.recycleInfo = recycleInfo;
   }

   @JsonProperty("recycleInfo")
   public RecycleInfo getRecycleInfo() {
      return this.recycleInfo;
   }

   @JsonProperty("buyYear")
   public void setBuyYear(String buyYear) {
      this.buyYear = buyYear;
   }

   @JsonProperty("buyYear")
   public String getBuyYear() {
      return this.buyYear;
   }

   @JsonProperty("receiveBrand")
   public void setReceiveBrand(String receiveBrand) {
      this.receiveBrand = receiveBrand;
   }

   @JsonProperty("receiveBrand")
   public String getReceiveBrand() {
      return this.receiveBrand;
   }

   @JsonProperty("measurementsInfo")
   public void setMeasurementsInfo(MeasurementsInfo measurementsInfo) {
      this.measurementsInfo = measurementsInfo;
   }

   @JsonProperty("measurementsInfo")
   public MeasurementsInfo getMeasurementsInfo() {
      return this.measurementsInfo;
   }
}
