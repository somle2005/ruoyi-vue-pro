package com.jd.open.api.sdk.request.supplier;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.supplier.DropshipDpsSearchAllOrdersResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class DropshipDpsSearchAllOrdersRequest extends AbstractRequest implements JdRequest<DropshipDpsSearchAllOrdersResponse> {
   private Integer pageSize;
   private Integer page;
   private Date beginDate;
   private Date endDate;
   private Date modifiedBeginDate;
   private Date modifiedEndDate;
   private String pinBuyer;
   private String openIdBuyer;
   private String xidBuyer;

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setPage(Integer page) {
      this.page = page;
   }

   public Integer getPage() {
      return this.page;
   }

   public void setBeginDate(Date beginDate) {
      this.beginDate = beginDate;
   }

   public Date getBeginDate() {
      return this.beginDate;
   }

   public void setEndDate(Date endDate) {
      this.endDate = endDate;
   }

   public Date getEndDate() {
      return this.endDate;
   }

   public void setModifiedBeginDate(Date modifiedBeginDate) {
      this.modifiedBeginDate = modifiedBeginDate;
   }

   public Date getModifiedBeginDate() {
      return this.modifiedBeginDate;
   }

   public void setModifiedEndDate(Date modifiedEndDate) {
      this.modifiedEndDate = modifiedEndDate;
   }

   public Date getModifiedEndDate() {
      return this.modifiedEndDate;
   }

   public void setPinBuyer(String pinBuyer) {
      this.pinBuyer = pinBuyer;
   }

   public String getPinBuyer() {
      return this.pinBuyer;
   }

   public void setOpenIdBuyer(String openIdBuyer) {
      this.openIdBuyer = openIdBuyer;
   }

   public String getOpenIdBuyer() {
      return this.openIdBuyer;
   }

   public void setXidBuyer(String xidBuyer) {
      this.xidBuyer = xidBuyer;
   }

   public String getXidBuyer() {
      return this.xidBuyer;
   }

   public String getApiMethod() {
      return "jingdong.dropship.dps.searchAllOrders";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("pageSize", this.pageSize);
      pmap.put("page", this.page);

      try {
         if (this.beginDate != null) {
            pmap.put("beginDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.beginDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.endDate != null) {
            pmap.put("endDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.modifiedBeginDate != null) {
            pmap.put("modifiedBeginDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.modifiedBeginDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.modifiedEndDate != null) {
            pmap.put("modifiedEndDate", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.modifiedEndDate));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("pin_buyer", this.pinBuyer);
      pmap.put("open_id_buyer", this.openIdBuyer);
      pmap.put("xid_buyer", this.xidBuyer);
      return JsonUtil.toJson(pmap);
   }

   public Class<DropshipDpsSearchAllOrdersResponse> getResponseClass() {
      return DropshipDpsSearchAllOrdersResponse.class;
   }
}
