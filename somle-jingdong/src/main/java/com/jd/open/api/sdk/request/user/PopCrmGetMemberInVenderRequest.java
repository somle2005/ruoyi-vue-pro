package com.jd.open.api.sdk.request.user;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.user.PopCrmGetMemberInVenderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopCrmGetMemberInVenderRequest extends AbstractRequest implements JdRequest<PopCrmGetMemberInVenderResponse> {
   private String customerPin;
   private String openIdBuyer;
   private String xidBuyer;

   public void setCustomerPin(String customerPin) {
      this.customerPin = customerPin;
   }

   public String getCustomerPin() {
      return this.customerPin;
   }

   public void setOpenIdBuyer(String openIdBuyer) {
      this.openIdBuyer = openIdBuyer;
   }

   public String getOpenIdBuyer() {
      return this.openIdBuyer;
   }

   public void setXidBuyer(String xidBuyer) {
      this.xidBuyer = xidBuyer;
   }

   public String getXidBuyer() {
      return this.xidBuyer;
   }

   public String getApiMethod() {
      return "jingdong.pop.crm.getMemberInVender";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("customerPin", this.customerPin);
      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopCrmGetMemberInVenderResponse> getResponseClass() {
      return PopCrmGetMemberInVenderResponse.class;
   }
}
