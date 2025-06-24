package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeRecoveryOrderOfflineSettleResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeRecoveryOrderOfflineSettleRequest extends AbstractRequest implements JdRequest<UeRecoveryOrderOfflineSettleResponse> {
   private String appid;
   private String code;
   private String orderNo;
   private String secondPic;
   private String settle;

   public void setAppid(String appid) {
      this.appid = appid;
   }

   public String getAppid() {
      return this.appid;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public String getCode() {
      return this.code;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setSecondPic(String secondPic) {
      this.secondPic = secondPic;
   }

   public String getSecondPic() {
      return this.secondPic;
   }

   public void setSettle(String settle) {
      this.settle = settle;
   }

   public String getSettle() {
      return this.settle;
   }

   public String getApiMethod() {
      return "jingdong.ue.recovery.order.offlineSettle";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("appid", this.appid);
      pmap.put("code", this.code);
      pmap.put("orderNo", this.orderNo);
      pmap.put("secondPic", this.secondPic);
      pmap.put("settle", this.settle);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeRecoveryOrderOfflineSettleResponse> getResponseClass() {
      return UeRecoveryOrderOfflineSettleResponse.class;
   }
}
