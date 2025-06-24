package com.jd.open.api.sdk.request.B2B;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jd.open.api.sdk.domain.B2B.B2BOrderProvider.request.submitPo.CartReq;
import com.jd.open.api.sdk.domain.B2B.B2BOrderProvider.request.submitPo.PoReq;
import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.B2B.B2bOpenPoCenterProviderSubmitPoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class B2bOpenPoCenterProviderSubmitPoRequest extends AbstractRequest implements JdRequest<B2bOpenPoCenterProviderSubmitPoResponse> {
   private String op;
   private String systemSource;
   private PoReq poReq;
   private CartReq cartReq;

   public String getApiMethod() {
      return "jingdong.b2b.open.PoCenterProvider.submitPo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("op", this.op);
      pmap.put("systemSource", this.systemSource);
      pmap.put("poReq", this.poReq);
      pmap.put("cartReq", this.cartReq);
      return JsonUtil.toJson(pmap);
   }

   public Class<B2bOpenPoCenterProviderSubmitPoResponse> getResponseClass() {
      return B2bOpenPoCenterProviderSubmitPoResponse.class;
   }

   @JsonProperty("op")
   public void setOp(String op) {
      this.op = op;
   }

   @JsonProperty("op")
   public String getOp() {
      return this.op;
   }

   @JsonProperty("systemSource")
   public void setSystemSource(String systemSource) {
      this.systemSource = systemSource;
   }

   @JsonProperty("systemSource")
   public String getSystemSource() {
      return this.systemSource;
   }

   @JsonProperty("poReq")
   public void setPoReq(PoReq poReq) {
      this.poReq = poReq;
   }

   @JsonProperty("poReq")
   public PoReq getPoReq() {
      return this.poReq;
   }

   @JsonProperty("cartReq")
   public void setCartReq(CartReq cartReq) {
      this.cartReq = cartReq;
   }

   @JsonProperty("cartReq")
   public CartReq getCartReq() {
      return this.cartReq;
   }
}
