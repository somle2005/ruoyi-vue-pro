package com.jd.open.api.sdk.request.crm;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.crm.CrmGradeUpdateResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CrmGradeUpdateRequest extends AbstractRequest implements JdRequest<CrmGradeUpdateResponse> {
   private String amount;
   private String count;

   public void setAmount(String amount) {
      this.amount = amount;
   }

   public String getAmount() {
      return this.amount;
   }

   public void setCount(String count) {
      this.count = count;
   }

   public String getCount() {
      return this.count;
   }

   public String getApiMethod() {
      return "jingdong.crm.grade.update";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("amount", this.amount);
      pmap.put("count", this.count);
      return JsonUtil.toJson(pmap);
   }

   public Class<CrmGradeUpdateResponse> getResponseClass() {
      return CrmGradeUpdateResponse.class;
   }
}
