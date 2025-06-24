package com.jd.open.api.sdk.request.HouseEI;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.HouseEI.LasSpareZerostockConfirmResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LasSpareZerostockConfirmRequest extends AbstractRequest implements JdRequest<LasSpareZerostockConfirmResponse> {
   private String afsNo;
   private String venCod;
   private String warDet;

   public void setAfsNo(String afsNo) {
      this.afsNo = afsNo;
   }

   public String getAfsNo() {
      return this.afsNo;
   }

   public void setVenCod(String venCod) {
      this.venCod = venCod;
   }

   public String getVenCod() {
      return this.venCod;
   }

   public void setWarDet(String warDet) {
      this.warDet = warDet;
   }

   public String getWarDet() {
      return this.warDet;
   }

   public String getApiMethod() {
      return "jingdong.las.spare.zerostock.confirm";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("afs_no", this.afsNo);
      pmap.put("ven_cod", this.venCod);
      pmap.put("war_det", this.warDet);
      return JsonUtil.toJson(pmap);
   }

   public Class<LasSpareZerostockConfirmResponse> getResponseClass() {
      return LasSpareZerostockConfirmResponse.class;
   }
}
