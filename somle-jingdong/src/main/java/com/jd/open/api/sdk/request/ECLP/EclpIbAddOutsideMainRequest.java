package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpIbAddOutsideMainResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpIbAddOutsideMainRequest extends AbstractRequest implements JdRequest<EclpIbAddOutsideMainResponse> {
   private Byte outsideSource;
   private String selfLiftCode;
   private String warehouseNoIn;
   private String isvOutsideNo;
   private String shipperNo;
   private String deptNo;
   private String warehouseNoOut;
   private String goodsNo;
   private String planNum;
   private String batAttrListJson;

   public void setOutsideSource(Byte outsideSource) {
      this.outsideSource = outsideSource;
   }

   public Byte getOutsideSource() {
      return this.outsideSource;
   }

   public void setSelfLiftCode(String selfLiftCode) {
      this.selfLiftCode = selfLiftCode;
   }

   public String getSelfLiftCode() {
      return this.selfLiftCode;
   }

   public void setWarehouseNoIn(String warehouseNoIn) {
      this.warehouseNoIn = warehouseNoIn;
   }

   public String getWarehouseNoIn() {
      return this.warehouseNoIn;
   }

   public void setIsvOutsideNo(String isvOutsideNo) {
      this.isvOutsideNo = isvOutsideNo;
   }

   public String getIsvOutsideNo() {
      return this.isvOutsideNo;
   }

   public void setShipperNo(String shipperNo) {
      this.shipperNo = shipperNo;
   }

   public String getShipperNo() {
      return this.shipperNo;
   }

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setWarehouseNoOut(String warehouseNoOut) {
      this.warehouseNoOut = warehouseNoOut;
   }

   public String getWarehouseNoOut() {
      return this.warehouseNoOut;
   }

   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   public String getGoodsNo() {
      return this.goodsNo;
   }

   public void setPlanNum(String planNum) {
      this.planNum = planNum;
   }

   public String getPlanNum() {
      return this.planNum;
   }

   public void setBatAttrListJson(String batAttrListJson) {
      this.batAttrListJson = batAttrListJson;
   }

   public String getBatAttrListJson() {
      return this.batAttrListJson;
   }

   public String getApiMethod() {
      return "jingdong.eclp.ib.addOutsideMain";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("outsideSource", this.outsideSource);
      pmap.put("selfLiftCode", this.selfLiftCode);
      pmap.put("warehouseNoIn", this.warehouseNoIn);
      pmap.put("isvOutsideNo", this.isvOutsideNo);
      pmap.put("shipperNo", this.shipperNo);
      pmap.put("deptNo", this.deptNo);
      pmap.put("warehouseNoOut", this.warehouseNoOut);
      pmap.put("goodsNo", this.goodsNo);
      pmap.put("planNum", this.planNum);
      pmap.put("batAttrListJson", this.batAttrListJson);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpIbAddOutsideMainResponse> getResponseClass() {
      return EclpIbAddOutsideMainResponse.class;
   }
}
