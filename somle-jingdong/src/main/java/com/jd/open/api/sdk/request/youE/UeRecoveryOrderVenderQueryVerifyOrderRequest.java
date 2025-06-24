package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeRecoveryOrderVenderQueryVerifyOrderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeRecoveryOrderVenderQueryVerifyOrderRequest extends AbstractRequest implements JdRequest<UeRecoveryOrderVenderQueryVerifyOrderResponse> {
   private String date;
   private Integer pageNumber;
   private Integer pageSize;
   private String orderNo;

   public void setDate(String date) {
      this.date = date;
   }

   public String getDate() {
      return this.date;
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

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public String getApiMethod() {
      return "jingdong.ue.recovery.order.vender.queryVerifyOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("date", this.date);
      pmap.put("pageNumber", this.pageNumber);
      pmap.put("pageSize", this.pageSize);
      pmap.put("orderNo", this.orderNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeRecoveryOrderVenderQueryVerifyOrderResponse> getResponseClass() {
      return UeRecoveryOrderVenderQueryVerifyOrderResponse.class;
   }
}
