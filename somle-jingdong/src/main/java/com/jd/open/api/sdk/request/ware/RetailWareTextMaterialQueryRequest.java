package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.RetailWareTextMaterialQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class RetailWareTextMaterialQueryRequest extends AbstractRequest implements JdRequest<RetailWareTextMaterialQueryResponse> {
   private Integer callEnd;
   private String needMaterialType;
   private String skuIds;

   public void setCallEnd(Integer callEnd) {
      this.callEnd = callEnd;
   }

   public Integer getCallEnd() {
      return this.callEnd;
   }

   public void setNeedMaterialType(String needMaterialType) {
      this.needMaterialType = needMaterialType;
   }

   public String getNeedMaterialType() {
      return this.needMaterialType;
   }

   public void setSkuIds(String skuIds) {
      this.skuIds = skuIds;
   }

   public String getSkuIds() {
      return this.skuIds;
   }

   public String getApiMethod() {
      return "jingdong.retail.ware.text.material.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("callEnd", this.callEnd);
      pmap.put("needMaterialType", this.needMaterialType);
      pmap.put("skuIds", this.skuIds);
      return JsonUtil.toJson(pmap);
   }

   public Class<RetailWareTextMaterialQueryResponse> getResponseClass() {
      return RetailWareTextMaterialQueryResponse.class;
   }
}
