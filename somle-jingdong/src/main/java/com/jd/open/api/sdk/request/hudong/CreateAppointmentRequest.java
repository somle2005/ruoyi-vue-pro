package com.jd.open.api.sdk.request.hudong;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.hudong.AppointmentWriteOuterService.request.createAppointment.AppointmentInfo;
import com.jd.open.api.sdk.domain.hudong.AppointmentWriteOuterService.request.createAppointment.ClientInfo;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.CreateAppointmentResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CreateAppointmentRequest extends AbstractRequest implements JdRequest<CreateAppointmentResponse> {
   private ClientInfo clientInfo;
   private AppointmentInfo appointmentInfo;

   public String getApiMethod() {
      return "jingdong.createAppointment";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("clientInfo", this.clientInfo);
      pmap.put("appointmentInfo", this.appointmentInfo);
      return JsonUtil.toJson(pmap);
   }

   public Class<CreateAppointmentResponse> getResponseClass() {
      return CreateAppointmentResponse.class;
   }

   @JsonProperty("clientInfo")
   public void setClientInfo(ClientInfo clientInfo) {
      this.clientInfo = clientInfo;
   }

   @JsonProperty("clientInfo")
   public ClientInfo getClientInfo() {
      return this.clientInfo;
   }

   @JsonProperty("appointmentInfo")
   public void setAppointmentInfo(AppointmentInfo appointmentInfo) {
      this.appointmentInfo = appointmentInfo;
   }

   @JsonProperty("appointmentInfo")
   public AppointmentInfo getAppointmentInfo() {
      return this.appointmentInfo;
   }
}
