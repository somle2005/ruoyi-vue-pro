package com.jd.open.api.sdk.request.shangjiashouhou;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.shangjiashouhou.AscProcessOfflineChangeResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AscProcessOfflineChangeRequest extends AbstractRequest implements JdRequest<AscProcessOfflineChangeResponse> {
   private String buId;
   private String operatePin;
   private String operateNick;
   private String operateRemark;
   private Long serviceId;
   private Long orderId;
   private Integer sysVersion;
   private Integer opFlag;
   private Integer partExpressId;
   private Integer shipWayId;
   private String shipWayName;
   private String expressCode;
   private String relationBillId;
   private String wareType;
   private Integer partSrc;
   private String extJsonStr;
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

   public void setOperateRemark(String operateRemark) {
      this.operateRemark = operateRemark;
   }

   public String getOperateRemark() {
      return this.operateRemark;
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

   public void setSysVersion(Integer sysVersion) {
      this.sysVersion = sysVersion;
   }

   public Integer getSysVersion() {
      return this.sysVersion;
   }

   public void setOpFlag(Integer opFlag) {
      this.opFlag = opFlag;
   }

   public Integer getOpFlag() {
      return this.opFlag;
   }

   public void setPartExpressId(Integer partExpressId) {
      this.partExpressId = partExpressId;
   }

   public Integer getPartExpressId() {
      return this.partExpressId;
   }

   public void setShipWayId(Integer shipWayId) {
      this.shipWayId = shipWayId;
   }

   public Integer getShipWayId() {
      return this.shipWayId;
   }

   public void setShipWayName(String shipWayName) {
      this.shipWayName = shipWayName;
   }

   public String getShipWayName() {
      return this.shipWayName;
   }

   public void setExpressCode(String expressCode) {
      this.expressCode = expressCode;
   }

   public String getExpressCode() {
      return this.expressCode;
   }

   public void setRelationBillId(String relationBillId) {
      this.relationBillId = relationBillId;
   }

   public String getRelationBillId() {
      return this.relationBillId;
   }

   public void setWareType(String wareType) {
      this.wareType = wareType;
   }

   public String getWareType() {
      return this.wareType;
   }

   public void setPartSrc(Integer partSrc) {
      this.partSrc = partSrc;
   }

   public Integer getPartSrc() {
      return this.partSrc;
   }

   public void setExtJsonStr(String extJsonStr) {
      this.extJsonStr = extJsonStr;
   }

   public String getExtJsonStr() {
      return this.extJsonStr;
   }

   public void setWareNum(Integer wareNum) {
      this.wareNum = wareNum;
   }

   public Integer getWareNum() {
      return this.wareNum;
   }

   public String getApiMethod() {
      return "jingdong.asc.process.offline.change";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("buId", this.buId);
      pmap.put("operatePin", this.operatePin);
      pmap.put("operateNick", this.operateNick);
      pmap.put("operateRemark", this.operateRemark);
      pmap.put("serviceId", this.serviceId);
      pmap.put("orderId", this.orderId);
      pmap.put("sysVersion", this.sysVersion);
      pmap.put("opFlag", this.opFlag);
      pmap.put("partExpressId", this.partExpressId);
      pmap.put("shipWayId", this.shipWayId);
      pmap.put("shipWayName", this.shipWayName);
      pmap.put("expressCode", this.expressCode);
      pmap.put("relationBillId", this.relationBillId);
      pmap.put("wareType", this.wareType);
      pmap.put("partSrc", this.partSrc);
      pmap.put("extJsonStr", this.extJsonStr);
      pmap.put("wareNum", this.wareNum);
      return JsonUtil.toJson(pmap);
   }

   public Class<AscProcessOfflineChangeResponse> getResponseClass() {
      return AscProcessOfflineChangeResponse.class;
   }
}
