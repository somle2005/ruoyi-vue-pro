package com.jd.open.api.sdk.request.sopstorage;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.sopstorage.StoreCountPartitionWhByIdAndStatusResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class StoreCountPartitionWhByIdAndStatusRequest extends AbstractRequest implements JdRequest<StoreCountPartitionWhByIdAndStatusResponse> {
   private int status;

   public void setStatus(int status) {
      this.status = status;
   }

   public int getStatus() {
      return this.status;
   }

   public String getApiMethod() {
      return "jingdong.store.countPartitionWhByIdAndStatus";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("status", this.status);
      return JsonUtil.toJson(pmap);
   }

   public Class<StoreCountPartitionWhByIdAndStatusResponse> getResponseClass() {
      return StoreCountPartitionWhByIdAndStatusResponse.class;
   }
}
