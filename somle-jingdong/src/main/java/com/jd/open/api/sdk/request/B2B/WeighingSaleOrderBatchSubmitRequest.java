package com.jd.open.api.sdk.request.B2B;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.B2B.NsspSubmitProvider.request.batchSubmit.ClientInfo;
import com.jd.open.api.sdk.domain.B2B.NsspSubmitProvider.request.batchSubmit.NsspOrderReq;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.B2B.WeighingSaleOrderBatchSubmitResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WeighingSaleOrderBatchSubmitRequest extends AbstractRequest implements JdRequest<WeighingSaleOrderBatchSubmitResponse> {
   private ClientInfo clientInfo;
   private NsspOrderReq nsspOrderReq;

   public String getApiMethod() {
      return "jingdong.weighing.sale.order.batchSubmit";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("clientInfo", this.clientInfo);
      pmap.put("nsspOrderReq", this.nsspOrderReq);
      return JsonUtil.toJson(pmap);
   }

   public Class<WeighingSaleOrderBatchSubmitResponse> getResponseClass() {
      return WeighingSaleOrderBatchSubmitResponse.class;
   }

   @JsonProperty("clientInfo")
   public void setClientInfo(ClientInfo clientInfo) {
      this.clientInfo = clientInfo;
   }

   @JsonProperty("clientInfo")
   public ClientInfo getClientInfo() {
      return this.clientInfo;
   }

   @JsonProperty("nsspOrderReq")
   public void setNsspOrderReq(NsspOrderReq nsspOrderReq) {
      this.nsspOrderReq = nsspOrderReq;
   }

   @JsonProperty("nsspOrderReq")
   public NsspOrderReq getNsspOrderReq() {
      return this.nsspOrderReq;
   }
}
