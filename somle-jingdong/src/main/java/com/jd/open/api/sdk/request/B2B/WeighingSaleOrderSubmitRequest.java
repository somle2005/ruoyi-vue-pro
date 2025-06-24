package com.jd.open.api.sdk.request.B2B;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.B2B.WeighingSaleOrderSubmitResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WeighingSaleOrderSubmitRequest extends AbstractRequest implements JdRequest<WeighingSaleOrderSubmitResponse> {
   private Integer buId;
   private String appKey;
   private String ip;
   private String loginPerson;
   private Integer orignalNum;
   private String skuUuid;
   private String nsspUnit;
   private Integer actualNum;
   private Long skuId;
   private Integer skuNum;
   private String thirdNsspId;
   private String buyerPin;
   private Integer classifyType;
   private Long jdOrderId;
   private Integer nsspSource;
   private String openIdBuyer;
   private String xidBuyer;

   public void setBuId(Integer buId) {
      this.buId = buId;
   }

   public Integer getBuId() {
      return this.buId;
   }

   public void setAppKey(String appKey) {
      this.appKey = appKey;
   }

   public String getAppKey() {
      return this.appKey;
   }

   public void setIp(String ip) {
      this.ip = ip;
   }

   public String getIp() {
      return this.ip;
   }

   public void setLoginPerson(String loginPerson) {
      this.loginPerson = loginPerson;
   }

   public String getLoginPerson() {
      return this.loginPerson;
   }

   public void setOrignalNum(Integer orignalNum) {
      this.orignalNum = orignalNum;
   }

   public Integer getOrignalNum() {
      return this.orignalNum;
   }

   public void setSkuUuid(String skuUuid) {
      this.skuUuid = skuUuid;
   }

   public String getSkuUuid() {
      return this.skuUuid;
   }

   public void setNsspUnit(String nsspUnit) {
      this.nsspUnit = nsspUnit;
   }

   public String getNsspUnit() {
      return this.nsspUnit;
   }

   public void setActualNum(Integer actualNum) {
      this.actualNum = actualNum;
   }

   public Integer getActualNum() {
      return this.actualNum;
   }

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public void setSkuNum(Integer skuNum) {
      this.skuNum = skuNum;
   }

   public Integer getSkuNum() {
      return this.skuNum;
   }

   public void setThirdNsspId(String thirdNsspId) {
      this.thirdNsspId = thirdNsspId;
   }

   public String getThirdNsspId() {
      return this.thirdNsspId;
   }

   public void setBuyerPin(String buyerPin) {
      this.buyerPin = buyerPin;
   }

   public String getBuyerPin() {
      return this.buyerPin;
   }

   public void setClassifyType(Integer classifyType) {
      this.classifyType = classifyType;
   }

   public Integer getClassifyType() {
      return this.classifyType;
   }

   public void setJdOrderId(Long jdOrderId) {
      this.jdOrderId = jdOrderId;
   }

   public Long getJdOrderId() {
      return this.jdOrderId;
   }

   public void setNsspSource(Integer nsspSource) {
      this.nsspSource = nsspSource;
   }

   public Integer getNsspSource() {
      return this.nsspSource;
   }

   public void setOpenIdBuyer(String openIdBuyer) {
      this.openIdBuyer = openIdBuyer;
   }

   public String getOpenIdBuyer() {
      return this.openIdBuyer;
   }

   public void setXidBuyer(String xidBuyer) {
      this.xidBuyer = xidBuyer;
   }

   public String getXidBuyer() {
      return this.xidBuyer;
   }

   public String getApiMethod() {
      return "jingdong.weighing.sale.order.submit";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("buId", this.buId);
      pmap.put("appKey", this.appKey);
      pmap.put("ip", this.ip);
      pmap.put("loginPerson", this.loginPerson);
      pmap.put("orignalNum", this.orignalNum);
      pmap.put("skuUuid", this.skuUuid);
      pmap.put("nsspUnit", this.nsspUnit);
      pmap.put("actualNum", this.actualNum);
      pmap.put("skuId", this.skuId);
      pmap.put("skuNum", this.skuNum);
      pmap.put("thirdNsspId", this.thirdNsspId);
      pmap.put("buyerPin", this.buyerPin);
      pmap.put("classifyType", this.classifyType);
      pmap.put("jdOrderId", this.jdOrderId);
      pmap.put("nsspSource", this.nsspSource);
      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      return JsonUtil.toJson(pmap);
   }

   public Class<WeighingSaleOrderSubmitResponse> getResponseClass() {
      return WeighingSaleOrderSubmitResponse.class;
   }
}
