package com.jd.open.api.sdk.request.xny;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.xny.EquipmentService.request.queryEquipmentsPage.TWQueryEquipmentsRpcRequest;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.xny.CarTwowheelEquipmentQueryEquipmentsPageResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CarTwowheelEquipmentQueryEquipmentsPageRequest extends AbstractRequest implements JdRequest<CarTwowheelEquipmentQueryEquipmentsPageResponse> {
   private TWQueryEquipmentsRpcRequest request;

   public String getApiMethod() {
      return "jingdong.car.twowheel.equipment.queryEquipmentsPage";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("request", this.request);
      return JsonUtil.toJson(pmap);
   }

   public Class<CarTwowheelEquipmentQueryEquipmentsPageResponse> getResponseClass() {
      return CarTwowheelEquipmentQueryEquipmentsPageResponse.class;
   }

   @JsonProperty("request")
   public void setRequest(TWQueryEquipmentsRpcRequest request) {
      this.request = request;
   }

   @JsonProperty("request")
   public TWQueryEquipmentsRpcRequest getRequest() {
      return this.request;
   }
}
