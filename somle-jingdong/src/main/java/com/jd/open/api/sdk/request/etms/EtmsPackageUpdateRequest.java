package com.jd.open.api.sdk.request.etms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.etms.EtmsPackageUpdateResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EtmsPackageUpdateRequest extends AbstractRequest implements JdRequest<EtmsPackageUpdateResponse> {
   private String customerCode;
   private String deliveryId;
   private Integer packageCount;
   private String boxCodeList;

   public void setCustomerCode(String customerCode) {
      this.customerCode = customerCode;
   }

   public String getCustomerCode() {
      return this.customerCode;
   }

   public void setDeliveryId(String deliveryId) {
      this.deliveryId = deliveryId;
   }

   public String getDeliveryId() {
      return this.deliveryId;
   }

   public void setPackageCount(Integer packageCount) {
      this.packageCount = packageCount;
   }

   public Integer getPackageCount() {
      return this.packageCount;
   }

   public void setBoxCodeList(String boxCodeList) {
      this.boxCodeList = boxCodeList;
   }

   public String getBoxCodeList() {
      return this.boxCodeList;
   }

   public String getApiMethod() {
      return "jingdong.etms.package.update";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("customerCode", this.customerCode);
      pmap.put("deliveryId", this.deliveryId);
      pmap.put("packageCount", this.packageCount);
      pmap.put("boxCodeList", this.boxCodeList);
      return JsonUtil.toJson(pmap);
   }

   public Class<EtmsPackageUpdateResponse> getResponseClass() {
      return EtmsPackageUpdateResponse.class;
   }
}
