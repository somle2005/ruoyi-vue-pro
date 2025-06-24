package com.jd.open.api.sdk.request.shangjiashouhou;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.shangjiashouhou.AscAuditFetchCountResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AscAuditFetchCountRequest extends AbstractRequest implements JdRequest<AscAuditFetchCountResponse> {
   private String buId;
   private String operatePin;
   private String operateNick;

   public void setBuId(String buId) {
      this.buId = buId;
   }

   public String getBuId() {
      return this.buId;
   }

   public void setOperatePin(String operatePin) {
      this.operatePin = operatePin;
   }

   public String getOperatePin() {
      return this.operatePin;
   }

   public void setOperateNick(String operateNick) {
      this.operateNick = operateNick;
   }

   public String getOperateNick() {
      return this.operateNick;
   }

   public String getApiMethod() {
      return "jingdong.asc.audit.fetch.count";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("buId", this.buId);
      pmap.put("operatePin", this.operatePin);
      pmap.put("operateNick", this.operateNick);
      return JsonUtil.toJson(pmap);
   }

   public Class<AscAuditFetchCountResponse> getResponseClass() {
      return AscAuditFetchCountResponse.class;
   }
}
