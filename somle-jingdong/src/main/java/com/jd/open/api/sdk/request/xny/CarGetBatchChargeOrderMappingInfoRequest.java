package com.jd.open.api.sdk.request.xny;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.xny.CarGetBatchChargeOrderMappingInfoResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CarGetBatchChargeOrderMappingInfoRequest extends AbstractRequest implements JdRequest<CarGetBatchChargeOrderMappingInfoResponse> {
   private Integer venderId;
   private List<String> startChargeSeqList;

   public String getApiMethod() {
      return "jingdong.car.getBatchChargeOrderMappingInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderId", this.venderId);
      pmap.put("startChargeSeqList", this.startChargeSeqList);
      return JsonUtil.toJson(pmap);
   }

   public Class<CarGetBatchChargeOrderMappingInfoResponse> getResponseClass() {
      return CarGetBatchChargeOrderMappingInfoResponse.class;
   }

   @JsonProperty("venderId")
   public void setVenderId(Integer venderId) {
      this.venderId = venderId;
   }

   @JsonProperty("venderId")
   public Integer getVenderId() {
      return this.venderId;
   }

   @JsonProperty("startChargeSeqList")
   public void setStartChargeSeqList(List<String> startChargeSeqList) {
      this.startChargeSeqList = startChargeSeqList;
   }

   @JsonProperty("startChargeSeqList")
   public List<String> getStartChargeSeqList() {
      return this.startChargeSeqList;
   }
}
