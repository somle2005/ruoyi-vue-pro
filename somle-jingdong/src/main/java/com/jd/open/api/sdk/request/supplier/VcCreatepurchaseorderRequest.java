package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcCreatepurchaseorderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcCreatepurchaseorderRequest extends AbstractRequest implements JdRequest<VcCreatepurchaseorderResponse> {
   private Integer orderDeliverCenterId;
   private String purchaserErpCode;
   private String orderRemark;
   private String wareId;
   private String wareDeliverCenterId;
   private String originalNum;
   private String wareRemark;

   public void setOrderDeliverCenterId(Integer orderDeliverCenterId) {
      this.orderDeliverCenterId = orderDeliverCenterId;
   }

   public Integer getOrderDeliverCenterId() {
      return this.orderDeliverCenterId;
   }

   public void setPurchaserErpCode(String purchaserErpCode) {
      this.purchaserErpCode = purchaserErpCode;
   }

   public String getPurchaserErpCode() {
      return this.purchaserErpCode;
   }

   public void setOrderRemark(String orderRemark) {
      this.orderRemark = orderRemark;
   }

   public String getOrderRemark() {
      return this.orderRemark;
   }

   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   public String getWareId() {
      return this.wareId;
   }

   public void setWareDeliverCenterId(String wareDeliverCenterId) {
      this.wareDeliverCenterId = wareDeliverCenterId;
   }

   public String getWareDeliverCenterId() {
      return this.wareDeliverCenterId;
   }

   public void setOriginalNum(String originalNum) {
      this.originalNum = originalNum;
   }

   public String getOriginalNum() {
      return this.originalNum;
   }

   public void setWareRemark(String wareRemark) {
      this.wareRemark = wareRemark;
   }

   public String getWareRemark() {
      return this.wareRemark;
   }

   public String getApiMethod() {
      return "jingdong.vc.createpurchaseorder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("order_deliver_center_id", this.orderDeliverCenterId);
      pmap.put("purchaser_erp_code", this.purchaserErpCode);
      pmap.put("order_remark", this.orderRemark);
      pmap.put("ware_id", this.wareId);
      pmap.put("ware_deliver_center_id", this.wareDeliverCenterId);
      pmap.put("original_num", this.originalNum);
      pmap.put("ware_remark", this.wareRemark);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcCreatepurchaseorderResponse> getResponseClass() {
      return VcCreatepurchaseorderResponse.class;
   }
}
