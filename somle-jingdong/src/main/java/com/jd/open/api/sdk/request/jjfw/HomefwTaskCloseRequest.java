package com.jd.open.api.sdk.request.jjfw;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.jjfw.HomefwTaskCloseResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HomefwTaskCloseRequest extends AbstractRequest implements JdRequest<HomefwTaskCloseResponse> {
   private String venderCode;
   private String beginDate;
   private String endDate;
   private Integer page;
   private Integer pageSize;
   private String orderNo;

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setBeginDate(String beginDate) {
      this.beginDate = beginDate;
   }

   public String getBeginDate() {
      return this.beginDate;
   }

   public void setEndDate(String endDate) {
      this.endDate = endDate;
   }

   public String getEndDate() {
      return this.endDate;
   }

   public void setPage(Integer page) {
      this.page = page;
   }

   public Integer getPage() {
      return this.page;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public String getApiMethod() {
      return "jingdong.homefw.task.close";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("venderCode", this.venderCode);
      pmap.put("beginDate", this.beginDate);
      pmap.put("endDate", this.endDate);
      pmap.put("page", this.page);
      pmap.put("pageSize", this.pageSize);
      pmap.put("orderNo", this.orderNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<HomefwTaskCloseResponse> getResponseClass() {
      return HomefwTaskCloseResponse.class;
   }
}
