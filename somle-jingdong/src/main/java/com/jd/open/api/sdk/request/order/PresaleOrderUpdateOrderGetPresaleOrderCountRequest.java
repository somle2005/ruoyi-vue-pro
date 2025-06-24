package com.jd.open.api.sdk.request.order;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.order.PresaleOrderUpdateOrderGetPresaleOrderCountResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class PresaleOrderUpdateOrderGetPresaleOrderCountRequest extends AbstractRequest implements JdRequest<PresaleOrderUpdateOrderGetPresaleOrderCountResponse> {
   private String userPin;
   private Long orderId;
   private String orderStatusItem;
   private Date startTime;
   private Date endTime;
   private Long skuID;
   private String openIdBuyer;
   private String xidBuyer;

   public void setUserPin(String userPin) {
      this.userPin = userPin;
   }

   public String getUserPin() {
      return this.userPin;
   }

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setOrderStatusItem(String orderStatusItem) {
      this.orderStatusItem = orderStatusItem;
   }

   public String getOrderStatusItem() {
      return this.orderStatusItem;
   }

   public void setStartTime(Date startTime) {
      this.startTime = startTime;
   }

   public Date getStartTime() {
      return this.startTime;
   }

   public void setEndTime(Date endTime) {
      this.endTime = endTime;
   }

   public Date getEndTime() {
      return this.endTime;
   }

   public void setSkuID(Long skuID) {
      this.skuID = skuID;
   }

   public Long getSkuID() {
      return this.skuID;
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
      return "jingdong.presale.order.updateOrder.getPresaleOrderCount";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("userPin", this.userPin);
      pmap.put("orderId", this.orderId);
      pmap.put("orderStatusItem", this.orderStatusItem);

      try {
         if (this.startTime != null) {
            pmap.put("startTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.startTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.endTime != null) {
            pmap.put("endTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("skuID", this.skuID);
      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      return JsonUtil.toJson(pmap);
   }

   public Class<PresaleOrderUpdateOrderGetPresaleOrderCountResponse> getResponseClass() {
      return PresaleOrderUpdateOrderGetPresaleOrderCountResponse.class;
   }
}
