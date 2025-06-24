package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryBatchAttrStock;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class BatchAttrData implements Serializable {
   private String deptName;
   private String sellerName;
   private String sellerNo;
   private String logistics;
   private String boxNumberAttr;
   private String warehouseName;
   private String deptNo;
   private String manufacturer;
   private Date productionDate;
   private String spareBatch;
   private String poNo;
   private String supplier;
   private int stockNum;
   private int stockStatus;
   private String goodsName;
   private Date expirationDate;
   private String pluManagerBatchAttr;
   private String goodsNo;
   private int stockType;
   private String goodsLevel;
   private int usableNum;
   private String packageBatchNo;
   private Date receiptDate;
   private String lotNumber;
   private String store;
   private String warehouseNo;
   private String supplierManage;
   private Date createTime;
   private String originCountry;
   private String notMarketableAttr;
   private String isvGoodsNo;
   private String goodsBarcode;
   private String isBusinessPo;

   @JsonProperty("deptName")
   public void setDeptName(String deptName) {
      this.deptName = deptName;
   }

   @JsonProperty("deptName")
   public String getDeptName() {
      return this.deptName;
   }

   @JsonProperty("sellerName")
   public void setSellerName(String sellerName) {
      this.sellerName = sellerName;
   }

   @JsonProperty("sellerName")
   public String getSellerName() {
      return this.sellerName;
   }

   @JsonProperty("sellerNo")
   public void setSellerNo(String sellerNo) {
      this.sellerNo = sellerNo;
   }

   @JsonProperty("sellerNo")
   public String getSellerNo() {
      return this.sellerNo;
   }

   @JsonProperty("logistics")
   public void setLogistics(String logistics) {
      this.logistics = logistics;
   }

   @JsonProperty("logistics")
   public String getLogistics() {
      return this.logistics;
   }

   @JsonProperty("boxNumberAttr")
   public void setBoxNumberAttr(String boxNumberAttr) {
      this.boxNumberAttr = boxNumberAttr;
   }

   @JsonProperty("boxNumberAttr")
   public String getBoxNumberAttr() {
      return this.boxNumberAttr;
   }

   @JsonProperty("warehouseName")
   public void setWarehouseName(String warehouseName) {
      this.warehouseName = warehouseName;
   }

   @JsonProperty("warehouseName")
   public String getWarehouseName() {
      return this.warehouseName;
   }

   @JsonProperty("deptNo")
   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   @JsonProperty("deptNo")
   public String getDeptNo() {
      return this.deptNo;
   }

   @JsonProperty("manufacturer")
   public void setManufacturer(String manufacturer) {
      this.manufacturer = manufacturer;
   }

   @JsonProperty("manufacturer")
   public String getManufacturer() {
      return this.manufacturer;
   }

   @JsonProperty("productionDate")
   public void setProductionDate(Date productionDate) {
      this.productionDate = productionDate;
   }

   @JsonProperty("productionDate")
   public Date getProductionDate() {
      return this.productionDate;
   }

   @JsonProperty("spareBatch")
   public void setSpareBatch(String spareBatch) {
      this.spareBatch = spareBatch;
   }

   @JsonProperty("spareBatch")
   public String getSpareBatch() {
      return this.spareBatch;
   }

   @JsonProperty("poNo")
   public void setPoNo(String poNo) {
      this.poNo = poNo;
   }

   @JsonProperty("poNo")
   public String getPoNo() {
      return this.poNo;
   }

   @JsonProperty("supplier")
   public void setSupplier(String supplier) {
      this.supplier = supplier;
   }

   @JsonProperty("supplier")
   public String getSupplier() {
      return this.supplier;
   }

   @JsonProperty("stockNum")
   public void setStockNum(int stockNum) {
      this.stockNum = stockNum;
   }

   @JsonProperty("stockNum")
   public int getStockNum() {
      return this.stockNum;
   }

   @JsonProperty("stockStatus")
   public void setStockStatus(int stockStatus) {
      this.stockStatus = stockStatus;
   }

   @JsonProperty("stockStatus")
   public int getStockStatus() {
      return this.stockStatus;
   }

   @JsonProperty("goodsName")
   public void setGoodsName(String goodsName) {
      this.goodsName = goodsName;
   }

   @JsonProperty("goodsName")
   public String getGoodsName() {
      return this.goodsName;
   }

   @JsonProperty("expirationDate")
   public void setExpirationDate(Date expirationDate) {
      this.expirationDate = expirationDate;
   }

   @JsonProperty("expirationDate")
   public Date getExpirationDate() {
      return this.expirationDate;
   }

   @JsonProperty("pluManagerBatchAttr")
   public void setPluManagerBatchAttr(String pluManagerBatchAttr) {
      this.pluManagerBatchAttr = pluManagerBatchAttr;
   }

   @JsonProperty("pluManagerBatchAttr")
   public String getPluManagerBatchAttr() {
      return this.pluManagerBatchAttr;
   }

   @JsonProperty("goodsNo")
   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   @JsonProperty("goodsNo")
   public String getGoodsNo() {
      return this.goodsNo;
   }

   @JsonProperty("stockType")
   public void setStockType(int stockType) {
      this.stockType = stockType;
   }

   @JsonProperty("stockType")
   public int getStockType() {
      return this.stockType;
   }

   @JsonProperty("goodsLevel")
   public void setGoodsLevel(String goodsLevel) {
      this.goodsLevel = goodsLevel;
   }

   @JsonProperty("goodsLevel")
   public String getGoodsLevel() {
      return this.goodsLevel;
   }

   @JsonProperty("usableNum")
   public void setUsableNum(int usableNum) {
      this.usableNum = usableNum;
   }

   @JsonProperty("usableNum")
   public int getUsableNum() {
      return this.usableNum;
   }

   @JsonProperty("packageBatchNo")
   public void setPackageBatchNo(String packageBatchNo) {
      this.packageBatchNo = packageBatchNo;
   }

   @JsonProperty("packageBatchNo")
   public String getPackageBatchNo() {
      return this.packageBatchNo;
   }

   @JsonProperty("receiptDate")
   public void setReceiptDate(Date receiptDate) {
      this.receiptDate = receiptDate;
   }

   @JsonProperty("receiptDate")
   public Date getReceiptDate() {
      return this.receiptDate;
   }

   @JsonProperty("lotNumber")
   public void setLotNumber(String lotNumber) {
      this.lotNumber = lotNumber;
   }

   @JsonProperty("lotNumber")
   public String getLotNumber() {
      return this.lotNumber;
   }

   @JsonProperty("store")
   public void setStore(String store) {
      this.store = store;
   }

   @JsonProperty("store")
   public String getStore() {
      return this.store;
   }

   @JsonProperty("warehouseNo")
   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   @JsonProperty("warehouseNo")
   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   @JsonProperty("supplierManage")
   public void setSupplierManage(String supplierManage) {
      this.supplierManage = supplierManage;
   }

   @JsonProperty("supplierManage")
   public String getSupplierManage() {
      return this.supplierManage;
   }

   @JsonProperty("createTime")
   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public Date getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("originCountry")
   public void setOriginCountry(String originCountry) {
      this.originCountry = originCountry;
   }

   @JsonProperty("originCountry")
   public String getOriginCountry() {
      return this.originCountry;
   }

   @JsonProperty("notMarketableAttr")
   public void setNotMarketableAttr(String notMarketableAttr) {
      this.notMarketableAttr = notMarketableAttr;
   }

   @JsonProperty("notMarketableAttr")
   public String getNotMarketableAttr() {
      return this.notMarketableAttr;
   }

   @JsonProperty("isvGoodsNo")
   public void setIsvGoodsNo(String isvGoodsNo) {
      this.isvGoodsNo = isvGoodsNo;
   }

   @JsonProperty("isvGoodsNo")
   public String getIsvGoodsNo() {
      return this.isvGoodsNo;
   }

   @JsonProperty("goodsBarcode")
   public void setGoodsBarcode(String goodsBarcode) {
      this.goodsBarcode = goodsBarcode;
   }

   @JsonProperty("goodsBarcode")
   public String getGoodsBarcode() {
      return this.goodsBarcode;
   }

   @JsonProperty("isBusinessPo")
   public void setIsBusinessPo(String isBusinessPo) {
      this.isBusinessPo = isBusinessPo;
   }

   @JsonProperty("isBusinessPo")
   public String getIsBusinessPo() {
      return this.isBusinessPo;
   }
}
