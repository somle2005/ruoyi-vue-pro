package com.jd.open.api.sdk.request.customsglobalAPI;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.customsglobalAPI.HangzhouCustomsQueryOrderByParamResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HangzhouCustomsQueryOrderByParamRequest extends AbstractRequest implements JdRequest<HangzhouCustomsQueryOrderByParamResponse> {
   private Long beginDate;
   private Long endDate;
   private Integer page;
   private Integer type;

   public void setBeginDate(Long beginDate) {
      this.beginDate = beginDate;
   }

   public Long getBeginDate() {
      return this.beginDate;
   }

   public void setEndDate(Long endDate) {
      this.endDate = endDate;
   }

   public Long getEndDate() {
      return this.endDate;
   }

   public void setPage(Integer page) {
      this.page = page;
   }

   public Integer getPage() {
      return this.page;
   }

   public void setType(Integer type) {
      this.type = type;
   }

   public Integer getType() {
      return this.type;
   }

   public String getApiMethod() {
      return "jingdong.hangzhou.customs.queryOrderByParam";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("beginDate", this.beginDate);
      pmap.put("endDate", this.endDate);
      pmap.put("page", this.page);
      pmap.put("type", this.type);
      return JsonUtil.toJson(pmap);
   }

   public Class<HangzhouCustomsQueryOrderByParamResponse> getResponseClass() {
      return HangzhouCustomsQueryOrderByParamResponse.class;
   }
}
