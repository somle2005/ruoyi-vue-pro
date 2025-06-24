package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.DeleteStoresByIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DeleteStoresByIdRequest extends AbstractRequest implements JdRequest<DeleteStoresByIdResponse> {
   private Long storeId;

   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   public Long getStoreId() {
      return this.storeId;
   }

   public String getApiMethod() {
      return "jingdong.deleteStoresById";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("storeId", this.storeId);
      return JsonUtil.toJson(pmap);
   }

   public Class<DeleteStoresByIdResponse> getResponseClass() {
      return DeleteStoresByIdResponse.class;
   }
}
