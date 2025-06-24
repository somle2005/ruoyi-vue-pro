package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.EdiRoDetailGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EdiRoDetailGetRequest extends AbstractRequest implements JdRequest<EdiRoDetailGetResponse> {
   private String returnOrderCode;

   public void setReturnOrderCode(String returnOrderCode) {
      this.returnOrderCode = returnOrderCode;
   }

   public String getReturnOrderCode() {
      return this.returnOrderCode;
   }

   public String getApiMethod() {
      return "jingdong.edi.ro.detail.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("returnOrderCode", this.returnOrderCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<EdiRoDetailGetResponse> getResponseClass() {
      return EdiRoDetailGetResponse.class;
   }
}
