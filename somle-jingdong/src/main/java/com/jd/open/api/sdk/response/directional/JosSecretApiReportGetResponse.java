package com.jd.open.api.sdk.response.directional;

import com.jd.open.api.sdk.response.AbstractResponse;

public class JosSecretApiReportGetResponse extends AbstractResponse {
   private int serviceCode;
   private String serviceMsg;

   public int getServiceCode() {
      return this.serviceCode;
   }

   public void setServiceCode(int serviceCode) {
      this.serviceCode = serviceCode;
   }

   public String getServiceMsg() {
      return this.serviceMsg;
   }

   public void setServiceMsg(String serviceMsg) {
      this.serviceMsg = serviceMsg;
   }
}
