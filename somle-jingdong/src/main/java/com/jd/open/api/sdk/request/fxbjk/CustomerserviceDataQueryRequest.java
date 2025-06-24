package com.jd.open.api.sdk.request.fxbjk;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.fxbjk.CustomerserviceDataQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CustomerserviceDataQueryRequest extends AbstractRequest implements JdRequest<CustomerserviceDataQueryResponse> {
   private String searchType;
   private String startTime;
   private String endTime;
   private String groupId;
   private String dimension;
   private String queryType;

   public void setSearchType(String searchType) {
      this.searchType = searchType;
   }

   public String getSearchType() {
      return this.searchType;
   }

   public void setStartTime(String startTime) {
      this.startTime = startTime;
   }

   public String getStartTime() {
      return this.startTime;
   }

   public void setEndTime(String endTime) {
      this.endTime = endTime;
   }

   public String getEndTime() {
      return this.endTime;
   }

   public void setGroupId(String groupId) {
      this.groupId = groupId;
   }

   public String getGroupId() {
      return this.groupId;
   }

   public void setDimension(String dimension) {
      this.dimension = dimension;
   }

   public String getDimension() {
      return this.dimension;
   }

   public void setQueryType(String queryType) {
      this.queryType = queryType;
   }

   public String getQueryType() {
      return this.queryType;
   }

   public String getApiMethod() {
      return "jingdong.customerservice.data.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("searchType", this.searchType);
      pmap.put("startTime", this.startTime);
      pmap.put("endTime", this.endTime);
      pmap.put("groupId", this.groupId);
      pmap.put("dimension", this.dimension);
      pmap.put("queryType", this.queryType);
      return JsonUtil.toJson(pmap);
   }

   public Class<CustomerserviceDataQueryResponse> getResponseClass() {
      return CustomerserviceDataQueryResponse.class;
   }
}
