package com.jd.open.api.sdk.request.etms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.etms.EtmsWaybillcodeGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EtmsWaybillcodeGetRequest extends AbstractRequest implements JdRequest<EtmsWaybillcodeGetResponse> {
   private String preNum;
   private String customerCode;
   private Integer orderType;

   public void setPreNum(String preNum) {
      this.preNum = preNum;
   }

   public String getPreNum() {
      return this.preNum;
   }

   public void setCustomerCode(String customerCode) {
      this.customerCode = customerCode;
   }

   public String getCustomerCode() {
      return this.customerCode;
   }

   public void setOrderType(Integer orderType) {
      this.orderType = orderType;
   }

   public Integer getOrderType() {
      return this.orderType;
   }

   public String getApiMethod() {
      return "jingdong.etms.waybillcode.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("preNum", this.preNum);
      pmap.put("customerCode", this.customerCode);
      pmap.put("orderType", this.orderType);
      return JsonUtil.toJson(pmap);
   }

   public Class<EtmsWaybillcodeGetResponse> getResponseClass() {
      return EtmsWaybillcodeGetResponse.class;
   }
}
