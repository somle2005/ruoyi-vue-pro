package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.PopOtoChecknumberinfoGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopOtoChecknumberinfoGetRequest extends AbstractRequest implements JdRequest<PopOtoChecknumberinfoGetResponse> {
   private Long orderId;
   private String cardNumber;
   private String pwdNumber;

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setCardNumber(String cardNumber) {
      this.cardNumber = cardNumber;
   }

   public String getCardNumber() {
      return this.cardNumber;
   }

   public void setPwdNumber(String pwdNumber) {
      this.pwdNumber = pwdNumber;
   }

   public String getPwdNumber() {
      return this.pwdNumber;
   }

   public String getApiMethod() {
      return "jingdong.pop.oto.checknumberinfo.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("order_id", this.orderId);
      pmap.put("card_number", this.cardNumber);
      pmap.put("pwd_number", this.pwdNumber);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopOtoChecknumberinfoGetResponse> getResponseClass() {
      return PopOtoChecknumberinfoGetResponse.class;
   }
}
