package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.InteractCenterApiServiceReadGiftActivityReadServiceFindAllGiftActivityTotalResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class InteractCenterApiServiceReadGiftActivityReadServiceFindAllGiftActivityTotalRequest extends AbstractRequest implements JdRequest<InteractCenterApiServiceReadGiftActivityReadServiceFindAllGiftActivityTotalResponse> {
   private String appKey;
   private Long activityId;
   private String name;
   private int pageSize;
   private String startTime;
   private int page;
   private String endTime;
   private String sourceName;
   private Integer status;

   public void setAppKey(String appKey) {
      this.appKey = appKey;
   }

   public String getAppKey() {
      return this.appKey;
   }

   public void setActivityId(Long activityId) {
      this.activityId = activityId;
   }

   public Long getActivityId() {
      return this.activityId;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public void setStartTime(String startTime) {
      this.startTime = startTime;
   }

   public String getStartTime() {
      return this.startTime;
   }

   public void setPage(int page) {
      this.page = page;
   }

   public int getPage() {
      return this.page;
   }

   public void setEndTime(String endTime) {
      this.endTime = endTime;
   }

   public String getEndTime() {
      return this.endTime;
   }

   public void setSourceName(String sourceName) {
      this.sourceName = sourceName;
   }

   public String getSourceName() {
      return this.sourceName;
   }

   public void setStatus(Integer status) {
      this.status = status;
   }

   public Integer getStatus() {
      return this.status;
   }

   public String getApiMethod() {
      return "jingdong.interact.center.api.service.read.GiftActivityReadService.findAllGiftActivityTotal";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appKey", this.appKey);
      pmap.put("activityId", this.activityId);
      pmap.put("name", this.name);
      pmap.put("pageSize", this.pageSize);
      pmap.put("startTime", this.startTime);
      pmap.put("page", this.page);
      pmap.put("endTime", this.endTime);
      pmap.put("sourceName", this.sourceName);
      pmap.put("status", this.status);
      return JsonUtil.toJson(pmap);
   }

   public Class<InteractCenterApiServiceReadGiftActivityReadServiceFindAllGiftActivityTotalResponse> getResponseClass() {
      return InteractCenterApiServiceReadGiftActivityReadServiceFindAllGiftActivityTotalResponse.class;
   }
}
