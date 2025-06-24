package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.EdiInventorySendResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class EdiInventorySendRequest extends AbstractRequest implements JdRequest<EdiInventorySendResponse> {
   private String vendorCode;
   private String vendorName;
   private String vendorProductId;
   private Date inventoryDate;
   private Integer totalQuantity;
   private Date estimateDate;
   private Integer totalEstimateQuantity;
   private BigDecimal costPrice;
   private String storeId;
   private String storeName;
   private String quantity;
   private String estimateQuantity;

   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   public String getVendorCode() {
      return this.vendorCode;
   }

   public void setVendorName(String vendorName) {
      this.vendorName = vendorName;
   }

   public String getVendorName() {
      return this.vendorName;
   }

   public void setVendorProductId(String vendorProductId) {
      this.vendorProductId = vendorProductId;
   }

   public String getVendorProductId() {
      return this.vendorProductId;
   }

   public void setInventoryDate(Date inventoryDate) {
      this.inventoryDate = inventoryDate;
   }

   public Date getInventoryDate() {
      return this.inventoryDate;
   }

   public void setTotalQuantity(Integer totalQuantity) {
      this.totalQuantity = totalQuantity;
   }

   public Integer getTotalQuantity() {
      return this.totalQuantity;
   }

   public void setEstimateDate(Date estimateDate) {
      this.estimateDate = estimateDate;
   }

   public Date getEstimateDate() {
      return this.estimateDate;
   }

   public void setTotalEstimateQuantity(Integer totalEstimateQuantity) {
      this.totalEstimateQuantity = totalEstimateQuantity;
   }

   public Integer getTotalEstimateQuantity() {
      return this.totalEstimateQuantity;
   }

   public void setCostPrice(BigDecimal costPrice) {
      this.costPrice = costPrice;
   }

   public BigDecimal getCostPrice() {
      return this.costPrice;
   }

   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   public String getStoreId() {
      return this.storeId;
   }

   public void setStoreName(String storeName) {
      this.storeName = storeName;
   }

   public String getStoreName() {
      return this.storeName;
   }

   public void setQuantity(String quantity) {
      this.quantity = quantity;
   }

   public String getQuantity() {
      return this.quantity;
   }

   public void setEstimateQuantity(String estimateQuantity) {
      this.estimateQuantity = estimateQuantity;
   }

   public String getEstimateQuantity() {
      return this.estimateQuantity;
   }

   public String getApiMethod() {
      return "jingdong.edi.inventory.send";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("vendorCode", this.vendorCode);
      pmap.put("vendorName", this.vendorName);
      pmap.put("vendorProductId", this.vendorProductId);

      try {
         if (this.inventoryDate != null) {
            pmap.put("inventoryDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.inventoryDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("totalQuantity", this.totalQuantity);

      try {
         if (this.estimateDate != null) {
            pmap.put("estimateDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.estimateDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("totalEstimateQuantity", this.totalEstimateQuantity);
      pmap.put("costPrice", this.costPrice);
      pmap.put("storeId", this.storeId);
      pmap.put("storeName", this.storeName);
      pmap.put("quantity", this.quantity);
      pmap.put("estimateQuantity", this.estimateQuantity);
      return JsonUtil.toJson(pmap);
   }

   public Class<EdiInventorySendResponse> getResponseClass() {
      return EdiInventorySendResponse.class;
   }
}
