package com.jd.open.api.sdk.request.imgzone;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.imgzone.ImgzoneUserinfoQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ImgzoneUserinfoQueryRequest extends AbstractRequest implements JdRequest<ImgzoneUserinfoQueryResponse> {
   public String getApiMethod() {
      return "jingdong.imgzone.userinfo.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<ImgzoneUserinfoQueryResponse> getResponseClass() {
      return ImgzoneUserinfoQueryResponse.class;
   }
}
