package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeOrderNewExtInsuranceBindResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeOrderNewExtInsuranceBindRequest extends AbstractRequest implements JdRequest<UeOrderNewExtInsuranceBindResponse> {
   private Integer bindStat;
   private String appid;
   private String venderCode;
   private String remark;
   private String orderNos;

   public void setBindStat(Integer bindStat) {
      this.bindStat = bindStat;
   }

   public Integer getBindStat() {
      return this.bindStat;
   }

   public void setAppid(String appid) {
      this.appid = appid;
   }

   public String getAppid() {
      return this.appid;
   }

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getRemark() {
      return this.remark;
   }

   public void setOrderNos(String orderNos) {
      this.orderNos = orderNos;
   }

   public String getOrderNos() {
      return this.orderNos;
   }

   public String getApiMethod() {
      return "jingdong.ue.order.new.extInsuranceBind";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("bindStat", this.bindStat);
      pmap.put("appid", this.appid);
      pmap.put("venderCode", this.venderCode);
      pmap.put("remark", this.remark);
      pmap.put("orderNos", this.orderNos);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeOrderNewExtInsuranceBindResponse> getResponseClass() {
      return UeOrderNewExtInsuranceBindResponse.class;
   }
}
