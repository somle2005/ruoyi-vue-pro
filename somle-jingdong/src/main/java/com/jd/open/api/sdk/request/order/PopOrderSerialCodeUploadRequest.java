package com.jd.open.api.sdk.request.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.SnUploadJosService.request.upload.SnUploadReq;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.PopOrderSerialCodeUploadResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopOrderSerialCodeUploadRequest extends AbstractRequest implements JdRequest<PopOrderSerialCodeUploadResponse> {
   private SnUploadReq snUploadReq;

   public String getApiMethod() {
      return "jingdong.pop.order.serialCode.upload";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("snUploadReq", this.snUploadReq);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopOrderSerialCodeUploadResponse> getResponseClass() {
      return PopOrderSerialCodeUploadResponse.class;
   }

   @JsonProperty("snUploadReq")
   public void setSnUploadReq(SnUploadReq snUploadReq) {
      this.snUploadReq = snUploadReq;
   }

   @JsonProperty("snUploadReq")
   public SnUploadReq getSnUploadReq() {
      return this.snUploadReq;
   }
}
