package com.jd.open.api.sdk.request.jialilue;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jialilue.OmnicBizStockJosServiceImplSearchBizStockInfoByPageResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class OmnicBizStockJosServiceImplSearchBizStockInfoByPageRequest extends AbstractRequest implements JdRequest<OmnicBizStockJosServiceImplSearchBizStockInfoByPageResponse> {
   private String authKey;
   private String pin;
   private String venderSkuId;
   private String venderWarehouseCode;

   public void setAuthKey(String authKey) {
      this.authKey = authKey;
   }

   public String getAuthKey() {
      return this.authKey;
   }

   public void setPin(String pin) {
      this.pin = pin;
   }

   public String getPin() {
      return this.pin;
   }

   public void setVenderSkuId(String venderSkuId) {
      this.venderSkuId = venderSkuId;
   }

   public String getVenderSkuId() {
      return this.venderSkuId;
   }

   public void setVenderWarehouseCode(String venderWarehouseCode) {
      this.venderWarehouseCode = venderWarehouseCode;
   }

   public String getVenderWarehouseCode() {
      return this.venderWarehouseCode;
   }

   public String getApiMethod() {
      return "jingdong.OmnicBizStockJosServiceImpl.searchBizStockInfoByPage";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("authKey", this.authKey);
      pmap.put("pin", this.pin);
      pmap.put("venderSkuId", this.venderSkuId);
      pmap.put("venderWarehouseCode", this.venderWarehouseCode);
      return JsonUtil.toJson(pmap);
   }

   public Class<OmnicBizStockJosServiceImplSearchBizStockInfoByPageResponse> getResponseClass() {
      return OmnicBizStockJosServiceImplSearchBizStockInfoByPageResponse.class;
   }
}
