package com.jd.open.api.sdk.request.hudong;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.hudong.SuitPromoWriteOuterService.request.AddSuitPromo.ClientInfo;
import com.jd.open.api.sdk.domain.hudong.SuitPromoWriteOuterService.request.AddSuitPromo.SuitPromoDetailVO;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.AddSuitPromoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AddSuitPromoRequest extends AbstractRequest implements JdRequest<AddSuitPromoResponse> {
   private SuitPromoDetailVO suitPromoDetailVO;
   private ClientInfo clientInfo;

   public String getApiMethod() {
      return "jingdong.AddSuitPromo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("suitPromoDetailVO", this.suitPromoDetailVO);
      pmap.put("clientInfo", this.clientInfo);
      return JsonUtil.toJson(pmap);
   }

   public Class<AddSuitPromoResponse> getResponseClass() {
      return AddSuitPromoResponse.class;
   }

   @JsonProperty("suitPromoDetailVO")
   public void setSuitPromoDetailVO(SuitPromoDetailVO suitPromoDetailVO) {
      this.suitPromoDetailVO = suitPromoDetailVO;
   }

   @JsonProperty("suitPromoDetailVO")
   public SuitPromoDetailVO getSuitPromoDetailVO() {
      return this.suitPromoDetailVO;
   }

   @JsonProperty("clientInfo")
   public void setClientInfo(ClientInfo clientInfo) {
      this.clientInfo = clientInfo;
   }

   @JsonProperty("clientInfo")
   public ClientInfo getClientInfo() {
      return this.clientInfo;
   }
}
