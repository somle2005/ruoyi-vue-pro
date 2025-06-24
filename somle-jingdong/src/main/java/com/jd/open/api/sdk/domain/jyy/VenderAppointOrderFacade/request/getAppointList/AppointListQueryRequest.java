package com.jd.open.api.sdk.domain.jyy.VenderAppointOrderFacade.request.getAppointList;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class AppointListQueryRequest implements Serializable {
   private String customerName;
   private Integer pageSize;
   private List<Sort> sortList;
   private Integer appointStatus;
   private String customerPhone;
   private String endTime;
   private Integer serverType;
   private String cardNo;
   private String startTime;
   private String sourceKey;
   private Long appointOrderId;
   private String address;
   private Long skuId;
   private Integer pageNumber;

   @JsonProperty("customerName")
   public void setCustomerName(String customerName) {
      this.customerName = customerName;
   }

   @JsonProperty("customerName")
   public String getCustomerName() {
      return this.customerName;
   }

   @JsonProperty("pageSize")
   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   @JsonProperty("pageSize")
   public Integer getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("sortList")
   public void setSortList(List<Sort> sortList) {
      this.sortList = sortList;
   }

   @JsonProperty("sortList")
   public List<Sort> getSortList() {
      return this.sortList;
   }

   @JsonProperty("appointStatus")
   public void setAppointStatus(Integer appointStatus) {
      this.appointStatus = appointStatus;
   }

   @JsonProperty("appointStatus")
   public Integer getAppointStatus() {
      return this.appointStatus;
   }

   @JsonProperty("customerPhone")
   public void setCustomerPhone(String customerPhone) {
      this.customerPhone = customerPhone;
   }

   @JsonProperty("customerPhone")
   public String getCustomerPhone() {
      return this.customerPhone;
   }

   @JsonProperty("endTime")
   public void setEndTime(String endTime) {
      this.endTime = endTime;
   }

   @JsonProperty("endTime")
   public String getEndTime() {
      return this.endTime;
   }

   @JsonProperty("serverType")
   public void setServerType(Integer serverType) {
      this.serverType = serverType;
   }

   @JsonProperty("serverType")
   public Integer getServerType() {
      return this.serverType;
   }

   @JsonProperty("cardNo")
   public void setCardNo(String cardNo) {
      this.cardNo = cardNo;
   }

   @JsonProperty("cardNo")
   public String getCardNo() {
      return this.cardNo;
   }

   @JsonProperty("startTime")
   public void setStartTime(String startTime) {
      this.startTime = startTime;
   }

   @JsonProperty("startTime")
   public String getStartTime() {
      return this.startTime;
   }

   @JsonProperty("sourceKey")
   public void setSourceKey(String sourceKey) {
      this.sourceKey = sourceKey;
   }

   @JsonProperty("sourceKey")
   public String getSourceKey() {
      return this.sourceKey;
   }

   @JsonProperty("appointOrderId")
   public void setAppointOrderId(Long appointOrderId) {
      this.appointOrderId = appointOrderId;
   }

   @JsonProperty("appointOrderId")
   public Long getAppointOrderId() {
      return this.appointOrderId;
   }

   @JsonProperty("address")
   public void setAddress(String address) {
      this.address = address;
   }

   @JsonProperty("address")
   public String getAddress() {
      return this.address;
   }

   @JsonProperty("skuId")
   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   @JsonProperty("skuId")
   public Long getSkuId() {
      return this.skuId;
   }

   @JsonProperty("pageNumber")
   public void setPageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
   }

   @JsonProperty("pageNumber")
   public Integer getPageNumber() {
      return this.pageNumber;
   }
}
