package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpRtwAcceptReturnOrderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpRtwAcceptReturnOrderRequest extends AbstractRequest implements JdRequest<EclpRtwAcceptReturnOrderResponse> {
   private String deliveryNo;
   private String receiptNo;
   private String packageCodes;
   private String sourceNo;
   private String ownerNo;
   private String billType;
   private String warehouseNo;
   private String tenantId;
   private String skuNo;
   private String skuName;
   private String expectedQty;
   private String isvLotattrs;
   private String checkLotattrs;

   public void setDeliveryNo(String deliveryNo) {
      this.deliveryNo = deliveryNo;
   }

   public String getDeliveryNo() {
      return this.deliveryNo;
   }

   public void setReceiptNo(String receiptNo) {
      this.receiptNo = receiptNo;
   }

   public String getReceiptNo() {
      return this.receiptNo;
   }

   public void setPackageCodes(String packageCodes) {
      this.packageCodes = packageCodes;
   }

   public String getPackageCodes() {
      return this.packageCodes;
   }

   public void setSourceNo(String sourceNo) {
      this.sourceNo = sourceNo;
   }

   public String getSourceNo() {
      return this.sourceNo;
   }

   public void setOwnerNo(String ownerNo) {
      this.ownerNo = ownerNo;
   }

   public String getOwnerNo() {
      return this.ownerNo;
   }

   public void setBillType(String billType) {
      this.billType = billType;
   }

   public String getBillType() {
      return this.billType;
   }

   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   public void setTenantId(String tenantId) {
      this.tenantId = tenantId;
   }

   public String getTenantId() {
      return this.tenantId;
   }

   public void setSkuNo(String skuNo) {
      this.skuNo = skuNo;
   }

   public String getSkuNo() {
      return this.skuNo;
   }

   public void setSkuName(String skuName) {
      this.skuName = skuName;
   }

   public String getSkuName() {
      return this.skuName;
   }

   public void setExpectedQty(String expectedQty) {
      this.expectedQty = expectedQty;
   }

   public String getExpectedQty() {
      return this.expectedQty;
   }

   public void setIsvLotattrs(String isvLotattrs) {
      this.isvLotattrs = isvLotattrs;
   }

   public String getIsvLotattrs() {
      return this.isvLotattrs;
   }

   public void setCheckLotattrs(String checkLotattrs) {
      this.checkLotattrs = checkLotattrs;
   }

   public String getCheckLotattrs() {
      return this.checkLotattrs;
   }

   public String getApiMethod() {
      return "jingdong.eclp.rtw.acceptReturnOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deliveryNo", this.deliveryNo);
      pmap.put("receiptNo", this.receiptNo);
      pmap.put("packageCodes", this.packageCodes);
      pmap.put("sourceNo", this.sourceNo);
      pmap.put("ownerNo", this.ownerNo);
      pmap.put("billType", this.billType);
      pmap.put("warehouseNo", this.warehouseNo);
      pmap.put("tenantId", this.tenantId);
      pmap.put("skuNo", this.skuNo);
      pmap.put("skuName", this.skuName);
      pmap.put("expectedQty", this.expectedQty);
      pmap.put("isvLotattrs", this.isvLotattrs);
      pmap.put("checkLotattrs", this.checkLotattrs);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpRtwAcceptReturnOrderResponse> getResponseClass() {
      return EclpRtwAcceptReturnOrderResponse.class;
   }
}
