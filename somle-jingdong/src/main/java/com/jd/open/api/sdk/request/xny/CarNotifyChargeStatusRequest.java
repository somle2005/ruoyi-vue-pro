package com.jd.open.api.sdk.request.xny;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.xny.CarOrderService.request.notifyChargeStatus.NotifyChargeStatusRequest;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.xny.CarNotifyChargeStatusResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CarNotifyChargeStatusRequest extends AbstractRequest implements JdRequest<CarNotifyChargeStatusResponse> {
   private Integer venderId;
   private NotifyChargeStatusRequest Data;

   public String getApiMethod() {
      return "jingdong.car.notifyChargeStatus";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderId", this.venderId);
      pmap.put("Data", this.Data);
      return JsonUtil.toJson(pmap);
   }

   public Class<CarNotifyChargeStatusResponse> getResponseClass() {
      return CarNotifyChargeStatusResponse.class;
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
   public void setData(NotifyChargeStatusRequest Data) {
      this.Data = Data;
   }

   @JsonProperty("Data")
   public NotifyChargeStatusRequest getData() {
      return this.Data;
   }
}
