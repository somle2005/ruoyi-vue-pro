package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.Jd3csOrderQueryUnHandleOrdersResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Jd3csOrderQueryUnHandleOrdersRequest extends AbstractRequest implements JdRequest<Jd3csOrderQueryUnHandleOrdersResponse> {
   private String venderCode;
   private String appId;
   private String createBy;
   private Integer secondServiceType;
   private Integer pageNo;
   private Integer firstServiceType;

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

   public void setSecondServiceType(Integer secondServiceType) {
      this.secondServiceType = secondServiceType;
   }

   public Integer getSecondServiceType() {
      return this.secondServiceType;
   }

   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   public Integer getPageNo() {
      return this.pageNo;
   }

   public void setFirstServiceType(Integer firstServiceType) {
      this.firstServiceType = firstServiceType;
   }

   public Integer getFirstServiceType() {
      return this.firstServiceType;
   }

   public String getApiMethod() {
      return "jingdong.jd3cs.order.queryUnHandleOrders";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderCode", this.venderCode);
      pmap.put("appId", this.appId);
      pmap.put("createBy", this.createBy);
      pmap.put("secondServiceType", this.secondServiceType);
      pmap.put("pageNo", this.pageNo);
      pmap.put("firstServiceType", this.firstServiceType);
      return JsonUtil.toJson(pmap);
   }

   public Class<Jd3csOrderQueryUnHandleOrdersResponse> getResponseClass() {
      return Jd3csOrderQueryUnHandleOrdersResponse.class;
   }
}
