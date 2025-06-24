package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpGoodsQueryGoodsInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpGoodsQueryGoodsInfoRequest extends AbstractRequest implements JdRequest<EclpGoodsQueryGoodsInfoResponse> {
   private String deptNo;
   private String isvGoodsNos;
   private String goodsNos;
   private String queryType;
   private String barcodes;
   private int pageNo;
   private int pageSize;

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setIsvGoodsNos(String isvGoodsNos) {
      this.isvGoodsNos = isvGoodsNos;
   }

   public String getIsvGoodsNos() {
      return this.isvGoodsNos;
   }

   public void setGoodsNos(String goodsNos) {
      this.goodsNos = goodsNos;
   }

   public String getGoodsNos() {
      return this.goodsNos;
   }

   public void setQueryType(String queryType) {
      this.queryType = queryType;
   }

   public String getQueryType() {
      return this.queryType;
   }

   public void setBarcodes(String barcodes) {
      this.barcodes = barcodes;
   }

   public String getBarcodes() {
      return this.barcodes;
   }

   public void setPageNo(int pageNo) {
      this.pageNo = pageNo;
   }

   public int getPageNo() {
      return this.pageNo;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public String getApiMethod() {
      return "jingdong.eclp.goods.queryGoodsInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNo", this.deptNo);
      pmap.put("isvGoodsNos", this.isvGoodsNos);
      pmap.put("goodsNos", this.goodsNos);
      pmap.put("queryType", this.queryType);
      pmap.put("barcodes", this.barcodes);
      pmap.put("pageNo", this.pageNo);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpGoodsQueryGoodsInfoResponse> getResponseClass() {
      return EclpGoodsQueryGoodsInfoResponse.class;
   }
}
