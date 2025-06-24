package com.jd.open.api.sdk.request.B2B;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.B2B.B2bPoPoMidProviderQueryPurOrdersResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class B2bPoPoMidProviderQueryPurOrdersRequest extends AbstractRequest implements JdRequest<B2bPoPoMidProviderQueryPurOrdersResponse> {
   private String userName;
   private String companyName;
   private Integer issueInvoice;
   private Date submitPoTimeFrom;
   private Date submitPoTimeTo;
   private Integer pageSize;
   private Integer pageIndex;
   private Integer consProvinceId;
   private Integer consCityId;
   private Integer consCountyId;
   private Integer consTownId;
   private String consName;
   private String OrederId;
   private String id;
   private Long OrederId1;
   private Integer OrederId2;
   private String OrederId3;
   private Integer OrederId4;
   private Integer OrederId5;
   private Long OrederId6;
   private Integer OrederId7;
   private Integer OrederId8;
   private Long OrederId9;
   private Integer OrederId10;
   private Long OrederId11;
   private Long OrederId12;
   private Long OrederId13;
   private Integer OrederId14;

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public String getUserName() {
      return this.userName;
   }

   public void setCompanyName(String companyName) {
      this.companyName = companyName;
   }

   public String getCompanyName() {
      return this.companyName;
   }

   public void setIssueInvoice(Integer issueInvoice) {
      this.issueInvoice = issueInvoice;
   }

   public Integer getIssueInvoice() {
      return this.issueInvoice;
   }

   public void setSubmitPoTimeFrom(Date submitPoTimeFrom) {
      this.submitPoTimeFrom = submitPoTimeFrom;
   }

   public Date getSubmitPoTimeFrom() {
      return this.submitPoTimeFrom;
   }

   public void setSubmitPoTimeTo(Date submitPoTimeTo) {
      this.submitPoTimeTo = submitPoTimeTo;
   }

   public Date getSubmitPoTimeTo() {
      return this.submitPoTimeTo;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setPageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
   }

   public Integer getPageIndex() {
      return this.pageIndex;
   }

   public void setConsProvinceId(Integer consProvinceId) {
      this.consProvinceId = consProvinceId;
   }

   public Integer getConsProvinceId() {
      return this.consProvinceId;
   }

   public void setConsCityId(Integer consCityId) {
      this.consCityId = consCityId;
   }

   public Integer getConsCityId() {
      return this.consCityId;
   }

   public void setConsCountyId(Integer consCountyId) {
      this.consCountyId = consCountyId;
   }

   public Integer getConsCountyId() {
      return this.consCountyId;
   }

   public void setConsTownId(Integer consTownId) {
      this.consTownId = consTownId;
   }

   public Integer getConsTownId() {
      return this.consTownId;
   }

   public void setConsName(String consName) {
      this.consName = consName;
   }

   public String getConsName() {
      return this.consName;
   }

   public void setOrederId(String OrederId) {
      this.OrederId = OrederId;
   }

   public String getOrederId() {
      return this.OrederId;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getId() {
      return this.id;
   }

   public void setOrederId1(Long OrederId1) {
      this.OrederId1 = OrederId1;
   }

   public Long getOrederId1() {
      return this.OrederId1;
   }

   public void setOrederId2(Integer OrederId2) {
      this.OrederId2 = OrederId2;
   }

   public Integer getOrederId2() {
      return this.OrederId2;
   }

   public void setOrederId3(String OrederId3) {
      this.OrederId3 = OrederId3;
   }

   public String getOrederId3() {
      return this.OrederId3;
   }

   public void setOrederId4(Integer OrederId4) {
      this.OrederId4 = OrederId4;
   }

   public Integer getOrederId4() {
      return this.OrederId4;
   }

   public void setOrederId5(Integer OrederId5) {
      this.OrederId5 = OrederId5;
   }

   public Integer getOrederId5() {
      return this.OrederId5;
   }

   public void setOrederId6(Long OrederId6) {
      this.OrederId6 = OrederId6;
   }

   public Long getOrederId6() {
      return this.OrederId6;
   }

   public void setOrederId7(Integer OrederId7) {
      this.OrederId7 = OrederId7;
   }

   public Integer getOrederId7() {
      return this.OrederId7;
   }

   public void setOrederId8(Integer OrederId8) {
      this.OrederId8 = OrederId8;
   }

   public Integer getOrederId8() {
      return this.OrederId8;
   }

   public void setOrederId9(Long OrederId9) {
      this.OrederId9 = OrederId9;
   }

   public Long getOrederId9() {
      return this.OrederId9;
   }

   public void setOrederId10(Integer OrederId10) {
      this.OrederId10 = OrederId10;
   }

   public Integer getOrederId10() {
      return this.OrederId10;
   }

   public void setOrederId11(Long OrederId11) {
      this.OrederId11 = OrederId11;
   }

   public Long getOrederId11() {
      return this.OrederId11;
   }

   public void setOrederId12(Long OrederId12) {
      this.OrederId12 = OrederId12;
   }

   public Long getOrederId12() {
      return this.OrederId12;
   }

   public void setOrederId13(Long OrederId13) {
      this.OrederId13 = OrederId13;
   }

   public Long getOrederId13() {
      return this.OrederId13;
   }

   public void setOrederId14(Integer OrederId14) {
      this.OrederId14 = OrederId14;
   }

   public Integer getOrederId14() {
      return this.OrederId14;
   }

   public String getApiMethod() {
      return "jingdong.b2b.po.PoMidProvider.queryPurOrders";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("userName", this.userName);
      pmap.put("companyName", this.companyName);
      pmap.put("issueInvoice", this.issueInvoice);

      try {
         if (this.submitPoTimeFrom != null) {
            pmap.put("submitPoTimeFrom", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.submitPoTimeFrom));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.submitPoTimeTo != null) {
            pmap.put("submitPoTimeTo", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.submitPoTimeTo));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("pageSize", this.pageSize);
      pmap.put("pageIndex", this.pageIndex);
      pmap.put("consProvinceId", this.consProvinceId);
      pmap.put("consCityId", this.consCityId);
      pmap.put("consCountyId", this.consCountyId);
      pmap.put("consTownId", this.consTownId);
      pmap.put("consName", this.consName);
      pmap.put("OrederId", this.OrederId);
      pmap.put("id", this.id);
      pmap.put("OrederId1", this.OrederId1);
      pmap.put("OrederId2", this.OrederId2);
      pmap.put("OrederId3", this.OrederId3);
      pmap.put("OrederId4", this.OrederId4);
      pmap.put("OrederId5", this.OrederId5);
      pmap.put("OrederId6", this.OrederId6);
      pmap.put("OrederId7", this.OrederId7);
      pmap.put("OrederId8", this.OrederId8);
      pmap.put("OrederId9", this.OrederId9);
      pmap.put("OrederId10", this.OrederId10);
      pmap.put("OrederId11", this.OrederId11);
      pmap.put("OrederId12", this.OrederId12);
      pmap.put("OrederId13", this.OrederId13);
      pmap.put("OrederId14", this.OrederId14);
      return JsonUtil.toJson(pmap);
   }

   public Class<B2bPoPoMidProviderQueryPurOrdersResponse> getResponseClass() {
      return B2bPoPoMidProviderQueryPurOrdersResponse.class;
   }
}
