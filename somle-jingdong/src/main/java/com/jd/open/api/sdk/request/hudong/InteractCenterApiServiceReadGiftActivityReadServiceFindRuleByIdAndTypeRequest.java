package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.InteractCenterApiServiceReadGiftActivityReadServiceFindRuleByIdAndTypeResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class InteractCenterApiServiceReadGiftActivityReadServiceFindRuleByIdAndTypeRequest extends AbstractRequest implements JdRequest<InteractCenterApiServiceReadGiftActivityReadServiceFindRuleByIdAndTypeResponse> {
   private String appKey;
   private int pageNumber;
   private int pageSize;
   private Long activityId;

   public void setAppKey(String appKey) {
      this.appKey = appKey;
   }

   public String getAppKey() {
      return this.appKey;
   }

   public void setPageNumber(int pageNumber) {
      this.pageNumber = pageNumber;
   }

   public int getPageNumber() {
      return this.pageNumber;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public void setActivityId(Long activityId) {
      this.activityId = activityId;
   }

   public Long getActivityId() {
      return this.activityId;
   }

   public String getApiMethod() {
      return "jingdong.interact.center.api.service.read.GiftActivityReadService.findRuleByIdAndType";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appKey", this.appKey);
      pmap.put("pageNumber", this.pageNumber);
      pmap.put("pageSize", this.pageSize);
      pmap.put("activityId", this.activityId);
      return JsonUtil.toJson(pmap);
   }

   public Class<InteractCenterApiServiceReadGiftActivityReadServiceFindRuleByIdAndTypeResponse> getResponseClass() {
      return InteractCenterApiServiceReadGiftActivityReadServiceFindRuleByIdAndTypeResponse.class;
   }
}
