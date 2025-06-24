package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryBatchChange;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class BatchChangeResponse implements Serializable {
   private String[] batchAttrChangeNo;
   private String[] deptNo;
   private String[] deptName;
   private String[] allocativeCenterNo;
   private String[] warehouseNo;
   private String[] goodsNo;
   private String[] goodsLevel;
   private String[] preChangeSoNo;
   private String[] preChangePD;
   private String[] preChangeGP;
   private String[] preChangeSupplier;
   private String[] preChangeDD;
   private String[] preChangeLC;
   private String[] preChangePOO;
   private String[] preChangeBatchNo;
   private String[] preChangeMfrs;
   private String[] preChangePackBatchNo;
   private String[] preChangeBoxNo;
   private String[] preChangeShop;
   private String[] afterChangeSoNo;
   private String[] afterChangePD;
   private String[] afterChangeGP;
   private String[] afterChangeSupplier;
   private String[] afterChangeDD;
   private String[] afterChangeLC;
   private String[] afterChangePOO;
   private String[] afterChangeBatchNo;
   private String[] afterChangeMfrs;
   private String[] afterChangePackBatchNo;
   private String[] afterChangeBoxNo;
   private String[] afterChangeShop;
   private int[] changeNum;
   private String[] createTime;

   @JsonProperty("batchAttrChangeNo")
   public void setBatchAttrChangeNo(String[] batchAttrChangeNo) {
      this.batchAttrChangeNo = batchAttrChangeNo;
   }

   @JsonProperty("batchAttrChangeNo")
   public String[] getBatchAttrChangeNo() {
      return this.batchAttrChangeNo;
   }

   @JsonProperty("deptNo")
   public void setDeptNo(String[] deptNo) {
      this.deptNo = deptNo;
   }

   @JsonProperty("deptNo")
   public String[] getDeptNo() {
      return this.deptNo;
   }

   @JsonProperty("deptName")
   public void setDeptName(String[] deptName) {
      this.deptName = deptName;
   }

   @JsonProperty("deptName")
   public String[] getDeptName() {
      return this.deptName;
   }

   @JsonProperty("allocativeCenterNo")
   public void setAllocativeCenterNo(String[] allocativeCenterNo) {
      this.allocativeCenterNo = allocativeCenterNo;
   }

   @JsonProperty("allocativeCenterNo")
   public String[] getAllocativeCenterNo() {
      return this.allocativeCenterNo;
   }

   @JsonProperty("warehouseNo")
   public void setWarehouseNo(String[] warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   @JsonProperty("warehouseNo")
   public String[] getWarehouseNo() {
      return this.warehouseNo;
   }

   @JsonProperty("goodsNo")
   public void setGoodsNo(String[] goodsNo) {
      this.goodsNo = goodsNo;
   }

   @JsonProperty("goodsNo")
   public String[] getGoodsNo() {
      return this.goodsNo;
   }

   @JsonProperty("goodsLevel")
   public void setGoodsLevel(String[] goodsLevel) {
      this.goodsLevel = goodsLevel;
   }

   @JsonProperty("goodsLevel")
   public String[] getGoodsLevel() {
      return this.goodsLevel;
   }

   @JsonProperty("preChangeSoNo")
   public void setPreChangeSoNo(String[] preChangeSoNo) {
      this.preChangeSoNo = preChangeSoNo;
   }

   @JsonProperty("preChangeSoNo")
   public String[] getPreChangeSoNo() {
      return this.preChangeSoNo;
   }

   @JsonProperty("preChangePD")
   public void setPreChangePD(String[] preChangePD) {
      this.preChangePD = preChangePD;
   }

   @JsonProperty("preChangePD")
   public String[] getPreChangePD() {
      return this.preChangePD;
   }

   @JsonProperty("preChangeGP")
   public void setPreChangeGP(String[] preChangeGP) {
      this.preChangeGP = preChangeGP;
   }

   @JsonProperty("preChangeGP")
   public String[] getPreChangeGP() {
      return this.preChangeGP;
   }

   @JsonProperty("preChangeSupplier")
   public void setPreChangeSupplier(String[] preChangeSupplier) {
      this.preChangeSupplier = preChangeSupplier;
   }

   @JsonProperty("preChangeSupplier")
   public String[] getPreChangeSupplier() {
      return this.preChangeSupplier;
   }

   @JsonProperty("preChangeDD")
   public void setPreChangeDD(String[] preChangeDD) {
      this.preChangeDD = preChangeDD;
   }

   @JsonProperty("preChangeDD")
   public String[] getPreChangeDD() {
      return this.preChangeDD;
   }

   @JsonProperty("preChangeLC")
   public void setPreChangeLC(String[] preChangeLC) {
      this.preChangeLC = preChangeLC;
   }

   @JsonProperty("preChangeLC")
   public String[] getPreChangeLC() {
      return this.preChangeLC;
   }

   @JsonProperty("preChangePOO")
   public void setPreChangePOO(String[] preChangePOO) {
      this.preChangePOO = preChangePOO;
   }

   @JsonProperty("preChangePOO")
   public String[] getPreChangePOO() {
      return this.preChangePOO;
   }

   @JsonProperty("preChangeBatchNo")
   public void setPreChangeBatchNo(String[] preChangeBatchNo) {
      this.preChangeBatchNo = preChangeBatchNo;
   }

   @JsonProperty("preChangeBatchNo")
   public String[] getPreChangeBatchNo() {
      return this.preChangeBatchNo;
   }

   @JsonProperty("preChangeMfrs")
   public void setPreChangeMfrs(String[] preChangeMfrs) {
      this.preChangeMfrs = preChangeMfrs;
   }

   @JsonProperty("preChangeMfrs")
   public String[] getPreChangeMfrs() {
      return this.preChangeMfrs;
   }

   @JsonProperty("preChangePackBatchNo")
   public void setPreChangePackBatchNo(String[] preChangePackBatchNo) {
      this.preChangePackBatchNo = preChangePackBatchNo;
   }

   @JsonProperty("preChangePackBatchNo")
   public String[] getPreChangePackBatchNo() {
      return this.preChangePackBatchNo;
   }

   @JsonProperty("preChangeBoxNo")
   public void setPreChangeBoxNo(String[] preChangeBoxNo) {
      this.preChangeBoxNo = preChangeBoxNo;
   }

   @JsonProperty("preChangeBoxNo")
   public String[] getPreChangeBoxNo() {
      return this.preChangeBoxNo;
   }

   @JsonProperty("preChangeShop")
   public void setPreChangeShop(String[] preChangeShop) {
      this.preChangeShop = preChangeShop;
   }

   @JsonProperty("preChangeShop")
   public String[] getPreChangeShop() {
      return this.preChangeShop;
   }

   @JsonProperty("afterChangeSoNo")
   public void setAfterChangeSoNo(String[] afterChangeSoNo) {
      this.afterChangeSoNo = afterChangeSoNo;
   }

   @JsonProperty("afterChangeSoNo")
   public String[] getAfterChangeSoNo() {
      return this.afterChangeSoNo;
   }

   @JsonProperty("afterChangePD")
   public void setAfterChangePD(String[] afterChangePD) {
      this.afterChangePD = afterChangePD;
   }

   @JsonProperty("afterChangePD")
   public String[] getAfterChangePD() {
      return this.afterChangePD;
   }

   @JsonProperty("afterChangeGP")
   public void setAfterChangeGP(String[] afterChangeGP) {
      this.afterChangeGP = afterChangeGP;
   }

   @JsonProperty("afterChangeGP")
   public String[] getAfterChangeGP() {
      return this.afterChangeGP;
   }

   @JsonProperty("afterChangeSupplier")
   public void setAfterChangeSupplier(String[] afterChangeSupplier) {
      this.afterChangeSupplier = afterChangeSupplier;
   }

   @JsonProperty("afterChangeSupplier")
   public String[] getAfterChangeSupplier() {
      return this.afterChangeSupplier;
   }

   @JsonProperty("afterChangeDD")
   public void setAfterChangeDD(String[] afterChangeDD) {
      this.afterChangeDD = afterChangeDD;
   }

   @JsonProperty("afterChangeDD")
   public String[] getAfterChangeDD() {
      return this.afterChangeDD;
   }

   @JsonProperty("afterChangeLC")
   public void setAfterChangeLC(String[] afterChangeLC) {
      this.afterChangeLC = afterChangeLC;
   }

   @JsonProperty("afterChangeLC")
   public String[] getAfterChangeLC() {
      return this.afterChangeLC;
   }

   @JsonProperty("afterChangePOO")
   public void setAfterChangePOO(String[] afterChangePOO) {
      this.afterChangePOO = afterChangePOO;
   }

   @JsonProperty("afterChangePOO")
   public String[] getAfterChangePOO() {
      return this.afterChangePOO;
   }

   @JsonProperty("afterChangeBatchNo")
   public void setAfterChangeBatchNo(String[] afterChangeBatchNo) {
      this.afterChangeBatchNo = afterChangeBatchNo;
   }

   @JsonProperty("afterChangeBatchNo")
   public String[] getAfterChangeBatchNo() {
      return this.afterChangeBatchNo;
   }

   @JsonProperty("afterChangeMfrs")
   public void setAfterChangeMfrs(String[] afterChangeMfrs) {
      this.afterChangeMfrs = afterChangeMfrs;
   }

   @JsonProperty("afterChangeMfrs")
   public String[] getAfterChangeMfrs() {
      return this.afterChangeMfrs;
   }

   @JsonProperty("afterChangePackBatchNo")
   public void setAfterChangePackBatchNo(String[] afterChangePackBatchNo) {
      this.afterChangePackBatchNo = afterChangePackBatchNo;
   }

   @JsonProperty("afterChangePackBatchNo")
   public String[] getAfterChangePackBatchNo() {
      return this.afterChangePackBatchNo;
   }

   @JsonProperty("afterChangeBoxNo")
   public void setAfterChangeBoxNo(String[] afterChangeBoxNo) {
      this.afterChangeBoxNo = afterChangeBoxNo;
   }

   @JsonProperty("afterChangeBoxNo")
   public String[] getAfterChangeBoxNo() {
      return this.afterChangeBoxNo;
   }

   @JsonProperty("afterChangeShop")
   public void setAfterChangeShop(String[] afterChangeShop) {
      this.afterChangeShop = afterChangeShop;
   }

   @JsonProperty("afterChangeShop")
   public String[] getAfterChangeShop() {
      return this.afterChangeShop;
   }

   @JsonProperty("changeNum")
   public void setChangeNum(int[] changeNum) {
      this.changeNum = changeNum;
   }

   @JsonProperty("changeNum")
   public int[] getChangeNum() {
      return this.changeNum;
   }

   @JsonProperty("createTime")
   public void setCreateTime(String[] createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public String[] getCreateTime() {
      return this.createTime;
   }
}
