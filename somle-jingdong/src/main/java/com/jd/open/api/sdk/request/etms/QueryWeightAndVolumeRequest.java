package com.jd.open.api.sdk.request.etms;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.etms.QueryWeightAndVolumeResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class QueryWeightAndVolumeRequest extends AbstractRequest implements JdRequest<QueryWeightAndVolumeResponse> {
   private String pickUpCode;
   private Integer documentType;
   private String customerCode;
   private String waybillCode;

   public void setPickUpCode(String pickUpCode) {
      this.pickUpCode = pickUpCode;
   }

   public String getPickUpCode() {
      return this.pickUpCode;
   }

   public void setDocumentType(Integer documentType) {
      this.documentType = documentType;
   }

   public Integer getDocumentType() {
      return this.documentType;
   }

   public void setCustomerCode(String customerCode) {
      this.customerCode = customerCode;
   }

   public String getCustomerCode() {
      return this.customerCode;
   }

   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   public String getWaybillCode() {
      return this.waybillCode;
   }

   public String getApiMethod() {
      return "jingdong.query.weightAndVolume";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("pickUpCode", this.pickUpCode);
      pmap.put("documentType", this.documentType);
      pmap.put("customerCode", this.customerCode);
      pmap.put("waybillCode", this.waybillCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<QueryWeightAndVolumeResponse> getResponseClass() {
      return QueryWeightAndVolumeResponse.class;
   }
}
