package com.jd.open.api.sdk.request.O2O;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.O2O.LocCodeConsumeResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LocCodeConsumeRequest extends AbstractRequest implements JdRequest<LocCodeConsumeResponse> {
   private String requestId;
   private String codeNum;
   private Long shopId;
   private String pwdNumber;
   private Integer consumeCount;

   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   public String getRequestId() {
      return this.requestId;
   }

   public void setCodeNum(String codeNum) {
      this.codeNum = codeNum;
   }

   public String getCodeNum() {
      return this.codeNum;
   }

   public void setShopId(Long shopId) {
      this.shopId = shopId;
   }

   public Long getShopId() {
      return this.shopId;
   }

   public void setPwdNumber(String pwdNumber) {
      this.pwdNumber = pwdNumber;
   }

   public String getPwdNumber() {
      return this.pwdNumber;
   }

   public void setConsumeCount(Integer consumeCount) {
      this.consumeCount = consumeCount;
   }

   public Integer getConsumeCount() {
      return this.consumeCount;
   }

   public String getApiMethod() {
      return "jingdong.loc.code.consume";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("requestId", this.requestId);
      pmap.put("codeNum", this.codeNum);
      pmap.put("shopId", this.shopId);
      pmap.put("pwdNumber", this.pwdNumber);
      pmap.put("consumeCount", this.consumeCount);
      return JsonUtil.toJson(pmap);
   }

   public Class<LocCodeConsumeResponse> getResponseClass() {
      return LocCodeConsumeResponse.class;
   }
}
