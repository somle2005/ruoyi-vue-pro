package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.PromoActivitySkuCountResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PromoActivitySkuCountRequest extends AbstractRequest implements JdRequest<PromoActivitySkuCountResponse> {
   private Long activityId;
   private Long skuId;
   private Integer bindType;
   private Long spuId;
   private Integer deleted;

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

   public void setBindType(Integer bindType) {
      this.bindType = bindType;
   }

   public Integer getBindType() {
      return this.bindType;
   }

   public void setSpuId(Long spuId) {
      this.spuId = spuId;
   }

   public Long getSpuId() {
      return this.spuId;
   }

   public void setDeleted(Integer deleted) {
      this.deleted = deleted;
   }

   public Integer getDeleted() {
      return this.deleted;
   }

   public String getApiMethod() {
      return "jingdong.promo.activity.sku.count";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("activityId", this.activityId);
      pmap.put("skuId", this.skuId);
      pmap.put("bindType", this.bindType);
      pmap.put("spuId", this.spuId);
      pmap.put("deleted", this.deleted);
      return JsonUtil.toJson(pmap);
   }

   public Class<PromoActivitySkuCountResponse> getResponseClass() {
      return PromoActivitySkuCountResponse.class;
   }
}
