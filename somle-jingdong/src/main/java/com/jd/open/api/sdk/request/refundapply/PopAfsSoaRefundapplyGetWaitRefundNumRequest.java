package com.jd.open.api.sdk.request.refundapply;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.refundapply.PopAfsSoaRefundapplyGetWaitRefundNumResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopAfsSoaRefundapplyGetWaitRefundNumRequest extends AbstractRequest implements JdRequest<PopAfsSoaRefundapplyGetWaitRefundNumResponse> {
   public String getApiMethod() {
      return "jingdong.pop.afs.soa.refundapply.getWaitRefundNum";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<PopAfsSoaRefundapplyGetWaitRefundNumResponse> getResponseClass() {
      return PopAfsSoaRefundapplyGetWaitRefundNumResponse.class;
   }
}
