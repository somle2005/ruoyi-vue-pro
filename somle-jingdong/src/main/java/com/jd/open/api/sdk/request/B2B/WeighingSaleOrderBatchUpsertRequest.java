package com.jd.open.api.sdk.request.B2B;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.B2B.NsspSubmitProvider.request.batchUpsert.ClientInfo;
import com.jd.open.api.sdk.domain.B2B.NsspSubmitProvider.request.batchUpsert.UpsertNsspOrderReq;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.B2B.WeighingSaleOrderBatchUpsertResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WeighingSaleOrderBatchUpsertRequest extends AbstractRequest implements JdRequest<WeighingSaleOrderBatchUpsertResponse> {
   private ClientInfo clientInfo;
   private UpsertNsspOrderReq upsertNsspOrderReq;

   public String getApiMethod() {
      return "jingdong.weighing.sale.order.batchUpsert";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("clientInfo", this.clientInfo);
      pmap.put("upsertNsspOrderReq", this.upsertNsspOrderReq);
      return JsonUtil.toJson(pmap);
   }

   public Class<WeighingSaleOrderBatchUpsertResponse> getResponseClass() {
      return WeighingSaleOrderBatchUpsertResponse.class;
   }

   @JsonProperty("clientInfo")
   public void setClientInfo(ClientInfo clientInfo) {
      this.clientInfo = clientInfo;
   }

   @JsonProperty("clientInfo")
   public ClientInfo getClientInfo() {
      return this.clientInfo;
   }

   @JsonProperty("upsertNsspOrderReq")
   public void setUpsertNsspOrderReq(UpsertNsspOrderReq upsertNsspOrderReq) {
      this.upsertNsspOrderReq = upsertNsspOrderReq;
   }

   @JsonProperty("upsertNsspOrderReq")
   public UpsertNsspOrderReq getUpsertNsspOrderReq() {
      return this.upsertNsspOrderReq;
   }
}
