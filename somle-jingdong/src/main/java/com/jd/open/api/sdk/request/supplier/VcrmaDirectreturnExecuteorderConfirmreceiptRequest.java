package com.jd.open.api.sdk.request.supplier;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.supplier.ReturnExecuteOrderHandlerJosApi.request.confirmreceipt.ReturnExecuteOrderReceiptInfoDto;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcrmaDirectreturnExecuteorderConfirmreceiptResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcrmaDirectreturnExecuteorderConfirmreceiptRequest extends AbstractRequest implements JdRequest<VcrmaDirectreturnExecuteorderConfirmreceiptResponse> {
   private ReturnExecuteOrderReceiptInfoDto requestParam;

   public String getApiMethod() {
      return "jingdong.vcrma.directreturn.executeorder.confirmreceipt";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("requestParam", this.requestParam);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcrmaDirectreturnExecuteorderConfirmreceiptResponse> getResponseClass() {
      return VcrmaDirectreturnExecuteorderConfirmreceiptResponse.class;
   }

   @JsonProperty("requestParam")
   public void setRequestParam(ReturnExecuteOrderReceiptInfoDto requestParam) {
      this.requestParam = requestParam;
   }

   @JsonProperty("requestParam")
   public ReturnExecuteOrderReceiptInfoDto getRequestParam() {
      return this.requestParam;
   }
}
