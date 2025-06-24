package com.jd.open.api.sdk.request.ThreePL;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.ThreePL.CarrierReceiveService.request.statusReport.CarrierStatusReportReq;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ThreePL.CarrierReceiveServiceStatusReportResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CarrierReceiveServiceStatusReportRequest extends AbstractRequest implements JdRequest<CarrierReceiveServiceStatusReportResponse> {
   private CarrierStatusReportReq carrierStatusReportReq;

   public String getApiMethod() {
      return "jingdong.CarrierReceiveService.statusReport";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("carrierStatusReportReq", this.carrierStatusReportReq);
      return JsonUtil.toJson(pmap);
   }

   public Class<CarrierReceiveServiceStatusReportResponse> getResponseClass() {
      return CarrierReceiveServiceStatusReportResponse.class;
   }

   @JsonProperty("carrierStatusReportReq")
   public void setCarrierStatusReportReq(CarrierStatusReportReq carrierStatusReportReq) {
      this.carrierStatusReportReq = carrierStatusReportReq;
   }

   @JsonProperty("carrierStatusReportReq")
   public CarrierStatusReportReq getCarrierStatusReportReq() {
      return this.carrierStatusReportReq;
   }
}
