package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.PopOtoCheckNumberConsumerResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopOtoCheckNumberConsumerRequest extends AbstractRequest implements JdRequest<PopOtoCheckNumberConsumerResponse> {
   private Long orderId;
   private String cardNumber;
   private String pwdUmber;
   private Long shopId;
   private String shopName;
   private Integer codeType;

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

   public void setPwdUmber(String pwdUmber) {
      this.pwdUmber = pwdUmber;
   }

   public String getPwdUmber() {
      return this.pwdUmber;
   }

   public void setShopId(Long shopId) {
      this.shopId = shopId;
   }

   public Long getShopId() {
      return this.shopId;
   }

   public void setShopName(String shopName) {
      this.shopName = shopName;
   }

   public String getShopName() {
      return this.shopName;
   }

   public void setCodeType(Integer codeType) {
      this.codeType = codeType;
   }

   public Integer getCodeType() {
      return this.codeType;
   }

   public String getApiMethod() {
      return "jingdong.pop.oto.CheckNumber.consumer";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("order_id", this.orderId);
      pmap.put("card_number", this.cardNumber);
      pmap.put("pwd_umber", this.pwdUmber);
      pmap.put("shop_id", this.shopId);
      pmap.put("shop_name", this.shopName);
      pmap.put("code_type", this.codeType);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopOtoCheckNumberConsumerResponse> getResponseClass() {
      return PopOtoCheckNumberConsumerResponse.class;
   }
}
