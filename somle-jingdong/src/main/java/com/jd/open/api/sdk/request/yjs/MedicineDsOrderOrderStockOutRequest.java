package com.jd.open.api.sdk.request.yjs;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.yjs.MedicineDsOrderOrderStockOutResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MedicineDsOrderOrderStockOutRequest extends AbstractRequest implements JdRequest<MedicineDsOrderOrderStockOutResponse> {
   private String carrierName;
   private String orderId;
   private String waybillCode;
   private String operateMan;
   private Long carrierId;

   public void setCarrierName(String carrierName) {
      this.carrierName = carrierName;
   }

   public String getCarrierName() {
      return this.carrierName;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   public String getWaybillCode() {
      return this.waybillCode;
   }

   public void setOperateMan(String operateMan) {
      this.operateMan = operateMan;
   }

   public String getOperateMan() {
      return this.operateMan;
   }

   public void setCarrierId(Long carrierId) {
      this.carrierId = carrierId;
   }

   public Long getCarrierId() {
      return this.carrierId;
   }

   public String getApiMethod() {
      return "jingdong.medicine.ds.order.orderStockOut";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("carrierName", this.carrierName);
      pmap.put("orderId", this.orderId);
      pmap.put("waybillCode", this.waybillCode);
      pmap.put("operateMan", this.operateMan);
      pmap.put("carrierId", this.carrierId);
      return JsonUtil.toJson(pmap);
   }

   public Class<MedicineDsOrderOrderStockOutResponse> getResponseClass() {
      return MedicineDsOrderOrderStockOutResponse.class;
   }
}
