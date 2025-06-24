package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.EdiSdvSalesForecastNumberGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EdiSdvSalesForecastNumberGetRequest extends AbstractRequest implements JdRequest<EdiSdvSalesForecastNumberGetResponse> {
   public String getApiMethod() {
      return "jingdong.edi.sdv.sales.forecast.number.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      return JsonUtil.toJson(pmap);
   }

   public Class<EdiSdvSalesForecastNumberGetResponse> getResponseClass() {
      return EdiSdvSalesForecastNumberGetResponse.class;
   }
}
