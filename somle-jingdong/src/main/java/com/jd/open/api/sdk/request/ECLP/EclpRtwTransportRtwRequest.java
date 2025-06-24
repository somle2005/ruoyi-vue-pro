package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpRtwTransportRtwResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpRtwTransportRtwRequest extends AbstractRequest implements JdRequest<EclpRtwTransportRtwResponse> {
   private String eclpSoNo;
   private String eclpRtwNo;
   private String isvRtwNum;
   private String warehouseNo;
   private String reson;
   private Byte orderInType;
   private String customField;

   public void setEclpSoNo(String eclpSoNo) {
      this.eclpSoNo = eclpSoNo;
   }

   public String getEclpSoNo() {
      return this.eclpSoNo;
   }

   public void setEclpRtwNo(String eclpRtwNo) {
      this.eclpRtwNo = eclpRtwNo;
   }

   public String getEclpRtwNo() {
      return this.eclpRtwNo;
   }

   public void setIsvRtwNum(String isvRtwNum) {
      this.isvRtwNum = isvRtwNum;
   }

   public String getIsvRtwNum() {
      return this.isvRtwNum;
   }

   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   public void setReson(String reson) {
      this.reson = reson;
   }

   public String getReson() {
      return this.reson;
   }

   public void setOrderInType(Byte orderInType) {
      this.orderInType = orderInType;
   }

   public Byte getOrderInType() {
      return this.orderInType;
   }

   public void setCustomField(String customField) {
      this.customField = customField;
   }

   public String getCustomField() {
      return this.customField;
   }

   public String getApiMethod() {
      return "jingdong.eclp.rtw.transportRtw";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("eclpSoNo", this.eclpSoNo);
      pmap.put("eclpRtwNo", this.eclpRtwNo);
      pmap.put("isvRtwNum", this.isvRtwNum);
      pmap.put("warehouseNo", this.warehouseNo);
      pmap.put("reson", this.reson);
      pmap.put("orderInType", this.orderInType);
      pmap.put("customField", this.customField);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpRtwTransportRtwResponse> getResponseClass() {
      return EclpRtwTransportRtwResponse.class;
   }
}
