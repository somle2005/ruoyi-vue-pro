package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpStockQueryBatchChangeResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class EclpStockQueryBatchChangeRequest extends AbstractRequest implements JdRequest<EclpStockQueryBatchChangeResponse> {
   private String deptNo;
   private String allocativeCenterNo;
   private String warehouseNo;
   private String batchAttrChangeNo;
   private Date startTime;
   private Date endTime;
   private Integer startPage;
   private Integer onePageNum;

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setAllocativeCenterNo(String allocativeCenterNo) {
      this.allocativeCenterNo = allocativeCenterNo;
   }

   public String getAllocativeCenterNo() {
      return this.allocativeCenterNo;
   }

   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   public void setBatchAttrChangeNo(String batchAttrChangeNo) {
      this.batchAttrChangeNo = batchAttrChangeNo;
   }

   public String getBatchAttrChangeNo() {
      return this.batchAttrChangeNo;
   }

   public void setStartTime(Date startTime) {
      this.startTime = startTime;
   }

   public Date getStartTime() {
      return this.startTime;
   }

   public void setEndTime(Date endTime) {
      this.endTime = endTime;
   }

   public Date getEndTime() {
      return this.endTime;
   }

   public void setStartPage(Integer startPage) {
      this.startPage = startPage;
   }

   public Integer getStartPage() {
      return this.startPage;
   }

   public void setOnePageNum(Integer onePageNum) {
      this.onePageNum = onePageNum;
   }

   public Integer getOnePageNum() {
      return this.onePageNum;
   }

   public String getApiMethod() {
      return "jingdong.eclp.stock.queryBatchChange";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNo", this.deptNo);
      pmap.put("allocativeCenterNo", this.allocativeCenterNo);
      pmap.put("warehouseNo", this.warehouseNo);
      pmap.put("batchAttrChangeNo", this.batchAttrChangeNo);

      try {
         if (this.startTime != null) {
            pmap.put("startTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.startTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.endTime != null) {
            pmap.put("endTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("startPage", this.startPage);
      pmap.put("onePageNum", this.onePageNum);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpStockQueryBatchChangeResponse> getResponseClass() {
      return EclpStockQueryBatchChangeResponse.class;
   }
}
