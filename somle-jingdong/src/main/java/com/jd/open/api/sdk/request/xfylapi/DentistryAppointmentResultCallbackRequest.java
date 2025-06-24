package com.jd.open.api.sdk.request.xfylapi;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.xfylapi.DentistryAppointmentResultCallbackResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DentistryAppointmentResultCallbackRequest extends AbstractRequest implements JdRequest<DentistryAppointmentResultCallbackResponse> {
   private Long channelType;
   private Integer resultType;
   private Long jdAppointmentId;
   private String code;
   private String resultDate;
   private String appointmentNo;
   private String msg;

   public void setChannelType(Long channelType) {
      this.channelType = channelType;
   }

   public Long getChannelType() {
      return this.channelType;
   }

   public void setResultType(Integer resultType) {
      this.resultType = resultType;
   }

   public Integer getResultType() {
      return this.resultType;
   }

   public void setJdAppointmentId(Long jdAppointmentId) {
      this.jdAppointmentId = jdAppointmentId;
   }

   public Long getJdAppointmentId() {
      return this.jdAppointmentId;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public String getCode() {
      return this.code;
   }

   public void setResultDate(String resultDate) {
      this.resultDate = resultDate;
   }

   public String getResultDate() {
      return this.resultDate;
   }

   public void setAppointmentNo(String appointmentNo) {
      this.appointmentNo = appointmentNo;
   }

   public String getAppointmentNo() {
      return this.appointmentNo;
   }

   public void setMsg(String msg) {
      this.msg = msg;
   }

   public String getMsg() {
      return this.msg;
   }

   public String getApiMethod() {
      return "jingdong.dentistry.appointmentResultCallback";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("channelType", this.channelType);
      pmap.put("resultType", this.resultType);
      pmap.put("jdAppointmentId", this.jdAppointmentId);
      pmap.put("code", this.code);
      pmap.put("resultDate", this.resultDate);
      pmap.put("appointmentNo", this.appointmentNo);
      pmap.put("msg", this.msg);
      return JsonUtil.toJson(pmap);
   }

   public Class<DentistryAppointmentResultCallbackResponse> getResponseClass() {
      return DentistryAppointmentResultCallbackResponse.class;
   }
}
