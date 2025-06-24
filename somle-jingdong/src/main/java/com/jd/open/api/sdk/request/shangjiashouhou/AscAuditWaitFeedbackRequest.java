package com.jd.open.api.sdk.request.shangjiashouhou;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.shangjiashouhou.AscAuditWaitFeedbackResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AscAuditWaitFeedbackRequest extends AbstractRequest implements JdRequest<AscAuditWaitFeedbackResponse> {
   private String buId;
   private String operatePin;
   private String operateNick;
   private Long serviceId;
   private Long orderId;
   private String approveNotes;
   private Integer sysVersion;
   private Integer approveReasonCid1;
   private Integer approveReasonCid2;
   private String operateRemark;
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

   public void setApproveNotes(String approveNotes) {
      this.approveNotes = approveNotes;
   }

   public String getApproveNotes() {
      return this.approveNotes;
   }

   public void setSysVersion(Integer sysVersion) {
      this.sysVersion = sysVersion;
   }

   public Integer getSysVersion() {
      return this.sysVersion;
   }

   public void setApproveReasonCid1(Integer approveReasonCid1) {
      this.approveReasonCid1 = approveReasonCid1;
   }

   public Integer getApproveReasonCid1() {
      return this.approveReasonCid1;
   }

   public void setApproveReasonCid2(Integer approveReasonCid2) {
      this.approveReasonCid2 = approveReasonCid2;
   }

   public Integer getApproveReasonCid2() {
      return this.approveReasonCid2;
   }

   public void setOperateRemark(String operateRemark) {
      this.operateRemark = operateRemark;
   }

   public String getOperateRemark() {
      return this.operateRemark;
   }

   public void setExtJsonStr(String extJsonStr) {
      this.extJsonStr = extJsonStr;
   }

   public String getExtJsonStr() {
      return this.extJsonStr;
   }

   public String getApiMethod() {
      return "jingdong.asc.audit.waitFeedback";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("buId", this.buId);
      pmap.put("operatePin", this.operatePin);
      pmap.put("operateNick", this.operateNick);
      pmap.put("serviceId", this.serviceId);
      pmap.put("orderId", this.orderId);
      pmap.put("approveNotes", this.approveNotes);
      pmap.put("sysVersion", this.sysVersion);
      pmap.put("approveReasonCid1", this.approveReasonCid1);
      pmap.put("approveReasonCid2", this.approveReasonCid2);
      pmap.put("operateRemark", this.operateRemark);
      pmap.put("extJsonStr", this.extJsonStr);
      return JsonUtil.toJson(pmap);
   }

   public Class<AscAuditWaitFeedbackResponse> getResponseClass() {
      return AscAuditWaitFeedbackResponse.class;
   }
}
