package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.Jd3csOrderQueryOrderByMobilePhoneResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Jd3csOrderQueryOrderByMobilePhoneRequest extends AbstractRequest implements JdRequest<Jd3csOrderQueryOrderByMobilePhoneResponse> {
   private String venderCode;
   private String appId;
   private String createBy;
   private String mobilePhone;
   private Integer pageNo;
   private String saleOrderNo;

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setAppId(String appId) {
      this.appId = appId;
   }

   public String getAppId() {
      return this.appId;
   }

   public void setCreateBy(String createBy) {
      this.createBy = createBy;
   }

   public String getCreateBy() {
      return this.createBy;
   }

   public void setMobilePhone(String mobilePhone) {
      this.mobilePhone = mobilePhone;
   }

   public String getMobilePhone() {
      return this.mobilePhone;
   }

   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   public Integer getPageNo() {
      return this.pageNo;
   }

   public void setSaleOrderNo(String saleOrderNo) {
      this.saleOrderNo = saleOrderNo;
   }

   public String getSaleOrderNo() {
      return this.saleOrderNo;
   }

   public String getApiMethod() {
      return "jingdong.jd3cs.order.queryOrderByMobilePhone";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderCode", this.venderCode);
      pmap.put("appId", this.appId);
      pmap.put("createBy", this.createBy);
      pmap.put("mobilePhone", this.mobilePhone);
      pmap.put("pageNo", this.pageNo);
      pmap.put("saleOrderNo", this.saleOrderNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<Jd3csOrderQueryOrderByMobilePhoneResponse> getResponseClass() {
      return Jd3csOrderQueryOrderByMobilePhoneResponse.class;
   }
}
