package com.jd.open.api.sdk.request.shangjiashouhou;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.shangjiashouhou.ServiceAuditProvider.request.customerDeliveryStoreApply.CustomerDeliveryStoreApplyCmd;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.shangjiashouhou.AscBizCustomerDeliveryStoreApplyResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AscBizCustomerDeliveryStoreApplyRequest extends AbstractRequest implements JdRequest<AscBizCustomerDeliveryStoreApplyResponse> {
   private CustomerDeliveryStoreApplyCmd CustomerDeliveryStoreApplyCmd;

   public String getApiMethod() {
      return "jingdong.asc.biz.customerDeliveryStoreApply";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("CustomerDeliveryStoreApplyCmd", this.CustomerDeliveryStoreApplyCmd);
      return JsonUtil.toJson(pmap);
   }

   public Class<AscBizCustomerDeliveryStoreApplyResponse> getResponseClass() {
      return AscBizCustomerDeliveryStoreApplyResponse.class;
   }

   @JsonProperty("CustomerDeliveryStoreApplyCmd")
   public void setCustomerDeliveryStoreApplyCmd(CustomerDeliveryStoreApplyCmd CustomerDeliveryStoreApplyCmd) {
      this.CustomerDeliveryStoreApplyCmd = CustomerDeliveryStoreApplyCmd;
   }

   @JsonProperty("CustomerDeliveryStoreApplyCmd")
   public CustomerDeliveryStoreApplyCmd getCustomerDeliveryStoreApplyCmd() {
      return this.CustomerDeliveryStoreApplyCmd;
   }
}
