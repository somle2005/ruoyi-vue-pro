package com.jd.open.api.sdk.domain.etms.WaybillTrackAndTimePositionApi.response.WaybillTrackAndTimePositionApi;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class WaybillGisTrackDto implements Serializable {
   private Integer waybillFinishFlag;
   private Integer gpsFrequency;
   private Integer gpsSource;
   private String gpsSourceName;
   private String courierCode;
   private String courierName;
   private String courierMobile;
   private Integer tplFlag;
   private String arrivedTime;
   private List<WaybillGisDto> waybillGisDtoList;

   @JsonProperty("waybillFinishFlag")
   public void setWaybillFinishFlag(Integer waybillFinishFlag) {
      this.waybillFinishFlag = waybillFinishFlag;
   }

   @JsonProperty("waybillFinishFlag")
   public Integer getWaybillFinishFlag() {
      return this.waybillFinishFlag;
   }

   @JsonProperty("gpsFrequency")
   public void setGpsFrequency(Integer gpsFrequency) {
      this.gpsFrequency = gpsFrequency;
   }

   @JsonProperty("gpsFrequency")
   public Integer getGpsFrequency() {
      return this.gpsFrequency;
   }

   @JsonProperty("gpsSource")
   public void setGpsSource(Integer gpsSource) {
      this.gpsSource = gpsSource;
   }

   @JsonProperty("gpsSource")
   public Integer getGpsSource() {
      return this.gpsSource;
   }

   @JsonProperty("gpsSourceName")
   public void setGpsSourceName(String gpsSourceName) {
      this.gpsSourceName = gpsSourceName;
   }

   @JsonProperty("gpsSourceName")
   public String getGpsSourceName() {
      return this.gpsSourceName;
   }

   @JsonProperty("courierCode")
   public void setCourierCode(String courierCode) {
      this.courierCode = courierCode;
   }

   @JsonProperty("courierCode")
   public String getCourierCode() {
      return this.courierCode;
   }

   @JsonProperty("courierName")
   public void setCourierName(String courierName) {
      this.courierName = courierName;
   }

   @JsonProperty("courierName")
   public String getCourierName() {
      return this.courierName;
   }

   @JsonProperty("courierMobile")
   public void setCourierMobile(String courierMobile) {
      this.courierMobile = courierMobile;
   }

   @JsonProperty("courierMobile")
   public String getCourierMobile() {
      return this.courierMobile;
   }

   @JsonProperty("tplFlag")
   public void setTplFlag(Integer tplFlag) {
      this.tplFlag = tplFlag;
   }

   @JsonProperty("tplFlag")
   public Integer getTplFlag() {
      return this.tplFlag;
   }

   @JsonProperty("arrivedTime")
   public void setArrivedTime(String arrivedTime) {
      this.arrivedTime = arrivedTime;
   }

   @JsonProperty("arrivedTime")
   public String getArrivedTime() {
      return this.arrivedTime;
   }

   @JsonProperty("waybillGisDtoList")
   public void setWaybillGisDtoList(List<WaybillGisDto> waybillGisDtoList) {
      this.waybillGisDtoList = waybillGisDtoList;
   }

   @JsonProperty("waybillGisDtoList")
   public List<WaybillGisDto> getWaybillGisDtoList() {
      return this.waybillGisDtoList;
   }
}
