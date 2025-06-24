package com.jd.open.api.sdk.request.fangchan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.fangchan.ErsFangUnShelveByExternalIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ErsFangUnShelveByExternalIdRequest extends AbstractRequest implements JdRequest<ErsFangUnShelveByExternalIdResponse> {
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
      return "jingdong.ers.fang.unShelveByExternalId";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("cityCode", this.cityCode);
      pmap.put("sourceId", this.sourceId);
      return JsonUtil.toJson(pmap);
   }

   public Class<ErsFangUnShelveByExternalIdResponse> getResponseClass() {
      return ErsFangUnShelveByExternalIdResponse.class;
   }
}
