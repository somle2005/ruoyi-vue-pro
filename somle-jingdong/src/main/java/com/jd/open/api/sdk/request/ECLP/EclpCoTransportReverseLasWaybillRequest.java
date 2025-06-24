package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpCoTransportReverseLasWaybillResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class EclpCoTransportReverseLasWaybillRequest extends AbstractRequest implements JdRequest<EclpCoTransportReverseLasWaybillResponse> {
   private String deptNo;
   private String orderNo;
   private String salePlatform;
   private String customerPin;
   private String associateSoNo;
   private String senderName;
   private String senderMobile;
   private String senderPhone;
   private String senderAddress;
   private String receiverName;
   private String receiverMobile;
   private String receiverPhone;
   private String receiverAddress;
   private String isFragile;
   private String pickupReturnReason;
   private Byte isGuarantee;
   private BigDecimal guaranteeValue;
   private String isDoorToDoorRecycle;
   private String oaid;
   private String weight;
   private String length;
   private String width;
   private String height;
   private String packageName;
   private String packageQty;
   private String productSku;
   private String lasDisassemble;
   private String lasBale;
   private String thirdCategoryNo;

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setSalePlatform(String salePlatform) {
      this.salePlatform = salePlatform;
   }

   public String getSalePlatform() {
      return this.salePlatform;
   }

   public void setCustomerPin(String customerPin) {
      this.customerPin = customerPin;
   }

   public String getCustomerPin() {
      return this.customerPin;
   }

   public void setAssociateSoNo(String associateSoNo) {
      this.associateSoNo = associateSoNo;
   }

   public String getAssociateSoNo() {
      return this.associateSoNo;
   }

   public void setSenderName(String senderName) {
      this.senderName = senderName;
   }

   public String getSenderName() {
      return this.senderName;
   }

   public void setSenderMobile(String senderMobile) {
      this.senderMobile = senderMobile;
   }

   public String getSenderMobile() {
      return this.senderMobile;
   }

   public void setSenderPhone(String senderPhone) {
      this.senderPhone = senderPhone;
   }

   public String getSenderPhone() {
      return this.senderPhone;
   }

   public void setSenderAddress(String senderAddress) {
      this.senderAddress = senderAddress;
   }

   public String getSenderAddress() {
      return this.senderAddress;
   }

   public void setReceiverName(String receiverName) {
      this.receiverName = receiverName;
   }

   public String getReceiverName() {
      return this.receiverName;
   }

   public void setReceiverMobile(String receiverMobile) {
      this.receiverMobile = receiverMobile;
   }

   public String getReceiverMobile() {
      return this.receiverMobile;
   }

   public void setReceiverPhone(String receiverPhone) {
      this.receiverPhone = receiverPhone;
   }

   public String getReceiverPhone() {
      return this.receiverPhone;
   }

   public void setReceiverAddress(String receiverAddress) {
      this.receiverAddress = receiverAddress;
   }

   public String getReceiverAddress() {
      return this.receiverAddress;
   }

   public void setIsFragile(String isFragile) {
      this.isFragile = isFragile;
   }

   public String getIsFragile() {
      return this.isFragile;
   }

   public void setPickupReturnReason(String pickupReturnReason) {
      this.pickupReturnReason = pickupReturnReason;
   }

   public String getPickupReturnReason() {
      return this.pickupReturnReason;
   }

   public void setIsGuarantee(Byte isGuarantee) {
      this.isGuarantee = isGuarantee;
   }

   public Byte getIsGuarantee() {
      return this.isGuarantee;
   }

   public void setGuaranteeValue(BigDecimal guaranteeValue) {
      this.guaranteeValue = guaranteeValue;
   }

   public BigDecimal getGuaranteeValue() {
      return this.guaranteeValue;
   }

   public void setIsDoorToDoorRecycle(String isDoorToDoorRecycle) {
      this.isDoorToDoorRecycle = isDoorToDoorRecycle;
   }

   public String getIsDoorToDoorRecycle() {
      return this.isDoorToDoorRecycle;
   }

   public void setOaid(String oaid) {
      this.oaid = oaid;
   }

   public String getOaid() {
      return this.oaid;
   }

   public void setWeight(String weight) {
      this.weight = weight;
   }

   public String getWeight() {
      return this.weight;
   }

   public void setLength(String length) {
      this.length = length;
   }

   public String getLength() {
      return this.length;
   }

   public void setWidth(String width) {
      this.width = width;
   }

   public String getWidth() {
      return this.width;
   }

   public void setHeight(String height) {
      this.height = height;
   }

   public String getHeight() {
      return this.height;
   }

   public void setPackageName(String packageName) {
      this.packageName = packageName;
   }

   public String getPackageName() {
      return this.packageName;
   }

   public void setPackageQty(String packageQty) {
      this.packageQty = packageQty;
   }

   public String getPackageQty() {
      return this.packageQty;
   }

   public void setProductSku(String productSku) {
      this.productSku = productSku;
   }

   public String getProductSku() {
      return this.productSku;
   }

   public void setLasDisassemble(String lasDisassemble) {
      this.lasDisassemble = lasDisassemble;
   }

   public String getLasDisassemble() {
      return this.lasDisassemble;
   }

   public void setLasBale(String lasBale) {
      this.lasBale = lasBale;
   }

   public String getLasBale() {
      return this.lasBale;
   }

   public void setThirdCategoryNo(String thirdCategoryNo) {
      this.thirdCategoryNo = thirdCategoryNo;
   }

   public String getThirdCategoryNo() {
      return this.thirdCategoryNo;
   }

   public String getApiMethod() {
      return "jingdong.eclp.co.transportReverseLasWaybill";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNo", this.deptNo);
      pmap.put("orderNo", this.orderNo);
      pmap.put("salePlatform", this.salePlatform);
      pmap.put("customerPin", this.customerPin);
      pmap.put("associateSoNo", this.associateSoNo);
      pmap.put("senderName", this.senderName);
      pmap.put("senderMobile", this.senderMobile);
      pmap.put("senderPhone", this.senderPhone);
      pmap.put("senderAddress", this.senderAddress);
      pmap.put("receiverName", this.receiverName);
      pmap.put("receiverMobile", this.receiverMobile);
      pmap.put("receiverPhone", this.receiverPhone);
      pmap.put("receiverAddress", this.receiverAddress);
      pmap.put("isFragile", this.isFragile);
      pmap.put("pickupReturnReason", this.pickupReturnReason);
      pmap.put("isGuarantee", this.isGuarantee);
      pmap.put("guaranteeValue", this.guaranteeValue);
      pmap.put("isDoorToDoorRecycle", this.isDoorToDoorRecycle);
      pmap.put("oaid", this.oaid);
      pmap.put("weight", this.weight);
      pmap.put("length", this.length);
      pmap.put("width", this.width);
      pmap.put("height", this.height);
      pmap.put("packageName", this.packageName);
      pmap.put("packageQty", this.packageQty);
      pmap.put("productSku", this.productSku);
      pmap.put("lasDisassemble", this.lasDisassemble);
      pmap.put("lasBale", this.lasBale);
      pmap.put("thirdCategoryNo", this.thirdCategoryNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpCoTransportReverseLasWaybillResponse> getResponseClass() {
      return EclpCoTransportReverseLasWaybillResponse.class;
   }
}
