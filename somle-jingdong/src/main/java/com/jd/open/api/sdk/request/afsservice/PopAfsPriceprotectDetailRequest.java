package com.jd.open.api.sdk.request.afsservice;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.afsservice.PopAfsPriceprotectDetailResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopAfsPriceprotectDetailRequest extends AbstractRequest implements JdRequest<PopAfsPriceprotectDetailResponse> {
   private Integer pricePrtctType;
   private Long uuid;

   public void setPricePrtctType(Integer pricePrtctType) {
      this.pricePrtctType = pricePrtctType;
   }

   public Integer getPricePrtctType() {
      return this.pricePrtctType;
   }

   public void setUuid(Long uuid) {
      this.uuid = uuid;
   }

   public Long getUuid() {
      return this.uuid;
   }

   public String getApiMethod() {
      return "jingdong.pop.afs.priceprotect.detail";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("pricePrtctType", this.pricePrtctType);
      pmap.put("uuid", this.uuid);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopAfsPriceprotectDetailResponse> getResponseClass() {
      return PopAfsPriceprotectDetailResponse.class;
   }
}
