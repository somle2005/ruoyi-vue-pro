package com.jd.open.api.sdk.request.video;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.video.PopVideoInfoQueryResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class PopVideoInfoQueryRequest extends AbstractRequest implements JdRequest<PopVideoInfoQueryResponse> {
   private String videoName;
   private Integer status;
   private String statuses;
   private Long agentVideoId;
   private Integer videoType;
   private Date createdDateStart;
   private Date createdDateEnd;
   private String order;
   private String orderBy;
   private Integer pageIndex;
   private Integer pageSize;
   private Long skuId;

   public void setVideoName(String videoName) {
      this.videoName = videoName;
   }

   public String getVideoName() {
      return this.videoName;
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

   public void setAgentVideoId(Long agentVideoId) {
      this.agentVideoId = agentVideoId;
   }

   public Long getAgentVideoId() {
      return this.agentVideoId;
   }

   public void setVideoType(Integer videoType) {
      this.videoType = videoType;
   }

   public Integer getVideoType() {
      return this.videoType;
   }

   public void setCreatedDateStart(Date createdDateStart) {
      this.createdDateStart = createdDateStart;
   }

   public Date getCreatedDateStart() {
      return this.createdDateStart;
   }

   public void setCreatedDateEnd(Date createdDateEnd) {
      this.createdDateEnd = createdDateEnd;
   }

   public Date getCreatedDateEnd() {
      return this.createdDateEnd;
   }

   public void setOrder(String order) {
      this.order = order;
   }

   public String getOrder() {
      return this.order;
   }

   public void setOrderBy(String orderBy) {
      this.orderBy = orderBy;
   }

   public String getOrderBy() {
      return this.orderBy;
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

   public void setSkuId(Long skuId) {
      this.skuId = skuId;
   }

   public Long getSkuId() {
      return this.skuId;
   }

   public String getApiMethod() {
      return "jingdong.pop.video.info.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("video_name", this.videoName);
      pmap.put("status", this.status);
      pmap.put("statuses", this.statuses);
      pmap.put("agent_video_id", this.agentVideoId);
      pmap.put("video_type", this.videoType);

      try {
         if (this.createdDateStart != null) {
            pmap.put("created_date_start", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.createdDateStart));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.createdDateEnd != null) {
            pmap.put("created_date_end", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.createdDateEnd));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("order", this.order);
      pmap.put("order_by", this.orderBy);
      pmap.put("page_index", this.pageIndex);
      pmap.put("page_size", this.pageSize);
      pmap.put("sku_id", this.skuId);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopVideoInfoQueryResponse> getResponseClass() {
      return PopVideoInfoQueryResponse.class;
   }
}
