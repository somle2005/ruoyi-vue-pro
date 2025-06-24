package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpMasterQueryShopResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpMasterQueryShopRequest extends AbstractRequest implements JdRequest<EclpMasterQueryShopResponse> {
   private String shopNos;
   private String isvShopNos;
   private String deptNo;

   public void setShopNos(String shopNos) {
      this.shopNos = shopNos;
   }

   public String getShopNos() {
      return this.shopNos;
   }

   public void setIsvShopNos(String isvShopNos) {
      this.isvShopNos = isvShopNos;
   }

   public String getIsvShopNos() {
      return this.isvShopNos;
   }

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public String getApiMethod() {
      return "jingdong.eclp.master.queryShop";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("shopNos", this.shopNos);
      pmap.put("isvShopNos", this.isvShopNos);
      pmap.put("deptNo", this.deptNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpMasterQueryShopResponse> getResponseClass() {
      return EclpMasterQueryShopResponse.class;
   }
}
