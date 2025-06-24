package com.jd.open.api.sdk.request.jjfw;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jjfw.HomefwTaskRefuseResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HomefwTaskRefuseRequest extends AbstractRequest implements JdRequest<HomefwTaskRefuseResponse> {
   private String venderCode;
   private String saleOrderNo;
   private Integer refuseType;

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setSaleOrderNo(String saleOrderNo) {
      this.saleOrderNo = saleOrderNo;
   }

   public String getSaleOrderNo() {
      return this.saleOrderNo;
   }

   public void setRefuseType(Integer refuseType) {
      this.refuseType = refuseType;
   }

   public Integer getRefuseType() {
      return this.refuseType;
   }

   public String getApiMethod() {
      return "jingdong.homefw.task.refuse";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderCode", this.venderCode);
      pmap.put("saleOrderNo", this.saleOrderNo);
      pmap.put("refuseType", this.refuseType);
      return JsonUtil.toJson(pmap);
   }

   public Class<HomefwTaskRefuseResponse> getResponseClass() {
      return HomefwTaskRefuseResponse.class;
   }
}
