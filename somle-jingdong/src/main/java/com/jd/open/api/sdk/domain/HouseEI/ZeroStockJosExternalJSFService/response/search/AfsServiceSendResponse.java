package com.jd.open.api.sdk.domain.HouseEI.ZeroStockJosExternalJSFService.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class AfsServiceSendResponse implements Serializable {
   private String afsNo;
   private String afsTaskNo;
   private String ordNo;
   private String invNo;
   private BigDecimal buyPri;
   private String cusN;
   private String cusMp;
   private String provNo;
   private String provN;
   private String ctyNo;
   private String ctyN;
   private String cntyNo;
   private String cntyN;
   private String tnNo;
   private String tnN;
   private String add;
   private String delT;
   private Integer hasInv;
   private String audTyp;
   private String queDesc;
   private String appT;
   private String cusExp;
   private String cusExpT;
   private Integer afsSta;
   private Integer appNum;
   private String befFinRs;
   private String afsDet;
   private String oaid;

   @JsonProperty("afs_no")
   public void setAfsNo(String afsNo) {
      this.afsNo = afsNo;
   }

   @JsonProperty("afs_no")
   public String getAfsNo() {
      return this.afsNo;
   }

   @JsonProperty("afs_task_no")
   public void setAfsTaskNo(String afsTaskNo) {
      this.afsTaskNo = afsTaskNo;
   }

   @JsonProperty("afs_task_no")
   public String getAfsTaskNo() {
      return this.afsTaskNo;
   }

   @JsonProperty("ord_no")
   public void setOrdNo(String ordNo) {
      this.ordNo = ordNo;
   }

   @JsonProperty("ord_no")
   public String getOrdNo() {
      return this.ordNo;
   }

   @JsonProperty("inv_no")
   public void setInvNo(String invNo) {
      this.invNo = invNo;
   }

   @JsonProperty("inv_no")
   public String getInvNo() {
      return this.invNo;
   }

   @JsonProperty("buy_pri")
   public void setBuyPri(BigDecimal buyPri) {
      this.buyPri = buyPri;
   }

   @JsonProperty("buy_pri")
   public BigDecimal getBuyPri() {
      return this.buyPri;
   }

   @JsonProperty("cus_n")
   public void setCusN(String cusN) {
      this.cusN = cusN;
   }

   @JsonProperty("cus_n")
   public String getCusN() {
      return this.cusN;
   }

   @JsonProperty("cus_mp")
   public void setCusMp(String cusMp) {
      this.cusMp = cusMp;
   }

   @JsonProperty("cus_mp")
   public String getCusMp() {
      return this.cusMp;
   }

   @JsonProperty("prov_no")
   public void setProvNo(String provNo) {
      this.provNo = provNo;
   }

   @JsonProperty("prov_no")
   public String getProvNo() {
      return this.provNo;
   }

   @JsonProperty("prov_n")
   public void setProvN(String provN) {
      this.provN = provN;
   }

   @JsonProperty("prov_n")
   public String getProvN() {
      return this.provN;
   }

   @JsonProperty("cty_no")
   public void setCtyNo(String ctyNo) {
      this.ctyNo = ctyNo;
   }

   @JsonProperty("cty_no")
   public String getCtyNo() {
      return this.ctyNo;
   }

   @JsonProperty("cty_n")
   public void setCtyN(String ctyN) {
      this.ctyN = ctyN;
   }

   @JsonProperty("cty_n")
   public String getCtyN() {
      return this.ctyN;
   }

   @JsonProperty("cnty_no")
   public void setCntyNo(String cntyNo) {
      this.cntyNo = cntyNo;
   }

   @JsonProperty("cnty_no")
   public String getCntyNo() {
      return this.cntyNo;
   }

   @JsonProperty("cnty_n")
   public void setCntyN(String cntyN) {
      this.cntyN = cntyN;
   }

   @JsonProperty("cnty_n")
   public String getCntyN() {
      return this.cntyN;
   }

   @JsonProperty("tn_no")
   public void setTnNo(String tnNo) {
      this.tnNo = tnNo;
   }

   @JsonProperty("tn_no")
   public String getTnNo() {
      return this.tnNo;
   }

   @JsonProperty("tn_n")
   public void setTnN(String tnN) {
      this.tnN = tnN;
   }

   @JsonProperty("tn_n")
   public String getTnN() {
      return this.tnN;
   }

   @JsonProperty("add")
   public void setAdd(String add) {
      this.add = add;
   }

   @JsonProperty("add")
   public String getAdd() {
      return this.add;
   }

   @JsonProperty("del_t")
   public void setDelT(String delT) {
      this.delT = delT;
   }

   @JsonProperty("del_t")
   public String getDelT() {
      return this.delT;
   }

   @JsonProperty("has_inv")
   public void setHasInv(Integer hasInv) {
      this.hasInv = hasInv;
   }

   @JsonProperty("has_inv")
   public Integer getHasInv() {
      return this.hasInv;
   }

   @JsonProperty("aud_typ")
   public void setAudTyp(String audTyp) {
      this.audTyp = audTyp;
   }

   @JsonProperty("aud_typ")
   public String getAudTyp() {
      return this.audTyp;
   }

   @JsonProperty("que_desc")
   public void setQueDesc(String queDesc) {
      this.queDesc = queDesc;
   }

   @JsonProperty("que_desc")
   public String getQueDesc() {
      return this.queDesc;
   }

   @JsonProperty("app_t")
   public void setAppT(String appT) {
      this.appT = appT;
   }

   @JsonProperty("app_t")
   public String getAppT() {
      return this.appT;
   }

   @JsonProperty("cus_exp")
   public void setCusExp(String cusExp) {
      this.cusExp = cusExp;
   }

   @JsonProperty("cus_exp")
   public String getCusExp() {
      return this.cusExp;
   }

   @JsonProperty("cus_exp_t")
   public void setCusExpT(String cusExpT) {
      this.cusExpT = cusExpT;
   }

   @JsonProperty("cus_exp_t")
   public String getCusExpT() {
      return this.cusExpT;
   }

   @JsonProperty("afs_sta")
   public void setAfsSta(Integer afsSta) {
      this.afsSta = afsSta;
   }

   @JsonProperty("afs_sta")
   public Integer getAfsSta() {
      return this.afsSta;
   }

   @JsonProperty("app_num")
   public void setAppNum(Integer appNum) {
      this.appNum = appNum;
   }

   @JsonProperty("app_num")
   public Integer getAppNum() {
      return this.appNum;
   }

   @JsonProperty("bef_fin_rs")
   public void setBefFinRs(String befFinRs) {
      this.befFinRs = befFinRs;
   }

   @JsonProperty("bef_fin_rs")
   public String getBefFinRs() {
      return this.befFinRs;
   }

   @JsonProperty("afs_det")
   public void setAfsDet(String afsDet) {
      this.afsDet = afsDet;
   }

   @JsonProperty("afs_det")
   public String getAfsDet() {
      return this.afsDet;
   }

   @JsonProperty("oaid")
   public void setOaid(String oaid) {
      this.oaid = oaid;
   }

   @JsonProperty("oaid")
   public String getOaid() {
      return this.oaid;
   }
}
