package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpStockSetShopStockFixedResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpStockSetShopStockFixedRequest extends AbstractRequest implements JdRequest<EclpStockSetShopStockFixedResponse> {
   private String requestId;
   private String deptNo;
   private String shopNo;
   private String warehouseNo;
   private int stockNum;
   private String goodsNo;
   private int shopType;
   private String opUser;

   public void setRequestId(String requestId) {
      this.requestId = requestId;
   }

   public String getRequestId() {
      return this.requestId;
   }

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setShopNo(String shopNo) {
      this.shopNo = shopNo;
   }

   public String getShopNo() {
      return this.shopNo;
   }

   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   public void setStockNum(int stockNum) {
      this.stockNum = stockNum;
   }

   public int getStockNum() {
      return this.stockNum;
   }

   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   public String getGoodsNo() {
      return this.goodsNo;
   }

   public void setShopType(int shopType) {
      this.shopType = shopType;
   }

   public int getShopType() {
      return this.shopType;
   }

   public void setOpUser(String opUser) {
      this.opUser = opUser;
   }

   public String getOpUser() {
      return this.opUser;
   }

   public String getApiMethod() {
      return "jingdong.eclp.stock.setShopStockFixed";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("requestId", this.requestId);
      pmap.put("deptNo", this.deptNo);
      pmap.put("shopNo", this.shopNo);
      pmap.put("warehouseNo", this.warehouseNo);
      pmap.put("stockNum", this.stockNum);
      pmap.put("goodsNo", this.goodsNo);
      pmap.put("shopType", this.shopType);
      pmap.put("opUser", this.opUser);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpStockSetShopStockFixedResponse> getResponseClass() {
      return EclpStockSetShopStockFixedResponse.class;
   }
}
