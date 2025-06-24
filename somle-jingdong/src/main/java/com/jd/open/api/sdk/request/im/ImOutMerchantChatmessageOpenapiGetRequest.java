package com.jd.open.api.sdk.request.im;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.im.ImOutMerchantChatmessageOpenapiGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ImOutMerchantChatmessageOpenapiGetRequest extends AbstractRequest implements JdRequest<ImOutMerchantChatmessageOpenapiGetResponse> {
   private String appId;
   private String sid;

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setSid(String sid) {
      this.sid = sid;
   }

   public String getSid() {
      return this.sid;
   }

   public String getApiMethod() {
      return "jingdong.im.out.merchant.chatmessage.openapi.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appId", this.appId);
      pmap.put("sid", this.sid);
      return JsonUtil.toJson(pmap);
   }

   public Class<ImOutMerchantChatmessageOpenapiGetResponse> getResponseClass() {
      return ImOutMerchantChatmessageOpenapiGetResponse.class;
   }
}
