package com.jd.open.api.sdk.request.ware_communication;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware_communication.InnovationStoreReadGetProductListByStoreIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class InnovationStoreReadGetProductListByStoreIdRequest extends AbstractRequest implements JdRequest<InnovationStoreReadGetProductListByStoreIdResponse> {
   private String paramStrin;

   public void setParamStrin(String paramStrin) {
      this.paramStrin = paramStrin;
   }

   public String getParamStrin() {
      return this.paramStrin;
   }

   public String getApiMethod() {
      return "jingdong.innovation.store.read.getProductListByStoreId";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("paramStrin", this.paramStrin);
      return JsonUtil.toJson(pmap);
   }

   public Class<InnovationStoreReadGetProductListByStoreIdResponse> getResponseClass() {
      return InnovationStoreReadGetProductListByStoreIdResponse.class;
   }
}
