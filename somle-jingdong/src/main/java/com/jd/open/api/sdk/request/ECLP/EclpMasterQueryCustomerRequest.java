package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpMasterQueryCustomerResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpMasterQueryCustomerRequest extends AbstractRequest implements JdRequest<EclpMasterQueryCustomerResponse> {
   private String deptNo;
   private String sellerNo;
   private String customerNo;
   private String customerName;
   private String warehouseNo;
   private String sellerName;
   private Integer pageNo;
   private Integer pageSize;

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setSellerNo(String sellerNo) {
      this.sellerNo = sellerNo;
   }

   public String getSellerNo() {
      return this.sellerNo;
   }

   public void setCustomerNo(String customerNo) {
      this.customerNo = customerNo;
   }

   public String getCustomerNo() {
      return this.customerNo;
   }

   public void setCustomerName(String customerName) {
      this.customerName = customerName;
   }

   public String getCustomerName() {
      return this.customerName;
   }

   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   public void setSellerName(String sellerName) {
      this.sellerName = sellerName;
   }

   public String getSellerName() {
      return this.sellerName;
   }

   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   public Integer getPageNo() {
      return this.pageNo;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public String getApiMethod() {
      return "jingdong.eclp.master.queryCustomer";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("deptNo", this.deptNo);
      pmap.put("sellerNo", this.sellerNo);
      pmap.put("customerNo", this.customerNo);
      pmap.put("customerName", this.customerName);
      pmap.put("warehouseNo", this.warehouseNo);
      pmap.put("sellerName", this.sellerName);
      pmap.put("pageNo", this.pageNo);
      pmap.put("pageSize", this.pageSize);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpMasterQueryCustomerResponse> getResponseClass() {
      return EclpMasterQueryCustomerResponse.class;
   }
}
