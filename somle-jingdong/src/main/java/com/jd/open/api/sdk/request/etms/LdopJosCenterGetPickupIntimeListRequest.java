package com.jd.open.api.sdk.request.etms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.etms.LdopJosCenterGetPickupIntimeListResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LdopJosCenterGetPickupIntimeListRequest extends AbstractRequest implements JdRequest<LdopJosCenterGetPickupIntimeListResponse> {
   private String customerCode;
   private String detailAddress;

   public void setCustomerCode(String customerCode) {
      this.customerCode = customerCode;
   }

   public String getCustomerCode() {
      return this.customerCode;
   }

   public void setDetailAddress(String detailAddress) {
      this.detailAddress = detailAddress;
   }

   public String getDetailAddress() {
      return this.detailAddress;
   }

   public String getApiMethod() {
      return "jingdong.ldop.jos.center.getPickupIntimeList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("customerCode", this.customerCode);
      pmap.put("detailAddress", this.detailAddress);
      return JsonUtil.toJson(pmap);
   }

   public Class<LdopJosCenterGetPickupIntimeListResponse> getResponseClass() {
      return LdopJosCenterGetPickupIntimeListResponse.class;
   }
}
