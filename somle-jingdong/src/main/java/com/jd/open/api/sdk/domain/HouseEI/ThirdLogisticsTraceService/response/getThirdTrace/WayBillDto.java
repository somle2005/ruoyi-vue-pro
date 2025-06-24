package com.jd.open.api.sdk.domain.HouseEI.ThirdLogisticsTraceService.response.getThirdTrace;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class WayBillDto implements Serializable {
   private String shipId;
   private Integer thirdId;
   private String thirdName;
   private Integer status;
   private Date createDate;
   private Date updateDate;
   private Integer flagOrderType;
   private List<TraceDetailDto> listTrace;
   private String businessCode;
   private Integer abroadFlag;

   @JsonProperty("shipId")
   public void setShipId(String shipId) {
      this.shipId = shipId;
   }

   @JsonProperty("shipId")
   public String getShipId() {
      return this.shipId;
   }

   @JsonProperty("thirdId")
   public void setThirdId(Integer thirdId) {
      this.thirdId = thirdId;
   }

   @JsonProperty("thirdId")
   public Integer getThirdId() {
      return this.thirdId;
   }

   @JsonProperty("thirdName")
   public void setThirdName(String thirdName) {
      this.thirdName = thirdName;
   }

   @JsonProperty("thirdName")
   public String getThirdName() {
      return this.thirdName;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("createDate")
   public void setCreateDate(Date createDate) {
      this.createDate = createDate;
   }

   @JsonProperty("createDate")
   public Date getCreateDate() {
      return this.createDate;
   }

   @JsonProperty("updateDate")
   public void setUpdateDate(Date updateDate) {
      this.updateDate = updateDate;
   }

   @JsonProperty("updateDate")
   public Date getUpdateDate() {
      return this.updateDate;
   }

   @JsonProperty("flagOrderType")
   public void setFlagOrderType(Integer flagOrderType) {
      this.flagOrderType = flagOrderType;
   }

   @JsonProperty("flagOrderType")
   public Integer getFlagOrderType() {
      return this.flagOrderType;
   }

   @JsonProperty("listTrace")
   public void setListTrace(List<TraceDetailDto> listTrace) {
      this.listTrace = listTrace;
   }

   @JsonProperty("listTrace")
   public List<TraceDetailDto> getListTrace() {
      return this.listTrace;
   }

   @JsonProperty("businessCode")
   public void setBusinessCode(String businessCode) {
      this.businessCode = businessCode;
   }

   @JsonProperty("businessCode")
   public String getBusinessCode() {
      return this.businessCode;
   }

   @JsonProperty("abroadFlag")
   public void setAbroadFlag(Integer abroadFlag) {
      this.abroadFlag = abroadFlag;
   }

   @JsonProperty("abroadFlag")
   public Integer getAbroadFlag() {
      return this.abroadFlag;
   }
}
