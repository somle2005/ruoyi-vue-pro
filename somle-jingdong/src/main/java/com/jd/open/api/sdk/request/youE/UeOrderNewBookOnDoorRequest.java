package com.jd.open.api.sdk.request.youE;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.youE.UeOrderNewBookOnDoorResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class UeOrderNewBookOnDoorRequest extends AbstractRequest implements JdRequest<UeOrderNewBookOnDoorResponse> {
   private String orderNo;
   private String bookOperateDate;
   private String bookDate;
   private Integer bookTimes;
   private String createBy;
   private String appid;
   private String venderCode;
   private String bookingStartDate;
   private String bookingEndDate;
   private String remark;
   private Byte changeReason;

   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   public String getOrderNo() {
      return this.orderNo;
   }

   public void setBookOperateDate(String bookOperateDate) {
      this.bookOperateDate = bookOperateDate;
   }

   public String getBookOperateDate() {
      return this.bookOperateDate;
   }

   public void setBookDate(String bookDate) {
      this.bookDate = bookDate;
   }

   public String getBookDate() {
      return this.bookDate;
   }

   public void setBookTimes(Integer bookTimes) {
      this.bookTimes = bookTimes;
   }

   public Integer getBookTimes() {
      return this.bookTimes;
   }

   public void setCreateBy(String createBy) {
      this.createBy = createBy;
   }

   public String getCreateBy() {
      return this.createBy;
   }

   public void setAppid(String appid) {
      this.appid = appid;
   }

   public String getAppid() {
      return this.appid;
   }

   public void setVenderCode(String venderCode) {
      this.venderCode = venderCode;
   }

   public String getVenderCode() {
      return this.venderCode;
   }

   public void setBookingStartDate(String bookingStartDate) {
      this.bookingStartDate = bookingStartDate;
   }

   public String getBookingStartDate() {
      return this.bookingStartDate;
   }

   public void setBookingEndDate(String bookingEndDate) {
      this.bookingEndDate = bookingEndDate;
   }

   public String getBookingEndDate() {
      return this.bookingEndDate;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getRemark() {
      return this.remark;
   }

   public void setChangeReason(Byte changeReason) {
      this.changeReason = changeReason;
   }

   public Byte getChangeReason() {
      return this.changeReason;
   }

   public String getApiMethod() {
      return "jingdong.ue.order.new.bookOnDoor";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("orderNo", this.orderNo);
      pmap.put("bookOperateDate", this.bookOperateDate);
      pmap.put("bookDate", this.bookDate);
      pmap.put("bookTimes", this.bookTimes);
      pmap.put("createBy", this.createBy);
      pmap.put("appid", this.appid);
      pmap.put("venderCode", this.venderCode);
      pmap.put("bookingStartDate", this.bookingStartDate);
      pmap.put("bookingEndDate", this.bookingEndDate);
      pmap.put("remark", this.remark);
      pmap.put("changeReason", this.changeReason);
      return JsonUtil.toJson(pmap);
   }

   public Class<UeOrderNewBookOnDoorResponse> getResponseClass() {
      return UeOrderNewBookOnDoorResponse.class;
   }
}
