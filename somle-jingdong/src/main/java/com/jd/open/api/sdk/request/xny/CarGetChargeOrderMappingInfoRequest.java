package com.jd.open.api.sdk.request.xny;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.xny.CarGetChargeOrderMappingInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CarGetChargeOrderMappingInfoRequest extends AbstractRequest implements JdRequest<CarGetChargeOrderMappingInfoResponse> {
   private Integer venderId;
   private String startChargeSeq;

   public void setVenderId(Integer venderId) {
      this.venderId = venderId;
   }

   public Integer getVenderId() {
      return this.venderId;
   }

   public void setStartChargeSeq(String startChargeSeq) {
      this.startChargeSeq = startChargeSeq;
   }

   public String getStartChargeSeq() {
      return this.startChargeSeq;
   }

   public String getApiMethod() {
      return "jingdong.car.getChargeOrderMappingInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderId", this.venderId);
      pmap.put("startChargeSeq", this.startChargeSeq);
      return JsonUtil.toJson(pmap);
   }

   public Class<CarGetChargeOrderMappingInfoResponse> getResponseClass() {
      return CarGetChargeOrderMappingInfoResponse.class;
   }
}
