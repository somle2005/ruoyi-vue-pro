package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareDeleteResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareDeleteRequest extends AbstractRequest implements JdRequest<WareDeleteResponse> {
   private String wareId;
   private String tradeNo;

   public String getApiMethod() {
      return "360buy.ware.delete";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, String> pmap = new TreeMap();
      pmap.put("ware_id", this.wareId);
      pmap.put("trade_no", this.tradeNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareDeleteResponse> getResponseClass() {
      return WareDeleteResponse.class;
   }

   public String getWareId() {
      return this.wareId;
   }

   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   public String getTradeNo() {
      return this.tradeNo;
   }

   public void setTradeNo(String tradeNo) {
      this.tradeNo = tradeNo;
   }
}
