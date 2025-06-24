package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.VcAplsStockUpdateProdStockInfoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class VcAplsStockUpdateProdStockInfoRequest extends AbstractRequest implements JdRequest<VcAplsStockUpdateProdStockInfoResponse> {
   private String vendorCode;
   private Integer companyId;
   private String stockRfId;
   private Long skuid;
   private Integer stockNum;

   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   public String getVendorCode() {
      return this.vendorCode;
   }

   public void setCompanyId(Integer companyId) {
      this.companyId = companyId;
   }

   public Integer getCompanyId() {
      return this.companyId;
   }

   public void setStockRfId(String stockRfId) {
      this.stockRfId = stockRfId;
   }

   public String getStockRfId() {
      return this.stockRfId;
   }

   public void setSkuid(Long skuid) {
      this.skuid = skuid;
   }

   public Long getSkuid() {
      return this.skuid;
   }

   public void setStockNum(Integer stockNum) {
      this.stockNum = stockNum;
   }

   public Integer getStockNum() {
      return this.stockNum;
   }

   public String getApiMethod() {
      return "jingdong.vc.apls.stock.updateProdStockInfo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("vendorCode", this.vendorCode);
      pmap.put("companyId", this.companyId);
      pmap.put("stockRfId", this.stockRfId);
      pmap.put("skuid", this.skuid);
      pmap.put("stockNum", this.stockNum);
      return JsonUtil.toJson(pmap);
   }

   public Class<VcAplsStockUpdateProdStockInfoResponse> getResponseClass() {
      return VcAplsStockUpdateProdStockInfoResponse.class;
   }
}
