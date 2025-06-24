package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcConfirmpurchaseorderResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class VcConfirmpurchaseorderRequest extends AbstractRequest implements JdRequest<VcConfirmpurchaseorderResponse> {
   private Long orderId;
   private Date deliveryTime;
   private String wareId;
   private String confirmNum;
   private String backExplanation;
   private String backExplanationType;
   private String deliverCenterId;

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setDeliveryTime(Date deliveryTime) {
      this.deliveryTime = deliveryTime;
   }

   public Date getDeliveryTime() {
      return this.deliveryTime;
   }

   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   public String getWareId() {
      return this.wareId;
   }

   public void setConfirmNum(String confirmNum) {
      this.confirmNum = confirmNum;
   }

   public String getConfirmNum() {
      return this.confirmNum;
   }

   public void setBackExplanation(String backExplanation) {
      this.backExplanation = backExplanation;
   }

   public String getBackExplanation() {
      return this.backExplanation;
   }

   public void setBackExplanationType(String backExplanationType) {
      this.backExplanationType = backExplanationType;
   }

   public String getBackExplanationType() {
      return this.backExplanationType;
   }

   public void setDeliverCenterId(String deliverCenterId) {
      this.deliverCenterId = deliverCenterId;
   }

   public String getDeliverCenterId() {
      return this.deliverCenterId;
   }

   public String getApiMethod() {
      return "jingdong.vc.confirmpurchaseorder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("order_id", this.orderId);

      try {
         if (this.deliveryTime != null) {
            pmap.put("delivery_time", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.deliveryTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("ware_id", this.wareId);
      pmap.put("confirm_num", this.confirmNum);
      pmap.put("back_explanation", this.backExplanation);
      pmap.put("back_explanation_type", this.backExplanationType);
      pmap.put("deliver_center_id", this.deliverCenterId);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcConfirmpurchaseorderResponse> getResponseClass() {
      return VcConfirmpurchaseorderResponse.class;
   }
}
