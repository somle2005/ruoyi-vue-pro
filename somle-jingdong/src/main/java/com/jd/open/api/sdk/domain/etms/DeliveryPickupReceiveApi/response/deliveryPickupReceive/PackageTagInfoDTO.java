package com.jd.open.api.sdk.domain.etms.DeliveryPickupReceiveApi.response.deliveryPickupReceive;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class PackageTagInfoDTO implements Serializable {
   private Integer deliverySiteId;
   private String deliverySiteName;
   private String deliverySiteType;
   private String road;
   private String slideNo;
   private Integer startSortCenterId;
   private String startSortCenterName;
   private String startCrossCode;
   private String startTableTrolleyCode;
   private Integer ndSortCenterId;
   private Integer aging;
   private Integer transportType;
   private String endSortCenterName;
   private String endCrossCode;
   private String endTableTrolleyCode;
   private String agingName;
   private String collectionAddress;
   private String distributeCode;
   private String waterPrintText;
   private String qrcodeUrl;
   private Boolean hideName;
   private Boolean hideContactNo;

   @JsonProperty("deliverySiteId")
   public void setDeliverySiteId(Integer deliverySiteId) {
      this.deliverySiteId = deliverySiteId;
   }

   @JsonProperty("deliverySiteId")
   public Integer getDeliverySiteId() {
      return this.deliverySiteId;
   }

   @JsonProperty("deliverySiteName")
   public void setDeliverySiteName(String deliverySiteName) {
      this.deliverySiteName = deliverySiteName;
   }

   @JsonProperty("deliverySiteName")
   public String getDeliverySiteName() {
      return this.deliverySiteName;
   }

   @JsonProperty("deliverySiteType")
   public void setDeliverySiteType(String deliverySiteType) {
      this.deliverySiteType = deliverySiteType;
   }

   @JsonProperty("deliverySiteType")
   public String getDeliverySiteType() {
      return this.deliverySiteType;
   }

   @JsonProperty("road")
   public void setRoad(String road) {
      this.road = road;
   }

   @JsonProperty("road")
   public String getRoad() {
      return this.road;
   }

   @JsonProperty("slideNo")
   public void setSlideNo(String slideNo) {
      this.slideNo = slideNo;
   }

   @JsonProperty("slideNo")
   public String getSlideNo() {
      return this.slideNo;
   }

   @JsonProperty("startSortCenterId")
   public void setStartSortCenterId(Integer startSortCenterId) {
      this.startSortCenterId = startSortCenterId;
   }

   @JsonProperty("startSortCenterId")
   public Integer getStartSortCenterId() {
      return this.startSortCenterId;
   }

   @JsonProperty("startSortCenterName")
   public void setStartSortCenterName(String startSortCenterName) {
      this.startSortCenterName = startSortCenterName;
   }

   @JsonProperty("startSortCenterName")
   public String getStartSortCenterName() {
      return this.startSortCenterName;
   }

   @JsonProperty("startCrossCode")
   public void setStartCrossCode(String startCrossCode) {
      this.startCrossCode = startCrossCode;
   }

   @JsonProperty("startCrossCode")
   public String getStartCrossCode() {
      return this.startCrossCode;
   }

   @JsonProperty("startTableTrolleyCode")
   public void setStartTableTrolleyCode(String startTableTrolleyCode) {
      this.startTableTrolleyCode = startTableTrolleyCode;
   }

   @JsonProperty("startTableTrolleyCode")
   public String getStartTableTrolleyCode() {
      return this.startTableTrolleyCode;
   }

   @JsonProperty("ndSortCenterId")
   public void setNdSortCenterId(Integer ndSortCenterId) {
      this.ndSortCenterId = ndSortCenterId;
   }

   @JsonProperty("ndSortCenterId")
   public Integer getNdSortCenterId() {
      return this.ndSortCenterId;
   }

   @JsonProperty("aging")
   public void setAging(Integer aging) {
      this.aging = aging;
   }

   @JsonProperty("aging")
   public Integer getAging() {
      return this.aging;
   }

   @JsonProperty("transportType")
   public void setTransportType(Integer transportType) {
      this.transportType = transportType;
   }

   @JsonProperty("transportType")
   public Integer getTransportType() {
      return this.transportType;
   }

   @JsonProperty("endSortCenterName")
   public void setEndSortCenterName(String endSortCenterName) {
      this.endSortCenterName = endSortCenterName;
   }

   @JsonProperty("endSortCenterName")
   public String getEndSortCenterName() {
      return this.endSortCenterName;
   }

   @JsonProperty("endCrossCode")
   public void setEndCrossCode(String endCrossCode) {
      this.endCrossCode = endCrossCode;
   }

   @JsonProperty("endCrossCode")
   public String getEndCrossCode() {
      return this.endCrossCode;
   }

   @JsonProperty("endTableTrolleyCode")
   public void setEndTableTrolleyCode(String endTableTrolleyCode) {
      this.endTableTrolleyCode = endTableTrolleyCode;
   }

   @JsonProperty("endTableTrolleyCode")
   public String getEndTableTrolleyCode() {
      return this.endTableTrolleyCode;
   }

   @JsonProperty("agingName")
   public void setAgingName(String agingName) {
      this.agingName = agingName;
   }

   @JsonProperty("agingName")
   public String getAgingName() {
      return this.agingName;
   }

   @JsonProperty("collectionAddress")
   public void setCollectionAddress(String collectionAddress) {
      this.collectionAddress = collectionAddress;
   }

   @JsonProperty("collectionAddress")
   public String getCollectionAddress() {
      return this.collectionAddress;
   }

   @JsonProperty("distributeCode")
   public void setDistributeCode(String distributeCode) {
      this.distributeCode = distributeCode;
   }

   @JsonProperty("distributeCode")
   public String getDistributeCode() {
      return this.distributeCode;
   }

   @JsonProperty("waterPrintText")
   public void setWaterPrintText(String waterPrintText) {
      this.waterPrintText = waterPrintText;
   }

   @JsonProperty("waterPrintText")
   public String getWaterPrintText() {
      return this.waterPrintText;
   }

   @JsonProperty("qrcodeUrl")
   public void setQrcodeUrl(String qrcodeUrl) {
      this.qrcodeUrl = qrcodeUrl;
   }

   @JsonProperty("qrcodeUrl")
   public String getQrcodeUrl() {
      return this.qrcodeUrl;
   }

   @JsonProperty("hideName")
   public void setHideName(Boolean hideName) {
      this.hideName = hideName;
   }

   @JsonProperty("hideName")
   public Boolean getHideName() {
      return this.hideName;
   }

   @JsonProperty("hideContactNo")
   public void setHideContactNo(Boolean hideContactNo) {
      this.hideContactNo = hideContactNo;
   }

   @JsonProperty("hideContactNo")
   public Boolean getHideContactNo() {
      return this.hideContactNo;
   }
}
