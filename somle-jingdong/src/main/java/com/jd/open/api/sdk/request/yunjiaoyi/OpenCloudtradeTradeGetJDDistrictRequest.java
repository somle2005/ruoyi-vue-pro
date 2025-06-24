package com.jd.open.api.sdk.request.yunjiaoyi;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.yunjiaoyi.OpenCloudtradeTradeGetJDDistrictResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OpenCloudtradeTradeGetJDDistrictRequest extends AbstractRequest implements JdRequest<OpenCloudtradeTradeGetJDDistrictResponse> {
   private String fullAddress;

   public void setFullAddress(String fullAddress) {
      this.fullAddress = fullAddress;
   }

   public String getFullAddress() {
      return this.fullAddress;
   }

   public String getApiMethod() {
      return "jingdong.open.cloudtrade.trade.getJDDistrict";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("fullAddress", this.fullAddress);
      return JsonUtil.toJson(pmap);
   }

   public Class<OpenCloudtradeTradeGetJDDistrictResponse> getResponseClass() {
      return OpenCloudtradeTradeGetJDDistrictResponse.class;
   }
}
