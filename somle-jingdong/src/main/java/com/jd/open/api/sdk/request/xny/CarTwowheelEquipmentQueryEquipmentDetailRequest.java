package com.jd.open.api.sdk.request.xny;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.xny.EquipmentService.request.queryEquipmentDetail.TWEquipmentsDetailRpcRequest;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.xny.CarTwowheelEquipmentQueryEquipmentDetailResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CarTwowheelEquipmentQueryEquipmentDetailRequest extends AbstractRequest implements JdRequest<CarTwowheelEquipmentQueryEquipmentDetailResponse> {
   private TWEquipmentsDetailRpcRequest request;

   public String getApiMethod() {
      return "jingdong.car.twowheel.equipment.queryEquipmentDetail";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("request", this.request);
      return JsonUtil.toJson(pmap);
   }

   public Class<CarTwowheelEquipmentQueryEquipmentDetailResponse> getResponseClass() {
      return CarTwowheelEquipmentQueryEquipmentDetailResponse.class;
   }

   @JsonProperty("request")
   public void setRequest(TWEquipmentsDetailRpcRequest request) {
      this.request = request;
   }

   @JsonProperty("request")
   public TWEquipmentsDetailRpcRequest getRequest() {
      return this.request;
   }
}
