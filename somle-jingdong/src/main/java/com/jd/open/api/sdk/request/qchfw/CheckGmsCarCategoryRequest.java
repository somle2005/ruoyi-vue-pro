package com.jd.open.api.sdk.request.qchfw;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.qchfw.CheckGmsCarCategoryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CheckGmsCarCategoryRequest extends AbstractRequest implements JdRequest<CheckGmsCarCategoryResponse> {
   private String traceId;
   private Integer offset;
   private Integer limit;
   private String appKey;
   private String reqSource;
   private Integer gmsCarCategory;

   public void setTraceId(String traceId) {
      this.traceId = traceId;
   }

   public String getTraceId() {
      return this.traceId;
   }

   public void setOffset(Integer offset) {
      this.offset = offset;
   }

   public Integer getOffset() {
      return this.offset;
   }

   public void setLimit(Integer limit) {
      this.limit = limit;
   }

   public Integer getLimit() {
      return this.limit;
   }

   public void setAppKey(String appKey) {
      this.appKey = appKey;
   }

   public String getAppKey() {
      return this.appKey;
   }

   public void setReqSource(String reqSource) {
      this.reqSource = reqSource;
   }

   public String getReqSource() {
      return this.reqSource;
   }

   public void setGmsCarCategory(Integer gmsCarCategory) {
      this.gmsCarCategory = gmsCarCategory;
   }

   public Integer getGmsCarCategory() {
      return this.gmsCarCategory;
   }

   public String getApiMethod() {
      return "jingdong.checkGmsCarCategory";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("trace_id", this.traceId);
      pmap.put("offset", this.offset);
      pmap.put("limit", this.limit);
      pmap.put("appKey", this.appKey);
      pmap.put("reqSource", this.reqSource);
      pmap.put("gmsCarCategory", this.gmsCarCategory);
      return JsonUtil.toJson(pmap);
   }

   public Class<CheckGmsCarCategoryResponse> getResponseClass() {
      return CheckGmsCarCategoryResponse.class;
   }
}
