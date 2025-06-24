package com.jd.open.api.sdk.request.xfylapi;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.xfylapi.HealthcareAppointmentResultCallbackResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HealthcareAppointmentResultCallbackRequest extends AbstractRequest implements JdRequest<HealthcareAppointmentResultCallbackResponse> {
   private String msg;
   private String code;
   private String reportId;
   private Long jdAppointmentId;
   private String resultDate;
   private Long channelType;
   private String appointmentNo;
   private Integer resultType;

   public void setMsg(String msg) {
      this.msg = msg;
   }

   public String getMsg() {
      return this.msg;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public String getCode() {
      return this.code;
   }

   public void setReportId(String reportId) {
      this.reportId = reportId;
   }

   public String getReportId() {
      return this.reportId;
   }

   public void setJdAppointmentId(Long jdAppointmentId) {
      this.jdAppointmentId = jdAppointmentId;
   }

   public Long getJdAppointmentId() {
      return this.jdAppointmentId;
   }

   public void setResultDate(String resultDate) {
      this.resultDate = resultDate;
   }

   public String getResultDate() {
      return this.resultDate;
   }

   public void setChannelType(Long channelType) {
      this.channelType = channelType;
   }

   public Long getChannelType() {
      return this.channelType;
   }

   public void setAppointmentNo(String appointmentNo) {
      this.appointmentNo = appointmentNo;
   }

   public String getAppointmentNo() {
      return this.appointmentNo;
   }

   public void setResultType(Integer resultType) {
      this.resultType = resultType;
   }

   public Integer getResultType() {
      return this.resultType;
   }

   public String getApiMethod() {
      return "jingdong.healthcare.appointmentResultCallback";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("msg", this.msg);
      pmap.put("code", this.code);
      pmap.put("reportId", this.reportId);
      pmap.put("jdAppointmentId", this.jdAppointmentId);
      pmap.put("resultDate", this.resultDate);
      pmap.put("channelType", this.channelType);
      pmap.put("appointmentNo", this.appointmentNo);
      pmap.put("resultType", this.resultType);
      return JsonUtil.toJson(pmap);
   }

   public Class<HealthcareAppointmentResultCallbackResponse> getResponseClass() {
      return HealthcareAppointmentResultCallbackResponse.class;
   }
}
