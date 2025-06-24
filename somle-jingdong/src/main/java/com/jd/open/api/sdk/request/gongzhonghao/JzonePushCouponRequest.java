package com.jd.open.api.sdk.request.gongzhonghao;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.gongzhonghao.JzonePushCouponResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JzonePushCouponRequest extends AbstractRequest implements JdRequest<JzonePushCouponResponse> {
   private String activityId;
   private String encryptOpenId;
   private Long couponId;
   private String distrTime;

   public void setActivityId(String activityId) {
      this.activityId = activityId;
   }

   public String getActivityId() {
      return this.activityId;
   }

   public void setEncryptOpenId(String encryptOpenId) {
      this.encryptOpenId = encryptOpenId;
   }

   public String getEncryptOpenId() {
      return this.encryptOpenId;
   }

   public void setCouponId(Long couponId) {
      this.couponId = couponId;
   }

   public Long getCouponId() {
      return this.couponId;
   }

   public void setDistrTime(String distrTime) {
      this.distrTime = distrTime;
   }

   public String getDistrTime() {
      return this.distrTime;
   }

   public String getApiMethod() {
      return "jingdong.jzone.pushCoupon";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("activityId", this.activityId);
      pmap.put("encryptOpenId", this.encryptOpenId);
      pmap.put("couponId", this.couponId);
      pmap.put("distrTime", this.distrTime);
      return JsonUtil.toJson(pmap);
   }

   public Class<JzonePushCouponResponse> getResponseClass() {
      return JzonePushCouponResponse.class;
   }
}
