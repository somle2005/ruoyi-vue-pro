package com.jd.open.api.sdk.request.unboundedShop;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.unboundedShop.ListEmployeeResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ListEmployeeRequest extends AbstractRequest implements JdRequest<ListEmployeeResponse> {
   private Long storeId;
   private String name;
   private String phone;
   private Long employeeId;
   private int pageNum;
   private int pageSize;

   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   public Long getStoreId() {
      return this.storeId;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public String getPhone() {
      return this.phone;
   }

   public void setEmployeeId(Long employeeId) {
      this.employeeId = employeeId;
   }

   public Long getEmployeeId() {
      return this.employeeId;
   }

   public void setPageNum(int pageNum) {
      this.pageNum = pageNum;
   }

   public int getPageNum() {
      return this.pageNum;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public int getPageSize() {
      return this.pageSize;
   }

   public String getApiMethod() {
      return "jingdong.listEmployee";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("storeId", this.storeId);
      pmap.put("name", this.name);
      pmap.put("phone", this.phone);
      pmap.put("employeeId", this.employeeId);
      pmap.put("pageNum", this.pageNum);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<ListEmployeeResponse> getResponseClass() {
      return ListEmployeeResponse.class;
   }
}
