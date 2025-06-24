package com.jd.open.api.sdk.request.directional;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.directional.JosVoucherInfoGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JosVoucherInfoGetRequest extends AbstractRequest implements JdRequest<JosVoucherInfoGetResponse> {
   private Long customerUserId;

   public void setCustomerUserId(Long customerUserId) {
      this.customerUserId = customerUserId;
   }

   public Long getCustomerUserId() {
      return this.customerUserId;
   }

   public String getApiMethod() {
      return "jingdong.jos.voucher.info.get";
   }

   public String getAppJsonParams() throws IOException {
      Map pmap = new TreeMap();
      pmap.put("customer_user_id", this.customerUserId);
      return JsonUtil.toJson(pmap);
   }

   public Class<JosVoucherInfoGetResponse> getResponseClass() {
      return JosVoucherInfoGetResponse.class;
   }
}
