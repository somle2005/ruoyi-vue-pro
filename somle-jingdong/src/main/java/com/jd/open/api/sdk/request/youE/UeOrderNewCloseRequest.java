package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeOrderNewCloseResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeOrderNewCloseRequest extends AbstractRequest implements JdRequest<UeOrderNewCloseResponse> {
   private String beginDate;
   private String venderCode;
   private String endDate;
   private String appid;
   private int pageSize;
   private int page;
   private int deliverType;
   private String orderNo;
   private int serviceTypeId;

   public void setBeginDate(String beginDate) {
      this.beginDate = beginDate;
   }

   public String getBeginDate() {
      return this.beginDate;
   }

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setEndDate(String endDate) {
      this.endDate = endDate;
   }

   public String getEndDate() {
      return this.endDate;
   }

   public void setAppid(String appid) {
      this.appid = appid;
   }

   public String getAppid() {
      return this.appid;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public void setPage(int page) {
      this.page = page;
   }

   public int getPage() {
      return this.page;
   }

   public void setDeliverType(int deliverType) {
      this.deliverType = deliverType;
   }

   public int getDeliverType() {
      return this.deliverType;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setServiceTypeId(int serviceTypeId) {
      this.serviceTypeId = serviceTypeId;
   }

   public int getServiceTypeId() {
      return this.serviceTypeId;
   }

   public String getApiMethod() {
      return "jingdong.ue.order.new.close";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("beginDate", this.beginDate);
      pmap.put("venderCode", this.venderCode);
      pmap.put("endDate", this.endDate);
      pmap.put("appid", this.appid);
      pmap.put("pageSize", this.pageSize);
      pmap.put("page", this.page);
      pmap.put("deliverType", this.deliverType);
      pmap.put("orderNo", this.orderNo);
      pmap.put("serviceTypeId", this.serviceTypeId);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeOrderNewCloseResponse> getResponseClass() {
      return UeOrderNewCloseResponse.class;
   }
}
