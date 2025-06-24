package com.jd.open.api.sdk.request.etms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.etms.LdopMiddleWaybillWaybillTrackAndTimePositionApiResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class LdopMiddleWaybillWaybillTrackAndTimePositionApiRequest extends AbstractRequest implements JdRequest<LdopMiddleWaybillWaybillTrackAndTimePositionApiResponse> {
   private String waybillCode;
   private Date gpsTime;
   private String customerCode;

   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   public String getWaybillCode() {
      return this.waybillCode;
   }

   public void setGpsTime(Date gpsTime) {
      this.gpsTime = gpsTime;
   }

   public Date getGpsTime() {
      return this.gpsTime;
   }

   public void setCustomerCode(String customerCode) {
      this.customerCode = customerCode;
   }

   public String getCustomerCode() {
      return this.customerCode;
   }

   public String getApiMethod() {
      return "jingdong.ldop.middle.waybill.WaybillTrackAndTimePositionApi";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("waybillCode", this.waybillCode);

      try {
         if (this.gpsTime != null) {
            pmap.put("gpsTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.gpsTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("customerCode", this.customerCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopMiddleWaybillWaybillTrackAndTimePositionApiResponse> getResponseClass() {
      return LdopMiddleWaybillWaybillTrackAndTimePositionApiResponse.class;
   }
}
