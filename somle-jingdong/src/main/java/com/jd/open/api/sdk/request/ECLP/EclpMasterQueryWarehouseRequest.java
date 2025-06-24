package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpMasterQueryWarehouseResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpMasterQueryWarehouseRequest extends AbstractRequest implements JdRequest<EclpMasterQueryWarehouseResponse> {
   private String deptNo;
   private String warehouseNos;
   private String status;

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setWarehouseNos(String warehouseNos) {
      this.warehouseNos = warehouseNos;
   }

   public String getWarehouseNos() {
      return this.warehouseNos;
   }

   public void setStatus(String status) {
      this.status = status;
   }

   public String getStatus() {
      return this.status;
   }

   public String getApiMethod() {
      return "jingdong.eclp.master.queryWarehouse";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNo", this.deptNo);
      pmap.put("warehouseNos", this.warehouseNos);
      pmap.put("status", this.status);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpMasterQueryWarehouseResponse> getResponseClass() {
      return EclpMasterQueryWarehouseResponse.class;
   }
}
