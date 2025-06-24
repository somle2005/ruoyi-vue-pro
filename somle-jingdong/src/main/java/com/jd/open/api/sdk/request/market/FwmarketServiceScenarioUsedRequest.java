package com.jd.open.api.sdk.request.market;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.market.FwmarketServiceScenarioUsedResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class FwmarketServiceScenarioUsedRequest extends AbstractRequest implements JdRequest<FwmarketServiceScenarioUsedResponse> {
   private String pitCode;
   private String serviceCode;
   private String belongBizId;
   private String requestUuid;

   public void setPitCode(String pitCode) {
      this.pitCode = pitCode;
   }

   public String getPitCode() {
      return this.pitCode;
   }

   public void setServiceCode(String serviceCode) {
      this.serviceCode = serviceCode;
   }

   public String getServiceCode() {
      return this.serviceCode;
   }

   public void setBelongBizId(String belongBizId) {
      this.belongBizId = belongBizId;
   }

   public String getBelongBizId() {
      return this.belongBizId;
   }

   public void setRequestUuid(String requestUuid) {
      this.requestUuid = requestUuid;
   }

   public String getRequestUuid() {
      return this.requestUuid;
   }

   public String getApiMethod() {
      return "jingdong.fwmarket.service.scenario.used";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("pitCode", this.pitCode);
      pmap.put("serviceCode", this.serviceCode);
      pmap.put("belongBizId", this.belongBizId);
      pmap.put("requestUuid", this.requestUuid);
      return JsonUtil.toJson(pmap);
   }

   public Class<FwmarketServiceScenarioUsedResponse> getResponseClass() {
      return FwmarketServiceScenarioUsedResponse.class;
   }
}
