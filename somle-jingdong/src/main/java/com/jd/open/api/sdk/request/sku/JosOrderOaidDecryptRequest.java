package com.jd.open.api.sdk.request.sku;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.sku.IOaidService.request.decrypt.GetReceiverInfoListReqVO;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.sku.JosOrderOaidDecryptResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JosOrderOaidDecryptRequest extends AbstractRequest implements JdRequest<JosOrderOaidDecryptResponse> {
   private GetReceiverInfoListReqVO getReceiverInfoListReqVO;

   public String getApiMethod() {
      return "jingdong.jos.order.oaid.decrypt";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("getReceiverInfoListReqVO", this.getReceiverInfoListReqVO);
      return JsonUtil.toJson(pmap);
   }

   public Class<JosOrderOaidDecryptResponse> getResponseClass() {
      return JosOrderOaidDecryptResponse.class;
   }

   @JsonProperty("getReceiverInfoListReqVO")
   public void setGetReceiverInfoListReqVO(GetReceiverInfoListReqVO getReceiverInfoListReqVO) {
      this.getReceiverInfoListReqVO = getReceiverInfoListReqVO;
   }

   @JsonProperty("getReceiverInfoListReqVO")
   public GetReceiverInfoListReqVO getGetReceiverInfoListReqVO() {
      return this.getReceiverInfoListReqVO;
   }
}
