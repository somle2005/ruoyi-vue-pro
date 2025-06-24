package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.PromoActivityDetailGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PromoActivityDetailGetRequest extends AbstractRequest implements JdRequest<PromoActivityDetailGetResponse> {
   private Long activityId;
   private String queryInclude;

   public void setActivityId(Long activityId) {
      this.activityId = activityId;
   }

   public Long getActivityId() {
      return this.activityId;
   }

   public void setQueryInclude(String queryInclude) {
      this.queryInclude = queryInclude;
   }

   public String getQueryInclude() {
      return this.queryInclude;
   }

   public String getApiMethod() {
      return "jingdong.promo.activity.detail.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("activityId", this.activityId);
      pmap.put("queryInclude", this.queryInclude);
      return JsonUtil.toJson(pmap);
   }

   public Class<PromoActivityDetailGetResponse> getResponseClass() {
      return PromoActivityDetailGetResponse.class;
   }
}
