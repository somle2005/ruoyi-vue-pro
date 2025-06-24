package com.jd.open.api.sdk.request.Account;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.Account.SellerAccountApiAccountFacadeFindAccountsOnPageResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class SellerAccountApiAccountFacadeFindAccountsOnPageRequest extends AbstractRequest implements JdRequest<SellerAccountApiAccountFacadeFindAccountsOnPageResponse> {
   private int pageNo;
   private int pageSize;
   private String buid;
   private String tenant;

   public void setPageNo(int pageNo) {
      this.pageNo = pageNo;
   }

   public int getPageNo() {
      return this.pageNo;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public void setBuid(String buid) {
      this.buid = buid;
   }

   public String getBuid() {
      return this.buid;
   }

   public void setTenant(String tenant) {
      this.tenant = tenant;
   }

   public String getTenant() {
      return this.tenant;
   }

   public String getApiMethod() {
      return "jingdong.seller.account.api.AccountFacade.findAccountsOnPage";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("pageNo", this.pageNo);
      pmap.put("pageSize", this.pageSize);
      pmap.put("buid", this.buid);
      pmap.put("tenant", this.tenant);
      return JsonUtil.toJson(pmap);
   }

   public Class<SellerAccountApiAccountFacadeFindAccountsOnPageResponse> getResponseClass() {
      return SellerAccountApiAccountFacadeFindAccountsOnPageResponse.class;
   }
}
