package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpSerialQueryPageSerialByOwnerNoAndConditionResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class EclpSerialQueryPageSerialByOwnerNoAndConditionRequest extends AbstractRequest implements JdRequest<EclpSerialQueryPageSerialByOwnerNoAndConditionResponse> {
   private Byte billType;
   private String ownerNo;
   private Date startTime;
   private Date endTime;
   private String warehouseNo;
   private Integer pageNo;
   private Integer pageSize;
   private Byte queryType;

   public void setBillType(Byte billType) {
      this.billType = billType;
   }

   public Byte getBillType() {
      return this.billType;
   }

   public void setOwnerNo(String ownerNo) {
      this.ownerNo = ownerNo;
   }

   public String getOwnerNo() {
      return this.ownerNo;
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

   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   public String getWarehouseNo() {
      return this.warehouseNo;
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
      return "jingdong.eclp.serial.queryPageSerialByOwnerNoAndCondition";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("billType", this.billType);
      pmap.put("ownerNo", this.ownerNo);

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

      pmap.put("warehouseNo", this.warehouseNo);
      pmap.put("pageNo", this.pageNo);
      pmap.put("pageSize", this.pageSize);
      pmap.put("queryType", this.queryType);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpSerialQueryPageSerialByOwnerNoAndConditionResponse> getResponseClass() {
      return EclpSerialQueryPageSerialByOwnerNoAndConditionResponse.class;
   }
}
