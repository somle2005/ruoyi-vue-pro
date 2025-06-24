package com.jd.open.api.sdk.request.etms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.etms.LdopPickupCancelResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LdopPickupCancelRequest extends AbstractRequest implements JdRequest<LdopPickupCancelResponse> {
   private String endReasonName;
   private Integer endReason;
   private String pickupCode;
   private String source;
   private String customerCode;

   public void setEndReasonName(String endReasonName) {
      this.endReasonName = endReasonName;
   }

   public String getEndReasonName() {
      return this.endReasonName;
   }

   public void setEndReason(Integer endReason) {
      this.endReason = endReason;
   }

   public Integer getEndReason() {
      return this.endReason;
   }

   public void setPickupCode(String pickupCode) {
      this.pickupCode = pickupCode;
   }

   public String getPickupCode() {
      return this.pickupCode;
   }

   public void setSource(String source) {
      this.source = source;
   }

   public String getSource() {
      return this.source;
   }

   public void setCustomerCode(String customerCode) {
      this.customerCode = customerCode;
   }

   public String getCustomerCode() {
      return this.customerCode;
   }

   public String getApiMethod() {
      return "jingdong.ldop.pickup.cancel";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("endReasonName", this.endReasonName);
      pmap.put("endReason", this.endReason);
      pmap.put("pickupCode", this.pickupCode);
      pmap.put("source", this.source);
      pmap.put("customerCode", this.customerCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopPickupCancelResponse> getResponseClass() {
      return LdopPickupCancelResponse.class;
   }
}
