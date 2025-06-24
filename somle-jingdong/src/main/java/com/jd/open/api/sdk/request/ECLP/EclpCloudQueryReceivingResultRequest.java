package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpCloudQueryReceivingResultResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpCloudQueryReceivingResultRequest extends AbstractRequest implements JdRequest<EclpCloudQueryReceivingResultResponse> {
   private String receiptNo;
   private String billType;
   private String warehouseNo;
   private String tenantId;

   public void setReceiptNo(String receiptNo) {
      this.receiptNo = receiptNo;
   }

   public String getReceiptNo() {
      return this.receiptNo;
   }

   public void setBillType(String billType) {
      this.billType = billType;
   }

   public String getBillType() {
      return this.billType;
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
      return "jingdong.eclp.cloud.queryReceivingResult";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("receiptNo", this.receiptNo);
      pmap.put("billType", this.billType);
      pmap.put("warehouseNo", this.warehouseNo);
      pmap.put("tenantId", this.tenantId);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpCloudQueryReceivingResultResponse> getResponseClass() {
      return EclpCloudQueryReceivingResultResponse.class;
   }
}
