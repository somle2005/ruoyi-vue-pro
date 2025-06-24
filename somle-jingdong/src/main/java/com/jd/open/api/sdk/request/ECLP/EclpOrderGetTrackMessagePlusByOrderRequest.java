package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpOrderGetTrackMessagePlusByOrderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpOrderGetTrackMessagePlusByOrderRequest extends AbstractRequest implements JdRequest<EclpOrderGetTrackMessagePlusByOrderResponse> {
   private String customerCode;
   private String bizCode;
   private int type;

   public void setCustomerCode(String customerCode) {
      this.customerCode = customerCode;
   }

   public String getCustomerCode() {
      return this.customerCode;
   }

   public void setBizCode(String bizCode) {
      this.bizCode = bizCode;
   }

   public String getBizCode() {
      return this.bizCode;
   }

   public void setType(int type) {
      this.type = type;
   }

   public int getType() {
      return this.type;
   }

   public String getApiMethod() {
      return "jingdong.eclp.order.getTrackMessagePlusByOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("customerCode", this.customerCode);
      pmap.put("bizCode", this.bizCode);
      pmap.put("type", this.type);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpOrderGetTrackMessagePlusByOrderResponse> getResponseClass() {
      return EclpOrderGetTrackMessagePlusByOrderResponse.class;
   }
}
