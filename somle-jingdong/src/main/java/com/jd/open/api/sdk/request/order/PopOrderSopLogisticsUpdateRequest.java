package com.jd.open.api.sdk.request.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.order.IGlobalOrderProduceServiceForJos.request.update.LogisticsGlobalModel;
import com.jd.open.api.sdk.domain.order.IGlobalOrderProduceServiceForJos.request.update.OneGlobalOrderModelNoLogistic;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.PopOrderSopLogisticsUpdateResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PopOrderSopLogisticsUpdateRequest extends AbstractRequest implements JdRequest<PopOrderSopLogisticsUpdateResponse> {
   private OneGlobalOrderModelNoLogistic oneGlobalOrderModelNoLogistic;
   private List<LogisticsGlobalModel> logisticsGlobalModelList;

   public String getApiMethod() {
      return "jingdong.pop.order.sop.logistics.update";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("oneGlobalOrderModelNoLogistic", this.oneGlobalOrderModelNoLogistic);
      pmap.put("logisticsGlobalModelList", this.logisticsGlobalModelList);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopOrderSopLogisticsUpdateResponse> getResponseClass() {
      return PopOrderSopLogisticsUpdateResponse.class;
   }

   @JsonProperty("oneGlobalOrderModelNoLogistic")
   public void setOneGlobalOrderModelNoLogistic(OneGlobalOrderModelNoLogistic oneGlobalOrderModelNoLogistic) {
      this.oneGlobalOrderModelNoLogistic = oneGlobalOrderModelNoLogistic;
   }

   @JsonProperty("oneGlobalOrderModelNoLogistic")
   public OneGlobalOrderModelNoLogistic getOneGlobalOrderModelNoLogistic() {
      return this.oneGlobalOrderModelNoLogistic;
   }

   @JsonProperty("logisticsGlobalModelList")
   public void setLogisticsGlobalModelList(List<LogisticsGlobalModel> logisticsGlobalModelList) {
      this.logisticsGlobalModelList = logisticsGlobalModelList;
   }

   @JsonProperty("logisticsGlobalModelList")
   public List<LogisticsGlobalModel> getLogisticsGlobalModelList() {
      return this.logisticsGlobalModelList;
   }
}
