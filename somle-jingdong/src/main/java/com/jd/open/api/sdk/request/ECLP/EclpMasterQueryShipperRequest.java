package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpMasterQueryShipperResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpMasterQueryShipperRequest extends AbstractRequest implements JdRequest<EclpMasterQueryShipperResponse> {
   private String shipperNos;

   public void setShipperNos(String shipperNos) {
      this.shipperNos = shipperNos;
   }

   public String getShipperNos() {
      return this.shipperNos;
   }

   public String getApiMethod() {
      return "jingdong.eclp.master.queryShipper";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("shipperNos", this.shipperNos);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpMasterQueryShipperResponse> getResponseClass() {
      return EclpMasterQueryShipperResponse.class;
   }
}
