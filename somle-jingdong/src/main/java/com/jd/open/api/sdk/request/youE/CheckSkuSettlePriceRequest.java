package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.CheckSkuSettlePriceResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CheckSkuSettlePriceRequest extends AbstractRequest implements JdRequest<CheckSkuSettlePriceResponse> {
   private String rejectedReason;
   private String id;
   private String sku;
   private String checkStat;
   private String venderCode;
   private String appid;

   public void setRejectedReason(String rejectedReason) {
      this.rejectedReason = rejectedReason;
   }

   public String getRejectedReason() {
      return this.rejectedReason;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getId() {
      return this.id;
   }

   public void setSku(String sku) {
      this.sku = sku;
   }

   public String getSku() {
      return this.sku;
   }

   public void setCheckStat(String checkStat) {
      this.checkStat = checkStat;
   }

   public String getCheckStat() {
      return this.checkStat;
   }

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setAppid(String appid) {
      this.appid = appid;
   }

   public String getAppid() {
      return this.appid;
   }

   public String getApiMethod() {
      return "jingdong.checkSkuSettlePrice";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("rejectedReason", this.rejectedReason);
      pmap.put("id", this.id);
      pmap.put("sku", this.sku);
      pmap.put("checkStat", this.checkStat);
      pmap.put("venderCode", this.venderCode);
      pmap.put("appid", this.appid);
      return JsonUtil.toJson(pmap);
   }

   public Class<CheckSkuSettlePriceResponse> getResponseClass() {
      return CheckSkuSettlePriceResponse.class;
   }
}
