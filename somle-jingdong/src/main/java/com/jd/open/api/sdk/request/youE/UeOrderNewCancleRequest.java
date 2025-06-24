package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeOrderNewCancleResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeOrderNewCancleRequest extends AbstractRequest implements JdRequest<UeOrderNewCancleResponse> {
   private String orderNo;
   private String venderCode;
   private String cancleReason;
   private String appid;
   private Integer cancleType;

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setCancleReason(String cancleReason) {
      this.cancleReason = cancleReason;
   }

   public String getCancleReason() {
      return this.cancleReason;
   }

   public void setAppid(String appid) {
      this.appid = appid;
   }

   public String getAppid() {
      return this.appid;
   }

   public void setCancleType(Integer cancleType) {
      this.cancleType = cancleType;
   }

   public Integer getCancleType() {
      return this.cancleType;
   }

   public String getApiMethod() {
      return "jingdong.ue.order.new.cancle";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderNo", this.orderNo);
      pmap.put("venderCode", this.venderCode);
      pmap.put("cancleReason", this.cancleReason);
      pmap.put("appid", this.appid);
      pmap.put("cancleType", this.cancleType);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeOrderNewCancleResponse> getResponseClass() {
      return UeOrderNewCancleResponse.class;
   }
}
