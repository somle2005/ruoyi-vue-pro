package com.jd.open.api.sdk.request.ydy;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ydy.PullDataService.request.sensitivePullData.SensitivePullDataReqDTO;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ydy.PrintingPrintDataSensitivePullDataResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PrintingPrintDataSensitivePullDataRequest extends AbstractRequest implements JdRequest<PrintingPrintDataSensitivePullDataResponse> {
   private SensitivePullDataReqDTO param1;

   public String getApiMethod() {
      return "jingdong.printing.printData.sensitivePullData";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("param1", this.param1);
      return JsonUtil.toJson(pmap);
   }

   public Class<PrintingPrintDataSensitivePullDataResponse> getResponseClass() {
      return PrintingPrintDataSensitivePullDataResponse.class;
   }

   @JsonProperty("param1")
   public void setParam1(SensitivePullDataReqDTO param1) {
      this.param1 = param1;
   }

   @JsonProperty("param1")
   public SensitivePullDataReqDTO getParam1() {
      return this.param1;
   }
}
