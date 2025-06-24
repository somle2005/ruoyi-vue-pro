package com.jd.open.api.sdk.request.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.KeeperWareAuditService.request.getWareAuditDetail.WareAuditParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareAuditGetWareAuditDetailResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareAuditGetWareAuditDetailRequest extends AbstractRequest implements JdRequest<WareAuditGetWareAuditDetailResponse> {
   private WareAuditParam wareAuditParam;

   public String getApiMethod() {
      return "jingdong.ware.audit.getWareAuditDetail";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("wareAuditParam", this.wareAuditParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareAuditGetWareAuditDetailResponse> getResponseClass() {
      return WareAuditGetWareAuditDetailResponse.class;
   }

   @JsonProperty("wareAuditParam")
   public void setWareAuditParam(WareAuditParam wareAuditParam) {
      this.wareAuditParam = wareAuditParam;
   }

   @JsonProperty("wareAuditParam")
   public WareAuditParam getWareAuditParam() {
      return this.wareAuditParam;
   }
}
