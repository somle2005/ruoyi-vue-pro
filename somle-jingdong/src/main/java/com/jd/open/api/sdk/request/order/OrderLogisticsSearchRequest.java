package com.jd.open.api.sdk.request.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.OrderLogisticsSearchResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OrderLogisticsSearchRequest extends AbstractRequest implements JdRequest<OrderLogisticsSearchResponse> {
   private String venderId;
   private String startDate;
   private String endDate;
   private String page;
   private String pageSize;

   public String getApiMethod() {
      return "jingdong.logistics.orders.search";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, String> map = new HashMap();
      map.put("vender_id", this.venderId);
      map.put("start_date", this.startDate);
      map.put("end_date", this.endDate);
      map.put("page", this.page);
      map.put("page_size", this.pageSize);
      return JsonUtil.toJson(map);
   }

   public Class<OrderLogisticsSearchResponse> getResponseClass() {
      return OrderLogisticsSearchResponse.class;
   }

   @JsonProperty("vender_id")
   public String getVenderId() {
      return this.venderId;
   }

   @JsonProperty("vender_id")
   public void setVenderId(String venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("start_date")
   public String getStartDate() {
      return this.startDate;
   }

   @JsonProperty("start_date")
   public void setStartDate(String startDate) {
      this.startDate = startDate;
   }

   @JsonProperty("end_date")
   public String getEndDate() {
      return this.endDate;
   }

   @JsonProperty("end_date")
   public void setEndDate(String endDate) {
      this.endDate = endDate;
   }

   @JsonProperty("page")
   public String getPage() {
      return this.page;
   }

   @JsonProperty("page")
   public void setPage(String page) {
      this.page = page;
   }

   @JsonProperty("page_size")
   public String getPageSize() {
      return this.pageSize;
   }

   @JsonProperty("page_size")
   public void setPageSize(String pageSize) {
      this.pageSize = pageSize;
   }
}
