package com.jd.open.api.sdk.request.shangjiashouhou;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.shangjiashouhou.AscAuditDetailResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AscAuditDetailRequest extends AbstractRequest implements JdRequest<AscAuditDetailResponse> {
   private String buId;
   private String operatePin;
   private String operateNick;
   private Long applyId;
   private String extJsonStr;

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

   public void setApplyId(Long applyId) {
      this.applyId = applyId;
   }

   public Long getApplyId() {
      return this.applyId;
   }

   public void setExtJsonStr(String extJsonStr) {
      this.extJsonStr = extJsonStr;
   }

   public String getExtJsonStr() {
      return this.extJsonStr;
   }

   public String getApiMethod() {
      return "jingdong.asc.audit.detail";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("buId", this.buId);
      pmap.put("operatePin", this.operatePin);
      pmap.put("operateNick", this.operateNick);
      pmap.put("applyId", this.applyId);
      pmap.put("extJsonStr", this.extJsonStr);
      return JsonUtil.toJson(pmap);
   }

   public Class<AscAuditDetailResponse> getResponseClass() {
      return AscAuditDetailResponse.class;
   }
}
