package com.jd.open.api.sdk.request.youE;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.youE.ElectronicBillApi.request.saveOrderInfo.ElectronicBillDTO;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.ComJdEerdcGrcgEjsfApiOrderElectronicBillApiSaveOrderInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ComJdEerdcGrcgEjsfApiOrderElectronicBillApiSaveOrderInfoRequest extends AbstractRequest implements JdRequest<ComJdEerdcGrcgEjsfApiOrderElectronicBillApiSaveOrderInfoResponse> {
   private ElectronicBillDTO electronicBillDTO;

   public String getApiMethod() {
      return "jingdong.com.jd.eerdc.grcg.ejsf.api.order.ElectronicBillApi.saveOrderInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("electronicBillDTO", this.electronicBillDTO);
      return JsonUtil.toJson(pmap);
   }

   public Class<ComJdEerdcGrcgEjsfApiOrderElectronicBillApiSaveOrderInfoResponse> getResponseClass() {
      return ComJdEerdcGrcgEjsfApiOrderElectronicBillApiSaveOrderInfoResponse.class;
   }

   @JsonProperty("electronicBillDTO")
   public void setElectronicBillDTO(ElectronicBillDTO electronicBillDTO) {
      this.electronicBillDTO = electronicBillDTO;
   }

   @JsonProperty("electronicBillDTO")
   public ElectronicBillDTO getElectronicBillDTO() {
      return this.electronicBillDTO;
   }
}
