package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpPoCancalPoOrderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpPoCancalPoOrderRequest extends AbstractRequest implements JdRequest<EclpPoCancalPoOrderResponse> {
   private String poOrderNo;

   public void setPoOrderNo(String poOrderNo) {
      this.poOrderNo = poOrderNo;
   }

   public String getPoOrderNo() {
      return this.poOrderNo;
   }

   public String getApiMethod() {
      return "jingdong.eclp.po.cancalPoOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("poOrderNo", this.poOrderNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpPoCancalPoOrderResponse> getResponseClass() {
      return EclpPoCancalPoOrderResponse.class;
   }
}
