package com.jd.open.api.sdk.request.unboundedShop;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.unboundedShop.StoreCenterServiceProvider.request.updateStoreStatus.VenderStoresBean;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.unboundedShop.UpdateStoreStatusResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UpdateStoreStatusRequest extends AbstractRequest implements JdRequest<UpdateStoreStatusResponse> {
   private VenderStoresBean param;

   public String getApiMethod() {
      return "jingdong.updateStoreStatus";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("param", this.param);
      return JsonUtil.toJson(pmap);
   }

   public Class<UpdateStoreStatusResponse> getResponseClass() {
      return UpdateStoreStatusResponse.class;
   }

   @JsonProperty("param")
   public void setParam(VenderStoresBean param) {
      this.param = param;
   }

   @JsonProperty("param")
   public VenderStoresBean getParam() {
      return this.param;
   }
}
