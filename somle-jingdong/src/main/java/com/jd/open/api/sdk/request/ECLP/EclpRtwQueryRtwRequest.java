package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpRtwQueryRtwResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpRtwQueryRtwRequest extends AbstractRequest implements JdRequest<EclpRtwQueryRtwResponse> {
   private String eclpSoNo;
   private String eclpRtwNo;
   private String isvRtwNum;
   private String warehouseNo;
   private String reson;
   private Byte orderInType;
   private Boolean queryBatAttrFlag;
   private String startCreateTime;
   private String endCreateTime;
   private String outStoreNo;
   private String startFinishTime;
   private String endFinishTime;

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

   public void setQueryBatAttrFlag(Boolean queryBatAttrFlag) {
      this.queryBatAttrFlag = queryBatAttrFlag;
   }

   public Boolean getQueryBatAttrFlag() {
      return this.queryBatAttrFlag;
   }

   public void setStartCreateTime(String startCreateTime) {
      this.startCreateTime = startCreateTime;
   }

   public String getStartCreateTime() {
      return this.startCreateTime;
   }

   public void setEndCreateTime(String endCreateTime) {
      this.endCreateTime = endCreateTime;
   }

   public String getEndCreateTime() {
      return this.endCreateTime;
   }

   public void setOutStoreNo(String outStoreNo) {
      this.outStoreNo = outStoreNo;
   }

   public String getOutStoreNo() {
      return this.outStoreNo;
   }

   public void setStartFinishTime(String startFinishTime) {
      this.startFinishTime = startFinishTime;
   }

   public String getStartFinishTime() {
      return this.startFinishTime;
   }

   public void setEndFinishTime(String endFinishTime) {
      this.endFinishTime = endFinishTime;
   }

   public String getEndFinishTime() {
      return this.endFinishTime;
   }

   public String getApiMethod() {
      return "jingdong.eclp.rtw.queryRtw";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("eclpSoNo", this.eclpSoNo);
      pmap.put("eclpRtwNo", this.eclpRtwNo);
      pmap.put("isvRtwNum", this.isvRtwNum);
      pmap.put("warehouseNo", this.warehouseNo);
      pmap.put("reson", this.reson);
      pmap.put("orderInType", this.orderInType);
      pmap.put("queryBatAttrFlag", this.queryBatAttrFlag);
      pmap.put("startCreateTime", this.startCreateTime);
      pmap.put("endCreateTime", this.endCreateTime);
      pmap.put("outStoreNo", this.outStoreNo);
      pmap.put("startFinishTime", this.startFinishTime);
      pmap.put("endFinishTime", this.endFinishTime);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpRtwQueryRtwResponse> getResponseClass() {
      return EclpRtwQueryRtwResponse.class;
   }
}
