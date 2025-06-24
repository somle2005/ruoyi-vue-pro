package com.jd.open.api.sdk.request.stock;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.stock.StoreCreateStockInBillForSamResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class StoreCreateStockInBillForSamRequest extends AbstractRequest implements JdRequest<StoreCreateStockInBillForSamResponse> {
   private Long samBillId;
   private Integer arrivalDay;
   private Integer clubId;
   private String itemId;
   private String num;
   private String remark;
   private Integer samStoreType;

   public void setSamBillId(Long samBillId) {
      this.samBillId = samBillId;
   }

   public Long getSamBillId() {
      return this.samBillId;
   }

   public void setArrivalDay(Integer arrivalDay) {
      this.arrivalDay = arrivalDay;
   }

   public Integer getArrivalDay() {
      return this.arrivalDay;
   }

   public void setClubId(Integer clubId) {
      this.clubId = clubId;
   }

   public Integer getClubId() {
      return this.clubId;
   }

   public void setItemId(String itemId) {
      this.itemId = itemId;
   }

   public String getItemId() {
      return this.itemId;
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

   public void setSamStoreType(Integer samStoreType) {
      this.samStoreType = samStoreType;
   }

   public Integer getSamStoreType() {
      return this.samStoreType;
   }

   public String getApiMethod() {
      return "jingdong.store.createStockInBillForSam";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("sam_bill_id", this.samBillId);
      pmap.put("arrivalDay", this.arrivalDay);
      pmap.put("club_id", this.clubId);
      pmap.put("item_id", this.itemId);
      pmap.put("num", this.num);
      pmap.put("remark", this.remark);
      pmap.put("samStoreType", this.samStoreType);
      return JsonUtil.toJson(pmap);
   }

   public Class<StoreCreateStockInBillForSamResponse> getResponseClass() {
      return StoreCreateStockInBillForSamResponse.class;
   }
}
