package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.EdiScheduleplanSendResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EdiScheduleplanSendRequest extends AbstractRequest implements JdRequest<EdiScheduleplanSendResponse> {
   private String schedulePlanCode;
   private String jdSku;
   private String vendorProductId;
   private String schedulePlanTime;
   private String quantity;

   public void setSchedulePlanCode(String schedulePlanCode) {
      this.schedulePlanCode = schedulePlanCode;
   }

   public String getSchedulePlanCode() {
      return this.schedulePlanCode;
   }

   public void setJdSku(String jdSku) {
      this.jdSku = jdSku;
   }

   public String getJdSku() {
      return this.jdSku;
   }

   public void setVendorProductId(String vendorProductId) {
      this.vendorProductId = vendorProductId;
   }

   public String getVendorProductId() {
      return this.vendorProductId;
   }

   public void setSchedulePlanTime(String schedulePlanTime) {
      this.schedulePlanTime = schedulePlanTime;
   }

   public String getSchedulePlanTime() {
      return this.schedulePlanTime;
   }

   public void setQuantity(String quantity) {
      this.quantity = quantity;
   }

   public String getQuantity() {
      return this.quantity;
   }

   public String getApiMethod() {
      return "jingdong.edi.scheduleplan.send";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("schedulePlanCode", this.schedulePlanCode);
      pmap.put("jdSku", this.jdSku);
      pmap.put("vendorProductId", this.vendorProductId);
      pmap.put("schedulePlanTime", this.schedulePlanTime);
      pmap.put("quantity", this.quantity);
      return JsonUtil.toJson(pmap);
   }

   public Class<EdiScheduleplanSendResponse> getResponseClass() {
      return EdiScheduleplanSendResponse.class;
   }
}
