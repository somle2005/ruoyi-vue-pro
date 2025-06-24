package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcGetcomponentlistResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcGetcomponentlistRequest extends AbstractRequest implements JdRequest<VcGetcomponentlistResponse> {
   private String type;

   public void setType(String type) {
      this.type = type;
   }

   public String getType() {
      return this.type;
   }

   public String getApiMethod() {
      return "jingdong.vc.getcomponentlist";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("type", this.type);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcGetcomponentlistResponse> getResponseClass() {
      return VcGetcomponentlistResponse.class;
   }
}
