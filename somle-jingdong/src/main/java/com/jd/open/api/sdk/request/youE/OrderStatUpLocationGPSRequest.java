package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.OrderStatUpLocationGPSResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OrderStatUpLocationGPSRequest extends AbstractRequest implements JdRequest<OrderStatUpLocationGPSResponse> {
   private String nowGPSY;
   private String nowGPSX;
   private String orderNo;
   private Integer enginnerId;

   public void setNowGPSY(String nowGPSY) {
      this.nowGPSY = nowGPSY;
   }

   public String getNowGPSY() {
      return this.nowGPSY;
   }

   public void setNowGPSX(String nowGPSX) {
      this.nowGPSX = nowGPSX;
   }

   public String getNowGPSX() {
      return this.nowGPSX;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setEnginnerId(Integer enginnerId) {
      this.enginnerId = enginnerId;
   }

   public Integer getEnginnerId() {
      return this.enginnerId;
   }

   public String getApiMethod() {
      return "jingdong.OrderStat.upLocationGPS";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("nowGPSY", this.nowGPSY);
      pmap.put("nowGPSX", this.nowGPSX);
      pmap.put("orderNo", this.orderNo);
      pmap.put("enginnerId", this.enginnerId);
      return JsonUtil.toJson(pmap);
   }

   public Class<OrderStatUpLocationGPSResponse> getResponseClass() {
      return OrderStatUpLocationGPSResponse.class;
   }
}
