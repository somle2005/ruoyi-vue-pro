package com.jd.open.api.sdk.request.customsglobalAPI;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.customsglobalAPI.DlzGuangzhouCustomsQueryPeriodOrderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DlzGuangzhouCustomsQueryPeriodOrderRequest extends AbstractRequest implements JdRequest<DlzGuangzhouCustomsQueryPeriodOrderResponse> {
   private Long beginDate;
   private Long endDate;
   private int page;
   private int type;

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

   public void setPage(int page) {
      this.page = page;
   }

   public int getPage() {
      return this.page;
   }

   public void setType(int type) {
      this.type = type;
   }

   public int getType() {
      return this.type;
   }

   public String getApiMethod() {
      return "jingdong.dlz.guangzhou.customs.queryPeriodOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("beginDate", this.beginDate);
      pmap.put("endDate", this.endDate);
      pmap.put("page", this.page);
      pmap.put("type", this.type);
      return JsonUtil.toJson(pmap);
   }

   public Class<DlzGuangzhouCustomsQueryPeriodOrderResponse> getResponseClass() {
      return DlzGuangzhouCustomsQueryPeriodOrderResponse.class;
   }
}
