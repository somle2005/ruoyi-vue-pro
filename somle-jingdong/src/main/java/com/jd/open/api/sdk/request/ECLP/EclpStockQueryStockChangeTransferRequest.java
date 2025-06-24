package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpStockQueryStockChangeTransferResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class EclpStockQueryStockChangeTransferRequest extends AbstractRequest implements JdRequest<EclpStockQueryStockChangeTransferResponse> {
   private String changeNo;
   private String changeType;
   private Date timeStart;
   private Date timeEnd;
   private String warehouseNo;
   private String tenantId;

   public void setChangeNo(String changeNo) {
      this.changeNo = changeNo;
   }

   public String getChangeNo() {
      return this.changeNo;
   }

   public void setChangeType(String changeType) {
      this.changeType = changeType;
   }

   public String getChangeType() {
      return this.changeType;
   }

   public void setTimeStart(Date timeStart) {
      this.timeStart = timeStart;
   }

   public Date getTimeStart() {
      return this.timeStart;
   }

   public void setTimeEnd(Date timeEnd) {
      this.timeEnd = timeEnd;
   }

   public Date getTimeEnd() {
      return this.timeEnd;
   }

   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   public void setTenantId(String tenantId) {
      this.tenantId = tenantId;
   }

   public String getTenantId() {
      return this.tenantId;
   }

   public String getApiMethod() {
      return "jingdong.eclp.stock.queryStockChangeTransfer";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("changeNo", this.changeNo);
      pmap.put("changeType", this.changeType);

      try {
         if (this.timeStart != null) {
            pmap.put("timeStart", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.timeStart));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.timeEnd != null) {
            pmap.put("timeEnd", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.timeEnd));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("warehouseNo", this.warehouseNo);
      pmap.put("tenantId", this.tenantId);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpStockQueryStockChangeTransferResponse> getResponseClass() {
      return EclpStockQueryStockChangeTransferResponse.class;
   }
}
