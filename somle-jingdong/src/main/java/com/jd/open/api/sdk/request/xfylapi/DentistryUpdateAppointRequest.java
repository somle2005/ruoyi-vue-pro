package com.jd.open.api.sdk.request.xfylapi;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.xfylapi.DentistryUpdateAppointResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DentistryUpdateAppointRequest extends AbstractRequest implements JdRequest<DentistryUpdateAppointResponse> {
   private String goodsId;
   private Long channelType;
   private String appointEndTime;
   private String appointBeginTime;
   private Long jdAppointmentId;
   private String appointmentNo;
   private String storeId;
   private String appointDate;

   public void setGoodsId(String goodsId) {
      this.goodsId = goodsId;
   }

   public String getGoodsId() {
      return this.goodsId;
   }

   public void setChannelType(Long channelType) {
      this.channelType = channelType;
   }

   public Long getChannelType() {
      return this.channelType;
   }

   public void setAppointEndTime(String appointEndTime) {
      this.appointEndTime = appointEndTime;
   }

   public String getAppointEndTime() {
      return this.appointEndTime;
   }

   public void setAppointBeginTime(String appointBeginTime) {
      this.appointBeginTime = appointBeginTime;
   }

   public String getAppointBeginTime() {
      return this.appointBeginTime;
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

   public void setStoreId(String storeId) {
      this.storeId = storeId;
   }

   public String getStoreId() {
      return this.storeId;
   }

   public void setAppointDate(String appointDate) {
      this.appointDate = appointDate;
   }

   public String getAppointDate() {
      return this.appointDate;
   }

   public String getApiMethod() {
      return "jingdong.dentistry.updateAppoint";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("goodsId", this.goodsId);
      pmap.put("channelType", this.channelType);
      pmap.put("appointEndTime", this.appointEndTime);
      pmap.put("appointBeginTime", this.appointBeginTime);
      pmap.put("jdAppointmentId", this.jdAppointmentId);
      pmap.put("appointmentNo", this.appointmentNo);
      pmap.put("storeId", this.storeId);
      pmap.put("appointDate", this.appointDate);
      return JsonUtil.toJson(pmap);
   }

   public Class<DentistryUpdateAppointResponse> getResponseClass() {
      return DentistryUpdateAppointResponse.class;
   }
}
