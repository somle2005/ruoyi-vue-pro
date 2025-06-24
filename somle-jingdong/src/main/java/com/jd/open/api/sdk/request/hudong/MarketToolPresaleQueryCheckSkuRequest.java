package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.MarketToolPresaleQueryCheckSkuResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MarketToolPresaleQueryCheckSkuRequest extends AbstractRequest implements JdRequest<MarketToolPresaleQueryCheckSkuResponse> {
   private String shipTime;
   private Boolean mergePay;
   private String presaleStartTime;
   private Integer hidePrice;
   private String balanceStartTime;
   private String skuId;
   private Integer type;
   private Integer attribute5;
   private Integer selectType;
   private Integer balanceHours;
   private Integer payType;
   private String presaleEndTime;
   private Integer discountType;

   public void setShipTime(String shipTime) {
      this.shipTime = shipTime;
   }

   public String getShipTime() {
      return this.shipTime;
   }

   public void setMergePay(Boolean mergePay) {
      this.mergePay = mergePay;
   }

   public Boolean getMergePay() {
      return this.mergePay;
   }

   public void setPresaleStartTime(String presaleStartTime) {
      this.presaleStartTime = presaleStartTime;
   }

   public String getPresaleStartTime() {
      return this.presaleStartTime;
   }

   public void setHidePrice(Integer hidePrice) {
      this.hidePrice = hidePrice;
   }

   public Integer getHidePrice() {
      return this.hidePrice;
   }

   public void setBalanceStartTime(String balanceStartTime) {
      this.balanceStartTime = balanceStartTime;
   }

   public String getBalanceStartTime() {
      return this.balanceStartTime;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public void setType(Integer type) {
      this.type = type;
   }

   public Integer getType() {
      return this.type;
   }

   public void setAttribute5(Integer attribute5) {
      this.attribute5 = attribute5;
   }

   public Integer getAttribute5() {
      return this.attribute5;
   }

   public void setSelectType(Integer selectType) {
      this.selectType = selectType;
   }

   public Integer getSelectType() {
      return this.selectType;
   }

   public void setBalanceHours(Integer balanceHours) {
      this.balanceHours = balanceHours;
   }

   public Integer getBalanceHours() {
      return this.balanceHours;
   }

   public void setPayType(Integer payType) {
      this.payType = payType;
   }

   public Integer getPayType() {
      return this.payType;
   }

   public void setPresaleEndTime(String presaleEndTime) {
      this.presaleEndTime = presaleEndTime;
   }

   public String getPresaleEndTime() {
      return this.presaleEndTime;
   }

   public void setDiscountType(Integer discountType) {
      this.discountType = discountType;
   }

   public Integer getDiscountType() {
      return this.discountType;
   }

   public String getApiMethod() {
      return "jingdong.market.tool.presale.query.checkSku";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("shipTime", this.shipTime);
      pmap.put("mergePay", this.mergePay);
      pmap.put("presaleStartTime", this.presaleStartTime);
      pmap.put("hidePrice", this.hidePrice);
      pmap.put("balanceStartTime", this.balanceStartTime);
      pmap.put("skuId", this.skuId);
      pmap.put("type", this.type);
      pmap.put("selectType", this.selectType);
      pmap.put("balanceHours", this.balanceHours);
      pmap.put("payType", this.payType);
      pmap.put("presaleEndTime", this.presaleEndTime);
      pmap.put("discountType", this.discountType);
      return JsonUtil.toJson(pmap);
   }

   public Class<MarketToolPresaleQueryCheckSkuResponse> getResponseClass() {
      return MarketToolPresaleQueryCheckSkuResponse.class;
   }
}
