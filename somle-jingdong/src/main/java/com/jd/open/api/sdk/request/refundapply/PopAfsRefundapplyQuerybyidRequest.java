package com.jd.open.api.sdk.request.refundapply;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.refundapply.PopAfsRefundapplyQuerybyidResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopAfsRefundapplyQuerybyidRequest extends AbstractRequest implements JdRequest<PopAfsRefundapplyQuerybyidResponse> {
   private Long raId;

   public void setRaId(Long raId) {
      this.raId = raId;
   }

   public Long getRaId() {
      return this.raId;
   }

   public String getApiMethod() {
      return "jingdong.pop.afs.refundapply.querybyid";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ra_id", this.raId);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopAfsRefundapplyQuerybyidResponse> getResponseClass() {
      return PopAfsRefundapplyQuerybyidResponse.class;
   }
}
