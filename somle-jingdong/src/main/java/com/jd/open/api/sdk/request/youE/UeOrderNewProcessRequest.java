package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeOrderNewProcessResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeOrderNewProcessRequest extends AbstractRequest implements JdRequest<UeOrderNewProcessResponse> {
   private String county;
   private String source;
   private String deliverCompany;
   private String deliverArriveDate;
   private String province;
   private String assessValue;
   private String orderNo;
   private String town;
   private int level;
   private double newPartPrice;
   private double newPartQty;
   private String barcode2;
   private String barcode1;
   private int appointTimes;
   private String engineerCode;
   private Integer partStat;
   private String failureReason;
   private String bookOperateDate;
   private double oldPartQty;
   private String uniqueId;
   private String oldPartCode;
   private String bookDate;
   private String city;
   private String deliverNo;
   private String siteName;
   private String remark;
   private String contactMan;
   private String failureName;
   private Integer bookTimes;
   private String engineerName;
   private String pic1;
   private String assessItem;
   private String venderCode;
   private String siteMobile;
   private Integer processType;
   private String pic2;
   private String pic3;
   private String engineerMobile;
   private String dealRemark;
   private String pic4;
   private String fixMethod;
   private String siteCode;
   private String address;
   private String newPartName;
   private String oldPartName;
   private String cancleReason;
   private String createBy;
   private String newPartCode;
   private String appid;
   private Integer dealResult;
   private String settleCode;
   private String pid;
   private String sitePhoto;
   private String insuranceNo;
   private String insurancePhoto;
   private String engineerPhoto;

   public void setCounty(String county) {
      this.county = county;
   }

   public String getCounty() {
      return this.county;
   }

   public void setSource(String source) {
      this.source = source;
   }

   public String getSource() {
      return this.source;
   }

   public void setDeliverCompany(String deliverCompany) {
      this.deliverCompany = deliverCompany;
   }

   public String getDeliverCompany() {
      return this.deliverCompany;
   }

   public void setDeliverArriveDate(String deliverArriveDate) {
      this.deliverArriveDate = deliverArriveDate;
   }

   public String getDeliverArriveDate() {
      return this.deliverArriveDate;
   }

   public void setProvince(String province) {
      this.province = province;
   }

   public String getProvince() {
      return this.province;
   }

   public void setAssessValue(String assessValue) {
      this.assessValue = assessValue;
   }

   public String getAssessValue() {
      return this.assessValue;
   }

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setTown(String town) {
      this.town = town;
   }

   public String getTown() {
      return this.town;
   }

   public void setLevel(int level) {
      this.level = level;
   }

   public int getLevel() {
      return this.level;
   }

   public void setNewPartPrice(double newPartPrice) {
      this.newPartPrice = newPartPrice;
   }

   public double getNewPartPrice() {
      return this.newPartPrice;
   }

   public void setNewPartQty(double newPartQty) {
      this.newPartQty = newPartQty;
   }

   public double getNewPartQty() {
      return this.newPartQty;
   }

   public void setBarcode2(String barcode2) {
      this.barcode2 = barcode2;
   }

   public String getBarcode2() {
      return this.barcode2;
   }

   public void setBarcode1(String barcode1) {
      this.barcode1 = barcode1;
   }

   public String getBarcode1() {
      return this.barcode1;
   }

   public void setAppointTimes(int appointTimes) {
      this.appointTimes = appointTimes;
   }

   public int getAppointTimes() {
      return this.appointTimes;
   }

   public void setEngineerCode(String engineerCode) {
      this.engineerCode = engineerCode;
   }

   public String getEngineerCode() {
      return this.engineerCode;
   }

   public void setPartStat(Integer partStat) {
      this.partStat = partStat;
   }

   public Integer getPartStat() {
      return this.partStat;
   }

   public void setFailureReason(String failureReason) {
      this.failureReason = failureReason;
   }

   public String getFailureReason() {
      return this.failureReason;
   }

   public void setBookOperateDate(String bookOperateDate) {
      this.bookOperateDate = bookOperateDate;
   }

   public String getBookOperateDate() {
      return this.bookOperateDate;
   }

   public void setOldPartQty(double oldPartQty) {
      this.oldPartQty = oldPartQty;
   }

   public double getOldPartQty() {
      return this.oldPartQty;
   }

   public void setUniqueId(String uniqueId) {
      this.uniqueId = uniqueId;
   }

   public String getUniqueId() {
      return this.uniqueId;
   }

   public void setOldPartCode(String oldPartCode) {
      this.oldPartCode = oldPartCode;
   }

   public String getOldPartCode() {
      return this.oldPartCode;
   }

   public void setBookDate(String bookDate) {
      this.bookDate = bookDate;
   }

   public String getBookDate() {
      return this.bookDate;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public String getCity() {
      return this.city;
   }

   public void setDeliverNo(String deliverNo) {
      this.deliverNo = deliverNo;
   }

   public String getDeliverNo() {
      return this.deliverNo;
   }

   public void setSiteName(String siteName) {
      this.siteName = siteName;
   }

   public String getSiteName() {
      return this.siteName;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getRemark() {
      return this.remark;
   }

   public void setContactMan(String contactMan) {
      this.contactMan = contactMan;
   }

   public String getContactMan() {
      return this.contactMan;
   }

   public void setFailureName(String failureName) {
      this.failureName = failureName;
   }

   public String getFailureName() {
      return this.failureName;
   }

   public void setBookTimes(Integer bookTimes) {
      this.bookTimes = bookTimes;
   }

   public Integer getBookTimes() {
      return this.bookTimes;
   }

   public void setEngineerName(String engineerName) {
      this.engineerName = engineerName;
   }

   public String getEngineerName() {
      return this.engineerName;
   }

   public void setPic1(String pic1) {
      this.pic1 = pic1;
   }

   public String getPic1() {
      return this.pic1;
   }

   public void setAssessItem(String assessItem) {
      this.assessItem = assessItem;
   }

   public String getAssessItem() {
      return this.assessItem;
   }

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setSiteMobile(String siteMobile) {
      this.siteMobile = siteMobile;
   }

   public String getSiteMobile() {
      return this.siteMobile;
   }

   public void setProcessType(Integer processType) {
      this.processType = processType;
   }

   public Integer getProcessType() {
      return this.processType;
   }

   public void setPic2(String pic2) {
      this.pic2 = pic2;
   }

   public String getPic2() {
      return this.pic2;
   }

   public void setPic3(String pic3) {
      this.pic3 = pic3;
   }

   public String getPic3() {
      return this.pic3;
   }

   public void setEngineerMobile(String engineerMobile) {
      this.engineerMobile = engineerMobile;
   }

   public String getEngineerMobile() {
      return this.engineerMobile;
   }

   public void setDealRemark(String dealRemark) {
      this.dealRemark = dealRemark;
   }

   public String getDealRemark() {
      return this.dealRemark;
   }

   public void setPic4(String pic4) {
      this.pic4 = pic4;
   }

   public String getPic4() {
      return this.pic4;
   }

   public void setFixMethod(String fixMethod) {
      this.fixMethod = fixMethod;
   }

   public String getFixMethod() {
      return this.fixMethod;
   }

   public void setSiteCode(String siteCode) {
      this.siteCode = siteCode;
   }

   public String getSiteCode() {
      return this.siteCode;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getAddress() {
      return this.address;
   }

   public void setNewPartName(String newPartName) {
      this.newPartName = newPartName;
   }

   public String getNewPartName() {
      return this.newPartName;
   }

   public void setOldPartName(String oldPartName) {
      this.oldPartName = oldPartName;
   }

   public String getOldPartName() {
      return this.oldPartName;
   }

   public void setCancleReason(String cancleReason) {
      this.cancleReason = cancleReason;
   }

   public String getCancleReason() {
      return this.cancleReason;
   }

   public void setCreateBy(String createBy) {
      this.createBy = createBy;
   }

   public String getCreateBy() {
      return this.createBy;
   }

   public void setNewPartCode(String newPartCode) {
      this.newPartCode = newPartCode;
   }

   public String getNewPartCode() {
      return this.newPartCode;
   }

   public void setAppid(String appid) {
      this.appid = appid;
   }

   public String getAppid() {
      return this.appid;
   }

   public void setDealResult(Integer dealResult) {
      this.dealResult = dealResult;
   }

   public Integer getDealResult() {
      return this.dealResult;
   }

   public void setSettleCode(String settleCode) {
      this.settleCode = settleCode;
   }

   public String getSettleCode() {
      return this.settleCode;
   }

   public void setPid(String pid) {
      this.pid = pid;
   }

   public String getPid() {
      return this.pid;
   }

   public void setSitePhoto(String sitePhoto) {
      this.sitePhoto = sitePhoto;
   }

   public String getSitePhoto() {
      return this.sitePhoto;
   }

   public void setInsuranceNo(String insuranceNo) {
      this.insuranceNo = insuranceNo;
   }

   public String getInsuranceNo() {
      return this.insuranceNo;
   }

   public void setInsurancePhoto(String insurancePhoto) {
      this.insurancePhoto = insurancePhoto;
   }

   public String getInsurancePhoto() {
      return this.insurancePhoto;
   }

   public void setEngineerPhoto(String engineerPhoto) {
      this.engineerPhoto = engineerPhoto;
   }

   public String getEngineerPhoto() {
      return this.engineerPhoto;
   }

   public String getApiMethod() {
      return "jingdong.ue.order.new.process";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("county", this.county);
      pmap.put("source", this.source);
      pmap.put("deliverCompany", this.deliverCompany);
      pmap.put("deliverArriveDate", this.deliverArriveDate);
      pmap.put("province", this.province);
      pmap.put("assessValue", this.assessValue);
      pmap.put("orderNo", this.orderNo);
      pmap.put("town", this.town);
      pmap.put("level", this.level);
      pmap.put("newPartPrice", this.newPartPrice);
      pmap.put("newPartQty", this.newPartQty);
      pmap.put("barcode2", this.barcode2);
      pmap.put("barcode1", this.barcode1);
      pmap.put("appointTimes", this.appointTimes);
      pmap.put("engineerCode", this.engineerCode);
      pmap.put("partStat", this.partStat);
      pmap.put("failureReason", this.failureReason);
      pmap.put("bookOperateDate", this.bookOperateDate);
      pmap.put("oldPartQty", this.oldPartQty);
      pmap.put("uniqueId", this.uniqueId);
      pmap.put("oldPartCode", this.oldPartCode);
      pmap.put("bookDate", this.bookDate);
      pmap.put("city", this.city);
      pmap.put("deliverNo", this.deliverNo);
      pmap.put("siteName", this.siteName);
      pmap.put("remark", this.remark);
      pmap.put("contactMan", this.contactMan);
      pmap.put("failureName", this.failureName);
      pmap.put("bookTimes", this.bookTimes);
      pmap.put("engineerName", this.engineerName);
      pmap.put("pic1", this.pic1);
      pmap.put("assessItem", this.assessItem);
      pmap.put("venderCode", this.venderCode);
      pmap.put("siteMobile", this.siteMobile);
      pmap.put("processType", this.processType);
      pmap.put("pic2", this.pic2);
      pmap.put("pic3", this.pic3);
      pmap.put("engineerMobile", this.engineerMobile);
      pmap.put("dealRemark", this.dealRemark);
      pmap.put("pic4", this.pic4);
      pmap.put("fixMethod", this.fixMethod);
      pmap.put("siteCode", this.siteCode);
      pmap.put("address", this.address);
      pmap.put("newPartName", this.newPartName);
      pmap.put("oldPartName", this.oldPartName);
      pmap.put("cancleReason", this.cancleReason);
      pmap.put("createBy", this.createBy);
      pmap.put("newPartCode", this.newPartCode);
      pmap.put("appid", this.appid);
      pmap.put("dealResult", this.dealResult);
      pmap.put("settleCode", this.settleCode);
      pmap.put("pid", this.pid);
      pmap.put("sitePhoto", this.sitePhoto);
      pmap.put("insuranceNo", this.insuranceNo);
      pmap.put("insurancePhoto", this.insurancePhoto);
      pmap.put("engineerPhoto", this.engineerPhoto);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeOrderNewProcessResponse> getResponseClass() {
      return UeOrderNewProcessResponse.class;
   }
}
