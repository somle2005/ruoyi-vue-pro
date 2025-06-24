package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.PopOrderGetRemarkByCreateTimeResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopOrderGetRemarkByCreateTimeRequest extends AbstractRequest implements JdRequest<PopOrderGetRemarkByCreateTimeResponse> {
   private String startTime;
   private String endTime;
   private Integer page;
   private Integer sortTime;
   private Integer orderType;

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

   public void setPage(Integer page) {
      this.page = page;
   }

   public Integer getPage() {
      return this.page;
   }

   public void setSortTime(Integer sortTime) {
      this.sortTime = sortTime;
   }

   public Integer getSortTime() {
      return this.sortTime;
   }

   public void setOrderType(Integer orderType) {
      this.orderType = orderType;
   }

   public Integer getOrderType() {
      return this.orderType;
   }

   public String getApiMethod() {
      return "jingdong.pop.order.getRemarkByCreateTime";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("startTime", this.startTime);
      pmap.put("endTime", this.endTime);
      pmap.put("page", this.page);
      pmap.put("sortTime", this.sortTime);
      pmap.put("orderType", this.orderType);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopOrderGetRemarkByCreateTimeResponse> getResponseClass() {
      return PopOrderGetRemarkByCreateTimeResponse.class;
   }
}
