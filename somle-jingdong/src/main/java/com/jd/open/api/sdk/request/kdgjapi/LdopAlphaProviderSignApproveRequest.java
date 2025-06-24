package com.jd.open.api.sdk.request.kdgjapi;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.kdgjapi.LdopAlphaProviderSignApproveResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LdopAlphaProviderSignApproveRequest extends AbstractRequest implements JdRequest<LdopAlphaProviderSignApproveResponse> {
   private String requestId;
   private Boolean approveResult;
   private String approveMessage;

   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   public String getRequestId() {
      return this.requestId;
   }

   public void setApproveResult(Boolean approveResult) {
      this.approveResult = approveResult;
   }

   public Boolean getApproveResult() {
      return this.approveResult;
   }

   public void setApproveMessage(String approveMessage) {
      this.approveMessage = approveMessage;
   }

   public String getApproveMessage() {
      return this.approveMessage;
   }

   public String getApiMethod() {
      return "jingdong.ldop.alpha.provider.sign.approve";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("requestId", this.requestId);
      pmap.put("approveResult", this.approveResult);
      pmap.put("approveMessage", this.approveMessage);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopAlphaProviderSignApproveResponse> getResponseClass() {
      return LdopAlphaProviderSignApproveResponse.class;
   }
}
