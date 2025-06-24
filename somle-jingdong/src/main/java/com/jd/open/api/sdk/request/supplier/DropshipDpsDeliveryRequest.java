package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.DropshipDpsDeliveryResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class DropshipDpsDeliveryRequest extends AbstractRequest implements JdRequest<DropshipDpsDeliveryResponse> {
   private Long customOrderId;
   private Integer carrierId;
   private String carrierBusinessName;
   private String shipNo;
   private Date estimateDate;
   private String carrierPhone;
   private String source;

   public void setCustomOrderId(Long customOrderId) {
      this.customOrderId = customOrderId;
   }

   public Long getCustomOrderId() {
      return this.customOrderId;
   }

   public void setCarrierId(Integer carrierId) {
      this.carrierId = carrierId;
   }

   public Integer getCarrierId() {
      return this.carrierId;
   }

   public void setCarrierBusinessName(String carrierBusinessName) {
      this.carrierBusinessName = carrierBusinessName;
   }

   public String getCarrierBusinessName() {
      return this.carrierBusinessName;
   }

   public void setShipNo(String shipNo) {
      this.shipNo = shipNo;
   }

   public String getShipNo() {
      return this.shipNo;
   }

   public void setEstimateDate(Date estimateDate) {
      this.estimateDate = estimateDate;
   }

   public Date getEstimateDate() {
      return this.estimateDate;
   }

   public void setCarrierPhone(String carrierPhone) {
      this.carrierPhone = carrierPhone;
   }

   public String getCarrierPhone() {
      return this.carrierPhone;
   }

   public void setSource(String source) {
      this.source = source;
   }

   public String getSource() {
      return this.source;
   }

   public String getApiMethod() {
      return "jingdong.dropship.dps.delivery";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("customOrderId", this.customOrderId);
      pmap.put("carrierId", this.carrierId);
      pmap.put("carrierBusinessName", this.carrierBusinessName);
      pmap.put("shipNo", this.shipNo);

      try {
         if (this.estimateDate != null) {
            pmap.put("estimateDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.estimateDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("carrierPhone", this.carrierPhone);
      pmap.put("source", this.source);
      return JsonUtil.toJson(pmap);
   }

   public Class<DropshipDpsDeliveryResponse> getResponseClass() {
      return DropshipDpsDeliveryResponse.class;
   }
}
