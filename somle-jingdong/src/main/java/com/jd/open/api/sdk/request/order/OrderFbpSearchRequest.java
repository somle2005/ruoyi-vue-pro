package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.OrderFbpSearchResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OrderFbpSearchRequest extends AbstractRequest implements JdRequest<OrderFbpSearchResponse> {
   private String startDate;
   private String endDate;
   private String page;
   private String pageSize;
   private String optionalFields;

   public String getApiMethod() {
      return "360buy.order.fbp.search";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, String> map = new TreeMap();
      map.put("start_date", this.startDate);
      map.put("end_date", this.endDate);
      map.put("page", this.page);
      map.put("page_size", this.pageSize);
      map.put("optional_fields", this.optionalFields);
      return JsonUtil.toJson(map);
   }

   public Class<OrderFbpSearchResponse> getResponseClass() {
      return OrderFbpSearchResponse.class;
   }

   public String getStartDate() {
      return this.startDate;
   }

   public void setStartDate(String startDate) {
      this.startDate = startDate;
   }

   public String getEndDate() {
      return this.endDate;
   }

   public void setEndDate(String endDate) {
      this.endDate = endDate;
   }

   public String getPage() {
      return this.page;
   }

   public void setPage(String page) {
      this.page = page;
   }

   public String getPageSize() {
      return this.pageSize;
   }

   public void setPageSize(String pageSize) {
      this.pageSize = pageSize;
   }

   public String getOptionalFields() {
      return this.optionalFields;
   }

   public void setOptionalFields(String optionalFields) {
      this.optionalFields = optionalFields;
   }
}
