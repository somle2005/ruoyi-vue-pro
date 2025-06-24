package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpCloudReceiveOrderInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpCloudReceiveOrderInfoRequest extends AbstractRequest implements JdRequest<EclpCloudReceiveOrderInfoResponse> {
   private String machiningNo;
   private String machiningType;
   private String ownerNo;
   private String skuNo;
   private String productLevel;
   private String qty;
   private String destOwnerNo;
   private String destSkuNo;
   private String destQty;
   private String destProductLevel;
   private String warehouseNo;
   private String tenantId;

   public void setMachiningNo(String machiningNo) {
      this.machiningNo = machiningNo;
   }

   public String getMachiningNo() {
      return this.machiningNo;
   }

   public void setMachiningType(String machiningType) {
      this.machiningType = machiningType;
   }

   public String getMachiningType() {
      return this.machiningType;
   }

   public void setOwnerNo(String ownerNo) {
      this.ownerNo = ownerNo;
   }

   public String getOwnerNo() {
      return this.ownerNo;
   }

   public void setSkuNo(String skuNo) {
      this.skuNo = skuNo;
   }

   public String getSkuNo() {
      return this.skuNo;
   }

   public void setProductLevel(String productLevel) {
      this.productLevel = productLevel;
   }

   public String getProductLevel() {
      return this.productLevel;
   }

   public void setQty(String qty) {
      this.qty = qty;
   }

   public String getQty() {
      return this.qty;
   }

   public void setDestOwnerNo(String destOwnerNo) {
      this.destOwnerNo = destOwnerNo;
   }

   public String getDestOwnerNo() {
      return this.destOwnerNo;
   }

   public void setDestSkuNo(String destSkuNo) {
      this.destSkuNo = destSkuNo;
   }

   public String getDestSkuNo() {
      return this.destSkuNo;
   }

   public void setDestQty(String destQty) {
      this.destQty = destQty;
   }

   public String getDestQty() {
      return this.destQty;
   }

   public void setDestProductLevel(String destProductLevel) {
      this.destProductLevel = destProductLevel;
   }

   public String getDestProductLevel() {
      return this.destProductLevel;
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

   public String getApiMethod() {
      return "jingdong.eclp.cloud.receiveOrderInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("machiningNo", this.machiningNo);
      pmap.put("machiningType", this.machiningType);
      pmap.put("ownerNo", this.ownerNo);
      pmap.put("skuNo", this.skuNo);
      pmap.put("productLevel", this.productLevel);
      pmap.put("qty", this.qty);
      pmap.put("destOwnerNo", this.destOwnerNo);
      pmap.put("destSkuNo", this.destSkuNo);
      pmap.put("destQty", this.destQty);
      pmap.put("destProductLevel", this.destProductLevel);
      pmap.put("warehouseNo", this.warehouseNo);
      pmap.put("tenantId", this.tenantId);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpCloudReceiveOrderInfoResponse> getResponseClass() {
      return EclpCloudReceiveOrderInfoResponse.class;
   }
}
