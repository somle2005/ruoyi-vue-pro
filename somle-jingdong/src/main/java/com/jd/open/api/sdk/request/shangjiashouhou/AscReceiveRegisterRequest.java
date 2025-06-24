package com.jd.open.api.sdk.request.shangjiashouhou;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.shangjiashouhou.AscReceiveRegisterResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AscReceiveRegisterRequest extends AbstractRequest implements JdRequest<AscReceiveRegisterResponse> {
   private String buId;
   private String operatePin;
   private String operateNick;
   private Long serviceId;
   private Long orderId;
   private String receivePin;
   private String receiveName;
   private Integer packingState;
   private Integer qualityState;
   private Integer invoiceRecord;
   private Integer judgmentReason;
   private Integer accessoryOrGift;
   private Integer appearanceState;
   private String receiveRemark;
   private Integer wareNum;

   public void setBuId(String buId) {
      this.buId = buId;
   }

   public String getBuId() {
      return this.buId;
   }

   public void setOperatePin(String operatePin) {
      this.operatePin = operatePin;
   }

   public String getOperatePin() {
      return this.operatePin;
   }

   public void setOperateNick(String operateNick) {
      this.operateNick = operateNick;
   }

   public String getOperateNick() {
      return this.operateNick;
   }

   public void setServiceId(Long serviceId) {
      this.serviceId = serviceId;
   }

   public Long getServiceId() {
      return this.serviceId;
   }

   public void setOrderId(Long orderId) {
      this.orderId = orderId;
   }

   public Long getOrderId() {
      return this.orderId;
   }

   public void setReceivePin(String receivePin) {
      this.receivePin = receivePin;
   }

   public String getReceivePin() {
      return this.receivePin;
   }

   public void setReceiveName(String receiveName) {
      this.receiveName = receiveName;
   }

   public String getReceiveName() {
      return this.receiveName;
   }

   public void setPackingState(Integer packingState) {
      this.packingState = packingState;
   }

   public Integer getPackingState() {
      return this.packingState;
   }

   public void setQualityState(Integer qualityState) {
      this.qualityState = qualityState;
   }

   public Integer getQualityState() {
      return this.qualityState;
   }

   public void setInvoiceRecord(Integer invoiceRecord) {
      this.invoiceRecord = invoiceRecord;
   }

   public Integer getInvoiceRecord() {
      return this.invoiceRecord;
   }

   public void setJudgmentReason(Integer judgmentReason) {
      this.judgmentReason = judgmentReason;
   }

   public Integer getJudgmentReason() {
      return this.judgmentReason;
   }

   public void setAccessoryOrGift(Integer accessoryOrGift) {
      this.accessoryOrGift = accessoryOrGift;
   }

   public Integer getAccessoryOrGift() {
      return this.accessoryOrGift;
   }

   public void setAppearanceState(Integer appearanceState) {
      this.appearanceState = appearanceState;
   }

   public Integer getAppearanceState() {
      return this.appearanceState;
   }

   public void setReceiveRemark(String receiveRemark) {
      this.receiveRemark = receiveRemark;
   }

   public String getReceiveRemark() {
      return this.receiveRemark;
   }

   public void setWareNum(Integer wareNum) {
      this.wareNum = wareNum;
   }

   public Integer getWareNum() {
      return this.wareNum;
   }

   public String getApiMethod() {
      return "jingdong.asc.receive.register";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("buId", this.buId);
      pmap.put("operatePin", this.operatePin);
      pmap.put("operateNick", this.operateNick);
      pmap.put("serviceId", this.serviceId);
      pmap.put("orderId", this.orderId);
      pmap.put("receivePin", this.receivePin);
      pmap.put("receiveName", this.receiveName);
      pmap.put("packingState", this.packingState);
      pmap.put("qualityState", this.qualityState);
      pmap.put("invoiceRecord", this.invoiceRecord);
      pmap.put("judgmentReason", this.judgmentReason);
      pmap.put("accessoryOrGift", this.accessoryOrGift);
      pmap.put("appearanceState", this.appearanceState);
      pmap.put("receiveRemark", this.receiveRemark);
      pmap.put("wareNum", this.wareNum);
      return JsonUtil.toJson(pmap);
   }

   public Class<AscReceiveRegisterResponse> getResponseClass() {
      return AscReceiveRegisterResponse.class;
   }
}
