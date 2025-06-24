package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpMasterInsertLogicalStockConfigResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpMasterInsertLogicalStockConfigRequest extends AbstractRequest implements JdRequest<EclpMasterInsertLogicalStockConfigResponse> {
   private String sellerNo;
   private String deptNo;
   private String sellerName;
   private String deptName;
   private String factor1No;
   private String factor1Name;
   private String factor2No;
   private String factor2Name;
   private String factor3No;
   private String factor3Name;
   private String factor4No;
   private String factor4Name;

   public void setSellerNo(String sellerNo) {
      this.sellerNo = sellerNo;
   }

   public String getSellerNo() {
      return this.sellerNo;
   }

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setSellerName(String sellerName) {
      this.sellerName = sellerName;
   }

   public String getSellerName() {
      return this.sellerName;
   }

   public void setDeptName(String deptName) {
      this.deptName = deptName;
   }

   public String getDeptName() {
      return this.deptName;
   }

   public void setFactor1No(String factor1No) {
      this.factor1No = factor1No;
   }

   public String getFactor1No() {
      return this.factor1No;
   }

   public void setFactor1Name(String factor1Name) {
      this.factor1Name = factor1Name;
   }

   public String getFactor1Name() {
      return this.factor1Name;
   }

   public void setFactor2No(String factor2No) {
      this.factor2No = factor2No;
   }

   public String getFactor2No() {
      return this.factor2No;
   }

   public void setFactor2Name(String factor2Name) {
      this.factor2Name = factor2Name;
   }

   public String getFactor2Name() {
      return this.factor2Name;
   }

   public void setFactor3No(String factor3No) {
      this.factor3No = factor3No;
   }

   public String getFactor3No() {
      return this.factor3No;
   }

   public void setFactor3Name(String factor3Name) {
      this.factor3Name = factor3Name;
   }

   public String getFactor3Name() {
      return this.factor3Name;
   }

   public void setFactor4No(String factor4No) {
      this.factor4No = factor4No;
   }

   public String getFactor4No() {
      return this.factor4No;
   }

   public void setFactor4Name(String factor4Name) {
      this.factor4Name = factor4Name;
   }

   public String getFactor4Name() {
      return this.factor4Name;
   }

   public String getApiMethod() {
      return "jingdong.eclp.master.insertLogicalStockConfig";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("sellerNo", this.sellerNo);
      pmap.put("deptNo", this.deptNo);
      pmap.put("sellerName", this.sellerName);
      pmap.put("deptName", this.deptName);
      pmap.put("factor1No", this.factor1No);
      pmap.put("factor1Name", this.factor1Name);
      pmap.put("factor2No", this.factor2No);
      pmap.put("factor2Name", this.factor2Name);
      pmap.put("factor3No", this.factor3No);
      pmap.put("factor3Name", this.factor3Name);
      pmap.put("factor4No", this.factor4No);
      pmap.put("factor4Name", this.factor4Name);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpMasterInsertLogicalStockConfigResponse> getResponseClass() {
      return EclpMasterInsertLogicalStockConfigResponse.class;
   }
}
