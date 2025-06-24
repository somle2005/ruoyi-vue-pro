package com.jd.open.api.sdk.request.Account;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.Account.VenderChildaccountPrivilegeQueryResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VenderChildaccountPrivilegeQueryRequest extends AbstractRequest implements JdRequest<VenderChildaccountPrivilegeQueryResponse> {
   private String accountNameS;

   public void setAccountNameS(String accountNameS) {
      this.accountNameS = accountNameS;
   }

   public String getAccountNameS() {
      return this.accountNameS;
   }

   public String getApiMethod() {
      return "jingdong.vender.childaccount.privilege.query";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("account_name_s", this.accountNameS);
      return JsonUtil.toJson(pmap);
   }

   public Class<VenderChildaccountPrivilegeQueryResponse> getResponseClass() {
      return VenderChildaccountPrivilegeQueryResponse.class;
   }
}
