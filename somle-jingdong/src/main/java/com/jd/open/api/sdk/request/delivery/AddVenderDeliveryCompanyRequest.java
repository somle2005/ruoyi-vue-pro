package com.jd.open.api.sdk.request.delivery;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.delivery.AddVenderDeliveryCompanyResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AddVenderDeliveryCompanyRequest extends AbstractRequest implements JdRequest<AddVenderDeliveryCompanyResponse> {
   private String deliveryCompanyId;
   private String name;
   private String sort;
   private String remark;

   public String getDeliveryCompanyId() {
      return this.deliveryCompanyId;
   }

   public void setDeliveryCompanyId(String deliveryCompanyId) {
      this.deliveryCompanyId = deliveryCompanyId;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getSort() {
      return this.sort;
   }

   public void setSort(String sort) {
      this.sort = sort;
   }

   public String getRemark() {
      return this.remark;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getApiMethod() {
      return "360buy.add.vender.delivery.company";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, String> map = new TreeMap();
      map.put("delivery_company_id", this.deliveryCompanyId);
      map.put("name", this.name);
      map.put("sort", this.sort);
      map.put("remark", this.remark);
      return JsonUtil.toJson(map);
   }

   public Class<AddVenderDeliveryCompanyResponse> getResponseClass() {
      return AddVenderDeliveryCompanyResponse.class;
   }
}
