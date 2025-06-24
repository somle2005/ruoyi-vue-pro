package com.jd.open.api.sdk.request.seller;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.seller.VenderReturnaddressQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VenderReturnaddressQueryRequest extends AbstractRequest implements JdRequest<VenderReturnaddressQueryResponse> {
   private int addressType;

   public void setAddressType(int addressType) {
      this.addressType = addressType;
   }

   public int getAddressType() {
      return this.addressType;
   }

   public String getApiMethod() {
      return "jingdong.vender.returnaddress.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("address_type", this.addressType);
      return JsonUtil.toJson(pmap);
   }

   public Class<VenderReturnaddressQueryResponse> getResponseClass() {
      return VenderReturnaddressQueryResponse.class;
   }
}
