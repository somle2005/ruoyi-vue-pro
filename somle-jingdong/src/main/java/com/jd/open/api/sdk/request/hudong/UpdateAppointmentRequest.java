package com.jd.open.api.sdk.request.hudong;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.UpdateAppointmentResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UpdateAppointmentRequest extends AbstractRequest implements JdRequest<UpdateAppointmentResponse> {
   private String appName;
   private String appId;
   private String preSellId;
   private Long robStartTime;
   private String groupType;
   private String groupId;
   private Long robEndTime;

   public void setAppName(String appName) {
      this.appName = appName;
   }

   public String getAppName() {
      return this.appName;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setPreSellId(String preSellId) {
      this.preSellId = preSellId;
   }

   public String getPreSellId() {
      return this.preSellId;
   }

   public void setRobStartTime(Long robStartTime) {
      this.robStartTime = robStartTime;
   }

   public Long getRobStartTime() {
      return this.robStartTime;
   }

   public void setGroupType(String groupType) {
      this.groupType = groupType;
   }

   public String getGroupType() {
      return this.groupType;
   }

   public void setGroupId(String groupId) {
      this.groupId = groupId;
   }

   public String getGroupId() {
      return this.groupId;
   }

   public void setRobEndTime(Long robEndTime) {
      this.robEndTime = robEndTime;
   }

   public Long getRobEndTime() {
      return this.robEndTime;
   }

   public String getApiMethod() {
      return "jingdong.updateAppointment";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appName", this.appName);
      pmap.put("appId", this.appId);
      pmap.put("preSellId", this.preSellId);
      pmap.put("robStartTime", this.robStartTime);
      pmap.put("groupType", this.groupType);
      pmap.put("groupId", this.groupId);
      pmap.put("robEndTime", this.robEndTime);
      return JsonUtil.toJson(pmap);
   }

   public Class<UpdateAppointmentResponse> getResponseClass() {
      return UpdateAppointmentResponse.class;
   }
}
