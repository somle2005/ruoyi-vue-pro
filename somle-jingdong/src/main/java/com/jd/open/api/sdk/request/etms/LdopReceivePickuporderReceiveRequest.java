package com.jd.open.api.sdk.request.etms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.etms.LdopReceivePickuporderReceiveResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class LdopReceivePickuporderReceiveRequest extends AbstractRequest implements JdRequest<LdopReceivePickuporderReceiveResponse> {
   private String pickupAddress;
   private String pickupName;
   private String pickupTel;
   private String customerTel;
   private String customerCode;
   private String backAddress;
   private String customerContract;
   private String desp;
   private String orderId;
   private Double weight;
   private String remark;
   private Double volume;
   private String valueAddService;
   private Boolean guaranteeValue;
   private Double guaranteeValueAmount;
   private Date pickupStartTime;
   private Date pickupEndTime;
   private String productId;
   private String productName;
   private String productCount;
   private String snCode;
   private String skuAddService;
   private String skuCheckOutShapes;
   private String skuCheckAttachFile;
   private String antiTearingCode;
   private Integer promiseTimeType;
   private Integer guaranteeSettleType;
   private Integer packingSettleType;
   private Integer freightSettleType;
   private Integer allowedRepeatOrderType;
   private String salePlatform;
   private Integer settleType;

   public void setPickupAddress(String pickupAddress) {
      this.pickupAddress = pickupAddress;
   }

   public String getPickupAddress() {
      return this.pickupAddress;
   }

   public void setPickupName(String pickupName) {
      this.pickupName = pickupName;
   }

   public String getPickupName() {
      return this.pickupName;
   }

   public void setPickupTel(String pickupTel) {
      this.pickupTel = pickupTel;
   }

   public String getPickupTel() {
      return this.pickupTel;
   }

   public void setCustomerTel(String customerTel) {
      this.customerTel = customerTel;
   }

   public String getCustomerTel() {
      return this.customerTel;
   }

   public void setCustomerCode(String customerCode) {
      this.customerCode = customerCode;
   }

   public String getCustomerCode() {
      return this.customerCode;
   }

   public void setBackAddress(String backAddress) {
      this.backAddress = backAddress;
   }

   public String getBackAddress() {
      return this.backAddress;
   }

   public void setCustomerContract(String customerContract) {
      this.customerContract = customerContract;
   }

   public String getCustomerContract() {
      return this.customerContract;
   }

   public void setDesp(String desp) {
      this.desp = desp;
   }

   public String getDesp() {
      return this.desp;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setWeight(Double weight) {
      this.weight = weight;
   }

   public Double getWeight() {
      return this.weight;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getRemark() {
      return this.remark;
   }

   public void setVolume(Double volume) {
      this.volume = volume;
   }

   public Double getVolume() {
      return this.volume;
   }

   public void setValueAddService(String valueAddService) {
      this.valueAddService = valueAddService;
   }

   public String getValueAddService() {
      return this.valueAddService;
   }

   public void setGuaranteeValue(Boolean guaranteeValue) {
      this.guaranteeValue = guaranteeValue;
   }

   public Boolean getGuaranteeValue() {
      return this.guaranteeValue;
   }

   public void setGuaranteeValueAmount(Double guaranteeValueAmount) {
      this.guaranteeValueAmount = guaranteeValueAmount;
   }

   public Double getGuaranteeValueAmount() {
      return this.guaranteeValueAmount;
   }

   public void setPickupStartTime(Date pickupStartTime) {
      this.pickupStartTime = pickupStartTime;
   }

   public Date getPickupStartTime() {
      return this.pickupStartTime;
   }

   public void setPickupEndTime(Date pickupEndTime) {
      this.pickupEndTime = pickupEndTime;
   }

   public Date getPickupEndTime() {
      return this.pickupEndTime;
   }

   public void setProductId(String productId) {
      this.productId = productId;
   }

   public String getProductId() {
      return this.productId;
   }

   public void setProductName(String productName) {
      this.productName = productName;
   }

   public String getProductName() {
      return this.productName;
   }

   public void setProductCount(String productCount) {
      this.productCount = productCount;
   }

   public String getProductCount() {
      return this.productCount;
   }

   public void setSnCode(String snCode) {
      this.snCode = snCode;
   }

   public String getSnCode() {
      return this.snCode;
   }

   public void setSkuAddService(String skuAddService) {
      this.skuAddService = skuAddService;
   }

   public String getSkuAddService() {
      return this.skuAddService;
   }

   public void setSkuCheckOutShapes(String skuCheckOutShapes) {
      this.skuCheckOutShapes = skuCheckOutShapes;
   }

   public String getSkuCheckOutShapes() {
      return this.skuCheckOutShapes;
   }

   public void setSkuCheckAttachFile(String skuCheckAttachFile) {
      this.skuCheckAttachFile = skuCheckAttachFile;
   }

   public String getSkuCheckAttachFile() {
      return this.skuCheckAttachFile;
   }

   public void setAntiTearingCode(String antiTearingCode) {
      this.antiTearingCode = antiTearingCode;
   }

   public String getAntiTearingCode() {
      return this.antiTearingCode;
   }

   public void setPromiseTimeType(Integer promiseTimeType) {
      this.promiseTimeType = promiseTimeType;
   }

   public Integer getPromiseTimeType() {
      return this.promiseTimeType;
   }

   public void setGuaranteeSettleType(Integer guaranteeSettleType) {
      this.guaranteeSettleType = guaranteeSettleType;
   }

   public Integer getGuaranteeSettleType() {
      return this.guaranteeSettleType;
   }

   public void setPackingSettleType(Integer packingSettleType) {
      this.packingSettleType = packingSettleType;
   }

   public Integer getPackingSettleType() {
      return this.packingSettleType;
   }

   public void setFreightSettleType(Integer freightSettleType) {
      this.freightSettleType = freightSettleType;
   }

   public Integer getFreightSettleType() {
      return this.freightSettleType;
   }

   public void setAllowedRepeatOrderType(Integer allowedRepeatOrderType) {
      this.allowedRepeatOrderType = allowedRepeatOrderType;
   }

   public Integer getAllowedRepeatOrderType() {
      return this.allowedRepeatOrderType;
   }

   public void setSalePlatform(String salePlatform) {
      this.salePlatform = salePlatform;
   }

   public String getSalePlatform() {
      return this.salePlatform;
   }

   public void setSettleType(Integer settleType) {
      this.settleType = settleType;
   }

   public Integer getSettleType() {
      return this.settleType;
   }

   public String getApiMethod() {
      return "jingdong.ldop.receive.pickuporder.receive";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("pickupAddress", this.pickupAddress);
      pmap.put("pickupName", this.pickupName);
      pmap.put("pickupTel", this.pickupTel);
      pmap.put("customerTel", this.customerTel);
      pmap.put("customerCode", this.customerCode);
      pmap.put("backAddress", this.backAddress);
      pmap.put("customerContract", this.customerContract);
      pmap.put("desp", this.desp);
      pmap.put("orderId", this.orderId);
      pmap.put("weight", this.weight);
      pmap.put("remark", this.remark);
      pmap.put("volume", this.volume);
      pmap.put("valueAddService", this.valueAddService);
      pmap.put("guaranteeValue", this.guaranteeValue);
      pmap.put("guaranteeValueAmount", this.guaranteeValueAmount);

      try {
         if (this.pickupStartTime != null) {
            pmap.put("pickupStartTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.pickupStartTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.pickupEndTime != null) {
            pmap.put("pickupEndTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.pickupEndTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("productId", this.productId);
      pmap.put("productName", this.productName);
      pmap.put("productCount", this.productCount);
      pmap.put("snCode", this.snCode);
      pmap.put("skuAddService", this.skuAddService);
      pmap.put("skuCheckOutShapes", this.skuCheckOutShapes);
      pmap.put("skuCheckAttachFile", this.skuCheckAttachFile);
      pmap.put("antiTearingCode", this.antiTearingCode);
      pmap.put("promiseTimeType", this.promiseTimeType);
      pmap.put("guaranteeSettleType", this.guaranteeSettleType);
      pmap.put("packingSettleType", this.packingSettleType);
      pmap.put("freightSettleType", this.freightSettleType);
      pmap.put("allowedRepeatOrderType", this.allowedRepeatOrderType);
      pmap.put("salePlatform", this.salePlatform);
      pmap.put("settleType", this.settleType);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopReceivePickuporderReceiveResponse> getResponseClass() {
      return LdopReceivePickuporderReceiveResponse.class;
   }
}
