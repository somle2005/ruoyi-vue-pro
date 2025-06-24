package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpMasterGetSellerInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpMasterGetSellerInfoRequest extends AbstractRequest implements JdRequest<EclpMasterGetSellerInfoResponse> {
   public String getApiMethod() {
      return "jingdong.eclp.master.getSellerInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpMasterGetSellerInfoResponse> getResponseClass() {
      return EclpMasterGetSellerInfoResponse.class;
   }
}
