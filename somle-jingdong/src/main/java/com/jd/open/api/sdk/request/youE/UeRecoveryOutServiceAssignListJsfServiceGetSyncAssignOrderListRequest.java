package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeRecoveryOutServiceAssignListJsfServiceGetSyncAssignOrderListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeRecoveryOutServiceAssignListJsfServiceGetSyncAssignOrderListRequest extends AbstractRequest implements JdRequest<UeRecoveryOutServiceAssignListJsfServiceGetSyncAssignOrderListResponse> {
   private String code;
   private String appid;

   public void setCode(String code) {
      this.code = code;
   }

   public String getCode() {
      return this.code;
   }

   public void setAppid(String appid) {
      this.appid = appid;
   }

   public String getAppid() {
      return this.appid;
   }

   public String getApiMethod() {
      return "jingdong.ue.recovery.out.service.AssignListJsfService.getSyncAssignOrderList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("code", this.code);
      pmap.put("appid", this.appid);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeRecoveryOutServiceAssignListJsfServiceGetSyncAssignOrderListResponse> getResponseClass() {
      return UeRecoveryOutServiceAssignListJsfServiceGetSyncAssignOrderListResponse.class;
   }
}
