package com.jd.open.api.sdk.domain.wujiemiandan.WaybillBigShotApi.response.query;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BigShotDTO implements Serializable {
   private String waybillCode;
   private String bigShotName;
   private String bigShotCode;
   private String gatherCenterName;
   private String gatherCenterCode;
   private String branchName;
   private String branchCode;
   private String secondSectionCode;
   private String thirdSectionCode;
   private String toTabletrolleyCode;
   private String fromTabletrolleyCode;
   private String toCrossCode;
   private String fromCrossCode;
   private String road;
   private String orderSign;
   private String packageNo;
   private String fromBranchName;
   private String toBranchName;
   private RlsDetailDTO rlsDetailDTO;

   @JsonProperty("waybillCode")
   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   @JsonProperty("waybillCode")
   public String getWaybillCode() {
      return this.waybillCode;
   }

   @JsonProperty("bigShotName")
   public void setBigShotName(String bigShotName) {
      this.bigShotName = bigShotName;
   }

   @JsonProperty("bigShotName")
   public String getBigShotName() {
      return this.bigShotName;
   }

   @JsonProperty("bigShotCode")
   public void setBigShotCode(String bigShotCode) {
      this.bigShotCode = bigShotCode;
   }

   @JsonProperty("bigShotCode")
   public String getBigShotCode() {
      return this.bigShotCode;
   }

   @JsonProperty("gatherCenterName")
   public void setGatherCenterName(String gatherCenterName) {
      this.gatherCenterName = gatherCenterName;
   }

   @JsonProperty("gatherCenterName")
   public String getGatherCenterName() {
      return this.gatherCenterName;
   }

   @JsonProperty("gatherCenterCode")
   public void setGatherCenterCode(String gatherCenterCode) {
      this.gatherCenterCode = gatherCenterCode;
   }

   @JsonProperty("gatherCenterCode")
   public String getGatherCenterCode() {
      return this.gatherCenterCode;
   }

   @JsonProperty("branchName")
   public void setBranchName(String branchName) {
      this.branchName = branchName;
   }

   @JsonProperty("branchName")
   public String getBranchName() {
      return this.branchName;
   }

   @JsonProperty("branchCode")
   public void setBranchCode(String branchCode) {
      this.branchCode = branchCode;
   }

   @JsonProperty("branchCode")
   public String getBranchCode() {
      return this.branchCode;
   }

   @JsonProperty("secondSectionCode")
   public void setSecondSectionCode(String secondSectionCode) {
      this.secondSectionCode = secondSectionCode;
   }

   @JsonProperty("secondSectionCode")
   public String getSecondSectionCode() {
      return this.secondSectionCode;
   }

   @JsonProperty("thirdSectionCode")
   public void setThirdSectionCode(String thirdSectionCode) {
      this.thirdSectionCode = thirdSectionCode;
   }

   @JsonProperty("thirdSectionCode")
   public String getThirdSectionCode() {
      return this.thirdSectionCode;
   }

   @JsonProperty("toTabletrolleyCode")
   public void setToTabletrolleyCode(String toTabletrolleyCode) {
      this.toTabletrolleyCode = toTabletrolleyCode;
   }

   @JsonProperty("toTabletrolleyCode")
   public String getToTabletrolleyCode() {
      return this.toTabletrolleyCode;
   }

   @JsonProperty("fromTabletrolleyCode")
   public void setFromTabletrolleyCode(String fromTabletrolleyCode) {
      this.fromTabletrolleyCode = fromTabletrolleyCode;
   }

   @JsonProperty("fromTabletrolleyCode")
   public String getFromTabletrolleyCode() {
      return this.fromTabletrolleyCode;
   }

   @JsonProperty("toCrossCode")
   public void setToCrossCode(String toCrossCode) {
      this.toCrossCode = toCrossCode;
   }

   @JsonProperty("toCrossCode")
   public String getToCrossCode() {
      return this.toCrossCode;
   }

   @JsonProperty("fromCrossCode")
   public void setFromCrossCode(String fromCrossCode) {
      this.fromCrossCode = fromCrossCode;
   }

   @JsonProperty("fromCrossCode")
   public String getFromCrossCode() {
      return this.fromCrossCode;
   }

   @JsonProperty("road")
   public void setRoad(String road) {
      this.road = road;
   }

   @JsonProperty("road")
   public String getRoad() {
      return this.road;
   }

   @JsonProperty("orderSign")
   public void setOrderSign(String orderSign) {
      this.orderSign = orderSign;
   }

   @JsonProperty("orderSign")
   public String getOrderSign() {
      return this.orderSign;
   }

   @JsonProperty("packageNo")
   public void setPackageNo(String packageNo) {
      this.packageNo = packageNo;
   }

   @JsonProperty("packageNo")
   public String getPackageNo() {
      return this.packageNo;
   }

   @JsonProperty("fromBranchName")
   public void setFromBranchName(String fromBranchName) {
      this.fromBranchName = fromBranchName;
   }

   @JsonProperty("fromBranchName")
   public String getFromBranchName() {
      return this.fromBranchName;
   }

   @JsonProperty("toBranchName")
   public void setToBranchName(String toBranchName) {
      this.toBranchName = toBranchName;
   }

   @JsonProperty("toBranchName")
   public String getToBranchName() {
      return this.toBranchName;
   }

   @JsonProperty("rlsDetailDTO")
   public void setRlsDetailDTO(RlsDetailDTO rlsDetailDTO) {
      this.rlsDetailDTO = rlsDetailDTO;
   }

   @JsonProperty("rlsDetailDTO")
   public RlsDetailDTO getRlsDetailDTO() {
      return this.rlsDetailDTO;
   }
}
