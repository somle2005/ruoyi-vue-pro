package com.jd.open.api.sdk.response.wms;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class ResponseOrderOtherDetail implements Serializable {
   private String joslGoodNo;
   private String isvGoodNo;
   private Integer qty;
   private String goodsStatus;
   private String differenceRemark;

   @JsonProperty("josl_good_no")
   public void setJoslGoodNo(String joslGoodNo) {
      this.joslGoodNo = joslGoodNo;
   }

   @JsonProperty("josl_good_no")
   public String getJoslGoodNo() {
      return this.joslGoodNo;
   }

   @JsonProperty("isv_good_no")
   public void setIsvGoodNo(String isvGoodNo) {
      this.isvGoodNo = isvGoodNo;
   }

   @JsonProperty("isv_good_no")
   public String getIsvGoodNo() {
      return this.isvGoodNo;
   }

   @JsonProperty("qty")
   public void setQty(Integer qty) {
      this.qty = qty;
   }

   @JsonProperty("qty")
   public Integer getQty() {
      return this.qty;
   }

   @JsonProperty("goods_status")
   public void setGoodsStatus(String goodsStatus) {
      this.goodsStatus = goodsStatus;
   }

   @JsonProperty("goods_status")
   public String getGoodsStatus() {
      return this.goodsStatus;
   }

   @JsonProperty("difference_remark")
   public void setDifferenceRemark(String differenceRemark) {
      this.differenceRemark = differenceRemark;
   }

   @JsonProperty("difference_remark")
   public String getDifferenceRemark() {
      return this.differenceRemark;
   }
}
