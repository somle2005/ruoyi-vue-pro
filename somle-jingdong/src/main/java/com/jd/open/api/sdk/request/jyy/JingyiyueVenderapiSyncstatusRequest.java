package com.jd.open.api.sdk.request.jyy;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jyy.JingyiyueVenderapiSyncstatusResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JingyiyueVenderapiSyncstatusRequest extends AbstractRequest implements JdRequest<JingyiyueVenderapiSyncstatusResponse> {
   private String sourceKey;
   private String orderId;
   private String stateDesc;
   private String stateCode;
   private String pushTime;
   private String extInfo;

   public void setSourceKey(String sourceKey) {
      this.sourceKey = sourceKey;
   }

   public String getSourceKey() {
      return this.sourceKey;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setStateDesc(String stateDesc) {
      this.stateDesc = stateDesc;
   }

   public String getStateDesc() {
      return this.stateDesc;
   }

   public void setStateCode(String stateCode) {
      this.stateCode = stateCode;
   }

   public String getStateCode() {
      return this.stateCode;
   }

   public void setPushTime(String pushTime) {
      this.pushTime = pushTime;
   }

   public String getPushTime() {
      return this.pushTime;
   }

   public void setExtInfo(String extInfo) {
      this.extInfo = extInfo;
   }

   public String getExtInfo() {
      return this.extInfo;
   }

   public String getApiMethod() {
      return "jingdong.jingyiyue.venderapi.syncstatus";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("sourceKey", this.sourceKey);
      pmap.put("orderId", this.orderId);
      pmap.put("stateDesc", this.stateDesc);
      pmap.put("stateCode", this.stateCode);
      pmap.put("pushTime", this.pushTime);
      pmap.put("extInfo", this.extInfo);
      return JsonUtil.toJson(pmap);
   }

   public Class<JingyiyueVenderapiSyncstatusResponse> getResponseClass() {
      return JingyiyueVenderapiSyncstatusResponse.class;
   }
}
