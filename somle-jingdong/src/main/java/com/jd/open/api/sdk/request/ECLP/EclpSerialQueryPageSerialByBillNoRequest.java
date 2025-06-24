package com.jd.open.api.sdk.request.ECLP;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ECLP.EclpSerialQueryPageSerialByBillNoResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class EclpSerialQueryPageSerialByBillNoRequest extends AbstractRequest implements JdRequest<EclpSerialQueryPageSerialByBillNoResponse> {
   private String billNo;
   private Byte billType;
   private Integer pageNo;
   private Integer pageSize;
   private Byte queryType;
   private String isvBizNo;
   private String waybillCode;
   private String ownerNo;

   public void setBillNo(String billNo) {
      this.billNo = billNo;
   }

   public String getBillNo() {
      return this.billNo;
   }

   public void setBillType(Byte billType) {
      this.billType = billType;
   }

   public Byte getBillType() {
      return this.billType;
   }

   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   public Integer getPageNo() {
      return this.pageNo;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setQueryType(Byte queryType) {
      this.queryType = queryType;
   }

   public Byte getQueryType() {
      return this.queryType;
   }

   public void setIsvBizNo(String isvBizNo) {
      this.isvBizNo = isvBizNo;
   }

   public String getIsvBizNo() {
      return this.isvBizNo;
   }

   public void setWaybillCode(String waybillCode) {
      this.waybillCode = waybillCode;
   }

   public String getWaybillCode() {
      return this.waybillCode;
   }

   public void setOwnerNo(String ownerNo) {
      this.ownerNo = ownerNo;
   }

   public String getOwnerNo() {
      return this.ownerNo;
   }

   public String getApiMethod() {
      return "jingdong.eclp.serial.queryPageSerialByBillNo";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("billNo", this.billNo);
      pmap.put("billType", this.billType);
      pmap.put("pageNo", this.pageNo);
      pmap.put("pageSize", this.pageSize);
      pmap.put("queryType", this.queryType);
      pmap.put("isvBizNo", this.isvBizNo);
      pmap.put("waybillCode", this.waybillCode);
      pmap.put("ownerNo", this.ownerNo);
      return JsonUtil.toJson(pmap);
   }

   public Class<EclpSerialQueryPageSerialByBillNoResponse> getResponseClass() {
      return EclpSerialQueryPageSerialByBillNoResponse.class;
   }
}
