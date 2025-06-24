package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareReadFindOpReasonResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WareReadFindOpReasonRequest extends AbstractRequest implements JdRequest<WareReadFindOpReasonResponse> {
   private Long wareId;
   private String field;

   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   public Long getWareId() {
      return this.wareId;
   }

   public void setField(String field) {
      this.field = field;
   }

   public String getField() {
      return this.field;
   }

   public String getApiMethod() {
      return "jingdong.ware.read.findOpReason";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("wareId", this.wareId);
      pmap.put("field", this.field);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareReadFindOpReasonResponse> getResponseClass() {
      return WareReadFindOpReasonResponse.class;
   }
}
