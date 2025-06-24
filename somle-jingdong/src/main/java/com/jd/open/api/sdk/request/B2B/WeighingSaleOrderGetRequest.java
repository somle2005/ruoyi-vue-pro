package com.jd.open.api.sdk.request.B2B;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.B2B.WeighingSaleOrderGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WeighingSaleOrderGetRequest extends AbstractRequest implements JdRequest<WeighingSaleOrderGetResponse> {
   private Integer buId;
   private String buyerPin;
   private Long jdOrderId;
   private String openIdBuyer;
   private String xidBuyer;

   public void setBuId(Integer buId) {
      this.buId = buId;
   }

   public Integer getBuId() {
      return this.buId;
   }

   public void setBuyerPin(String buyerPin) {
      this.buyerPin = buyerPin;
   }

   public String getBuyerPin() {
      return this.buyerPin;
   }

   public void setJdOrderId(Long jdOrderId) {
      this.jdOrderId = jdOrderId;
   }

   public Long getJdOrderId() {
      return this.jdOrderId;
   }

   public void setOpenIdBuyer(String openIdBuyer) {
      this.openIdBuyer = openIdBuyer;
   }

   public String getOpenIdBuyer() {
      return this.openIdBuyer;
   }

   public void setXidBuyer(String xidBuyer) {
      this.xidBuyer = xidBuyer;
   }

   public String getXidBuyer() {
      return this.xidBuyer;
   }

   public String getApiMethod() {
      return "jingdong.weighing.sale.order.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("buId", this.buId);
      pmap.put("buyerPin", this.buyerPin);
      pmap.put("jdOrderId", this.jdOrderId);
      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      return JsonUtil.toJson(pmap);
   }

   public Class<WeighingSaleOrderGetResponse> getResponseClass() {
      return WeighingSaleOrderGetResponse.class;
   }
}
