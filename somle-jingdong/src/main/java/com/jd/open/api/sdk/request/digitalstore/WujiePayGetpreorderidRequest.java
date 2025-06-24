package com.jd.open.api.sdk.request.digitalstore;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.digitalstore.WujiePayGetpreorderidResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WujiePayGetpreorderidRequest extends AbstractRequest implements JdRequest<WujiePayGetpreorderidResponse> {
   private String brandId;
   private String bizId;
   private String exStoreId;
   private String outTradeNo;
   private Long amount;
   private String notifyUrl;
   private String extMap;
   private String merchantNo;
   private String storePrice;
   private String exSkuId;
   private String count;
   private String activityPrice;
   private String returnUrl;
   private Long venderId;
   private String scene;
   private Long activityAmount;

   public void setBrandId(String brandId) {
      this.brandId = brandId;
   }

   public String getBrandId() {
      return this.brandId;
   }

   public void setBizId(String bizId) {
      this.bizId = bizId;
   }

   public String getBizId() {
      return this.bizId;
   }

   public void setExStoreId(String exStoreId) {
      this.exStoreId = exStoreId;
   }

   public String getExStoreId() {
      return this.exStoreId;
   }

   public void setOutTradeNo(String outTradeNo) {
      this.outTradeNo = outTradeNo;
   }

   public String getOutTradeNo() {
      return this.outTradeNo;
   }

   public void setAmount(Long amount) {
      this.amount = amount;
   }

   public Long getAmount() {
      return this.amount;
   }

   public void setNotifyUrl(String notifyUrl) {
      this.notifyUrl = notifyUrl;
   }

   public String getNotifyUrl() {
      return this.notifyUrl;
   }

   public void setExtMap(String extMap) {
      this.extMap = extMap;
   }

   public String getExtMap() {
      return this.extMap;
   }

   public void setMerchantNo(String merchantNo) {
      this.merchantNo = merchantNo;
   }

   public String getMerchantNo() {
      return this.merchantNo;
   }

   public void setStorePrice(String storePrice) {
      this.storePrice = storePrice;
   }

   public String getStorePrice() {
      return this.storePrice;
   }

   public void setExSkuId(String exSkuId) {
      this.exSkuId = exSkuId;
   }

   public String getExSkuId() {
      return this.exSkuId;
   }

   public void setCount(String count) {
      this.count = count;
   }

   public String getCount() {
      return this.count;
   }

   public void setActivityPrice(String activityPrice) {
      this.activityPrice = activityPrice;
   }

   public String getActivityPrice() {
      return this.activityPrice;
   }

   public void setReturnUrl(String returnUrl) {
      this.returnUrl = returnUrl;
   }

   public String getReturnUrl() {
      return this.returnUrl;
   }

   public void setVenderId(Long venderId) {
      this.venderId = venderId;
   }

   public Long getVenderId() {
      return this.venderId;
   }

   public void setScene(String scene) {
      this.scene = scene;
   }

   public String getScene() {
      return this.scene;
   }

   public void setActivityAmount(Long activityAmount) {
      this.activityAmount = activityAmount;
   }

   public Long getActivityAmount() {
      return this.activityAmount;
   }

   public String getApiMethod() {
      return "jingdong.wujie.pay.getpreorderid";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("brandId", this.brandId);
      pmap.put("bizId", this.bizId);
      pmap.put("exStoreId", this.exStoreId);
      pmap.put("outTradeNo", this.outTradeNo);
      pmap.put("amount", this.amount);
      pmap.put("notifyUrl", this.notifyUrl);
      pmap.put("extMap", this.extMap);
      pmap.put("merchantNo", this.merchantNo);
      pmap.put("storePrice", this.storePrice);
      pmap.put("exSkuId", this.exSkuId);
      pmap.put("count", this.count);
      pmap.put("activityPrice", this.activityPrice);
      pmap.put("returnUrl", this.returnUrl);
      pmap.put("venderId", this.venderId);
      pmap.put("scene", this.scene);
      pmap.put("activityAmount", this.activityAmount);
      return JsonUtil.toJson(pmap);
   }

   public Class<WujiePayGetpreorderidResponse> getResponseClass() {
      return WujiePayGetpreorderidResponse.class;
   }
}
