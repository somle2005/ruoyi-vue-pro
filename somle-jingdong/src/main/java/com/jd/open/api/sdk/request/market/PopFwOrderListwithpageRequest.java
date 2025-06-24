package com.jd.open.api.sdk.request.market;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.market.PopFwOrderListwithpageResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopFwOrderListwithpageRequest extends AbstractRequest implements JdRequest<PopFwOrderListwithpageResponse> {
   private Integer pageSize;
   private String fwsPin;
   private Integer currentPage;
   private String serviceCode;

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setFwsPin(String fwsPin) {
      this.fwsPin = fwsPin;
   }

   public String getFwsPin() {
      return this.fwsPin;
   }

   public void setCurrentPage(Integer currentPage) {
      this.currentPage = currentPage;
   }

   public Integer getCurrentPage() {
      return this.currentPage;
   }

   public void setServiceCode(String serviceCode) {
      this.serviceCode = serviceCode;
   }

   public String getServiceCode() {
      return this.serviceCode;
   }

   public String getApiMethod() {
      return "jingdong.pop.fw.order.listwithpage";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("pageSize", this.pageSize);
      pmap.put("fwsPin", this.fwsPin);
      pmap.put("currentPage", this.currentPage);
      pmap.put("serviceCode", this.serviceCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopFwOrderListwithpageResponse> getResponseClass() {
      return PopFwOrderListwithpageResponse.class;
   }
}
