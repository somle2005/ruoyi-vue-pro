package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.WareReadSearchWare4ValidResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class WareReadSearchWare4ValidRequest extends AbstractRequest implements JdRequest<WareReadSearchWare4ValidResponse> {
   private String wareId;
   private String searchKey;
   private String searchField;
   private Long categoryId;
   private Long shopCategoryIdLevel1;
   private Long shopCategoryIdLevel2;
   private Long templateId;
   private Long promiseId;
   private Long brandId;
   private String featureKey;
   private String featureValue;
   private String wareStatusValue;
   private String itemNum;
   private String barCode;
   private Integer colType;
   private Date startCreatedTime;
   private Date endCreatedTime;
   private BigDecimal startJdPrice;
   private BigDecimal endJdPrice;
   private Date startOnlineTime;
   private Date endOnlineTime;
   private Date startModifiedTime;
   private Date endModifiedTime;
   private Date startOfflineTime;
   private Date endOfflineTime;
   private Long startStockNum;
   private Long endStockNum;
   private String orderField;
   private String orderType;
   private Integer pageNo;
   private Integer pageSize;
   private Long transportId;
   private Integer claim;
   private Long groupId;
   private Long multiCategoryId;
   private String warePropKey;
   private String warePropValue;
   private String field;

   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   public String getWareId() {
      return this.wareId;
   }

   public void setSearchKey(String searchKey) {
      this.searchKey = searchKey;
   }

   public String getSearchKey() {
      return this.searchKey;
   }

   public void setSearchField(String searchField) {
      this.searchField = searchField;
   }

   public String getSearchField() {
      return this.searchField;
   }

   public void setCategoryId(Long categoryId) {
      this.categoryId = categoryId;
   }

   public Long getCategoryId() {
      return this.categoryId;
   }

   public void setShopCategoryIdLevel1(Long shopCategoryIdLevel1) {
      this.shopCategoryIdLevel1 = shopCategoryIdLevel1;
   }

   public Long getShopCategoryIdLevel1() {
      return this.shopCategoryIdLevel1;
   }

   public void setShopCategoryIdLevel2(Long shopCategoryIdLevel2) {
      this.shopCategoryIdLevel2 = shopCategoryIdLevel2;
   }

   public Long getShopCategoryIdLevel2() {
      return this.shopCategoryIdLevel2;
   }

   public void setTemplateId(Long templateId) {
      this.templateId = templateId;
   }

   public Long getTemplateId() {
      return this.templateId;
   }

   public void setPromiseId(Long promiseId) {
      this.promiseId = promiseId;
   }

   public Long getPromiseId() {
      return this.promiseId;
   }

   public void setBrandId(Long brandId) {
      this.brandId = brandId;
   }

   public Long getBrandId() {
      return this.brandId;
   }

   public void setFeatureKey(String featureKey) {
      this.featureKey = featureKey;
   }

   public String getFeatureKey() {
      return this.featureKey;
   }

   public void setFeatureValue(String featureValue) {
      this.featureValue = featureValue;
   }

   public String getFeatureValue() {
      return this.featureValue;
   }

   public void setWareStatusValue(String wareStatusValue) {
      this.wareStatusValue = wareStatusValue;
   }

   public String getWareStatusValue() {
      return this.wareStatusValue;
   }

   public void setItemNum(String itemNum) {
      this.itemNum = itemNum;
   }

   public String getItemNum() {
      return this.itemNum;
   }

   public void setBarCode(String barCode) {
      this.barCode = barCode;
   }

   public String getBarCode() {
      return this.barCode;
   }

   public void setColType(Integer colType) {
      this.colType = colType;
   }

   public Integer getColType() {
      return this.colType;
   }

   public void setStartCreatedTime(Date startCreatedTime) {
      this.startCreatedTime = startCreatedTime;
   }

   public Date getStartCreatedTime() {
      return this.startCreatedTime;
   }

   public void setEndCreatedTime(Date endCreatedTime) {
      this.endCreatedTime = endCreatedTime;
   }

   public Date getEndCreatedTime() {
      return this.endCreatedTime;
   }

   public void setStartJdPrice(BigDecimal startJdPrice) {
      this.startJdPrice = startJdPrice;
   }

   public BigDecimal getStartJdPrice() {
      return this.startJdPrice;
   }

   public void setEndJdPrice(BigDecimal endJdPrice) {
      this.endJdPrice = endJdPrice;
   }

   public BigDecimal getEndJdPrice() {
      return this.endJdPrice;
   }

   public void setStartOnlineTime(Date startOnlineTime) {
      this.startOnlineTime = startOnlineTime;
   }

   public Date getStartOnlineTime() {
      return this.startOnlineTime;
   }

   public void setEndOnlineTime(Date endOnlineTime) {
      this.endOnlineTime = endOnlineTime;
   }

   public Date getEndOnlineTime() {
      return this.endOnlineTime;
   }

   public void setStartModifiedTime(Date startModifiedTime) {
      this.startModifiedTime = startModifiedTime;
   }

   public Date getStartModifiedTime() {
      return this.startModifiedTime;
   }

   public void setEndModifiedTime(Date endModifiedTime) {
      this.endModifiedTime = endModifiedTime;
   }

   public Date getEndModifiedTime() {
      return this.endModifiedTime;
   }

   public void setStartOfflineTime(Date startOfflineTime) {
      this.startOfflineTime = startOfflineTime;
   }

   public Date getStartOfflineTime() {
      return this.startOfflineTime;
   }

   public void setEndOfflineTime(Date endOfflineTime) {
      this.endOfflineTime = endOfflineTime;
   }

   public Date getEndOfflineTime() {
      return this.endOfflineTime;
   }

   public void setStartStockNum(Long startStockNum) {
      this.startStockNum = startStockNum;
   }

   public Long getStartStockNum() {
      return this.startStockNum;
   }

   public void setEndStockNum(Long endStockNum) {
      this.endStockNum = endStockNum;
   }

   public Long getEndStockNum() {
      return this.endStockNum;
   }

   public void setOrderField(String orderField) {
      this.orderField = orderField;
   }

   public String getOrderField() {
      return this.orderField;
   }

   public void setOrderType(String orderType) {
      this.orderType = orderType;
   }

   public String getOrderType() {
      return this.orderType;
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

   public void setTransportId(Long transportId) {
      this.transportId = transportId;
   }

   public Long getTransportId() {
      return this.transportId;
   }

   public void setClaim(Integer claim) {
      this.claim = claim;
   }

   public Integer getClaim() {
      return this.claim;
   }

   public void setGroupId(Long groupId) {
      this.groupId = groupId;
   }

   public Long getGroupId() {
      return this.groupId;
   }

   public void setMultiCategoryId(Long multiCategoryId) {
      this.multiCategoryId = multiCategoryId;
   }

   public Long getMultiCategoryId() {
      return this.multiCategoryId;
   }

   public void setWarePropKey(String warePropKey) {
      this.warePropKey = warePropKey;
   }

   public String getWarePropKey() {
      return this.warePropKey;
   }

   public void setWarePropValue(String warePropValue) {
      this.warePropValue = warePropValue;
   }

   public String getWarePropValue() {
      return this.warePropValue;
   }

   public void setField(String field) {
      this.field = field;
   }

   public String getField() {
      return this.field;
   }

   public String getApiMethod() {
      return "jingdong.ware.read.searchWare4Valid";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("wareId", this.wareId);
      pmap.put("searchKey", this.searchKey);
      pmap.put("searchField", this.searchField);
      pmap.put("categoryId", this.categoryId);
      pmap.put("shopCategoryIdLevel1", this.shopCategoryIdLevel1);
      pmap.put("shopCategoryIdLevel2", this.shopCategoryIdLevel2);
      pmap.put("templateId", this.templateId);
      pmap.put("promiseId", this.promiseId);
      pmap.put("brandId", this.brandId);
      pmap.put("featureKey", this.featureKey);
      pmap.put("featureValue", this.featureValue);
      pmap.put("wareStatusValue", this.wareStatusValue);
      pmap.put("itemNum", this.itemNum);
      pmap.put("barCode", this.barCode);
      pmap.put("colType", this.colType);

      try {
         if (this.startCreatedTime != null) {
            pmap.put("startCreatedTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.startCreatedTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.endCreatedTime != null) {
            pmap.put("endCreatedTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endCreatedTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("startJdPrice", this.startJdPrice);
      pmap.put("endJdPrice", this.endJdPrice);

      try {
         if (this.startOnlineTime != null) {
            pmap.put("startOnlineTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.startOnlineTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.endOnlineTime != null) {
            pmap.put("endOnlineTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endOnlineTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.startModifiedTime != null) {
            pmap.put("startModifiedTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.startModifiedTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.endModifiedTime != null) {
            pmap.put("endModifiedTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endModifiedTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.startOfflineTime != null) {
            pmap.put("startOfflineTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.startOfflineTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.endOfflineTime != null) {
            pmap.put("endOfflineTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endOfflineTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("startStockNum", this.startStockNum);
      pmap.put("endStockNum", this.endStockNum);
      pmap.put("orderField", this.orderField);
      pmap.put("orderType", this.orderType);
      pmap.put("pageNo", this.pageNo);
      pmap.put("pageSize", this.pageSize);
      pmap.put("transportId", this.transportId);
      pmap.put("claim", this.claim);
      pmap.put("groupId", this.groupId);
      pmap.put("multiCategoryId", this.multiCategoryId);
      pmap.put("warePropKey", this.warePropKey);
      pmap.put("warePropValue", this.warePropValue);
      pmap.put("field", this.field);
      return JsonUtil.toJson(pmap);
   }

   public Class<WareReadSearchWare4ValidResponse> getResponseClass() {
      return WareReadSearchWare4ValidResponse.class;
   }
}
