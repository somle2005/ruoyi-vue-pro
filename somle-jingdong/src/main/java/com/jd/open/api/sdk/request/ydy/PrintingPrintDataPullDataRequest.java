package com.jd.open.api.sdk.request.ydy;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ydy.PullDataService.request.pullData.PullDataReqDTO;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ydy.PrintingPrintDataPullDataResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PrintingPrintDataPullDataRequest extends AbstractRequest implements JdRequest<PrintingPrintDataPullDataResponse> {
   private PullDataReqDTO param1;

   public String getApiMethod() {
      return "jingdong.printing.printData.pullData";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("param1", this.param1);
      return JsonUtil.toJson(pmap);
   }

   public Class<PrintingPrintDataPullDataResponse> getResponseClass() {
      return PrintingPrintDataPullDataResponse.class;
   }

   @JsonProperty("param1")
   public void setParam1(PullDataReqDTO param1) {
      this.param1 = param1;
   }

   @JsonProperty("param1")
   public PullDataReqDTO getParam1() {
      return this.param1;
   }
}
