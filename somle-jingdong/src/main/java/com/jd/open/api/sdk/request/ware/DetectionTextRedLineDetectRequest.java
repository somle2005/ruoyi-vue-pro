package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.DetectionTextRedLineDetectResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DetectionTextRedLineDetectRequest extends AbstractRequest implements JdRequest<DetectionTextRedLineDetectResponse> {
   private String text;

   public void setText(String text) {
      this.text = text;
   }

   public String getText() {
      return this.text;
   }

   public String getApiMethod() {
      return "jingdong.detection.textRedLineDetect";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("text", this.text);
      return JsonUtil.toJson(pmap);
   }

   public Class<DetectionTextRedLineDetectResponse> getResponseClass() {
      return DetectionTextRedLineDetectResponse.class;
   }
}
