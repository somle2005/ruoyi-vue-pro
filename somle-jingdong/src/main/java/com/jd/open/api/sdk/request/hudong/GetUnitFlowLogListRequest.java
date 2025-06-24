package com.jd.open.api.sdk.request.hudong;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.hudong.SuitPromoReadOuterService.request.getUnitFlowLogList.ClientInfo;
import com.jd.open.api.sdk.domain.hudong.SuitPromoReadOuterService.request.getUnitFlowLogList.PromoQueryVO;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.hudong.GetUnitFlowLogListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class GetUnitFlowLogListRequest extends AbstractRequest implements JdRequest<GetUnitFlowLogListResponse> {
   private PromoQueryVO promoQueryVO;
   private ClientInfo clientInfo;

   public String getApiMethod() {
      return "jingdong.getUnitFlowLogList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("promoQueryVO", this.promoQueryVO);
      pmap.put("clientInfo", this.clientInfo);
      return JsonUtil.toJson(pmap);
   }

   public Class<GetUnitFlowLogListResponse> getResponseClass() {
      return GetUnitFlowLogListResponse.class;
   }

   @JsonProperty("promoQueryVO")
   public void setPromoQueryVO(PromoQueryVO promoQueryVO) {
      this.promoQueryVO = promoQueryVO;
   }

   @JsonProperty("promoQueryVO")
   public PromoQueryVO getPromoQueryVO() {
      return this.promoQueryVO;
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
