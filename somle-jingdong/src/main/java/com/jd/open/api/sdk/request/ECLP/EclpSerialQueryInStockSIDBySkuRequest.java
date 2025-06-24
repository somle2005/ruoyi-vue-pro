package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpSerialQueryInStockSIDBySkuResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpSerialQueryInStockSIDBySkuRequest extends AbstractRequest implements JdRequest<EclpSerialQueryInStockSIDBySkuResponse> {
   private String goodsNo;
   private Integer pageNo;
   private Integer pageSize;
   private Byte queryType;

   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   public String getGoodsNo() {
      return this.goodsNo;
   }

   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   public Integer getPageNo() {
      return this.pageNo;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setQueryType(Byte queryType) {
      this.queryType = queryType;
   }

   public Byte getQueryType() {
      return this.queryType;
   }

   public String getApiMethod() {
      return "jingdong.eclp.serial.queryInStockSIDBySku";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("goodsNo", this.goodsNo);
      pmap.put("pageNo", this.pageNo);
      pmap.put("pageSize", this.pageSize);
      pmap.put("queryType", this.queryType);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpSerialQueryInStockSIDBySkuResponse> getResponseClass() {
      return EclpSerialQueryInStockSIDBySkuResponse.class;
   }
}
