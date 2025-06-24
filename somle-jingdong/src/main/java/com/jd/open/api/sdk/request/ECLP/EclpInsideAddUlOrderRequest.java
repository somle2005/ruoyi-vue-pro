package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpInsideAddUlOrderResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpInsideAddUlOrderRequest extends AbstractRequest implements JdRequest<EclpInsideAddUlOrderResponse> {
   private String outUlNo;
   private String sellerNo;
   private String warehouseNo;
   private String deptNo;
   private Byte deliveryMode;
   private Byte ulType;
   private Byte allowReturnDest;
   private Byte allowLackDest;
   private Byte destMethod;
   private Byte destReason;
   private String destCompNo;
   private String receiver;
   private String receiverPhone;
   private String email;
   private String province;
   private String city;
   private String county;
   private String town;
   private String address;
   private String backEmail;
   private String createUser;
   private String createTime;
   private String remark;
   private String orderLine;
   private String goodsNo;
   private String goodsName;
   private String planQty;
   private String goodsLevel;
   private String ulItemBatchRequest;

   public void setOutUlNo(String outUlNo) {
      this.outUlNo = outUlNo;
   }

   public String getOutUlNo() {
      return this.outUlNo;
   }

   public void setSellerNo(String sellerNo) {
      this.sellerNo = sellerNo;
   }

   public String getSellerNo() {
      return this.sellerNo;
   }

   public void setWarehouseNo(String warehouseNo) {
      this.warehouseNo = warehouseNo;
   }

   public String getWarehouseNo() {
      return this.warehouseNo;
   }

   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   public String getDeptNo() {
      return this.deptNo;
   }

   public void setDeliveryMode(Byte deliveryMode) {
      this.deliveryMode = deliveryMode;
   }

   public Byte getDeliveryMode() {
      return this.deliveryMode;
   }

   public void setUlType(Byte ulType) {
      this.ulType = ulType;
   }

   public Byte getUlType() {
      return this.ulType;
   }

   public void setAllowReturnDest(Byte allowReturnDest) {
      this.allowReturnDest = allowReturnDest;
   }

   public Byte getAllowReturnDest() {
      return this.allowReturnDest;
   }

   public void setAllowLackDest(Byte allowLackDest) {
      this.allowLackDest = allowLackDest;
   }

   public Byte getAllowLackDest() {
      return this.allowLackDest;
   }

   public void setDestMethod(Byte destMethod) {
      this.destMethod = destMethod;
   }

   public Byte getDestMethod() {
      return this.destMethod;
   }

   public void setDestReason(Byte destReason) {
      this.destReason = destReason;
   }

   public Byte getDestReason() {
      return this.destReason;
   }

   public void setDestCompNo(String destCompNo) {
      this.destCompNo = destCompNo;
   }

   public String getDestCompNo() {
      return this.destCompNo;
   }

   public void setReceiver(String receiver) {
      this.receiver = receiver;
   }

   public String getReceiver() {
      return this.receiver;
   }

   public void setReceiverPhone(String receiverPhone) {
      this.receiverPhone = receiverPhone;
   }

   public String getReceiverPhone() {
      return this.receiverPhone;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getEmail() {
      return this.email;
   }

   public void setProvince(String province) {
      this.province = province;
   }

   public String getProvince() {
      return this.province;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public String getCity() {
      return this.city;
   }

   public void setCounty(String county) {
      this.county = county;
   }

   public String getCounty() {
      return this.county;
   }

   public void setTown(String town) {
      this.town = town;
   }

   public String getTown() {
      return this.town;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getAddress() {
      return this.address;
   }

   public void setBackEmail(String backEmail) {
      this.backEmail = backEmail;
   }

   public String getBackEmail() {
      return this.backEmail;
   }

   public void setCreateUser(String createUser) {
      this.createUser = createUser;
   }

   public String getCreateUser() {
      return this.createUser;
   }

   public void setCreateTime(String createTime) {
      this.createTime = createTime;
   }

   public String getCreateTime() {
      return this.createTime;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   public String getRemark() {
      return this.remark;
   }

   public void setOrderLine(String orderLine) {
      this.orderLine = orderLine;
   }

   public String getOrderLine() {
      return this.orderLine;
   }

   public void setGoodsNo(String goodsNo) {
      this.goodsNo = goodsNo;
   }

   public String getGoodsNo() {
      return this.goodsNo;
   }

   public void setGoodsName(String goodsName) {
      this.goodsName = goodsName;
   }

   public String getGoodsName() {
      return this.goodsName;
   }

   public void setPlanQty(String planQty) {
      this.planQty = planQty;
   }

   public String getPlanQty() {
      return this.planQty;
   }

   public void setGoodsLevel(String goodsLevel) {
      this.goodsLevel = goodsLevel;
   }

   public String getGoodsLevel() {
      return this.goodsLevel;
   }

   public void setUlItemBatchRequest(String ulItemBatchRequest) {
      this.ulItemBatchRequest = ulItemBatchRequest;
   }

   public String getUlItemBatchRequest() {
      return this.ulItemBatchRequest;
   }

   public String getApiMethod() {
      return "jingdong.eclp.inside.addUlOrder";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("outUlNo", this.outUlNo);
      pmap.put("sellerNo", this.sellerNo);
      pmap.put("warehouseNo", this.warehouseNo);
      pmap.put("deptNo", this.deptNo);
      pmap.put("deliveryMode", this.deliveryMode);
      pmap.put("ulType", this.ulType);
      pmap.put("allowReturnDest", this.allowReturnDest);
      pmap.put("allowLackDest", this.allowLackDest);
      pmap.put("destMethod", this.destMethod);
      pmap.put("destReason", this.destReason);
      pmap.put("destCompNo", this.destCompNo);
      pmap.put("receiver", this.receiver);
      pmap.put("receiverPhone", this.receiverPhone);
      pmap.put("email", this.email);
      pmap.put("province", this.province);
      pmap.put("city", this.city);
      pmap.put("county", this.county);
      pmap.put("town", this.town);
      pmap.put("address", this.address);
      pmap.put("backEmail", this.backEmail);
      pmap.put("createUser", this.createUser);
      pmap.put("createTime", this.createTime);
      pmap.put("remark", this.remark);
      pmap.put("orderLine", this.orderLine);
      pmap.put("goodsNo", this.goodsNo);
      pmap.put("goodsName", this.goodsName);
      pmap.put("planQty", this.planQty);
      pmap.put("goodsLevel", this.goodsLevel);
      pmap.put("ulItemBatchRequest", this.ulItemBatchRequest);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpInsideAddUlOrderResponse> getResponseClass() {
      return EclpInsideAddUlOrderResponse.class;
   }
}
