package com.jd.open.api.sdk.request.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.LocOrderCodeSoaService.request.write.LocFeatureJosParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.LocWareFeatureWriteResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LocWareFeatureWriteRequest extends AbstractRequest implements JdRequest<LocWareFeatureWriteResponse> {
   private Long wareId;
   private LocFeatureJosParam featureParam;

   public String getApiMethod() {
      return "jingdong.loc.ware.feature.write";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("wareId", this.wareId);
      pmap.put("featureParam", this.featureParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<LocWareFeatureWriteResponse> getResponseClass() {
      return LocWareFeatureWriteResponse.class;
   }

   @JsonProperty("wareId")
   public void setWareId(Long wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("wareId")
   public Long getWareId() {
      return this.wareId;
   }

   @JsonProperty("featureParam")
   public void setFeatureParam(LocFeatureJosParam featureParam) {
      this.featureParam = featureParam;
   }

   @JsonProperty("featureParam")
   public LocFeatureJosParam getFeatureParam() {
      return this.featureParam;
   }
}
