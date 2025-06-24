package com.jd.open.api.sdk.request.shangjiashouhou;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.shangjiashouhou.AscAuditReasonListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AscAuditReasonListRequest extends AbstractRequest implements JdRequest<AscAuditReasonListResponse> {
   private String buId;
   private String operatePin;
   private String operateNick;
   private Long serviceId;
   private String parentCode;
   private Integer bizType;

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

   public void setServiceId(Long serviceId) {
      this.serviceId = serviceId;
   }

   public Long getServiceId() {
      return this.serviceId;
   }

   public void setParentCode(String parentCode) {
      this.parentCode = parentCode;
   }

   public String getParentCode() {
      return this.parentCode;
   }

   public void setBizType(Integer bizType) {
      this.bizType = bizType;
   }

   public Integer getBizType() {
      return this.bizType;
   }

   public String getApiMethod() {
      return "jingdong.asc.audit.reason.list";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("buId", this.buId);
      pmap.put("operatePin", this.operatePin);
      pmap.put("operateNick", this.operateNick);
      pmap.put("serviceId", this.serviceId);
      pmap.put("parentCode", this.parentCode);
      pmap.put("bizType", this.bizType);
      return JsonUtil.toJson(pmap);
   }

   public Class<AscAuditReasonListResponse> getResponseClass() {
      return AscAuditReasonListResponse.class;
   }
}
