package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.OrderVenderRemarkUpdateResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OrderVenderRemarkUpdateRequest extends AbstractRequest implements JdRequest<OrderVenderRemarkUpdateResponse> {
   private String orderId;
   private String remark;
   private String tradeNo;
   private String flag;

   public String getApiMethod() {
      return "360buy.order.vender.remark.update";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, String> map = new TreeMap();
      map.put("order_id", this.orderId);
      map.put("remark", this.remark);
      map.put("trade_no", this.tradeNo);
      map.put("flag", this.flag);
      return JsonUtil.toJson(map);
   }

   public Class<OrderVenderRemarkUpdateResponse> getResponseClass() {
      return OrderVenderRemarkUpdateResponse.class;
   }

   public String getTradeNo() {
      return this.tradeNo;
   }

   public void setTradeNo(String tradeNo) {
      this.tradeNo = tradeNo;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getRemark() {
      return this.remark;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getFlag() {
      return this.flag;
   }

   public void setFlag(String flag) {
      this.flag = flag;
   }
}
