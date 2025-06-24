package com.jd.open.api.sdk.request.xny;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.xny.CarStationService.request.notifyStationInfo.StationsInfoRequest;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.xny.CarNotifyStationInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CarNotifyStationInfoRequest extends AbstractRequest implements JdRequest<CarNotifyStationInfoResponse> {
   private Integer venderId;
   private StationsInfoRequest Data;

   public String getApiMethod() {
      return "jingdong.car.notifyStationInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderId", this.venderId);
      pmap.put("Data", this.Data);
      return JsonUtil.toJson(pmap);
   }

   public Class<CarNotifyStationInfoResponse> getResponseClass() {
      return CarNotifyStationInfoResponse.class;
   }

   @JsonProperty("venderId")
   public void setVenderId(Integer venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Integer getVenderId() {
      return this.venderId;
   }

   @JsonProperty("Data")
   public void setData(StationsInfoRequest Data) {
      this.Data = Data;
   }

   @JsonProperty("Data")
   public StationsInfoRequest getData() {
      return this.Data;
   }
}
