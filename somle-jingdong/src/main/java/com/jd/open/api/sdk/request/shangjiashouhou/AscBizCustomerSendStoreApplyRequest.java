package com.jd.open.api.sdk.request.shangjiashouhou;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.shangjiashouhou.ServiceAuditProvider.request.customerSendStoreApply.CustomerSendStoreApplyCmd;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.shangjiashouhou.AscBizCustomerSendStoreApplyResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AscBizCustomerSendStoreApplyRequest extends AbstractRequest implements JdRequest<AscBizCustomerSendStoreApplyResponse> {
   private CustomerSendStoreApplyCmd CustomerSendStoreApplyCmd;

   public String getApiMethod() {
      return "jingdong.asc.biz.customerSendStoreApply";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("CustomerSendStoreApplyCmd", this.CustomerSendStoreApplyCmd);
      return JsonUtil.toJson(pmap);
   }

   public Class<AscBizCustomerSendStoreApplyResponse> getResponseClass() {
      return AscBizCustomerSendStoreApplyResponse.class;
   }

   @JsonProperty("CustomerSendStoreApplyCmd")
   public void setCustomerSendStoreApplyCmd(CustomerSendStoreApplyCmd CustomerSendStoreApplyCmd) {
      this.CustomerSendStoreApplyCmd = CustomerSendStoreApplyCmd;
   }

   @JsonProperty("CustomerSendStoreApplyCmd")
   public CustomerSendStoreApplyCmd getCustomerSendStoreApplyCmd() {
      return this.CustomerSendStoreApplyCmd;
   }
}
