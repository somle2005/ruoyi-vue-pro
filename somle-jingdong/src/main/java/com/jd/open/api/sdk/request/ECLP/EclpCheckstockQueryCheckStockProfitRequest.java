package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpCheckstockQueryCheckStockProfitResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpCheckstockQueryCheckStockProfitRequest extends AbstractRequest implements JdRequest<EclpCheckstockQueryCheckStockProfitResponse> {
   private String deptNo;
   private String checkStockNos;
   private int pageNo;
   private int pageSize;
   private String startTime;
   private String endTime;
   private int returnIsvLotattrs;

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setCheckStockNos(String checkStockNos) {
      this.checkStockNos = checkStockNos;
   }

   public String getCheckStockNos() {
      return this.checkStockNos;
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

   public void setReturnIsvLotattrs(int returnIsvLotattrs) {
      this.returnIsvLotattrs = returnIsvLotattrs;
   }

   public int getReturnIsvLotattrs() {
      return this.returnIsvLotattrs;
   }

   public String getApiMethod() {
      return "jingdong.eclp.checkstock.queryCheckStockProfit";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNo", this.deptNo);
      pmap.put("checkStockNos", this.checkStockNos);
      pmap.put("pageNo", this.pageNo);
      pmap.put("pageSize", this.pageSize);
      pmap.put("startTime", this.startTime);
      pmap.put("endTime", this.endTime);
      pmap.put("returnIsvLotattrs", this.returnIsvLotattrs);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpCheckstockQueryCheckStockProfitResponse> getResponseClass() {
      return EclpCheckstockQueryCheckStockProfitResponse.class;
   }
}
