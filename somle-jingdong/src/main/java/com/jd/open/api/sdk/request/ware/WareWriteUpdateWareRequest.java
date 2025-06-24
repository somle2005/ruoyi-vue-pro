package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.domain.Ware;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareWriteUpdateWareResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareWriteUpdateWareRequest extends AbstractRequest implements JdRequest<WareWriteUpdateWareResponse> {
   private Ware ware;

   public Ware getWare() {
      return this.ware;
   }

   public void setWare(Ware ware) {
      this.ware = ware;
   }

   public String getApiMethod() {
      return "jingdong.ware.write.updateWare";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ware", this.ware);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareWriteUpdateWareResponse> getResponseClass() {
      return WareWriteUpdateWareResponse.class;
   }
}
