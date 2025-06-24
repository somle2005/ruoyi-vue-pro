package com.jd.open.api.sdk.request.fangchan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.fangchan.ErsFangHouseResourceDeleteImgByHouseResourceIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ErsFangHouseResourceDeleteImgByHouseResourceIdRequest extends AbstractRequest implements JdRequest<ErsFangHouseResourceDeleteImgByHouseResourceIdResponse> {
   private Integer cityCode;
   private Long pSourceId;

   public void setCityCode(Integer cityCode) {
      this.cityCode = cityCode;
   }

   public Integer getCityCode() {
      return this.cityCode;
   }

   public void setPSourceId(Long pSourceId) {
      this.pSourceId = pSourceId;
   }

   public Long getPSourceId() {
      return this.pSourceId;
   }

   public String getApiMethod() {
      return "jingdong.ers.fang.houseResource.deleteImgByHouseResourceId";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("cityCode", this.cityCode);
      pmap.put("pSourceId", this.pSourceId);
      return JsonUtil.toJson(pmap);
   }

   public Class<ErsFangHouseResourceDeleteImgByHouseResourceIdResponse> getResponseClass() {
      return ErsFangHouseResourceDeleteImgByHouseResourceIdResponse.class;
   }
}
