package com.jd.open.api.sdk.request.stock;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.stock.StoreCreateStockInBillResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class StoreCreateStockInBillRequest extends AbstractRequest implements JdRequest<StoreCreateStockInBillResponse> {
   private Integer arrivalDay;
   private Long comId;
   private Long orgId;
   private Long whId;
   private String skuCode;
   private String num;
   private String remark;

   public void setArrivalDay(Integer arrivalDay) {
      this.arrivalDay = arrivalDay;
   }

   public Integer getArrivalDay() {
      return this.arrivalDay;
   }

   public void setComId(Long comId) {
      this.comId = comId;
   }

   public Long getComId() {
      return this.comId;
   }

   public void setOrgId(Long orgId) {
      this.orgId = orgId;
   }

   public Long getOrgId() {
      return this.orgId;
   }

   public void setWhId(Long whId) {
      this.whId = whId;
   }

   public Long getWhId() {
      return this.whId;
   }

   public void setSkuCode(String skuCode) {
      this.skuCode = skuCode;
   }

   public String getSkuCode() {
      return this.skuCode;
   }

   public void setNum(String num) {
      this.num = num;
   }

   public String getNum() {
      return this.num;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getRemark() {
      return this.remark;
   }

   public String getApiMethod() {
      return "jingdong.store.createStockInBill";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("arrivalDay", this.arrivalDay);
      pmap.put("com_id", this.comId);
      pmap.put("org_id", this.orgId);
      pmap.put("wh_id", this.whId);
      pmap.put("sku_code", this.skuCode);
      pmap.put("num", this.num);
      pmap.put("remark", this.remark);
      return JsonUtil.toJson(pmap);
   }

   public Class<StoreCreateStockInBillResponse> getResponseClass() {
      return StoreCreateStockInBillResponse.class;
   }
}
