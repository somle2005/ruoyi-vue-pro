package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.PopMarketingGatewayActivityCreateResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopMarketingGatewayActivityCreateRequest extends AbstractRequest implements JdRequest<PopMarketingGatewayActivityCreateResponse> {
   private String activityDetailName;
   private Integer selfActPlusType;
   private String skuFilePath;
   private String skuIds;
   private String planNum;
   private String isLongAct;
   private String startTime;
   private String actType;
   private String periodBeginTime;
   private String actBaseName;
   private String finishTime;
   private String instalment;
   private String bound;
   private String periodEndTime;
   private String skuUploadType;
   private String actFeeType;

   public void setActivityDetailName(String activityDetailName) {
      this.activityDetailName = activityDetailName;
   }

   public String getActivityDetailName() {
      return this.activityDetailName;
   }

   public void setSelfActPlusType(Integer selfActPlusType) {
      this.selfActPlusType = selfActPlusType;
   }

   public Integer getSelfActPlusType() {
      return this.selfActPlusType;
   }

   public void setSkuFilePath(String skuFilePath) {
      this.skuFilePath = skuFilePath;
   }

   public String getSkuFilePath() {
      return this.skuFilePath;
   }

   public void setSkuIds(String skuIds) {
      this.skuIds = skuIds;
   }

   public String getSkuIds() {
      return this.skuIds;
   }

   public void setPlanNum(String planNum) {
      this.planNum = planNum;
   }

   public String getPlanNum() {
      return this.planNum;
   }

   public void setIsLongAct(String isLongAct) {
      this.isLongAct = isLongAct;
   }

   public String getIsLongAct() {
      return this.isLongAct;
   }

   public void setStartTime(String startTime) {
      this.startTime = startTime;
   }

   public String getStartTime() {
      return this.startTime;
   }

   public void setActType(String actType) {
      this.actType = actType;
   }

   public String getActType() {
      return this.actType;
   }

   public void setPeriodBeginTime(String periodBeginTime) {
      this.periodBeginTime = periodBeginTime;
   }

   public String getPeriodBeginTime() {
      return this.periodBeginTime;
   }

   public void setActBaseName(String actBaseName) {
      this.actBaseName = actBaseName;
   }

   public String getActBaseName() {
      return this.actBaseName;
   }

   public void setFinishTime(String finishTime) {
      this.finishTime = finishTime;
   }

   public String getFinishTime() {
      return this.finishTime;
   }

   public void setInstalment(String instalment) {
      this.instalment = instalment;
   }

   public String getInstalment() {
      return this.instalment;
   }

   public void setBound(String bound) {
      this.bound = bound;
   }

   public String getBound() {
      return this.bound;
   }

   public void setPeriodEndTime(String periodEndTime) {
      this.periodEndTime = periodEndTime;
   }

   public String getPeriodEndTime() {
      return this.periodEndTime;
   }

   public void setSkuUploadType(String skuUploadType) {
      this.skuUploadType = skuUploadType;
   }

   public String getSkuUploadType() {
      return this.skuUploadType;
   }

   public void setActFeeType(String actFeeType) {
      this.actFeeType = actFeeType;
   }

   public String getActFeeType() {
      return this.actFeeType;
   }

   public String getApiMethod() {
      return "jingdong.pop.marketing.gateway.activity.create";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("activityDetailName", this.activityDetailName);
      pmap.put("selfActPlusType", this.selfActPlusType);
      pmap.put("skuFilePath", this.skuFilePath);
      pmap.put("skuIds", this.skuIds);
      pmap.put("planNum", this.planNum);
      pmap.put("isLongAct", this.isLongAct);
      pmap.put("startTime", this.startTime);
      pmap.put("actType", this.actType);
      pmap.put("periodBeginTime", this.periodBeginTime);
      pmap.put("actBaseName", this.actBaseName);
      pmap.put("finishTime", this.finishTime);
      pmap.put("instalment", this.instalment);
      pmap.put("bound", this.bound);
      pmap.put("periodEndTime", this.periodEndTime);
      pmap.put("skuUploadType", this.skuUploadType);
      pmap.put("actFeeType", this.actFeeType);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopMarketingGatewayActivityCreateResponse> getResponseClass() {
      return PopMarketingGatewayActivityCreateResponse.class;
   }
}
