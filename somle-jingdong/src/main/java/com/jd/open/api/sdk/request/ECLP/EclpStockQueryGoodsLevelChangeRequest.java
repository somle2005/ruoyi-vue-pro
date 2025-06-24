package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpStockQueryGoodsLevelChangeResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpStockQueryGoodsLevelChangeRequest extends AbstractRequest implements JdRequest<EclpStockQueryGoodsLevelChangeResponse> {
   private String deptNo;
   private String orderNo;
   private String outLevel;
   private String intoLevel;
   private Integer pageNo;
   private Integer pageSize;
   private String startTime;
   private String endTime;

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setOutLevel(String outLevel) {
      this.outLevel = outLevel;
   }

   public String getOutLevel() {
      return this.outLevel;
   }

   public void setIntoLevel(String intoLevel) {
      this.intoLevel = intoLevel;
   }

   public String getIntoLevel() {
      return this.intoLevel;
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

   public void setStartTime(String startTime) {
      this.startTime = startTime;
   }

   public String getStartTime() {
      return this.startTime;
   }

   public void setEndTime(String endTime) {
      this.endTime = endTime;
   }

   public String getEndTime() {
      return this.endTime;
   }

   public String getApiMethod() {
      return "jingdong.eclp.stock.queryGoodsLevelChange";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNo", this.deptNo);
      pmap.put("orderNo", this.orderNo);
      pmap.put("outLevel", this.outLevel);
      pmap.put("intoLevel", this.intoLevel);
      pmap.put("pageNo", this.pageNo);
      pmap.put("pageSize", this.pageSize);
      pmap.put("startTime", this.startTime);
      pmap.put("endTime", this.endTime);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpStockQueryGoodsLevelChangeResponse> getResponseClass() {
      return EclpStockQueryGoodsLevelChangeResponse.class;
   }
}
