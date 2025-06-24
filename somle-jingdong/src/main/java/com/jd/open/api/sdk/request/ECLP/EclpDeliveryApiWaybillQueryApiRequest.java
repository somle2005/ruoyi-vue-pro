package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpDeliveryApiWaybillQueryApiResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpDeliveryApiWaybillQueryApiRequest extends AbstractRequest implements JdRequest<EclpDeliveryApiWaybillQueryApiResponse> {
   private String waybillCode;
   private String orderNo;
   private Integer settleType;
   private String traderCode;

   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   public String getWaybillCode() {
      return this.waybillCode;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setSettleType(Integer settleType) {
      this.settleType = settleType;
   }

   public Integer getSettleType() {
      return this.settleType;
   }

   public void setTraderCode(String traderCode) {
      this.traderCode = traderCode;
   }

   public String getTraderCode() {
      return this.traderCode;
   }

   public String getApiMethod() {
      return "jingdong.eclp.delivery.api.WaybillQueryApi";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("waybillCode", this.waybillCode);
      pmap.put("orderNo", this.orderNo);
      pmap.put("settleType", this.settleType);
      pmap.put("traderCode", this.traderCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpDeliveryApiWaybillQueryApiResponse> getResponseClass() {
      return EclpDeliveryApiWaybillQueryApiResponse.class;
   }
}
