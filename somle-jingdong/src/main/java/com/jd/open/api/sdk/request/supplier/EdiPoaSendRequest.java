package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.EdiPoaSendResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class EdiPoaSendRequest extends AbstractRequest implements JdRequest<EdiPoaSendResponse> {
   private String vendorCode;
   private String vendorName;
   private String purchaseOrderCode;
   private Integer recordCount;
   private Integer categoryNumber;
   private Integer totalNubmer;
   private Double totalAmount;
   private Double actualTotalAmount;
   private Date purchaseDate;
   private Date arrivalDate;
   private String purchaseContact;
   private String receivingAddress;
   private String comments;
   private String currentRecordCount;
   private String linePurchaseOrderCode;
   private String productCode;
   private String buyerProductId;
   private String vendorSku;
   private String productName;
   private String quantity;
   private String orderQuantity;
   private String salePrice;
   private String listPrice;
   private String discountRate;
   private String backOrderProcessing;
   private String lineComments;

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

   public void setPurchaseOrderCode(String purchaseOrderCode) {
      this.purchaseOrderCode = purchaseOrderCode;
   }

   public String getPurchaseOrderCode() {
      return this.purchaseOrderCode;
   }

   public void setRecordCount(Integer recordCount) {
      this.recordCount = recordCount;
   }

   public Integer getRecordCount() {
      return this.recordCount;
   }

   public void setCategoryNumber(Integer categoryNumber) {
      this.categoryNumber = categoryNumber;
   }

   public Integer getCategoryNumber() {
      return this.categoryNumber;
   }

   public void setTotalNubmer(Integer totalNubmer) {
      this.totalNubmer = totalNubmer;
   }

   public Integer getTotalNubmer() {
      return this.totalNubmer;
   }

   public void setTotalAmount(Double totalAmount) {
      this.totalAmount = totalAmount;
   }

   public Double getTotalAmount() {
      return this.totalAmount;
   }

   public void setActualTotalAmount(Double actualTotalAmount) {
      this.actualTotalAmount = actualTotalAmount;
   }

   public Double getActualTotalAmount() {
      return this.actualTotalAmount;
   }

   public void setPurchaseDate(Date purchaseDate) {
      this.purchaseDate = purchaseDate;
   }

   public Date getPurchaseDate() {
      return this.purchaseDate;
   }

   public void setArrivalDate(Date arrivalDate) {
      this.arrivalDate = arrivalDate;
   }

   public Date getArrivalDate() {
      return this.arrivalDate;
   }

   public void setPurchaseContact(String purchaseContact) {
      this.purchaseContact = purchaseContact;
   }

   public String getPurchaseContact() {
      return this.purchaseContact;
   }

   public void setReceivingAddress(String receivingAddress) {
      this.receivingAddress = receivingAddress;
   }

   public String getReceivingAddress() {
      return this.receivingAddress;
   }

   public void setComments(String comments) {
      this.comments = comments;
   }

   public String getComments() {
      return this.comments;
   }

   public void setCurrentRecordCount(String currentRecordCount) {
      this.currentRecordCount = currentRecordCount;
   }

   public String getCurrentRecordCount() {
      return this.currentRecordCount;
   }

   public void setLinePurchaseOrderCode(String linePurchaseOrderCode) {
      this.linePurchaseOrderCode = linePurchaseOrderCode;
   }

   public String getLinePurchaseOrderCode() {
      return this.linePurchaseOrderCode;
   }

   public void setProductCode(String productCode) {
      this.productCode = productCode;
   }

   public String getProductCode() {
      return this.productCode;
   }

   public void setBuyerProductId(String buyerProductId) {
      this.buyerProductId = buyerProductId;
   }

   public String getBuyerProductId() {
      return this.buyerProductId;
   }

   public void setVendorSku(String vendorSku) {
      this.vendorSku = vendorSku;
   }

   public String getVendorSku() {
      return this.vendorSku;
   }

   public void setProductName(String productName) {
      this.productName = productName;
   }

   public String getProductName() {
      return this.productName;
   }

   public void setQuantity(String quantity) {
      this.quantity = quantity;
   }

   public String getQuantity() {
      return this.quantity;
   }

   public void setOrderQuantity(String orderQuantity) {
      this.orderQuantity = orderQuantity;
   }

   public String getOrderQuantity() {
      return this.orderQuantity;
   }

   public void setSalePrice(String salePrice) {
      this.salePrice = salePrice;
   }

   public String getSalePrice() {
      return this.salePrice;
   }

   public void setListPrice(String listPrice) {
      this.listPrice = listPrice;
   }

   public String getListPrice() {
      return this.listPrice;
   }

   public void setDiscountRate(String discountRate) {
      this.discountRate = discountRate;
   }

   public String getDiscountRate() {
      return this.discountRate;
   }

   public void setBackOrderProcessing(String backOrderProcessing) {
      this.backOrderProcessing = backOrderProcessing;
   }

   public String getBackOrderProcessing() {
      return this.backOrderProcessing;
   }

   public void setLineComments(String lineComments) {
      this.lineComments = lineComments;
   }

   public String getLineComments() {
      return this.lineComments;
   }

   public String getApiMethod() {
      return "jingdong.edi.poa.send";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("vendorCode", this.vendorCode);
      pmap.put("vendorName", this.vendorName);
      pmap.put("purchaseOrderCode", this.purchaseOrderCode);
      pmap.put("recordCount", this.recordCount);
      pmap.put("categoryNumber", this.categoryNumber);
      pmap.put("totalNubmer", this.totalNubmer);
      pmap.put("totalAmount", this.totalAmount);
      pmap.put("actualTotalAmount", this.actualTotalAmount);

      try {
         if (this.purchaseDate != null) {
            pmap.put("purchaseDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.purchaseDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.arrivalDate != null) {
            pmap.put("arrivalDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.arrivalDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("purchaseContact", this.purchaseContact);
      pmap.put("receivingAddress", this.receivingAddress);
      pmap.put("comments", this.comments);
      pmap.put("currentRecordCount", this.currentRecordCount);
      pmap.put("linePurchaseOrderCode", this.linePurchaseOrderCode);
      pmap.put("productCode", this.productCode);
      pmap.put("buyerProductId", this.buyerProductId);
      pmap.put("vendorSku", this.vendorSku);
      pmap.put("productName", this.productName);
      pmap.put("quantity", this.quantity);
      pmap.put("orderQuantity", this.orderQuantity);
      pmap.put("salePrice", this.salePrice);
      pmap.put("listPrice", this.listPrice);
      pmap.put("discountRate", this.discountRate);
      pmap.put("backOrderProcessing", this.backOrderProcessing);
      pmap.put("lineComments", this.lineComments);
      return JsonUtil.toJson(pmap);
   }

   public Class<EdiPoaSendResponse> getResponseClass() {
      return EdiPoaSendResponse.class;
   }
}
