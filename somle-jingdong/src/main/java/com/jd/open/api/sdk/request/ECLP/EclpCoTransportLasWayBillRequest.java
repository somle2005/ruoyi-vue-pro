package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpCoTransportLasWayBillResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpCoTransportLasWayBillRequest extends AbstractRequest implements JdRequest<EclpCoTransportLasWayBillResponse> {
   private String deptNo;
   private String orderNo;
   private String senderName;
   private String senderMobile;
   private String senderPhone;
   private String senderAddress;
   private String receiverName;
   private String receiverMobile;
   private String receiverPhone;
   private String receiverAddress;
   private String remark;
   private String isFragile;
   private String senderTc;
   private String predictDate;
   private String isJDOrder;
   private String isCod;
   private String receiveable;
   private String onDoorPickUp;
   private String pickUpDate;
   private String isGuarantee;
   private String guaranteeValue;
   private String receiptFlag;
   private String paperFrom;
   private String rtnReceiverName;
   private String rtnReceiverMobile;
   private String rtnReceiverAddress;
   private String rtnReceiverPhone;
   private String productType;
   private String pickUpForNew;
   private String pickUpAbnormalNumber;
   private String pickUpReceiverName;
   private String pickUpReceiverMobile;
   private String pickUpReceiverPhone;
   private String pickUpReceiverCode;
   private String pickUpReceiverAddress;
   private Byte isSignPrint;
   private String sameCityDelivery;
   private String lasDischarge;
   private Integer thirdPayment;
   private String extendFieldStr;
   private String servProductName;
   private String servProductSku;
   private String servProductNum;
   private String servCode;
   private String saleOrderNo;
   private String upstairsFlag;
   private String oaid;
   private String backerName;
   private String backerMobile;
   private String backerPhone;
   private String backerAddress;
   private String weight;
   private String length;
   private String width;
   private String height;
   private String installFlag;
   private String thirdCategoryNo;
   private String brandNo;
   private String productSku;
   private String packageName;
   private String reverseLwb;
   private String getOldService;
   private String openBoxService;
   private String deliveryInstallService;
   private String packageIdentityCode;
   private String price;
   private String lasInstall;

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

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getRemark() {
      return this.remark;
   }

   public void setIsFragile(String isFragile) {
      this.isFragile = isFragile;
   }

   public String getIsFragile() {
      return this.isFragile;
   }

   public void setSenderTc(String senderTc) {
      this.senderTc = senderTc;
   }

   public String getSenderTc() {
      return this.senderTc;
   }

   public void setPredictDate(String predictDate) {
      this.predictDate = predictDate;
   }

   public String getPredictDate() {
      return this.predictDate;
   }

   public void setIsJDOrder(String isJDOrder) {
      this.isJDOrder = isJDOrder;
   }

   public String getIsJDOrder() {
      return this.isJDOrder;
   }

   public void setIsCod(String isCod) {
      this.isCod = isCod;
   }

   public String getIsCod() {
      return this.isCod;
   }

   public void setReceiveable(String receiveable) {
      this.receiveable = receiveable;
   }

   public String getReceiveable() {
      return this.receiveable;
   }

   public void setOnDoorPickUp(String onDoorPickUp) {
      this.onDoorPickUp = onDoorPickUp;
   }

   public String getOnDoorPickUp() {
      return this.onDoorPickUp;
   }

   public void setPickUpDate(String pickUpDate) {
      this.pickUpDate = pickUpDate;
   }

   public String getPickUpDate() {
      return this.pickUpDate;
   }

   public void setIsGuarantee(String isGuarantee) {
      this.isGuarantee = isGuarantee;
   }

   public String getIsGuarantee() {
      return this.isGuarantee;
   }

   public void setGuaranteeValue(String guaranteeValue) {
      this.guaranteeValue = guaranteeValue;
   }

   public String getGuaranteeValue() {
      return this.guaranteeValue;
   }

   public void setReceiptFlag(String receiptFlag) {
      this.receiptFlag = receiptFlag;
   }

   public String getReceiptFlag() {
      return this.receiptFlag;
   }

   public void setPaperFrom(String paperFrom) {
      this.paperFrom = paperFrom;
   }

   public String getPaperFrom() {
      return this.paperFrom;
   }

   public void setRtnReceiverName(String rtnReceiverName) {
      this.rtnReceiverName = rtnReceiverName;
   }

   public String getRtnReceiverName() {
      return this.rtnReceiverName;
   }

   public void setRtnReceiverMobile(String rtnReceiverMobile) {
      this.rtnReceiverMobile = rtnReceiverMobile;
   }

   public String getRtnReceiverMobile() {
      return this.rtnReceiverMobile;
   }

   public void setRtnReceiverAddress(String rtnReceiverAddress) {
      this.rtnReceiverAddress = rtnReceiverAddress;
   }

   public String getRtnReceiverAddress() {
      return this.rtnReceiverAddress;
   }

   public void setRtnReceiverPhone(String rtnReceiverPhone) {
      this.rtnReceiverPhone = rtnReceiverPhone;
   }

   public String getRtnReceiverPhone() {
      return this.rtnReceiverPhone;
   }

   public void setProductType(String productType) {
      this.productType = productType;
   }

   public String getProductType() {
      return this.productType;
   }

   public void setPickUpForNew(String pickUpForNew) {
      this.pickUpForNew = pickUpForNew;
   }

   public String getPickUpForNew() {
      return this.pickUpForNew;
   }

   public void setPickUpAbnormalNumber(String pickUpAbnormalNumber) {
      this.pickUpAbnormalNumber = pickUpAbnormalNumber;
   }

   public String getPickUpAbnormalNumber() {
      return this.pickUpAbnormalNumber;
   }

   public void setPickUpReceiverName(String pickUpReceiverName) {
      this.pickUpReceiverName = pickUpReceiverName;
   }

   public String getPickUpReceiverName() {
      return this.pickUpReceiverName;
   }

   public void setPickUpReceiverMobile(String pickUpReceiverMobile) {
      this.pickUpReceiverMobile = pickUpReceiverMobile;
   }

   public String getPickUpReceiverMobile() {
      return this.pickUpReceiverMobile;
   }

   public void setPickUpReceiverPhone(String pickUpReceiverPhone) {
      this.pickUpReceiverPhone = pickUpReceiverPhone;
   }

   public String getPickUpReceiverPhone() {
      return this.pickUpReceiverPhone;
   }

   public void setPickUpReceiverCode(String pickUpReceiverCode) {
      this.pickUpReceiverCode = pickUpReceiverCode;
   }

   public String getPickUpReceiverCode() {
      return this.pickUpReceiverCode;
   }

   public void setPickUpReceiverAddress(String pickUpReceiverAddress) {
      this.pickUpReceiverAddress = pickUpReceiverAddress;
   }

   public String getPickUpReceiverAddress() {
      return this.pickUpReceiverAddress;
   }

   public void setIsSignPrint(Byte isSignPrint) {
      this.isSignPrint = isSignPrint;
   }

   public Byte getIsSignPrint() {
      return this.isSignPrint;
   }

   public void setSameCityDelivery(String sameCityDelivery) {
      this.sameCityDelivery = sameCityDelivery;
   }

   public String getSameCityDelivery() {
      return this.sameCityDelivery;
   }

   public void setLasDischarge(String lasDischarge) {
      this.lasDischarge = lasDischarge;
   }

   public String getLasDischarge() {
      return this.lasDischarge;
   }

   public void setThirdPayment(Integer thirdPayment) {
      this.thirdPayment = thirdPayment;
   }

   public Integer getThirdPayment() {
      return this.thirdPayment;
   }

   public void setExtendFieldStr(String extendFieldStr) {
      this.extendFieldStr = extendFieldStr;
   }

   public String getExtendFieldStr() {
      return this.extendFieldStr;
   }

   public void setServProductName(String servProductName) {
      this.servProductName = servProductName;
   }

   public String getServProductName() {
      return this.servProductName;
   }

   public void setServProductSku(String servProductSku) {
      this.servProductSku = servProductSku;
   }

   public String getServProductSku() {
      return this.servProductSku;
   }

   public void setServProductNum(String servProductNum) {
      this.servProductNum = servProductNum;
   }

   public String getServProductNum() {
      return this.servProductNum;
   }

   public void setServCode(String servCode) {
      this.servCode = servCode;
   }

   public String getServCode() {
      return this.servCode;
   }

   public void setSaleOrderNo(String saleOrderNo) {
      this.saleOrderNo = saleOrderNo;
   }

   public String getSaleOrderNo() {
      return this.saleOrderNo;
   }

   public void setUpstairsFlag(String upstairsFlag) {
      this.upstairsFlag = upstairsFlag;
   }

   public String getUpstairsFlag() {
      return this.upstairsFlag;
   }

   public void setOaid(String oaid) {
      this.oaid = oaid;
   }

   public String getOaid() {
      return this.oaid;
   }

   public void setBackerName(String backerName) {
      this.backerName = backerName;
   }

   public String getBackerName() {
      return this.backerName;
   }

   public void setBackerMobile(String backerMobile) {
      this.backerMobile = backerMobile;
   }

   public String getBackerMobile() {
      return this.backerMobile;
   }

   public void setBackerPhone(String backerPhone) {
      this.backerPhone = backerPhone;
   }

   public String getBackerPhone() {
      return this.backerPhone;
   }

   public void setBackerAddress(String backerAddress) {
      this.backerAddress = backerAddress;
   }

   public String getBackerAddress() {
      return this.backerAddress;
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

   public void setInstallFlag(String installFlag) {
      this.installFlag = installFlag;
   }

   public String getInstallFlag() {
      return this.installFlag;
   }

   public void setThirdCategoryNo(String thirdCategoryNo) {
      this.thirdCategoryNo = thirdCategoryNo;
   }

   public String getThirdCategoryNo() {
      return this.thirdCategoryNo;
   }

   public void setBrandNo(String brandNo) {
      this.brandNo = brandNo;
   }

   public String getBrandNo() {
      return this.brandNo;
   }

   public void setProductSku(String productSku) {
      this.productSku = productSku;
   }

   public String getProductSku() {
      return this.productSku;
   }

   public void setPackageName(String packageName) {
      this.packageName = packageName;
   }

   public String getPackageName() {
      return this.packageName;
   }

   public void setReverseLwb(String reverseLwb) {
      this.reverseLwb = reverseLwb;
   }

   public String getReverseLwb() {
      return this.reverseLwb;
   }

   public void setGetOldService(String getOldService) {
      this.getOldService = getOldService;
   }

   public String getGetOldService() {
      return this.getOldService;
   }

   public void setOpenBoxService(String openBoxService) {
      this.openBoxService = openBoxService;
   }

   public String getOpenBoxService() {
      return this.openBoxService;
   }

   public void setDeliveryInstallService(String deliveryInstallService) {
      this.deliveryInstallService = deliveryInstallService;
   }

   public String getDeliveryInstallService() {
      return this.deliveryInstallService;
   }

   public void setPackageIdentityCode(String packageIdentityCode) {
      this.packageIdentityCode = packageIdentityCode;
   }

   public String getPackageIdentityCode() {
      return this.packageIdentityCode;
   }

   public void setPrice(String price) {
      this.price = price;
   }

   public String getPrice() {
      return this.price;
   }

   public void setLasInstall(String lasInstall) {
      this.lasInstall = lasInstall;
   }

   public String getLasInstall() {
      return this.lasInstall;
   }

   public String getApiMethod() {
      return "jingdong.eclp.co.transportLasWayBill";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNo", this.deptNo);
      pmap.put("orderNo", this.orderNo);
      pmap.put("senderName", this.senderName);
      pmap.put("senderMobile", this.senderMobile);
      pmap.put("senderPhone", this.senderPhone);
      pmap.put("senderAddress", this.senderAddress);
      pmap.put("receiverName", this.receiverName);
      pmap.put("receiverMobile", this.receiverMobile);
      pmap.put("receiverPhone", this.receiverPhone);
      pmap.put("receiverAddress", this.receiverAddress);
      pmap.put("remark", this.remark);
      pmap.put("isFragile", this.isFragile);
      pmap.put("senderTc", this.senderTc);
      pmap.put("predictDate", this.predictDate);
      pmap.put("isJDOrder", this.isJDOrder);
      pmap.put("isCod", this.isCod);
      pmap.put("receiveable", this.receiveable);
      pmap.put("onDoorPickUp", this.onDoorPickUp);
      pmap.put("pickUpDate", this.pickUpDate);
      pmap.put("isGuarantee", this.isGuarantee);
      pmap.put("guaranteeValue", this.guaranteeValue);
      pmap.put("receiptFlag", this.receiptFlag);
      pmap.put("paperFrom", this.paperFrom);
      pmap.put("rtnReceiverName", this.rtnReceiverName);
      pmap.put("rtnReceiverMobile", this.rtnReceiverMobile);
      pmap.put("rtnReceiverAddress", this.rtnReceiverAddress);
      pmap.put("rtnReceiverPhone", this.rtnReceiverPhone);
      pmap.put("productType", this.productType);
      pmap.put("pickUpForNew", this.pickUpForNew);
      pmap.put("pickUpAbnormalNumber", this.pickUpAbnormalNumber);
      pmap.put("pickUpReceiverName", this.pickUpReceiverName);
      pmap.put("pickUpReceiverMobile", this.pickUpReceiverMobile);
      pmap.put("pickUpReceiverPhone", this.pickUpReceiverPhone);
      pmap.put("pickUpReceiverCode", this.pickUpReceiverCode);
      pmap.put("pickUpReceiverAddress", this.pickUpReceiverAddress);
      pmap.put("isSignPrint", this.isSignPrint);
      pmap.put("sameCityDelivery", this.sameCityDelivery);
      pmap.put("lasDischarge", this.lasDischarge);
      pmap.put("thirdPayment", this.thirdPayment);
      pmap.put("extendFieldStr", this.extendFieldStr);
      pmap.put("servProductName", this.servProductName);
      pmap.put("servProductSku", this.servProductSku);
      pmap.put("servProductNum", this.servProductNum);
      pmap.put("servCode", this.servCode);
      pmap.put("saleOrderNo", this.saleOrderNo);
      pmap.put("upstairsFlag", this.upstairsFlag);
      pmap.put("oaid", this.oaid);
      pmap.put("backerName", this.backerName);
      pmap.put("backerMobile", this.backerMobile);
      pmap.put("backerPhone", this.backerPhone);
      pmap.put("backerAddress", this.backerAddress);
      pmap.put("weight", this.weight);
      pmap.put("length", this.length);
      pmap.put("width", this.width);
      pmap.put("height", this.height);
      pmap.put("installFlag", this.installFlag);
      pmap.put("thirdCategoryNo", this.thirdCategoryNo);
      pmap.put("brandNo", this.brandNo);
      pmap.put("productSku", this.productSku);
      pmap.put("packageName", this.packageName);
      pmap.put("reverseLwb", this.reverseLwb);
      pmap.put("getOldService", this.getOldService);
      pmap.put("openBoxService", this.openBoxService);
      pmap.put("deliveryInstallService", this.deliveryInstallService);
      pmap.put("packageIdentityCode", this.packageIdentityCode);
      pmap.put("price", this.price);
      pmap.put("lasInstall", this.lasInstall);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpCoTransportLasWayBillResponse> getResponseClass() {
      return EclpCoTransportLasWayBillResponse.class;
   }
}
