package com.jd.open.api.sdk.request.HouseEI;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.HouseEI.LasSpareZerostockDetectionPushResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class LasSpareZerostockDetectionPushRequest extends AbstractRequest implements JdRequest<LasSpareZerostockDetectionPushResponse> {
   private String ordNo;
   private String afsNo;
   private String afsSerTasNo;
   private String engNo;
   private String engN;
   private String engMp;
   private String gooSku;
   private String actT;
   private String gooN;
   private Integer detRs;
   private Boolean isInv;
   private String gooSn;
   private String notRefRea;
   private String refRea;
   private String deaTyp;
   private String gooPacN;
   private String gooExtN;
   private String gooFunN;
   private String attDesc;
   private Boolean isBroScr;

   public void setOrdNo(String ordNo) {
      this.ordNo = ordNo;
   }

   public String getOrdNo() {
      return this.ordNo;
   }

   public void setAfsNo(String afsNo) {
      this.afsNo = afsNo;
   }

   public String getAfsNo() {
      return this.afsNo;
   }

   public void setAfsSerTasNo(String afsSerTasNo) {
      this.afsSerTasNo = afsSerTasNo;
   }

   public String getAfsSerTasNo() {
      return this.afsSerTasNo;
   }

   public void setEngNo(String engNo) {
      this.engNo = engNo;
   }

   public String getEngNo() {
      return this.engNo;
   }

   public void setEngN(String engN) {
      this.engN = engN;
   }

   public String getEngN() {
      return this.engN;
   }

   public void setEngMp(String engMp) {
      this.engMp = engMp;
   }

   public String getEngMp() {
      return this.engMp;
   }

   public void setGooSku(String gooSku) {
      this.gooSku = gooSku;
   }

   public String getGooSku() {
      return this.gooSku;
   }

   public void setActT(String actT) {
      this.actT = actT;
   }

   public String getActT() {
      return this.actT;
   }

   public void setGooN(String gooN) {
      this.gooN = gooN;
   }

   public String getGooN() {
      return this.gooN;
   }

   public void setDetRs(Integer detRs) {
      this.detRs = detRs;
   }

   public Integer getDetRs() {
      return this.detRs;
   }

   public void setIsInv(Boolean isInv) {
      this.isInv = isInv;
   }

   public Boolean getIsInv() {
      return this.isInv;
   }

   public void setGooSn(String gooSn) {
      this.gooSn = gooSn;
   }

   public String getGooSn() {
      return this.gooSn;
   }

   public void setNotRefRea(String notRefRea) {
      this.notRefRea = notRefRea;
   }

   public String getNotRefRea() {
      return this.notRefRea;
   }

   public void setRefRea(String refRea) {
      this.refRea = refRea;
   }

   public String getRefRea() {
      return this.refRea;
   }

   public void setDeaTyp(String deaTyp) {
      this.deaTyp = deaTyp;
   }

   public String getDeaTyp() {
      return this.deaTyp;
   }

   public void setGooPacN(String gooPacN) {
      this.gooPacN = gooPacN;
   }

   public String getGooPacN() {
      return this.gooPacN;
   }

   public void setGooExtN(String gooExtN) {
      this.gooExtN = gooExtN;
   }

   public String getGooExtN() {
      return this.gooExtN;
   }

   public void setGooFunN(String gooFunN) {
      this.gooFunN = gooFunN;
   }

   public String getGooFunN() {
      return this.gooFunN;
   }

   public void setAttDesc(String attDesc) {
      this.attDesc = attDesc;
   }

   public String getAttDesc() {
      return this.attDesc;
   }

   public void setIsBroScr(Boolean isBroScr) {
      this.isBroScr = isBroScr;
   }

   public Boolean getIsBroScr() {
      return this.isBroScr;
   }

   public String getApiMethod() {
      return "jingdong.las.spare.zerostock.detection.push";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("ord_no", this.ordNo);
      pmap.put("afs_no", this.afsNo);
      pmap.put("afs_ser_tas_no", this.afsSerTasNo);
      pmap.put("eng_no", this.engNo);
      pmap.put("eng_n", this.engN);
      pmap.put("eng_mp", this.engMp);
      pmap.put("goo_sku", this.gooSku);
      pmap.put("act_t", this.actT);
      pmap.put("goo_n", this.gooN);
      pmap.put("det_rs", this.detRs);
      pmap.put("is_inv", this.isInv);
      pmap.put("goo_sn", this.gooSn);
      pmap.put("not_ref_rea", this.notRefRea);
      pmap.put("ref_rea", this.refRea);
      pmap.put("dea_typ", this.deaTyp);
      pmap.put("goo_pac_n", this.gooPacN);
      pmap.put("goo_ext_n", this.gooExtN);
      pmap.put("goo_fun_n", this.gooFunN);
      pmap.put("att_desc", this.attDesc);
      pmap.put("is_bro_scr", this.isBroScr);
      return JsonUtil.toJson(pmap);
   }

   public Class<LasSpareZerostockDetectionPushResponse> getResponseClass() {
      return LasSpareZerostockDetectionPushResponse.class;
   }
}
