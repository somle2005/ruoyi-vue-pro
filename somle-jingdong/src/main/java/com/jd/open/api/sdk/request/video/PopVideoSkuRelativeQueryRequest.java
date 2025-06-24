package com.jd.open.api.sdk.request.video;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.video.PopVideoSkuRelativeQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopVideoSkuRelativeQueryRequest extends AbstractRequest implements JdRequest<PopVideoSkuRelativeQueryResponse> {
   private Long videoId;
   private Long productId;
   private Long skuId;
   private Integer status;
   private String statuses;
   private Integer videoType;
   private Integer pageIndex;
   private Integer pageSize;

   public void setVideoId(Long videoId) {
      this.videoId = videoId;
   }

   public Long getVideoId() {
      return this.videoId;
   }

   public void setProductId(Long productId) {
      this.productId = productId;
   }

   public Long getProductId() {
      return this.productId;
   }

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public void setStatus(Integer status) {
      this.status = status;
   }

   public Integer getStatus() {
      return this.status;
   }

   public void setStatuses(String statuses) {
      this.statuses = statuses;
   }

   public String getStatuses() {
      return this.statuses;
   }

   public void setVideoType(Integer videoType) {
      this.videoType = videoType;
   }

   public Integer getVideoType() {
      return this.videoType;
   }

   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   public Integer getPageIndex() {
      return this.pageIndex;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public String getApiMethod() {
      return "jingdong.pop.video.sku.relative.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("video_id", this.videoId);
      pmap.put("product_id", this.productId);
      pmap.put("sku_id", this.skuId);
      pmap.put("status", this.status);
      pmap.put("statuses", this.statuses);
      pmap.put("videoType", this.videoType);
      pmap.put("pageIndex", this.pageIndex);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopVideoSkuRelativeQueryResponse> getResponseClass() {
      return PopVideoSkuRelativeQueryResponse.class;
   }
}
