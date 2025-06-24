package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.EdiRealtimeinventoryQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EdiRealtimeinventoryQueryRequest extends AbstractRequest implements JdRequest<EdiRealtimeinventoryQueryResponse> {
   private String operatorErp;
   private String jdSku;
   private String vendorCode;

   public void setOperatorErp(String operatorErp) {
      this.operatorErp = operatorErp;
   }

   public String getOperatorErp() {
      return this.operatorErp;
   }

   public void setJdSku(String jdSku) {
      this.jdSku = jdSku;
   }

   public String getJdSku() {
      return this.jdSku;
   }

   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   public String getVendorCode() {
      return this.vendorCode;
   }

   public String getApiMethod() {
      return "jingdong.edi.realtimeinventory.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("operatorErp", this.operatorErp);
      pmap.put("jdSku", this.jdSku);
      pmap.put("vendorCode", this.vendorCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<EdiRealtimeinventoryQueryResponse> getResponseClass() {
      return EdiRealtimeinventoryQueryResponse.class;
   }
}
