package com.jd.open.api.sdk.request.jialilue;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jialilue.AllinplateYphOrderQueryPriceInfosBySopOrderIdResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class AllinplateYphOrderQueryPriceInfosBySopOrderIdRequest extends AbstractRequest implements JdRequest<AllinplateYphOrderQueryPriceInfosBySopOrderIdResponse> {
   private String systermName;
   private String queryCondition;
   private String extendStr;

   public void setSystermName(String systermName) {
      this.systermName = systermName;
   }

   public String getSystermName() {
      return this.systermName;
   }

   public void setQueryCondition(String queryCondition) {
      this.queryCondition = queryCondition;
   }

   public String getQueryCondition() {
      return this.queryCondition;
   }

   public void setExtendStr(String extendStr) {
      this.extendStr = extendStr;
   }

   public String getExtendStr() {
      return this.extendStr;
   }

   public String getApiMethod() {
      return "jingdong.allinplate.yphOrder.queryPriceInfosBySopOrderId";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("systermName", this.systermName);
      pmap.put("queryCondition", this.queryCondition);
      pmap.put("extendStr", this.extendStr);
      return JsonUtil.toJson(pmap);
   }

   public Class<AllinplateYphOrderQueryPriceInfosBySopOrderIdResponse> getResponseClass() {
      return AllinplateYphOrderQueryPriceInfosBySopOrderIdResponse.class;
   }
}
