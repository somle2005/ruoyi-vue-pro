package com.jd.open.api.sdk.request.fangchan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.fangchan.ErsFangHouseResourceGetESFIdAndSkuIdByExternalIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ErsFangHouseResourceGetESFIdAndSkuIdByExternalIdRequest extends AbstractRequest implements JdRequest<ErsFangHouseResourceGetESFIdAndSkuIdByExternalIdResponse> {
   private Integer cityCode;
   private Long sourceId;

   public void setCityCode(Integer cityCode) {
      this.cityCode = cityCode;
   }

   public Integer getCityCode() {
      return this.cityCode;
   }

   public void setSourceId(Long sourceId) {
      this.sourceId = sourceId;
   }

   public Long getSourceId() {
      return this.sourceId;
   }

   public String getApiMethod() {
      return "jingdong.ers.fang.houseResource.getESFIdAndSkuIdByExternalId";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("cityCode", this.cityCode);
      pmap.put("sourceId", this.sourceId);
      return JsonUtil.toJson(pmap);
   }

   public Class<ErsFangHouseResourceGetESFIdAndSkuIdByExternalIdResponse> getResponseClass() {
      return ErsFangHouseResourceGetESFIdAndSkuIdByExternalIdResponse.class;
   }
}
