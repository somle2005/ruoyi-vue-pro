package com.jd.open.api.sdk.request.market;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.market.FwMarketPaymentoutResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class FwMarketPaymentoutRequest extends AbstractRequest implements JdRequest<FwMarketPaymentoutResponse> {
   private String requestNo;
   private Long activityId;
   private String appId;
   private Long price;
   private Boolean isMainService;
   private Integer serviceCycle;
   private Long skuId;
   private String serviceCode;
   private Integer orderNum;
   private String itemCode;
   private Long outOrderId;
   private Object value1;
   private Integer resultPageType;
   private String successUrl;
   private String ip;

   public void setRequestNo(String requestNo) {
      this.requestNo = requestNo;
   }

   public String getRequestNo() {
      return this.requestNo;
   }

   public void setActivityId(Long activityId) {
      this.activityId = activityId;
   }

   public Long getActivityId() {
      return this.activityId;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setPrice(Long price) {
      this.price = price;
   }

   public Long getPrice() {
      return this.price;
   }

   public void setIsMainService(Boolean isMainService) {
      this.isMainService = isMainService;
   }

   public Boolean getIsMainService() {
      return this.isMainService;
   }

   public void setServiceCycle(Integer serviceCycle) {
      this.serviceCycle = serviceCycle;
   }

   public Integer getServiceCycle() {
      return this.serviceCycle;
   }

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public void setServiceCode(String serviceCode) {
      this.serviceCode = serviceCode;
   }

   public String getServiceCode() {
      return this.serviceCode;
   }

   public void setOrderNum(Integer orderNum) {
      this.orderNum = orderNum;
   }

   public Integer getOrderNum() {
      return this.orderNum;
   }

   public void setItemCode(String itemCode) {
      this.itemCode = itemCode;
   }

   public String getItemCode() {
      return this.itemCode;
   }

   public void setOutOrderId(Long outOrderId) {
      this.outOrderId = outOrderId;
   }

   public Long getOutOrderId() {
      return this.outOrderId;
   }

   public void setValue1(Object value1) {
      this.value1 = value1;
   }

   public Object getValue1() {
      return this.value1;
   }

   public void setResultPageType(Integer resultPageType) {
      this.resultPageType = resultPageType;
   }

   public Integer getResultPageType() {
      return this.resultPageType;
   }

   public void setSuccessUrl(String successUrl) {
      this.successUrl = successUrl;
   }

   public String getSuccessUrl() {
      return this.successUrl;
   }

   public void setIp(String ip) {
      this.ip = ip;
   }

   public String getIp() {
      return this.ip;
   }

   public String getApiMethod() {
      return "jingdong.fw.market.paymentout";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("requestNo", this.requestNo);
      pmap.put("activityId", this.activityId);
      pmap.put("appId", this.appId);
      pmap.put("price", this.price);
      pmap.put("isMainService", this.isMainService);
      pmap.put("serviceCycle", this.serviceCycle);
      pmap.put("skuId", this.skuId);
      pmap.put("serviceCode", this.serviceCode);
      pmap.put("orderNum", this.orderNum);
      pmap.put("itemCode", this.itemCode);
      pmap.put("outOrderId", this.outOrderId);
      pmap.put("value1", this.value1);
      pmap.put("resultPageType", this.resultPageType);
      pmap.put("successUrl", this.successUrl);
      pmap.put("ip", this.ip);
      return JsonUtil.toJson(pmap);
   }

   public Class<FwMarketPaymentoutResponse> getResponseClass() {
      return FwMarketPaymentoutResponse.class;
   }
}
