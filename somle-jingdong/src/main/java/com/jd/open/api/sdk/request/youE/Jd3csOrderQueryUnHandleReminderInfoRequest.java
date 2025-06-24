package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.Jd3csOrderQueryUnHandleReminderInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Jd3csOrderQueryUnHandleReminderInfoRequest extends AbstractRequest implements JdRequest<Jd3csOrderQueryUnHandleReminderInfoResponse> {
   private String venderCode;
   private String appId;
   private String createBy;
   private Integer pageNo;
   private String token;

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setCreateBy(String createBy) {
      this.createBy = createBy;
   }

   public String getCreateBy() {
      return this.createBy;
   }

   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   public Integer getPageNo() {
      return this.pageNo;
   }

   public void setToken(String token) {
      this.token = token;
   }

   public String getToken() {
      return this.token;
   }

   public String getApiMethod() {
      return "jingdong.jd3cs.order.queryUnHandleReminderInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderCode", this.venderCode);
      pmap.put("appId", this.appId);
      pmap.put("createBy", this.createBy);
      pmap.put("pageNo", this.pageNo);
      pmap.put("token", this.token);
      return JsonUtil.toJson(pmap);
   }

   public Class<Jd3csOrderQueryUnHandleReminderInfoResponse> getResponseClass() {
      return Jd3csOrderQueryUnHandleReminderInfoResponse.class;
   }
}
