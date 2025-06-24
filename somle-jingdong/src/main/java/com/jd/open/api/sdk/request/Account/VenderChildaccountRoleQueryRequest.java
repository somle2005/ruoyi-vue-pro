package com.jd.open.api.sdk.request.Account;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.Account.VenderChildaccountRoleQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VenderChildaccountRoleQueryRequest extends AbstractRequest implements JdRequest<VenderChildaccountRoleQueryResponse> {
   private String accountNameS;

   public void setAccountNameS(String accountNameS) {
      this.accountNameS = accountNameS;
   }

   public String getAccountNameS() {
      return this.accountNameS;
   }

   public String getApiMethod() {
      return "jingdong.vender.childaccount.role.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("account_name_s", this.accountNameS);
      return JsonUtil.toJson(pmap);
   }

   public Class<VenderChildaccountRoleQueryResponse> getResponseClass() {
      return VenderChildaccountRoleQueryResponse.class;
   }
}
