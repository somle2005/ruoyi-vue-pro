package com.jd.open.api.sdk.request.refundapply;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.refundapply.PopAfsSoaVipApplyRefundResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class PopAfsSoaVipApplyRefundRequest extends AbstractRequest implements JdRequest<PopAfsSoaVipApplyRefundResponse> {
   private String ids;
   private String venderID;

   public void setIds(String ids) {
      this.ids = ids;
   }

   public String getIds() {
      return this.ids;
   }

   public void setVenderID(String venderID) {
      this.venderID = venderID;
   }

   public String getVenderID() {
      return this.venderID;
   }

   public String getApiMethod() {
      return "jingdong.pop.afs.soa.vipApplyRefund";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ids", this.ids);
      pmap.put("venderID", this.venderID);
      return JsonUtil.toJson(pmap);
   }

   public Class<PopAfsSoaVipApplyRefundResponse> getResponseClass() {
      return PopAfsSoaVipApplyRefundResponse.class;
   }
}
