package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.Jd3csOrderInsReceiveOrdersResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Jd3csOrderInsReceiveOrdersRequest extends AbstractRequest implements JdRequest<Jd3csOrderInsReceiveOrdersResponse> {
   private String venderCode;
   private String appId;
   private String createBy;
   private String orderNo;
   private String opType;

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setCreateBy(String createBy) {
      this.createBy = createBy;
   }

   public String getCreateBy() {
      return this.createBy;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setOpType(String opType) {
      this.opType = opType;
   }

   public String getOpType() {
      return this.opType;
   }

   public String getApiMethod() {
      return "jingdong.jd3cs.order.insReceiveOrders";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderCode", this.venderCode);
      pmap.put("appId", this.appId);
      pmap.put("createBy", this.createBy);
      pmap.put("orderNo", this.orderNo);
      pmap.put("opType", this.opType);
      return JsonUtil.toJson(pmap);
   }

   public Class<Jd3csOrderInsReceiveOrdersResponse> getResponseClass() {
      return Jd3csOrderInsReceiveOrdersResponse.class;
   }
}
