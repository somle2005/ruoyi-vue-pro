package com.jd.open.api.sdk.request.market;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.market.VasSubscribeGetResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VasSubscribeGetRequest extends AbstractRequest implements JdRequest<VasSubscribeGetResponse> {
   private String userName;
   private String itemCode;
   private String openIdBuyer;
   private String xidBuyer;

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public String getUserName() {
      return this.userName;
   }

   public void setItemCode(String itemCode) {
      this.itemCode = itemCode;
   }

   public String getItemCode() {
      return this.itemCode;
   }

   public void setOpenIdBuyer(String openIdBuyer) {
      this.openIdBuyer = openIdBuyer;
   }

   public String getOpenIdBuyer() {
      return this.openIdBuyer;
   }

   public void setXidBuyer(String xidBuyer) {
      this.xidBuyer = xidBuyer;
   }

   public String getXidBuyer() {
      return this.xidBuyer;
   }

   public String getApiMethod() {
      return "jingdong.vas.subscribe.get";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("user_name", this.userName);
      pmap.put("item_code", this.itemCode);
      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      return JsonUtil.toJson(pmap);
   }

   public Class<VasSubscribeGetResponse> getResponseClass() {
      return VasSubscribeGetResponse.class;
   }
}
