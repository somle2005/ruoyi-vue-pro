package com.jd.open.api.sdk.request.promotion;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.promotion.PromoActivityCommitResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PromoActivityCommitRequest extends AbstractRequest implements JdRequest<PromoActivityCommitResponse> {
   private Long activityId;

   public void setActivityId(Long activityId) {
      this.activityId = activityId;
   }

   public Long getActivityId() {
      return this.activityId;
   }

   public String getApiMethod() {
      return "jingdong.promo.activity.commit";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("activityId", this.activityId);
      return JsonUtil.toJson(pmap);
   }

   public Class<PromoActivityCommitResponse> getResponseClass() {
      return PromoActivityCommitResponse.class;
   }
}
