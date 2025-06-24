package com.jd.open.api.sdk.request.fangchan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.fangchan.ErsFangHouseResourceBatchSynHouseResourceImgResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ErsFangHouseResourceBatchSynHouseResourceImgRequest extends AbstractRequest implements JdRequest<ErsFangHouseResourceBatchSynHouseResourceImgResponse> {
   private String paramStrin;

   public void setParamStrin(String paramStrin) {
      this.paramStrin = paramStrin;
   }

   public String getParamStrin() {
      return this.paramStrin;
   }

   public String getApiMethod() {
      return "jingdong.ers.fang.houseResource.batchSynHouseResourceImg";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("paramStrin", this.paramStrin);
      return JsonUtil.toJson(pmap);
   }

   public Class<ErsFangHouseResourceBatchSynHouseResourceImgResponse> getResponseClass() {
      return ErsFangHouseResourceBatchSynHouseResourceImgResponse.class;
   }
}
