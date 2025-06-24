package com.jd.open.api.sdk.request.wlycangchu;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.wlycangchu.JcloudWmsStockQuerySumResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class JcloudWmsStockQuerySumRequest extends AbstractRequest implements JdRequest<JcloudWmsStockQuerySumResponse> {
   private String skuNo;
   private String ownerNo;
   private String warehouseNo;
   private String tenantId;

   public void setSkuNo(String skuNo) {
      this.skuNo = skuNo;
   }

   public String getSkuNo() {
      return this.skuNo;
   }

   public void setOwnerNo(String ownerNo) {
      this.ownerNo = ownerNo;
   }

   public String getOwnerNo() {
      return this.ownerNo;
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
      return "jingdong.jcloud.wms.stock.query.sum";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("skuNo", this.skuNo);
      pmap.put("ownerNo", this.ownerNo);
      pmap.put("warehouseNo", this.warehouseNo);
      pmap.put("tenantId", this.tenantId);
      return JsonUtil.toJson(pmap);
   }

   public Class<JcloudWmsStockQuerySumResponse> getResponseClass() {
      return JcloudWmsStockQuerySumResponse.class;
   }
}
