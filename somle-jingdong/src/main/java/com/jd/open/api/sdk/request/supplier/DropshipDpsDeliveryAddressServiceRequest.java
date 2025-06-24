package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.DropshipDpsDeliveryAddressServiceResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DropshipDpsDeliveryAddressServiceRequest extends AbstractRequest implements JdRequest<DropshipDpsDeliveryAddressServiceResponse> {
   private Integer addressId;

   public void setAddressId(Integer addressId) {
      this.addressId = addressId;
   }

   public Integer getAddressId() {
      return this.addressId;
   }

   public String getApiMethod() {
      return "jingdong.dropship.dps.deliveryAddressService";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("addressId", this.addressId);
      return JsonUtil.toJson(pmap);
   }

   public Class<DropshipDpsDeliveryAddressServiceResponse> getResponseClass() {
      return DropshipDpsDeliveryAddressServiceResponse.class;
   }
}
