package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryRtw;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class RtwDetailsResult implements Serializable {
   private String[] goodsNo;
   private String[] goodsLevelNo;
   private Integer[] planQty;
   private Integer[] realQty;
   private String[] isvGoodsNo;
   private String[] detailIsvSoNo;
   private String[] detailEclpSoNo;
   private String[] detailOrderLine;
   private String[] planRtwReasonNo;
   private String[] planRtwReasonDesc;
   private String[] realRtwReasonNo;
   private String[] realPlanRtwReasonDesc;

   @JsonProperty("goodsNo")
   public void setGoodsNo(String[] goodsNo) {
      this.goodsNo = goodsNo;
   }

   @JsonProperty("goodsNo")
   public String[] getGoodsNo() {
      return this.goodsNo;
   }

   @JsonProperty("goodsLevelNo")
   public void setGoodsLevelNo(String[] goodsLevelNo) {
      this.goodsLevelNo = goodsLevelNo;
   }

   @JsonProperty("goodsLevelNo")
   public String[] getGoodsLevelNo() {
      return this.goodsLevelNo;
   }

   @JsonProperty("planQty")
   public void setPlanQty(Integer[] planQty) {
      this.planQty = planQty;
   }

   @JsonProperty("planQty")
   public Integer[] getPlanQty() {
      return this.planQty;
   }

   @JsonProperty("realQty")
   public void setRealQty(Integer[] realQty) {
      this.realQty = realQty;
   }

   @JsonProperty("realQty")
   public Integer[] getRealQty() {
      return this.realQty;
   }

   @JsonProperty("isvGoodsNo")
   public void setIsvGoodsNo(String[] isvGoodsNo) {
      this.isvGoodsNo = isvGoodsNo;
   }

   @JsonProperty("isvGoodsNo")
   public String[] getIsvGoodsNo() {
      return this.isvGoodsNo;
   }

   @JsonProperty("detailIsvSoNo")
   public void setDetailIsvSoNo(String[] detailIsvSoNo) {
      this.detailIsvSoNo = detailIsvSoNo;
   }

   @JsonProperty("detailIsvSoNo")
   public String[] getDetailIsvSoNo() {
      return this.detailIsvSoNo;
   }

   @JsonProperty("detailEclpSoNo")
   public void setDetailEclpSoNo(String[] detailEclpSoNo) {
      this.detailEclpSoNo = detailEclpSoNo;
   }

   @JsonProperty("detailEclpSoNo")
   public String[] getDetailEclpSoNo() {
      return this.detailEclpSoNo;
   }

   @JsonProperty("detailOrderLine")
   public void setDetailOrderLine(String[] detailOrderLine) {
      this.detailOrderLine = detailOrderLine;
   }

   @JsonProperty("detailOrderLine")
   public String[] getDetailOrderLine() {
      return this.detailOrderLine;
   }

   @JsonProperty("planRtwReasonNo")
   public void setPlanRtwReasonNo(String[] planRtwReasonNo) {
      this.planRtwReasonNo = planRtwReasonNo;
   }

   @JsonProperty("planRtwReasonNo")
   public String[] getPlanRtwReasonNo() {
      return this.planRtwReasonNo;
   }

   @JsonProperty("planRtwReasonDesc")
   public void setPlanRtwReasonDesc(String[] planRtwReasonDesc) {
      this.planRtwReasonDesc = planRtwReasonDesc;
   }

   @JsonProperty("planRtwReasonDesc")
   public String[] getPlanRtwReasonDesc() {
      return this.planRtwReasonDesc;
   }

   @JsonProperty("realRtwReasonNo")
   public void setRealRtwReasonNo(String[] realRtwReasonNo) {
      this.realRtwReasonNo = realRtwReasonNo;
   }

   @JsonProperty("realRtwReasonNo")
   public String[] getRealRtwReasonNo() {
      return this.realRtwReasonNo;
   }

   @JsonProperty("realPlanRtwReasonDesc")
   public void setRealPlanRtwReasonDesc(String[] realPlanRtwReasonDesc) {
      this.realPlanRtwReasonDesc = realPlanRtwReasonDesc;
   }

   @JsonProperty("realPlanRtwReasonDesc")
   public String[] getRealPlanRtwReasonDesc() {
      return this.realPlanRtwReasonDesc;
   }
}
