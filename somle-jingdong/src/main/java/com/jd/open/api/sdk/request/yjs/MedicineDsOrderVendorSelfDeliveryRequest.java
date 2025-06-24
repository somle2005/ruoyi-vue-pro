package com.jd.open.api.sdk.request.yjs;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.yjs.MedicineDsOrderVendorSelfDeliveryResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class MedicineDsOrderVendorSelfDeliveryRequest extends AbstractRequest implements JdRequest<MedicineDsOrderVendorSelfDeliveryResponse> {
   private String orderId;
   private String deliverymanPhone;
   private String deliveryman;
   private String operateMan;
   private Date reqTimestamp;

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setDeliverymanPhone(String deliverymanPhone) {
      this.deliverymanPhone = deliverymanPhone;
   }

   public String getDeliverymanPhone() {
      return this.deliverymanPhone;
   }

   public void setDeliveryman(String deliveryman) {
      this.deliveryman = deliveryman;
   }

   public String getDeliveryman() {
      return this.deliveryman;
   }

   public void setOperateMan(String operateMan) {
      this.operateMan = operateMan;
   }

   public String getOperateMan() {
      return this.operateMan;
   }

   public void setReqTimestamp(Date reqTimestamp) {
      this.reqTimestamp = reqTimestamp;
   }

   public Date getReqTimestamp() {
      return this.reqTimestamp;
   }

   public String getApiMethod() {
      return "jingdong.medicine.ds.order.vendorSelfDelivery";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderId", this.orderId);
      pmap.put("deliverymanPhone", this.deliverymanPhone);
      pmap.put("deliveryman", this.deliveryman);
      pmap.put("operateMan", this.operateMan);

      try {
         if (this.reqTimestamp != null) {
            pmap.put("reqTimestamp", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.reqTimestamp));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      return JsonUtil.toJson(pmap);
   }

   public Class<MedicineDsOrderVendorSelfDeliveryResponse> getResponseClass() {
      return MedicineDsOrderVendorSelfDeliveryResponse.class;
   }
}
