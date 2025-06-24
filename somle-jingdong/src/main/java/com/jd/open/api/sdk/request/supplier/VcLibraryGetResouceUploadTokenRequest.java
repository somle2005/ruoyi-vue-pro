package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcLibraryGetResouceUploadTokenResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcLibraryGetResouceUploadTokenRequest extends AbstractRequest implements JdRequest<VcLibraryGetResouceUploadTokenResponse> {
   public String getApiMethod() {
      return "jingdong.vc.library.getResouceUploadToken";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<VcLibraryGetResouceUploadTokenResponse> getResponseClass() {
      return VcLibraryGetResouceUploadTokenResponse.class;
   }
}
