package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.PromoActivityCountOperatelogResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PromoActivityCountOperatelogRequest extends AbstractRequest implements JdRequest<PromoActivityCountOperatelogResponse> {
   private Long activityId;
   private Long skuId;
   private String skuIdList;
   private Integer operateLevel;
   private String operateList;
   private String operatorName;
   private Long multiActivityId;
   private Long storeId;

   public void setActivityId(Long activityId) {
      this.activityId = activityId;
   }

   public Long getActivityId() {
      return this.activityId;
   }

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public void setSkuIdList(String skuIdList) {
      this.skuIdList = skuIdList;
   }

   public String getSkuIdList() {
      return this.skuIdList;
   }

   public void setOperateLevel(Integer operateLevel) {
      this.operateLevel = operateLevel;
   }

   public Integer getOperateLevel() {
      return this.operateLevel;
   }

   public void setOperateList(String operateList) {
      this.operateList = operateList;
   }

   public String getOperateList() {
      return this.operateList;
   }

   public void setOperatorName(String operatorName) {
      this.operatorName = operatorName;
   }

   public String getOperatorName() {
      return this.operatorName;
   }

   public void setMultiActivityId(Long multiActivityId) {
      this.multiActivityId = multiActivityId;
   }

   public Long getMultiActivityId() {
      return this.multiActivityId;
   }

   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   public Long getStoreId() {
      return this.storeId;
   }

   public String getApiMethod() {
      return "jingdong.promo.activity.count.operatelog";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("activityId", this.activityId);
      pmap.put("skuId", this.skuId);
      pmap.put("skuIdList", this.skuIdList);
      pmap.put("operateLevel", this.operateLevel);
      pmap.put("operateList", this.operateList);
      pmap.put("operatorName", this.operatorName);
      pmap.put("multiActivityId", this.multiActivityId);
      pmap.put("storeId", this.storeId);
      return JsonUtil.toJson(pmap);
   }

   public Class<PromoActivityCountOperatelogResponse> getResponseClass() {
      return PromoActivityCountOperatelogResponse.class;
   }
}
