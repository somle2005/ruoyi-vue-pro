package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeRecoveryOrderVenderQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeRecoveryOrderVenderQueryRequest extends AbstractRequest implements JdRequest<UeRecoveryOrderVenderQueryResponse> {
   private Long saleOrderNo;
   private Integer pageNumber;
   private Integer pageSize;

   public void setSaleOrderNo(Long saleOrderNo) {
      this.saleOrderNo = saleOrderNo;
   }

   public Long getSaleOrderNo() {
      return this.saleOrderNo;
   }

   public void setPageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
   }

   public Integer getPageNumber() {
      return this.pageNumber;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public String getApiMethod() {
      return "jingdong.ue.recovery.order.vender.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("saleOrderNo", this.saleOrderNo);
      pmap.put("pageNumber", this.pageNumber);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeRecoveryOrderVenderQueryResponse> getResponseClass() {
      return UeRecoveryOrderVenderQueryResponse.class;
   }
}
