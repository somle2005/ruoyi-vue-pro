package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.SellerPromotionListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerPromotionListRequest extends AbstractRequest implements JdRequest<SellerPromotionListResponse> {
   private Integer type;
   private Integer status;
   private String beginTime;
   private String endTime;
   private Long skuId;
   private Integer favorMode;
   private int page;
   private int size;

   public void setType(Integer type) {
      this.type = type;
   }

   public Integer getType() {
      return this.type;
   }

   public void setStatus(Integer status) {
      this.status = status;
   }

   public Integer getStatus() {
      return this.status;
   }

   public void setBeginTime(String beginTime) {
      this.beginTime = beginTime;
   }

   public String getBeginTime() {
      return this.beginTime;
   }

   public void setEndTime(String endTime) {
      this.endTime = endTime;
   }

   public String getEndTime() {
      return this.endTime;
   }

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public void setFavorMode(Integer favorMode) {
      this.favorMode = favorMode;
   }

   public Integer getFavorMode() {
      return this.favorMode;
   }

   public void setPage(int page) {
      this.page = page;
   }

   public int getPage() {
      return this.page;
   }

   public void setSize(int size) {
      this.size = size;
   }

   public int getSize() {
      return this.size;
   }

   public String getApiMethod() {
      return "jingdong.seller.promotion.list";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("type", this.type);
      pmap.put("status", this.status);
      pmap.put("begin_time", this.beginTime);
      pmap.put("end_time", this.endTime);
      pmap.put("sku_id", this.skuId);
      pmap.put("favor_mode", this.favorMode);
      pmap.put("page", this.page);
      pmap.put("size", this.size);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerPromotionListResponse> getResponseClass() {
      return SellerPromotionListResponse.class;
   }
}
