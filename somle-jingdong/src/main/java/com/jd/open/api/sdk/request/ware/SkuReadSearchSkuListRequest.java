package com.jd.open.api.sdk.request.ware;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.ware.SkuReadSearchSkuListResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class SkuReadSearchSkuListRequest extends AbstractRequest implements JdRequest<SkuReadSearchSkuListResponse> {
   private String wareId;
   private String skuId;
   private String skuStatuValue;
   private Long maxStockNum;
   private Long minStockNum;
   private Date endCreatedTime;
   private Date endModifiedTime;
   private Date startCreatedTime;
   private Date startModifiedTime;
   private String outId;
   private Integer colType;
   private String itemNum;
   private String wareTitle;
   private String orderFiled;
   private String orderType;
   private Integer pageNo;
   private Integer pageSize;
   private String valid;
   private String key;
   private String value;
   private String cn;
   private String field;

   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   public String getWareId() {
      return this.wareId;
   }

   public void setSkuId(String skuId) {
      this.skuId = skuId;
   }

   public String getSkuId() {
      return this.skuId;
   }

   public void setSkuStatuValue(String skuStatuValue) {
      this.skuStatuValue = skuStatuValue;
   }

   public String getSkuStatuValue() {
      return this.skuStatuValue;
   }

   public void setMaxStockNum(Long maxStockNum) {
      this.maxStockNum = maxStockNum;
   }

   public Long getMaxStockNum() {
      return this.maxStockNum;
   }

   public void setMinStockNum(Long minStockNum) {
      this.minStockNum = minStockNum;
   }

   public Long getMinStockNum() {
      return this.minStockNum;
   }

   public void setEndCreatedTime(Date endCreatedTime) {
      this.endCreatedTime = endCreatedTime;
   }

   public Date getEndCreatedTime() {
      return this.endCreatedTime;
   }

   public void setEndModifiedTime(Date endModifiedTime) {
      this.endModifiedTime = endModifiedTime;
   }

   public Date getEndModifiedTime() {
      return this.endModifiedTime;
   }

   public void setStartCreatedTime(Date startCreatedTime) {
      this.startCreatedTime = startCreatedTime;
   }

   public Date getStartCreatedTime() {
      return this.startCreatedTime;
   }

   public void setStartModifiedTime(Date startModifiedTime) {
      this.startModifiedTime = startModifiedTime;
   }

   public Date getStartModifiedTime() {
      return this.startModifiedTime;
   }

   public void setOutId(String outId) {
      this.outId = outId;
   }

   public String getOutId() {
      return this.outId;
   }

   public void setColType(Integer colType) {
      this.colType = colType;
   }

   public Integer getColType() {
      return this.colType;
   }

   public void setItemNum(String itemNum) {
      this.itemNum = itemNum;
   }

   public String getItemNum() {
      return this.itemNum;
   }

   public void setWareTitle(String wareTitle) {
      this.wareTitle = wareTitle;
   }

   public String getWareTitle() {
      return this.wareTitle;
   }

   public void setOrderFiled(String orderFiled) {
      this.orderFiled = orderFiled;
   }

   public String getOrderFiled() {
      return this.orderFiled;
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

   public void setValid(String valid) {
      this.valid = valid;
   }

   public String getValid() {
      return this.valid;
   }

   public void setKey(String key) {
      this.key = key;
   }

   public String getKey() {
      return this.key;
   }

   public void setValue(String value) {
      this.value = value;
   }

   public String getValue() {
      return this.value;
   }

   public void setCn(String cn) {
      this.cn = cn;
   }

   public String getCn() {
      return this.cn;
   }

   public void setField(String field) {
      this.field = field;
   }

   public String getField() {
      return this.field;
   }

   public String getApiMethod() {
      return "jingdong.sku.read.searchSkuList";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("wareId", this.wareId);
      pmap.put("skuId", this.skuId);
      pmap.put("skuStatuValue", this.skuStatuValue);
      pmap.put("maxStockNum", this.maxStockNum);
      pmap.put("minStockNum", this.minStockNum);

      try {
         if (this.endCreatedTime != null) {
            pmap.put("endCreatedTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endCreatedTime));
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
         if (this.startCreatedTime != null) {
            pmap.put("startCreatedTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.startCreatedTime));
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

      pmap.put("outId", this.outId);
      pmap.put("colType", this.colType);
      pmap.put("itemNum", this.itemNum);
      pmap.put("wareTitle", this.wareTitle);
      pmap.put("orderFiled", this.orderFiled);
      pmap.put("orderType", this.orderType);
      pmap.put("pageNo", this.pageNo);
      pmap.put("page_size", this.pageSize);
      pmap.put("valid", this.valid);
      pmap.put("key", this.key);
      pmap.put("value", this.value);
      pmap.put("cn", this.cn);
      pmap.put("field", this.field);
      return JsonUtil.toJson(pmap);
   }

   public Class<SkuReadSearchSkuListResponse> getResponseClass() {
      return SkuReadSearchSkuListResponse.class;
   }
}
