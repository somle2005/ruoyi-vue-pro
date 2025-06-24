package com.jd.open.api.sdk.domain.youE.OrderFinishExportService.request.orderFinish;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class AfterSalesInfo implements Serializable {
   private Integer guaranteeType;
   private Integer repairType;
   private List<SparePartInfo> sparePartInfos;
   private Boolean applySpareParts;
   private Integer detectResult;
   private String detectDetail;
   private String detectPic;
   private String installSituation;
   private String invoiceSituation;
   private String warrantyCard;
   private String outRepair;
   private String chargeAmount;
   private String usedMaterial;
   private String barcode1;
   private String barcode2;
   private String purchaseTime;
   private String machineCode;
   private String repairObj;
   private String failureName;
   private String fixMethod;
   private String failureReason;
   private List<FailureTreeInfo> failureTreeInfoList;

   @JsonProperty("guaranteeType")
   public void setGuaranteeType(Integer guaranteeType) {
      this.guaranteeType = guaranteeType;
   }

   @JsonProperty("guaranteeType")
   public Integer getGuaranteeType() {
      return this.guaranteeType;
   }

   @JsonProperty("repairType")
   public void setRepairType(Integer repairType) {
      this.repairType = repairType;
   }

   @JsonProperty("repairType")
   public Integer getRepairType() {
      return this.repairType;
   }

   @JsonProperty("sparePartInfos")
   public void setSparePartInfos(List<SparePartInfo> sparePartInfos) {
      this.sparePartInfos = sparePartInfos;
   }

   @JsonProperty("sparePartInfos")
   public List<SparePartInfo> getSparePartInfos() {
      return this.sparePartInfos;
   }

   @JsonProperty("applySpareParts")
   public void setApplySpareParts(Boolean applySpareParts) {
      this.applySpareParts = applySpareParts;
   }

   @JsonProperty("applySpareParts")
   public Boolean getApplySpareParts() {
      return this.applySpareParts;
   }

   @JsonProperty("detectResult")
   public void setDetectResult(Integer detectResult) {
      this.detectResult = detectResult;
   }

   @JsonProperty("detectResult")
   public Integer getDetectResult() {
      return this.detectResult;
   }

   @JsonProperty("detectDetail")
   public void setDetectDetail(String detectDetail) {
      this.detectDetail = detectDetail;
   }

   @JsonProperty("detectDetail")
   public String getDetectDetail() {
      return this.detectDetail;
   }

   @JsonProperty("detectPic")
   public void setDetectPic(String detectPic) {
      this.detectPic = detectPic;
   }

   @JsonProperty("detectPic")
   public String getDetectPic() {
      return this.detectPic;
   }

   @JsonProperty("installSituation")
   public void setInstallSituation(String installSituation) {
      this.installSituation = installSituation;
   }

   @JsonProperty("installSituation")
   public String getInstallSituation() {
      return this.installSituation;
   }

   @JsonProperty("invoiceSituation")
   public void setInvoiceSituation(String invoiceSituation) {
      this.invoiceSituation = invoiceSituation;
   }

   @JsonProperty("invoiceSituation")
   public String getInvoiceSituation() {
      return this.invoiceSituation;
   }

   @JsonProperty("warrantyCard")
   public void setWarrantyCard(String warrantyCard) {
      this.warrantyCard = warrantyCard;
   }

   @JsonProperty("warrantyCard")
   public String getWarrantyCard() {
      return this.warrantyCard;
   }

   @JsonProperty("outRepair")
   public void setOutRepair(String outRepair) {
      this.outRepair = outRepair;
   }

   @JsonProperty("outRepair")
   public String getOutRepair() {
      return this.outRepair;
   }

   @JsonProperty("chargeAmount")
   public void setChargeAmount(String chargeAmount) {
      this.chargeAmount = chargeAmount;
   }

   @JsonProperty("chargeAmount")
   public String getChargeAmount() {
      return this.chargeAmount;
   }

   @JsonProperty("usedMaterial")
   public void setUsedMaterial(String usedMaterial) {
      this.usedMaterial = usedMaterial;
   }

   @JsonProperty("usedMaterial")
   public String getUsedMaterial() {
      return this.usedMaterial;
   }

   @JsonProperty("barcode1")
   public void setBarcode1(String barcode1) {
      this.barcode1 = barcode1;
   }

   @JsonProperty("barcode1")
   public String getBarcode1() {
      return this.barcode1;
   }

   @JsonProperty("barcode2")
   public void setBarcode2(String barcode2) {
      this.barcode2 = barcode2;
   }

   @JsonProperty("barcode2")
   public String getBarcode2() {
      return this.barcode2;
   }

   @JsonProperty("purchaseTime")
   public void setPurchaseTime(String purchaseTime) {
      this.purchaseTime = purchaseTime;
   }

   @JsonProperty("purchaseTime")
   public String getPurchaseTime() {
      return this.purchaseTime;
   }

   @JsonProperty("machineCode")
   public void setMachineCode(String machineCode) {
      this.machineCode = machineCode;
   }

   @JsonProperty("machineCode")
   public String getMachineCode() {
      return this.machineCode;
   }

   @JsonProperty("repairObj")
   public void setRepairObj(String repairObj) {
      this.repairObj = repairObj;
   }

   @JsonProperty("repairObj")
   public String getRepairObj() {
      return this.repairObj;
   }

   @JsonProperty("failureName")
   public void setFailureName(String failureName) {
      this.failureName = failureName;
   }

   @JsonProperty("failureName")
   public String getFailureName() {
      return this.failureName;
   }

   @JsonProperty("fixMethod")
   public void setFixMethod(String fixMethod) {
      this.fixMethod = fixMethod;
   }

   @JsonProperty("fixMethod")
   public String getFixMethod() {
      return this.fixMethod;
   }

   @JsonProperty("failureReason")
   public void setFailureReason(String failureReason) {
      this.failureReason = failureReason;
   }

   @JsonProperty("failureReason")
   public String getFailureReason() {
      return this.failureReason;
   }

   @JsonProperty("failureTreeInfoList")
   public void setFailureTreeInfoList(List<FailureTreeInfo> failureTreeInfoList) {
      this.failureTreeInfoList = failureTreeInfoList;
   }

   @JsonProperty("failureTreeInfoList")
   public List<FailureTreeInfo> getFailureTreeInfoList() {
      return this.failureTreeInfoList;
   }
}
