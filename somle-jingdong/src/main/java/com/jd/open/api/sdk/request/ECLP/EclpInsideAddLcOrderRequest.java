package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpInsideAddLcOrderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpInsideAddLcOrderRequest extends AbstractRequest implements JdRequest<EclpInsideAddLcOrderResponse> {
   private String sellerLcNo;
   private String sellerNo;
   private String wareHouseNo;
   private String deptNo;
   private String outsideLogicStock;
   private String insideLogicStock;
   private Byte lack;
   private String orderLine;
   private String isvGoodsNo;
   private String outGoodsLevel;
   private String inGoodsLevel;
   private String planQty;

   public void setSellerLcNo(String sellerLcNo) {
      this.sellerLcNo = sellerLcNo;
   }

   public String getSellerLcNo() {
      return this.sellerLcNo;
   }

   public void setSellerNo(String sellerNo) {
      this.sellerNo = sellerNo;
   }

   public String getSellerNo() {
      return this.sellerNo;
   }

   public void setWareHouseNo(String wareHouseNo) {
      this.wareHouseNo = wareHouseNo;
   }

   public String getWareHouseNo() {
      return this.wareHouseNo;
   }

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setOutsideLogicStock(String outsideLogicStock) {
      this.outsideLogicStock = outsideLogicStock;
   }

   public String getOutsideLogicStock() {
      return this.outsideLogicStock;
   }

   public void setInsideLogicStock(String insideLogicStock) {
      this.insideLogicStock = insideLogicStock;
   }

   public String getInsideLogicStock() {
      return this.insideLogicStock;
   }

   public void setLack(Byte lack) {
      this.lack = lack;
   }

   public Byte getLack() {
      return this.lack;
   }

   public void setOrderLine(String orderLine) {
      this.orderLine = orderLine;
   }

   public String getOrderLine() {
      return this.orderLine;
   }

   public void setIsvGoodsNo(String isvGoodsNo) {
      this.isvGoodsNo = isvGoodsNo;
   }

   public String getIsvGoodsNo() {
      return this.isvGoodsNo;
   }

   public void setOutGoodsLevel(String outGoodsLevel) {
      this.outGoodsLevel = outGoodsLevel;
   }

   public String getOutGoodsLevel() {
      return this.outGoodsLevel;
   }

   public void setInGoodsLevel(String inGoodsLevel) {
      this.inGoodsLevel = inGoodsLevel;
   }

   public String getInGoodsLevel() {
      return this.inGoodsLevel;
   }

   public void setPlanQty(String planQty) {
      this.planQty = planQty;
   }

   public String getPlanQty() {
      return this.planQty;
   }

   public String getApiMethod() {
      return "jingdong.eclp.inside.addLcOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("sellerLcNo", this.sellerLcNo);
      pmap.put("sellerNo", this.sellerNo);
      pmap.put("wareHouseNo", this.wareHouseNo);
      pmap.put("deptNo", this.deptNo);
      pmap.put("outsideLogicStock", this.outsideLogicStock);
      pmap.put("insideLogicStock", this.insideLogicStock);
      pmap.put("lack", this.lack);
      pmap.put("orderLine", this.orderLine);
      pmap.put("isvGoodsNo", this.isvGoodsNo);
      pmap.put("outGoodsLevel", this.outGoodsLevel);
      pmap.put("inGoodsLevel", this.inGoodsLevel);
      pmap.put("planQty", this.planQty);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpInsideAddLcOrderResponse> getResponseClass() {
      return EclpInsideAddLcOrderResponse.class;
   }
}
