package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryPoOrder;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class QueryPoModel implements Serializable {
   private String poOrderNo;
   private String isvPoOrderNo;
   private String deptNo;
   private String whNo;
   private String supplierNo;
   private String createUser;
   private String poOrderStatus;
   private String createTime;
   private String completeTime;
   private String storageStatus;
   private List<PoItemModel> poItemModelList;
   private List<String> qcBackItemList;
   private List<String> qcBackErrItemList;
   private String resultCode;
   private String msg;
   private List<PoBatAttrModel> poBatAttrModelList;
   private List<PoBatAttrModel> diffBatAttrModelList;
   private String productName;
   private String billingMode;
   private String receiveBoxNumber;
   private String logicParam;
   private String grossWeight;
   private String volume;
   private String sellerWarehouseNo;
   private List<PoItemReject> poItemRejectList;
   private List<PoItemWmsResp> poItemWmsModelList;
   private String operTime;
   private List<PoBoxModel> poBoxModelList;

   @JsonProperty("poOrderNo")
   public void setPoOrderNo(String poOrderNo) {
      this.poOrderNo = poOrderNo;
   }

   @JsonProperty("poOrderNo")
   public String getPoOrderNo() {
      return this.poOrderNo;
   }

   @JsonProperty("isvPoOrderNo")
   public void setIsvPoOrderNo(String isvPoOrderNo) {
      this.isvPoOrderNo = isvPoOrderNo;
   }

   @JsonProperty("isvPoOrderNo")
   public String getIsvPoOrderNo() {
      return this.isvPoOrderNo;
   }

   @JsonProperty("deptNo")
   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   @JsonProperty("deptNo")
   public String getDeptNo() {
      return this.deptNo;
   }

   @JsonProperty("whNo")
   public void setWhNo(String whNo) {
      this.whNo = whNo;
   }

   @JsonProperty("whNo")
   public String getWhNo() {
      return this.whNo;
   }

   @JsonProperty("supplierNo")
   public void setSupplierNo(String supplierNo) {
      this.supplierNo = supplierNo;
   }

   @JsonProperty("supplierNo")
   public String getSupplierNo() {
      return this.supplierNo;
   }

   @JsonProperty("createUser")
   public void setCreateUser(String createUser) {
      this.createUser = createUser;
   }

   @JsonProperty("createUser")
   public String getCreateUser() {
      return this.createUser;
   }

   @JsonProperty("poOrderStatus")
   public void setPoOrderStatus(String poOrderStatus) {
      this.poOrderStatus = poOrderStatus;
   }

   @JsonProperty("poOrderStatus")
   public String getPoOrderStatus() {
      return this.poOrderStatus;
   }

   @JsonProperty("createTime")
   public void setCreateTime(String createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public String getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("completeTime")
   public void setCompleteTime(String completeTime) {
      this.completeTime = completeTime;
   }

   @JsonProperty("completeTime")
   public String getCompleteTime() {
      return this.completeTime;
   }

   @JsonProperty("storageStatus")
   public void setStorageStatus(String storageStatus) {
      this.storageStatus = storageStatus;
   }

   @JsonProperty("storageStatus")
   public String getStorageStatus() {
      return this.storageStatus;
   }

   @JsonProperty("poItemModelList")
   public void setPoItemModelList(List<PoItemModel> poItemModelList) {
      this.poItemModelList = poItemModelList;
   }

   @JsonProperty("poItemModelList")
   public List<PoItemModel> getPoItemModelList() {
      return this.poItemModelList;
   }

   @JsonProperty("qcBackItemList")
   public void setQcBackItemList(List<String> qcBackItemList) {
      this.qcBackItemList = qcBackItemList;
   }

   @JsonProperty("qcBackItemList")
   public List<String> getQcBackItemList() {
      return this.qcBackItemList;
   }

   @JsonProperty("qcBackErrItemList")
   public void setQcBackErrItemList(List<String> qcBackErrItemList) {
      this.qcBackErrItemList = qcBackErrItemList;
   }

   @JsonProperty("qcBackErrItemList")
   public List<String> getQcBackErrItemList() {
      return this.qcBackErrItemList;
   }

   @JsonProperty("resultCode")
   public void setResultCode(String resultCode) {
      this.resultCode = resultCode;
   }

   @JsonProperty("resultCode")
   public String getResultCode() {
      return this.resultCode;
   }

   @JsonProperty("msg")
   public void setMsg(String msg) {
      this.msg = msg;
   }

   @JsonProperty("msg")
   public String getMsg() {
      return this.msg;
   }

   @JsonProperty("poBatAttrModelList")
   public void setPoBatAttrModelList(List<PoBatAttrModel> poBatAttrModelList) {
      this.poBatAttrModelList = poBatAttrModelList;
   }

   @JsonProperty("poBatAttrModelList")
   public List<PoBatAttrModel> getPoBatAttrModelList() {
      return this.poBatAttrModelList;
   }

   @JsonProperty("diffBatAttrModelList")
   public void setDiffBatAttrModelList(List<PoBatAttrModel> diffBatAttrModelList) {
      this.diffBatAttrModelList = diffBatAttrModelList;
   }

   @JsonProperty("diffBatAttrModelList")
   public List<PoBatAttrModel> getDiffBatAttrModelList() {
      return this.diffBatAttrModelList;
   }

   @JsonProperty("productName")
   public void setProductName(String productName) {
      this.productName = productName;
   }

   @JsonProperty("productName")
   public String getProductName() {
      return this.productName;
   }

   @JsonProperty("billingMode")
   public void setBillingMode(String billingMode) {
      this.billingMode = billingMode;
   }

   @JsonProperty("billingMode")
   public String getBillingMode() {
      return this.billingMode;
   }

   @JsonProperty("receiveBoxNumber")
   public void setReceiveBoxNumber(String receiveBoxNumber) {
      this.receiveBoxNumber = receiveBoxNumber;
   }

   @JsonProperty("receiveBoxNumber")
   public String getReceiveBoxNumber() {
      return this.receiveBoxNumber;
   }

   @JsonProperty("logicParam")
   public void setLogicParam(String logicParam) {
      this.logicParam = logicParam;
   }

   @JsonProperty("logicParam")
   public String getLogicParam() {
      return this.logicParam;
   }

   @JsonProperty("grossWeight")
   public void setGrossWeight(String grossWeight) {
      this.grossWeight = grossWeight;
   }

   @JsonProperty("grossWeight")
   public String getGrossWeight() {
      return this.grossWeight;
   }

   @JsonProperty("volume")
   public void setVolume(String volume) {
      this.volume = volume;
   }

   @JsonProperty("volume")
   public String getVolume() {
      return this.volume;
   }

   @JsonProperty("sellerWarehouseNo")
   public void setSellerWarehouseNo(String sellerWarehouseNo) {
      this.sellerWarehouseNo = sellerWarehouseNo;
   }

   @JsonProperty("sellerWarehouseNo")
   public String getSellerWarehouseNo() {
      return this.sellerWarehouseNo;
   }

   @JsonProperty("poItemRejectList")
   public void setPoItemRejectList(List<PoItemReject> poItemRejectList) {
      this.poItemRejectList = poItemRejectList;
   }

   @JsonProperty("poItemRejectList")
   public List<PoItemReject> getPoItemRejectList() {
      return this.poItemRejectList;
   }

   @JsonProperty("poItemWmsModelList")
   public void setPoItemWmsModelList(List<PoItemWmsResp> poItemWmsModelList) {
      this.poItemWmsModelList = poItemWmsModelList;
   }

   @JsonProperty("poItemWmsModelList")
   public List<PoItemWmsResp> getPoItemWmsModelList() {
      return this.poItemWmsModelList;
   }

   @JsonProperty("operTime")
   public void setOperTime(String operTime) {
      this.operTime = operTime;
   }

   @JsonProperty("operTime")
   public String getOperTime() {
      return this.operTime;
   }

   @JsonProperty("poBoxModelList")
   public void setPoBoxModelList(List<PoBoxModel> poBoxModelList) {
      this.poBoxModelList = poBoxModelList;
   }

   @JsonProperty("poBoxModelList")
   public List<PoBoxModel> getPoBoxModelList() {
      return this.poBoxModelList;
   }
}
