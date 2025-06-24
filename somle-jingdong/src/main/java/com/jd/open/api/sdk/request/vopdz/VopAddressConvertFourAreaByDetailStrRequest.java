package com.jd.open.api.sdk.request.vopdz;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.vopdz.VopAddressConvertFourAreaByDetailStrResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VopAddressConvertFourAreaByDetailStrRequest extends AbstractRequest implements JdRequest<VopAddressConvertFourAreaByDetailStrResponse> {
   private String addressDetailStr;

   public void setAddressDetailStr(String addressDetailStr) {
      this.addressDetailStr = addressDetailStr;
   }

   public String getAddressDetailStr() {
      return this.addressDetailStr;
   }

   public String getApiMethod() {
      return "jingdong.vop.address.convertFourAreaByDetailStr";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("addressDetailStr", this.addressDetailStr);
      return JsonUtil.toJson(pmap);
   }

   public Class<VopAddressConvertFourAreaByDetailStrResponse> getResponseClass() {
      return VopAddressConvertFourAreaByDetailStrResponse.class;
   }
}
