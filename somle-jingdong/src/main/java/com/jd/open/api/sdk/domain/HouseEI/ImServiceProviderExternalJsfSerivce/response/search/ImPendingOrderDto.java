package com.jd.open.api.sdk.domain.HouseEI.ImServiceProviderExternalJsfSerivce.response.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ImPendingOrderDto implements Serializable {
   private String ordNo;
   private String jdOrdNo;
   private Integer serSco;
   private Integer isCol;
   private Date colT;
   private String popN;
   private String popNo;
   private String popAdd;
   private String popTel;
   private String popCon;
   private String delProNo;
   private String delProN;
   private String delCitNo;
   private String delCitN;
   private String delDisNo;
   private String delDisN;
   private String delTowNo;
   private String delTowN;
   private String delAdd;
   private String desProNo;
   private String desProN;
   private String desCitNo;
   private String desCitN;
   private String desDisNo;
   private String desDisN;
   private String desTowNo;
   private String desTowN;
   private String sitNo;
   private String sitN;
   private String sitCon;
   private String sitTel;
   private String sitAdd;
   private String colProNo;
   private String colProN;
   private String colCitNo;
   private String colCitN;
   private String colDisNo;
   private String colDisN;
   private String colTowNo;
   private String colTowN;
   private String colAdd;
   private String colTel;
   private String colCod;
   private String recProNo;
   private String recProN;
   private String recCitNo;
   private String recCitN;
   private String recDisNo;
   private String recDisN;
   private String recTowNo;
   private String recTowN;
   private String cusN;
   private String cusTel;
   private String cusAdd;
   private Date estRecT;
   private BigDecimal sumPri;
   private BigDecimal colPri;
   private BigDecimal maiPri;
   private BigDecimal braPri;
   private BigDecimal vouPri;
   private BigDecimal insPri;
   private BigDecimal sumVol;
   private Integer lgsSta;
   private Integer ordSta;
   private Integer isVer;
   private Integer ordFroTyp;
   private String delT;
   private String carRecT;
   private String delFinT;
   private String rejT;
   private String expAtHomT;
   private String creOrdT;
   private String ordDet;
   private String ikaPac;
   private String ikaSalNo;
   private String creOrdSlo;
   private String ordDir;
   private Integer saPafr;
   private String saPafrna;
   private String remark;
   private String pacRem;
   private String proCateName;
   private String proCateSecondname;
   private String proCateFirstname;
   private String proBran;
   private Integer pacNum;
   private Double skuWei;

   @JsonProperty("ord_no")
   public void setOrdNo(String ordNo) {
      this.ordNo = ordNo;
   }

   @JsonProperty("ord_no")
   public String getOrdNo() {
      return this.ordNo;
   }

   @JsonProperty("jd_ord_no")
   public void setJdOrdNo(String jdOrdNo) {
      this.jdOrdNo = jdOrdNo;
   }

   @JsonProperty("jd_ord_no")
   public String getJdOrdNo() {
      return this.jdOrdNo;
   }

   @JsonProperty("ser_sco")
   public void setSerSco(Integer serSco) {
      this.serSco = serSco;
   }

   @JsonProperty("ser_sco")
   public Integer getSerSco() {
      return this.serSco;
   }

   @JsonProperty("is_col")
   public void setIsCol(Integer isCol) {
      this.isCol = isCol;
   }

   @JsonProperty("is_col")
   public Integer getIsCol() {
      return this.isCol;
   }

   @JsonProperty("col_t")
   public void setColT(Date colT) {
      this.colT = colT;
   }

   @JsonProperty("col_t")
   public Date getColT() {
      return this.colT;
   }

   @JsonProperty("pop_n")
   public void setPopN(String popN) {
      this.popN = popN;
   }

   @JsonProperty("pop_n")
   public String getPopN() {
      return this.popN;
   }

   @JsonProperty("pop_no")
   public void setPopNo(String popNo) {
      this.popNo = popNo;
   }

   @JsonProperty("pop_no")
   public String getPopNo() {
      return this.popNo;
   }

   @JsonProperty("pop_add")
   public void setPopAdd(String popAdd) {
      this.popAdd = popAdd;
   }

   @JsonProperty("pop_add")
   public String getPopAdd() {
      return this.popAdd;
   }

   @JsonProperty("pop_tel")
   public void setPopTel(String popTel) {
      this.popTel = popTel;
   }

   @JsonProperty("pop_tel")
   public String getPopTel() {
      return this.popTel;
   }

   @JsonProperty("pop_con")
   public void setPopCon(String popCon) {
      this.popCon = popCon;
   }

   @JsonProperty("pop_con")
   public String getPopCon() {
      return this.popCon;
   }

   @JsonProperty("del_pro_no")
   public void setDelProNo(String delProNo) {
      this.delProNo = delProNo;
   }

   @JsonProperty("del_pro_no")
   public String getDelProNo() {
      return this.delProNo;
   }

   @JsonProperty("del_pro_n")
   public void setDelProN(String delProN) {
      this.delProN = delProN;
   }

   @JsonProperty("del_pro_n")
   public String getDelProN() {
      return this.delProN;
   }

   @JsonProperty("del_cit_no")
   public void setDelCitNo(String delCitNo) {
      this.delCitNo = delCitNo;
   }

   @JsonProperty("del_cit_no")
   public String getDelCitNo() {
      return this.delCitNo;
   }

   @JsonProperty("del_cit_n")
   public void setDelCitN(String delCitN) {
      this.delCitN = delCitN;
   }

   @JsonProperty("del_cit_n")
   public String getDelCitN() {
      return this.delCitN;
   }

   @JsonProperty("del_dis_no")
   public void setDelDisNo(String delDisNo) {
      this.delDisNo = delDisNo;
   }

   @JsonProperty("del_dis_no")
   public String getDelDisNo() {
      return this.delDisNo;
   }

   @JsonProperty("del_dis_n")
   public void setDelDisN(String delDisN) {
      this.delDisN = delDisN;
   }

   @JsonProperty("del_dis_n")
   public String getDelDisN() {
      return this.delDisN;
   }

   @JsonProperty("del_tow_no")
   public void setDelTowNo(String delTowNo) {
      this.delTowNo = delTowNo;
   }

   @JsonProperty("del_tow_no")
   public String getDelTowNo() {
      return this.delTowNo;
   }

   @JsonProperty("del_tow_n")
   public void setDelTowN(String delTowN) {
      this.delTowN = delTowN;
   }

   @JsonProperty("del_tow_n")
   public String getDelTowN() {
      return this.delTowN;
   }

   @JsonProperty("del_add")
   public void setDelAdd(String delAdd) {
      this.delAdd = delAdd;
   }

   @JsonProperty("del_add")
   public String getDelAdd() {
      return this.delAdd;
   }

   @JsonProperty("des_pro_no")
   public void setDesProNo(String desProNo) {
      this.desProNo = desProNo;
   }

   @JsonProperty("des_pro_no")
   public String getDesProNo() {
      return this.desProNo;
   }

   @JsonProperty("des_pro_n")
   public void setDesProN(String desProN) {
      this.desProN = desProN;
   }

   @JsonProperty("des_pro_n")
   public String getDesProN() {
      return this.desProN;
   }

   @JsonProperty("des_cit_no")
   public void setDesCitNo(String desCitNo) {
      this.desCitNo = desCitNo;
   }

   @JsonProperty("des_cit_no")
   public String getDesCitNo() {
      return this.desCitNo;
   }

   @JsonProperty("des_cit_n")
   public void setDesCitN(String desCitN) {
      this.desCitN = desCitN;
   }

   @JsonProperty("des_cit_n")
   public String getDesCitN() {
      return this.desCitN;
   }

   @JsonProperty("des_dis_no")
   public void setDesDisNo(String desDisNo) {
      this.desDisNo = desDisNo;
   }

   @JsonProperty("des_dis_no")
   public String getDesDisNo() {
      return this.desDisNo;
   }

   @JsonProperty("des_dis_n")
   public void setDesDisN(String desDisN) {
      this.desDisN = desDisN;
   }

   @JsonProperty("des_dis_n")
   public String getDesDisN() {
      return this.desDisN;
   }

   @JsonProperty("des_tow_no")
   public void setDesTowNo(String desTowNo) {
      this.desTowNo = desTowNo;
   }

   @JsonProperty("des_tow_no")
   public String getDesTowNo() {
      return this.desTowNo;
   }

   @JsonProperty("des_tow_n")
   public void setDesTowN(String desTowN) {
      this.desTowN = desTowN;
   }

   @JsonProperty("des_tow_n")
   public String getDesTowN() {
      return this.desTowN;
   }

   @JsonProperty("sit_no")
   public void setSitNo(String sitNo) {
      this.sitNo = sitNo;
   }

   @JsonProperty("sit_no")
   public String getSitNo() {
      return this.sitNo;
   }

   @JsonProperty("sit_n")
   public void setSitN(String sitN) {
      this.sitN = sitN;
   }

   @JsonProperty("sit_n")
   public String getSitN() {
      return this.sitN;
   }

   @JsonProperty("sit_con")
   public void setSitCon(String sitCon) {
      this.sitCon = sitCon;
   }

   @JsonProperty("sit_con")
   public String getSitCon() {
      return this.sitCon;
   }

   @JsonProperty("sit_tel")
   public void setSitTel(String sitTel) {
      this.sitTel = sitTel;
   }

   @JsonProperty("sit_tel")
   public String getSitTel() {
      return this.sitTel;
   }

   @JsonProperty("sit_add")
   public void setSitAdd(String sitAdd) {
      this.sitAdd = sitAdd;
   }

   @JsonProperty("sit_add")
   public String getSitAdd() {
      return this.sitAdd;
   }

   @JsonProperty("col_pro_no")
   public void setColProNo(String colProNo) {
      this.colProNo = colProNo;
   }

   @JsonProperty("col_pro_no")
   public String getColProNo() {
      return this.colProNo;
   }

   @JsonProperty("col_pro_n")
   public void setColProN(String colProN) {
      this.colProN = colProN;
   }

   @JsonProperty("col_pro_n")
   public String getColProN() {
      return this.colProN;
   }

   @JsonProperty("col_cit_no")
   public void setColCitNo(String colCitNo) {
      this.colCitNo = colCitNo;
   }

   @JsonProperty("col_cit_no")
   public String getColCitNo() {
      return this.colCitNo;
   }

   @JsonProperty("col_cit_n")
   public void setColCitN(String colCitN) {
      this.colCitN = colCitN;
   }

   @JsonProperty("col_cit_n")
   public String getColCitN() {
      return this.colCitN;
   }

   @JsonProperty("col_dis_no")
   public void setColDisNo(String colDisNo) {
      this.colDisNo = colDisNo;
   }

   @JsonProperty("col_dis_no")
   public String getColDisNo() {
      return this.colDisNo;
   }

   @JsonProperty("col_dis_n")
   public void setColDisN(String colDisN) {
      this.colDisN = colDisN;
   }

   @JsonProperty("col_dis_n")
   public String getColDisN() {
      return this.colDisN;
   }

   @JsonProperty("col_tow_no")
   public void setColTowNo(String colTowNo) {
      this.colTowNo = colTowNo;
   }

   @JsonProperty("col_tow_no")
   public String getColTowNo() {
      return this.colTowNo;
   }

   @JsonProperty("col_tow_n")
   public void setColTowN(String colTowN) {
      this.colTowN = colTowN;
   }

   @JsonProperty("col_tow_n")
   public String getColTowN() {
      return this.colTowN;
   }

   @JsonProperty("col_add")
   public void setColAdd(String colAdd) {
      this.colAdd = colAdd;
   }

   @JsonProperty("col_add")
   public String getColAdd() {
      return this.colAdd;
   }

   @JsonProperty("col_tel")
   public void setColTel(String colTel) {
      this.colTel = colTel;
   }

   @JsonProperty("col_tel")
   public String getColTel() {
      return this.colTel;
   }

   @JsonProperty("col_cod")
   public void setColCod(String colCod) {
      this.colCod = colCod;
   }

   @JsonProperty("col_cod")
   public String getColCod() {
      return this.colCod;
   }

   @JsonProperty("rec_pro_no")
   public void setRecProNo(String recProNo) {
      this.recProNo = recProNo;
   }

   @JsonProperty("rec_pro_no")
   public String getRecProNo() {
      return this.recProNo;
   }

   @JsonProperty("rec_pro_n")
   public void setRecProN(String recProN) {
      this.recProN = recProN;
   }

   @JsonProperty("rec_pro_n")
   public String getRecProN() {
      return this.recProN;
   }

   @JsonProperty("rec_cit_no")
   public void setRecCitNo(String recCitNo) {
      this.recCitNo = recCitNo;
   }

   @JsonProperty("rec_cit_no")
   public String getRecCitNo() {
      return this.recCitNo;
   }

   @JsonProperty("rec_cit_n")
   public void setRecCitN(String recCitN) {
      this.recCitN = recCitN;
   }

   @JsonProperty("rec_cit_n")
   public String getRecCitN() {
      return this.recCitN;
   }

   @JsonProperty("rec_dis_no")
   public void setRecDisNo(String recDisNo) {
      this.recDisNo = recDisNo;
   }

   @JsonProperty("rec_dis_no")
   public String getRecDisNo() {
      return this.recDisNo;
   }

   @JsonProperty("rec_dis_n")
   public void setRecDisN(String recDisN) {
      this.recDisN = recDisN;
   }

   @JsonProperty("rec_dis_n")
   public String getRecDisN() {
      return this.recDisN;
   }

   @JsonProperty("rec_tow_no")
   public void setRecTowNo(String recTowNo) {
      this.recTowNo = recTowNo;
   }

   @JsonProperty("rec_tow_no")
   public String getRecTowNo() {
      return this.recTowNo;
   }

   @JsonProperty("rec_tow_n")
   public void setRecTowN(String recTowN) {
      this.recTowN = recTowN;
   }

   @JsonProperty("rec_tow_n")
   public String getRecTowN() {
      return this.recTowN;
   }

   @JsonProperty("cus_n")
   public void setCusN(String cusN) {
      this.cusN = cusN;
   }

   @JsonProperty("cus_n")
   public String getCusN() {
      return this.cusN;
   }

   @JsonProperty("cus_tel")
   public void setCusTel(String cusTel) {
      this.cusTel = cusTel;
   }

   @JsonProperty("cus_tel")
   public String getCusTel() {
      return this.cusTel;
   }

   @JsonProperty("cus_add")
   public void setCusAdd(String cusAdd) {
      this.cusAdd = cusAdd;
   }

   @JsonProperty("cus_add")
   public String getCusAdd() {
      return this.cusAdd;
   }

   @JsonProperty("est_rec_t")
   public void setEstRecT(Date estRecT) {
      this.estRecT = estRecT;
   }

   @JsonProperty("est_rec_t")
   public Date getEstRecT() {
      return this.estRecT;
   }

   @JsonProperty("sum_pri")
   public void setSumPri(BigDecimal sumPri) {
      this.sumPri = sumPri;
   }

   @JsonProperty("sum_pri")
   public BigDecimal getSumPri() {
      return this.sumPri;
   }

   @JsonProperty("col_pri")
   public void setColPri(BigDecimal colPri) {
      this.colPri = colPri;
   }

   @JsonProperty("col_pri")
   public BigDecimal getColPri() {
      return this.colPri;
   }

   @JsonProperty("mai_pri")
   public void setMaiPri(BigDecimal maiPri) {
      this.maiPri = maiPri;
   }

   @JsonProperty("mai_pri")
   public BigDecimal getMaiPri() {
      return this.maiPri;
   }

   @JsonProperty("bra_pri")
   public void setBraPri(BigDecimal braPri) {
      this.braPri = braPri;
   }

   @JsonProperty("bra_pri")
   public BigDecimal getBraPri() {
      return this.braPri;
   }

   @JsonProperty("vou_pri")
   public void setVouPri(BigDecimal vouPri) {
      this.vouPri = vouPri;
   }

   @JsonProperty("vou_pri")
   public BigDecimal getVouPri() {
      return this.vouPri;
   }

   @JsonProperty("ins_pri")
   public void setInsPri(BigDecimal insPri) {
      this.insPri = insPri;
   }

   @JsonProperty("ins_pri")
   public BigDecimal getInsPri() {
      return this.insPri;
   }

   @JsonProperty("sum_vol")
   public void setSumVol(BigDecimal sumVol) {
      this.sumVol = sumVol;
   }

   @JsonProperty("sum_vol")
   public BigDecimal getSumVol() {
      return this.sumVol;
   }

   @JsonProperty("lgs_sta")
   public void setLgsSta(Integer lgsSta) {
      this.lgsSta = lgsSta;
   }

   @JsonProperty("lgs_sta")
   public Integer getLgsSta() {
      return this.lgsSta;
   }

   @JsonProperty("ord_sta")
   public void setOrdSta(Integer ordSta) {
      this.ordSta = ordSta;
   }

   @JsonProperty("ord_sta")
   public Integer getOrdSta() {
      return this.ordSta;
   }

   @JsonProperty("is_ver")
   public void setIsVer(Integer isVer) {
      this.isVer = isVer;
   }

   @JsonProperty("is_ver")
   public Integer getIsVer() {
      return this.isVer;
   }

   @JsonProperty("ord_fro_typ")
   public void setOrdFroTyp(Integer ordFroTyp) {
      this.ordFroTyp = ordFroTyp;
   }

   @JsonProperty("ord_fro_typ")
   public Integer getOrdFroTyp() {
      return this.ordFroTyp;
   }

   @JsonProperty("del_t")
   public void setDelT(String delT) {
      this.delT = delT;
   }

   @JsonProperty("del_t")
   public String getDelT() {
      return this.delT;
   }

   @JsonProperty("car_rec_t")
   public void setCarRecT(String carRecT) {
      this.carRecT = carRecT;
   }

   @JsonProperty("car_rec_t")
   public String getCarRecT() {
      return this.carRecT;
   }

   @JsonProperty("del_fin_t")
   public void setDelFinT(String delFinT) {
      this.delFinT = delFinT;
   }

   @JsonProperty("del_fin_t")
   public String getDelFinT() {
      return this.delFinT;
   }

   @JsonProperty("rej_t")
   public void setRejT(String rejT) {
      this.rejT = rejT;
   }

   @JsonProperty("rej_t")
   public String getRejT() {
      return this.rejT;
   }

   @JsonProperty("exp_at_hom_t")
   public void setExpAtHomT(String expAtHomT) {
      this.expAtHomT = expAtHomT;
   }

   @JsonProperty("exp_at_hom_t")
   public String getExpAtHomT() {
      return this.expAtHomT;
   }

   @JsonProperty("cre_ord_t")
   public void setCreOrdT(String creOrdT) {
      this.creOrdT = creOrdT;
   }

   @JsonProperty("cre_ord_t")
   public String getCreOrdT() {
      return this.creOrdT;
   }

   @JsonProperty("ord_det")
   public void setOrdDet(String ordDet) {
      this.ordDet = ordDet;
   }

   @JsonProperty("ord_det")
   public String getOrdDet() {
      return this.ordDet;
   }

   @JsonProperty("ika_pac")
   public void setIkaPac(String ikaPac) {
      this.ikaPac = ikaPac;
   }

   @JsonProperty("ika_pac")
   public String getIkaPac() {
      return this.ikaPac;
   }

   @JsonProperty("ika_sal_no")
   public void setIkaSalNo(String ikaSalNo) {
      this.ikaSalNo = ikaSalNo;
   }

   @JsonProperty("ika_sal_no")
   public String getIkaSalNo() {
      return this.ikaSalNo;
   }

   @JsonProperty("cre_ord_slo")
   public void setCreOrdSlo(String creOrdSlo) {
      this.creOrdSlo = creOrdSlo;
   }

   @JsonProperty("cre_ord_slo")
   public String getCreOrdSlo() {
      return this.creOrdSlo;
   }

   @JsonProperty("ord_dir")
   public void setOrdDir(String ordDir) {
      this.ordDir = ordDir;
   }

   @JsonProperty("ord_dir")
   public String getOrdDir() {
      return this.ordDir;
   }

   @JsonProperty("sa_pafr")
   public void setSaPafr(Integer saPafr) {
      this.saPafr = saPafr;
   }

   @JsonProperty("sa_pafr")
   public Integer getSaPafr() {
      return this.saPafr;
   }

   @JsonProperty("sa_pafrna")
   public void setSaPafrna(String saPafrna) {
      this.saPafrna = saPafrna;
   }

   @JsonProperty("sa_pafrna")
   public String getSaPafrna() {
      return this.saPafrna;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("pac_rem")
   public void setPacRem(String pacRem) {
      this.pacRem = pacRem;
   }

   @JsonProperty("pac_rem")
   public String getPacRem() {
      return this.pacRem;
   }

   @JsonProperty("pro_cate_name")
   public void setProCateName(String proCateName) {
      this.proCateName = proCateName;
   }

   @JsonProperty("pro_cate_name")
   public String getProCateName() {
      return this.proCateName;
   }

   @JsonProperty("pro_cate_secondname")
   public void setProCateSecondname(String proCateSecondname) {
      this.proCateSecondname = proCateSecondname;
   }

   @JsonProperty("pro_cate_secondname")
   public String getProCateSecondname() {
      return this.proCateSecondname;
   }

   @JsonProperty("pro_cate_firstname")
   public void setProCateFirstname(String proCateFirstname) {
      this.proCateFirstname = proCateFirstname;
   }

   @JsonProperty("pro_cate_firstname")
   public String getProCateFirstname() {
      return this.proCateFirstname;
   }

   @JsonProperty("pro_bran")
   public void setProBran(String proBran) {
      this.proBran = proBran;
   }

   @JsonProperty("pro_bran")
   public String getProBran() {
      return this.proBran;
   }

   @JsonProperty("pac_num")
   public void setPacNum(Integer pacNum) {
      this.pacNum = pacNum;
   }

   @JsonProperty("pac_num")
   public Integer getPacNum() {
      return this.pacNum;
   }

   @JsonProperty("sku_wei")
   public void setSkuWei(Double skuWei) {
      this.skuWei = skuWei;
   }

   @JsonProperty("sku_wei")
   public Double getSkuWei() {
      return this.skuWei;
   }
}
