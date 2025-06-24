package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeRecoveryOrderRecyclerCancelResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeRecoveryOrderRecyclerCancelRequest extends AbstractRequest implements JdRequest<UeRecoveryOrderRecyclerCancelResponse> {
   private String appid;
   private String recyclerCancelInfo;
   private String orderNo;
   private String code;

   public void setAppid(String appid) {
      this.appid = appid;
   }

   public String getAppid() {
      return this.appid;
   }

   public void setRecyclerCancelInfo(String recyclerCancelInfo) {
      this.recyclerCancelInfo = recyclerCancelInfo;
   }

   public String getRecyclerCancelInfo() {
      return this.recyclerCancelInfo;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public String getCode() {
      return this.code;
   }

   public String getApiMethod() {
      return "jingdong.ue.recovery.order.recyclerCancel";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appid", this.appid);
      pmap.put("recyclerCancelInfo", this.recyclerCancelInfo);
      pmap.put("orderNo", this.orderNo);
      pmap.put("code", this.code);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeRecoveryOrderRecyclerCancelResponse> getResponseClass() {
      return UeRecoveryOrderRecyclerCancelResponse.class;
   }
}
