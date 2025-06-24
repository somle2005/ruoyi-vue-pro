package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.PopOrderEncryptMobileNumResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopOrderEncryptMobileNumRequest extends AbstractRequest implements JdRequest<PopOrderEncryptMobileNumResponse> {
   private String mobile;

   public void setMobile(String mobile) {
      this.mobile = mobile;
   }

   public String getMobile() {
      return this.mobile;
   }

   public String getApiMethod() {
      return "jingdong.pop.order.encryptMobileNum";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("mobile", this.mobile);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopOrderEncryptMobileNumResponse> getResponseClass() {
      return PopOrderEncryptMobileNumResponse.class;
   }
}
