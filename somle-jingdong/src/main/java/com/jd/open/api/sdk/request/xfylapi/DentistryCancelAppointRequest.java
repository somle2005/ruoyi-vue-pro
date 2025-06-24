package com.jd.open.api.sdk.request.xfylapi;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.xfylapi.DentistryCancelAppointResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DentistryCancelAppointRequest extends AbstractRequest implements JdRequest<DentistryCancelAppointResponse> {
   private Long channelType;
   private Long jdAppointmentId;
   private String appointmentNo;
   private String remark;

   public void setChannelType(Long channelType) {
      this.channelType = channelType;
   }

   public Long getChannelType() {
      return this.channelType;
   }

   public void setJdAppointmentId(Long jdAppointmentId) {
      this.jdAppointmentId = jdAppointmentId;
   }

   public Long getJdAppointmentId() {
      return this.jdAppointmentId;
   }

   public void setAppointmentNo(String appointmentNo) {
      this.appointmentNo = appointmentNo;
   }

   public String getAppointmentNo() {
      return this.appointmentNo;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getRemark() {
      return this.remark;
   }

   public String getApiMethod() {
      return "jingdong.dentistry.cancelAppoint";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("channelType", this.channelType);
      pmap.put("jdAppointmentId", this.jdAppointmentId);
      pmap.put("appointmentNo", this.appointmentNo);
      pmap.put("remark", this.remark);
      return JsonUtil.toJson(pmap);
   }

   public Class<DentistryCancelAppointResponse> getResponseClass() {
      return DentistryCancelAppointResponse.class;
   }
}
