package com.jd.open.api.sdk.request.delivery;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.delivery.DeleteVenderDeliveryCompanyResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class DeleteVenderDeliveryCompanyRequest extends AbstractRequest implements JdRequest<DeleteVenderDeliveryCompanyResponse> {
   private String deliveryCompanyId;

   public String getDeliveryCompanyId() {
      return this.deliveryCompanyId;
   }

   public void setDeliveryCompanyId(String deliveryCompanyId) {
      this.deliveryCompanyId = deliveryCompanyId;
   }

   public String getApiMethod() {
      return "360buy.delete.vender.delivery.company";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, String> map = new TreeMap();
      map.put("delivery_company_id", this.deliveryCompanyId);
      return JsonUtil.toJson(map);
   }

   public Class<DeleteVenderDeliveryCompanyResponse> getResponseClass() {
      return DeleteVenderDeliveryCompanyResponse.class;
   }
}
