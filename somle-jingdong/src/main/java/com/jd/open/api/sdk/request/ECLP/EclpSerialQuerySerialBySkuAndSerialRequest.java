package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpSerialQuerySerialBySkuAndSerialResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpSerialQuerySerialBySkuAndSerialRequest extends AbstractRequest implements JdRequest<EclpSerialQuerySerialBySkuAndSerialResponse> {
   private String goodsNo;
   private String goodsSID;
   private Byte queryType;

   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   public String getGoodsNo() {
      return this.goodsNo;
   }

   public void setGoodsSID(String goodsSID) {
      this.goodsSID = goodsSID;
   }

   public String getGoodsSID() {
      return this.goodsSID;
   }

   public void setQueryType(Byte queryType) {
      this.queryType = queryType;
   }

   public Byte getQueryType() {
      return this.queryType;
   }

   public String getApiMethod() {
      return "jingdong.eclp.serial.querySerialBySkuAndSerial";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("goodsNo", this.goodsNo);
      pmap.put("goodsSID", this.goodsSID);
      pmap.put("queryType", this.queryType);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpSerialQuerySerialBySkuAndSerialResponse> getResponseClass() {
      return EclpSerialQuerySerialBySkuAndSerialResponse.class;
   }
}
