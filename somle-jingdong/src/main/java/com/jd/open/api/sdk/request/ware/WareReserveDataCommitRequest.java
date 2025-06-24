package com.jd.open.api.sdk.request.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ware.ReserveProductJosService.request.commit.OpenAccessContext;
import com.jd.open.api.sdk.domain.ware.ReserveProductJosService.request.commit.SetReserveProductParam;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareReserveDataCommitResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class WareReserveDataCommitRequest extends AbstractRequest implements JdRequest<WareReserveDataCommitResponse> {
   private OpenAccessContext openAccessContext;
   private List<SetReserveProductParam> setReserveProductParamList;

   public String getApiMethod() {
      return "jingdong.ware.reserve.data.commit";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("openAccessContext", this.openAccessContext);
      pmap.put("setReserveProductParamList", this.setReserveProductParamList);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareReserveDataCommitResponse> getResponseClass() {
      return WareReserveDataCommitResponse.class;
   }

   @JsonProperty("openAccessContext")
   public void setOpenAccessContext(OpenAccessContext openAccessContext) {
      this.openAccessContext = openAccessContext;
   }

   @JsonProperty("openAccessContext")
   public OpenAccessContext getOpenAccessContext() {
      return this.openAccessContext;
   }

   @JsonProperty("setReserveProductParamList")
   public void setSetReserveProductParamList(List<SetReserveProductParam> setReserveProductParamList) {
      this.setReserveProductParamList = setReserveProductParamList;
   }

   @JsonProperty("setReserveProductParamList")
   public List<SetReserveProductParam> getSetReserveProductParamList() {
      return this.setReserveProductParamList;
   }
}
