package com.jd.open.api.sdk.domain.supplier.VcOutboundOrderJosAPI.response.ware;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class VcWareHouseOutDetailDto implements Serializable {
   private String goodsSku;
   private String goodsName;
   private Integer total;
   private String remark1;
   private String remark2;
   private String remark3;
   private String remark4;
   private String remark5;

   @JsonProperty("goodsSku")
   public void setGoodsSku(String goodsSku) {
      this.goodsSku = goodsSku;
   }

   @JsonProperty("goodsSku")
   public String getGoodsSku() {
      return this.goodsSku;
   }

   @JsonProperty("goodsName")
   public void setGoodsName(String goodsName) {
      this.goodsName = goodsName;
   }

   @JsonProperty("goodsName")
   public String getGoodsName() {
      return this.goodsName;
   }

   @JsonProperty("total")
   public void setTotal(Integer total) {
      this.total = total;
   }

   @JsonProperty("total")
   public Integer getTotal() {
      return this.total;
   }

   @JsonProperty("remark1")
   public void setRemark1(String remark1) {
      this.remark1 = remark1;
   }

   @JsonProperty("remark1")
   public String getRemark1() {
      return this.remark1;
   }

   @JsonProperty("remark2")
   public void setRemark2(String remark2) {
      this.remark2 = remark2;
   }

   @JsonProperty("remark2")
   public String getRemark2() {
      return this.remark2;
   }

   @JsonProperty("remark3")
   public void setRemark3(String remark3) {
      this.remark3 = remark3;
   }

   @JsonProperty("remark3")
   public String getRemark3() {
      return this.remark3;
   }

   @JsonProperty("remark4")
   public void setRemark4(String remark4) {
      this.remark4 = remark4;
   }

   @JsonProperty("remark4")
   public String getRemark4() {
      return this.remark4;
   }

   @JsonProperty("remark5")
   public void setRemark5(String remark5) {
      this.remark5 = remark5;
   }

   @JsonProperty("remark5")
   public String getRemark5() {
      return this.remark5;
   }
}
