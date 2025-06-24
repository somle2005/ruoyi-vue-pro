package com.jd.open.api.sdk.request.refundapply;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.refundapply.PopAfsSoaRefundapplyQueryByIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopAfsSoaRefundapplyQueryByIdRequest extends AbstractRequest implements JdRequest<PopAfsSoaRefundapplyQueryByIdResponse> {
   private Long id;

   public void setId(Long id) {
      this.id = id;
   }

   public Long getId() {
      return this.id;
   }

   public String getApiMethod() {
      return "jingdong.pop.afs.soa.refundapply.queryById";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("id", this.id);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopAfsSoaRefundapplyQueryByIdResponse> getResponseClass() {
      return PopAfsSoaRefundapplyQueryByIdResponse.class;
   }
}
