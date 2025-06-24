package com.jd.open.api.sdk.request.shangjiashouhou;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.shangjiashouhou.AscProcessCloseResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AscProcessCloseRequest extends AbstractRequest implements JdRequest<AscProcessCloseResponse> {
   private String buId;
   private String operatePin;
   private String operateNick;
   private Long serviceId;
   private Long orderId;
   private Integer sysVersion;
   private String extJsonStr;
   private Integer refuseReason;
   private String refuseReasonName;
   private String refuseRemark;
   private String refuseImageName;
   private String refuseImageUrl;

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

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setSysVersion(Integer sysVersion) {
      this.sysVersion = sysVersion;
   }

   public Integer getSysVersion() {
      return this.sysVersion;
   }

   public void setExtJsonStr(String extJsonStr) {
      this.extJsonStr = extJsonStr;
   }

   public String getExtJsonStr() {
      return this.extJsonStr;
   }

   public void setRefuseReason(Integer refuseReason) {
      this.refuseReason = refuseReason;
   }

   public Integer getRefuseReason() {
      return this.refuseReason;
   }

   public void setRefuseReasonName(String refuseReasonName) {
      this.refuseReasonName = refuseReasonName;
   }

   public String getRefuseReasonName() {
      return this.refuseReasonName;
   }

   public void setRefuseRemark(String refuseRemark) {
      this.refuseRemark = refuseRemark;
   }

   public String getRefuseRemark() {
      return this.refuseRemark;
   }

   public void setRefuseImageName(String refuseImageName) {
      this.refuseImageName = refuseImageName;
   }

   public String getRefuseImageName() {
      return this.refuseImageName;
   }

   public void setRefuseImageUrl(String refuseImageUrl) {
      this.refuseImageUrl = refuseImageUrl;
   }

   public String getRefuseImageUrl() {
      return this.refuseImageUrl;
   }

   public String getApiMethod() {
      return "jingdong.asc.process.close";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("buId", this.buId);
      pmap.put("operatePin", this.operatePin);
      pmap.put("operateNick", this.operateNick);
      pmap.put("serviceId", this.serviceId);
      pmap.put("orderId", this.orderId);
      pmap.put("sysVersion", this.sysVersion);
      pmap.put("extJsonStr", this.extJsonStr);
      pmap.put("refuseReason", this.refuseReason);
      pmap.put("refuseReasonName", this.refuseReasonName);
      pmap.put("refuseRemark", this.refuseRemark);
      pmap.put("refuseImageName", this.refuseImageName);
      pmap.put("refuseImageUrl", this.refuseImageUrl);
      return JsonUtil.toJson(pmap);
   }

   public Class<AscProcessCloseResponse> getResponseClass() {
      return AscProcessCloseResponse.class;
   }
}
