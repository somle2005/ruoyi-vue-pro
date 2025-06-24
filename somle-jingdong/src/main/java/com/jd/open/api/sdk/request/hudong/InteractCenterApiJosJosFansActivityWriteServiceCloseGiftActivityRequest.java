package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.InteractCenterApiJosJosFansActivityWriteServiceCloseGiftActivityResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class InteractCenterApiJosJosFansActivityWriteServiceCloseGiftActivityRequest extends AbstractRequest implements JdRequest<InteractCenterApiJosJosFansActivityWriteServiceCloseGiftActivityResponse> {
   private String appKey;
   private Long activityId;

   public void setAppKey(String appKey) {
      this.appKey = appKey;
   }

   public String getAppKey() {
      return this.appKey;
   }

   public void setActivityId(Long activityId) {
      this.activityId = activityId;
   }

   public Long getActivityId() {
      return this.activityId;
   }

   public String getApiMethod() {
      return "jingdong.interact.center.api.jos.JosFansActivityWriteService.closeGiftActivity";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appKey", this.appKey);
      pmap.put("activityId", this.activityId);
      return JsonUtil.toJson(pmap);
   }

   public Class<InteractCenterApiJosJosFansActivityWriteServiceCloseGiftActivityResponse> getResponseClass() {
      return InteractCenterApiJosJosFansActivityWriteServiceCloseGiftActivityResponse.class;
   }
}
