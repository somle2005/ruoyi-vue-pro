package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcGetReturnOrderDetailResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcGetReturnOrderDetailRequest extends AbstractRequest implements JdRequest<VcGetReturnOrderDetailResponse> {
   private Long returnId;

   public void setReturnId(Long returnId) {
      this.returnId = returnId;
   }

   public Long getReturnId() {
      return this.returnId;
   }

   public String getApiMethod() {
      return "jingdong.vc.get.return.order.detail";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("returnId", this.returnId);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcGetReturnOrderDetailResponse> getResponseClass() {
      return VcGetReturnOrderDetailResponse.class;
   }
}
