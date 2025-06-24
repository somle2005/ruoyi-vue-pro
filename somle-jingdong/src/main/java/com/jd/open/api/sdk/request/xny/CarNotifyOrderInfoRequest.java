package com.jd.open.api.sdk.request.xny;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.xny.CarOrderService.request.notifyOrderInfo.NotifyOrderRequest;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.xny.CarNotifyOrderInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CarNotifyOrderInfoRequest extends AbstractRequest implements JdRequest<CarNotifyOrderInfoResponse> {
   private Integer venderId;
   private NotifyOrderRequest Data;

   public String getApiMethod() {
      return "jingdong.car.notifyOrderInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderId", this.venderId);
      pmap.put("Data", this.Data);
      return JsonUtil.toJson(pmap);
   }

   public Class<CarNotifyOrderInfoResponse> getResponseClass() {
      return CarNotifyOrderInfoResponse.class;
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
   public void setData(NotifyOrderRequest Data) {
      this.Data = Data;
   }

   @JsonProperty("Data")
   public NotifyOrderRequest getData() {
      return this.Data;
   }
}
