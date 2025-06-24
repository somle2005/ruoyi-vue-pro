package com.jd.open.api.sdk.request.afsservice;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.afsservice.AfsserviceServicedetailListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AfsserviceServicedetailListRequest extends AbstractRequest implements JdRequest<AfsserviceServicedetailListResponse> {
   private Long afsServiceId;

   public void setAfsServiceId(Long afsServiceId) {
      this.afsServiceId = afsServiceId;
   }

   public Long getAfsServiceId() {
      return this.afsServiceId;
   }

   public String getApiMethod() {
      return "jingdong.afsservice.servicedetail.list";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("afsServiceId", this.afsServiceId);
      return JsonUtil.toJson(pmap);
   }

   public Class<AfsserviceServicedetailListResponse> getResponseClass() {
      return AfsserviceServicedetailListResponse.class;
   }
}
