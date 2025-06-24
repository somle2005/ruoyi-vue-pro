package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpRtwCancelRtwOrderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpRtwCancelRtwOrderRequest extends AbstractRequest implements JdRequest<EclpRtwCancelRtwOrderResponse> {
   private String isvRtwNum;
   private String eclpRtwNum;
   private String cancelReson;
   private String ownerNo;
   private Byte orderInType;

   public void setIsvRtwNum(String isvRtwNum) {
      this.isvRtwNum = isvRtwNum;
   }

   public String getIsvRtwNum() {
      return this.isvRtwNum;
   }

   public void setEclpRtwNum(String eclpRtwNum) {
      this.eclpRtwNum = eclpRtwNum;
   }

   public String getEclpRtwNum() {
      return this.eclpRtwNum;
   }

   public void setCancelReson(String cancelReson) {
      this.cancelReson = cancelReson;
   }

   public String getCancelReson() {
      return this.cancelReson;
   }

   public void setOwnerNo(String ownerNo) {
      this.ownerNo = ownerNo;
   }

   public String getOwnerNo() {
      return this.ownerNo;
   }

   public void setOrderInType(Byte orderInType) {
      this.orderInType = orderInType;
   }

   public Byte getOrderInType() {
      return this.orderInType;
   }

   public String getApiMethod() {
      return "jingdong.eclp.rtw.cancelRtwOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("isvRtwNum", this.isvRtwNum);
      pmap.put("eclpRtwNum", this.eclpRtwNum);
      pmap.put("cancelReson", this.cancelReson);
      pmap.put("ownerNo", this.ownerNo);
      pmap.put("orderInType", this.orderInType);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpRtwCancelRtwOrderResponse> getResponseClass() {
      return EclpRtwCancelRtwOrderResponse.class;
   }
}
