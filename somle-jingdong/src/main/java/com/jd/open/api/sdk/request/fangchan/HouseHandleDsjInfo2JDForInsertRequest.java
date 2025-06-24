package com.jd.open.api.sdk.request.fangchan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.fangchan.HouseHandleDsjInfo2JDForInsertResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HouseHandleDsjInfo2JDForInsertRequest extends AbstractRequest implements JdRequest<HouseHandleDsjInfo2JDForInsertResponse> {
   private String productInfo;

   public void setProductInfo(String productInfo) {
      this.productInfo = productInfo;
   }

   public String getProductInfo() {
      return this.productInfo;
   }

   public String getApiMethod() {
      return "jingdong.house.handleDsjInfo2JDForInsert";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("productInfo", this.productInfo);
      return JsonUtil.toJson(pmap);
   }

   public Class<HouseHandleDsjInfo2JDForInsertResponse> getResponseClass() {
      return HouseHandleDsjInfo2JDForInsertResponse.class;
   }
}
