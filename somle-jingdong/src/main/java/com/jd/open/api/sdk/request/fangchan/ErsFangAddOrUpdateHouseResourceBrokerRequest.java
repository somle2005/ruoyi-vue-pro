package com.jd.open.api.sdk.request.fangchan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.fangchan.ErsFangAddOrUpdateHouseResourceBrokerResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class ErsFangAddOrUpdateHouseResourceBrokerRequest extends AbstractRequest implements JdRequest<ErsFangAddOrUpdateHouseResourceBrokerResponse> {
   private Long brokerId;
   private Long houseResourceId;
   private BigDecimal quotedPrice;
   private Short recommend;
   private Short orderNum;
   private Integer cityCode;
   private Long sourceId;
   private Short brokerType;
   private String brokerIdList;
   private String quotedPriceList;
   private String recommendList;
   private String orderNumList;
   private String brokerTypeList;
   private String cityCodeList;
   private String sourceIdLsit;
   private String venderIdList;

   public void setBrokerId(Long brokerId) {
      this.brokerId = brokerId;
   }

   public Long getBrokerId() {
      return this.brokerId;
   }

   public void setHouseResourceId(Long houseResourceId) {
      this.houseResourceId = houseResourceId;
   }

   public Long getHouseResourceId() {
      return this.houseResourceId;
   }

   public void setQuotedPrice(BigDecimal quotedPrice) {
      this.quotedPrice = quotedPrice;
   }

   public BigDecimal getQuotedPrice() {
      return this.quotedPrice;
   }

   public void setRecommend(Short recommend) {
      this.recommend = recommend;
   }

   public Short getRecommend() {
      return this.recommend;
   }

   public void setOrderNum(Short orderNum) {
      this.orderNum = orderNum;
   }

   public Short getOrderNum() {
      return this.orderNum;
   }

   public void setCityCode(Integer cityCode) {
      this.cityCode = cityCode;
   }

   public Integer getCityCode() {
      return this.cityCode;
   }

   public void setSourceId(Long sourceId) {
      this.sourceId = sourceId;
   }

   public Long getSourceId() {
      return this.sourceId;
   }

   public void setBrokerType(Short brokerType) {
      this.brokerType = brokerType;
   }

   public Short getBrokerType() {
      return this.brokerType;
   }

   public void setBrokerIdList(String brokerIdList) {
      this.brokerIdList = brokerIdList;
   }

   public String getBrokerIdList() {
      return this.brokerIdList;
   }

   public void setQuotedPriceList(String quotedPriceList) {
      this.quotedPriceList = quotedPriceList;
   }

   public String getQuotedPriceList() {
      return this.quotedPriceList;
   }

   public void setRecommendList(String recommendList) {
      this.recommendList = recommendList;
   }

   public String getRecommendList() {
      return this.recommendList;
   }

   public void setOrderNumList(String orderNumList) {
      this.orderNumList = orderNumList;
   }

   public String getOrderNumList() {
      return this.orderNumList;
   }

   public void setBrokerTypeList(String brokerTypeList) {
      this.brokerTypeList = brokerTypeList;
   }

   public String getBrokerTypeList() {
      return this.brokerTypeList;
   }

   public void setCityCodeList(String cityCodeList) {
      this.cityCodeList = cityCodeList;
   }

   public String getCityCodeList() {
      return this.cityCodeList;
   }

   public void setSourceIdLsit(String sourceIdLsit) {
      this.sourceIdLsit = sourceIdLsit;
   }

   public String getSourceIdLsit() {
      return this.sourceIdLsit;
   }

   public void setVenderIdList(String venderIdList) {
      this.venderIdList = venderIdList;
   }

   public String getVenderIdList() {
      return this.venderIdList;
   }

   public String getApiMethod() {
      return "jingdong.ers.fang.addOrUpdateHouseResourceBroker";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("brokerId", this.brokerId);
      pmap.put("houseResourceId", this.houseResourceId);
      pmap.put("quotedPrice", this.quotedPrice);
      pmap.put("recommend", this.recommend);
      pmap.put("orderNum", this.orderNum);
      pmap.put("cityCode", this.cityCode);
      pmap.put("sourceId", this.sourceId);
      pmap.put("brokerType", this.brokerType);
      pmap.put("brokerIdList", this.brokerIdList);
      pmap.put("quotedPriceList", this.quotedPriceList);
      pmap.put("recommendList", this.recommendList);
      pmap.put("orderNumList", this.orderNumList);
      pmap.put("brokerTypeList", this.brokerTypeList);
      pmap.put("cityCodeList", this.cityCodeList);
      pmap.put("sourceIdLsit", this.sourceIdLsit);
      pmap.put("venderIdList", this.venderIdList);
      return JsonUtil.toJson(pmap);
   }

   public Class<ErsFangAddOrUpdateHouseResourceBrokerResponse> getResponseClass() {
      return ErsFangAddOrUpdateHouseResourceBrokerResponse.class;
   }
}
