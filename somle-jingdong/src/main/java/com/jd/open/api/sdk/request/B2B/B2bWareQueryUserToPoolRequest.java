package com.jd.open.api.sdk.request.B2B;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.B2B.B2bWareQueryUserToPoolResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class B2bWareQueryUserToPoolRequest extends AbstractRequest implements JdRequest<B2bWareQueryUserToPoolResponse> {
   private String businessChannel;
   private String mappingId;
   private Date endModifyTime;
   private String userToPoolSortField;
   private Integer pageSize;
   private Date startCreateTime;
   private String attributeId;
   private Integer mappingLevel;
   private Date startModifyTime;
   private Long b2bMappingId;
   private Integer cateType;
   private Integer wareMappingType;
   private Integer pageNo;
   private String bizPoolType;
   private String b2bUserToPoolQueryTypeEnum;
   private String editor;
   private String creator;
   private Integer totalItem;
   private Integer totalPage;
   private String sortTypeEnum;
   private Long b2bPoolId;
   private Date endCreateTime;
   private String b2bPoolName;
   private Long lastB2bMappingId;
   private Integer cateId;
   private Integer mappingType;
   private Long poolGroupId;
   private String thirdMappingId;
   private String outerMappingId;
   private Integer dataSource;

   public void setBusinessChannel(String businessChannel) {
      this.businessChannel = businessChannel;
   }

   public String getBusinessChannel() {
      return this.businessChannel;
   }

   public void setMappingId(String mappingId) {
      this.mappingId = mappingId;
   }

   public String getMappingId() {
      return this.mappingId;
   }

   public void setEndModifyTime(Date endModifyTime) {
      this.endModifyTime = endModifyTime;
   }

   public Date getEndModifyTime() {
      return this.endModifyTime;
   }

   public void setUserToPoolSortField(String userToPoolSortField) {
      this.userToPoolSortField = userToPoolSortField;
   }

   public String getUserToPoolSortField() {
      return this.userToPoolSortField;
   }

   public void setPageSize(Integer pageSize) {
      this.pageSize = pageSize;
   }

   public Integer getPageSize() {
      return this.pageSize;
   }

   public void setStartCreateTime(Date startCreateTime) {
      this.startCreateTime = startCreateTime;
   }

   public Date getStartCreateTime() {
      return this.startCreateTime;
   }

   public void setAttributeId(String attributeId) {
      this.attributeId = attributeId;
   }

   public String getAttributeId() {
      return this.attributeId;
   }

   public void setMappingLevel(Integer mappingLevel) {
      this.mappingLevel = mappingLevel;
   }

   public Integer getMappingLevel() {
      return this.mappingLevel;
   }

   public void setStartModifyTime(Date startModifyTime) {
      this.startModifyTime = startModifyTime;
   }

   public Date getStartModifyTime() {
      return this.startModifyTime;
   }

   public void setB2bMappingId(Long b2bMappingId) {
      this.b2bMappingId = b2bMappingId;
   }

   public Long getB2bMappingId() {
      return this.b2bMappingId;
   }

   public void setCateType(Integer cateType) {
      this.cateType = cateType;
   }

   public Integer getCateType() {
      return this.cateType;
   }

   public void setWareMappingType(Integer wareMappingType) {
      this.wareMappingType = wareMappingType;
   }

   public Integer getWareMappingType() {
      return this.wareMappingType;
   }

   public void setPageNo(Integer pageNo) {
      this.pageNo = pageNo;
   }

   public Integer getPageNo() {
      return this.pageNo;
   }

   public void setBizPoolType(String bizPoolType) {
      this.bizPoolType = bizPoolType;
   }

   public String getBizPoolType() {
      return this.bizPoolType;
   }

   public void setB2bUserToPoolQueryTypeEnum(String b2bUserToPoolQueryTypeEnum) {
      this.b2bUserToPoolQueryTypeEnum = b2bUserToPoolQueryTypeEnum;
   }

   public String getB2bUserToPoolQueryTypeEnum() {
      return this.b2bUserToPoolQueryTypeEnum;
   }

   public void setEditor(String editor) {
      this.editor = editor;
   }

   public String getEditor() {
      return this.editor;
   }

   public void setCreator(String creator) {
      this.creator = creator;
   }

   public String getCreator() {
      return this.creator;
   }

   public void setTotalItem(Integer totalItem) {
      this.totalItem = totalItem;
   }

   public Integer getTotalItem() {
      return this.totalItem;
   }

   public void setTotalPage(Integer totalPage) {
      this.totalPage = totalPage;
   }

   public Integer getTotalPage() {
      return this.totalPage;
   }

   public void setSortTypeEnum(String sortTypeEnum) {
      this.sortTypeEnum = sortTypeEnum;
   }

   public String getSortTypeEnum() {
      return this.sortTypeEnum;
   }

   public void setB2bPoolId(Long b2bPoolId) {
      this.b2bPoolId = b2bPoolId;
   }

   public Long getB2bPoolId() {
      return this.b2bPoolId;
   }

   public void setEndCreateTime(Date endCreateTime) {
      this.endCreateTime = endCreateTime;
   }

   public Date getEndCreateTime() {
      return this.endCreateTime;
   }

   public void setB2bPoolName(String b2bPoolName) {
      this.b2bPoolName = b2bPoolName;
   }

   public String getB2bPoolName() {
      return this.b2bPoolName;
   }

   public void setLastB2bMappingId(Long lastB2bMappingId) {
      this.lastB2bMappingId = lastB2bMappingId;
   }

   public Long getLastB2bMappingId() {
      return this.lastB2bMappingId;
   }

   public void setCateId(Integer cateId) {
      this.cateId = cateId;
   }

   public Integer getCateId() {
      return this.cateId;
   }

   public void setMappingType(Integer mappingType) {
      this.mappingType = mappingType;
   }

   public Integer getMappingType() {
      return this.mappingType;
   }

   public void setPoolGroupId(Long poolGroupId) {
      this.poolGroupId = poolGroupId;
   }

   public Long getPoolGroupId() {
      return this.poolGroupId;
   }

   public void setThirdMappingId(String thirdMappingId) {
      this.thirdMappingId = thirdMappingId;
   }

   public String getThirdMappingId() {
      return this.thirdMappingId;
   }

   public void setOuterMappingId(String outerMappingId) {
      this.outerMappingId = outerMappingId;
   }

   public String getOuterMappingId() {
      return this.outerMappingId;
   }

   public void setDataSource(Integer dataSource) {
      this.dataSource = dataSource;
   }

   public Integer getDataSource() {
      return this.dataSource;
   }

   public String getApiMethod() {
      return "jingdong.b2b.ware.queryUserToPool";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("businessChannel", this.businessChannel);
      pmap.put("mappingId", this.mappingId);

      try {
         if (this.endModifyTime != null) {
            pmap.put("endModifyTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endModifyTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("userToPoolSortField", this.userToPoolSortField);
      pmap.put("pageSize", this.pageSize);

      try {
         if (this.startCreateTime != null) {
            pmap.put("startCreateTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.startCreateTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("attributeId", this.attributeId);
      pmap.put("mappingLevel", this.mappingLevel);

      try {
         if (this.startModifyTime != null) {
            pmap.put("startModifyTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.startModifyTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("b2bMappingId", this.b2bMappingId);
      pmap.put("cateType", this.cateType);
      pmap.put("wareMappingType", this.wareMappingType);
      pmap.put("pageNo", this.pageNo);
      pmap.put("bizPoolType", this.bizPoolType);
      pmap.put("b2bUserToPoolQueryTypeEnum", this.b2bUserToPoolQueryTypeEnum);
      pmap.put("editor", this.editor);
      pmap.put("creator", this.creator);
      pmap.put("totalItem", this.totalItem);
      pmap.put("totalPage", this.totalPage);
      pmap.put("sortTypeEnum", this.sortTypeEnum);
      pmap.put("b2bPoolId", this.b2bPoolId);

      try {
         if (this.endCreateTime != null) {
            pmap.put("endCreateTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.endCreateTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("b2bPoolName", this.b2bPoolName);
      pmap.put("lastB2bMappingId", this.lastB2bMappingId);
      pmap.put("cateId", this.cateId);
      pmap.put("mappingType", this.mappingType);
      pmap.put("poolGroupId", this.poolGroupId);
      pmap.put("thirdMappingId", this.thirdMappingId);
      pmap.put("outerMappingId", this.outerMappingId);
      pmap.put("dataSource", this.dataSource);
      return JsonUtil.toJson(pmap);
   }

   public Class<B2bWareQueryUserToPoolResponse> getResponseClass() {
      return B2bWareQueryUserToPoolResponse.class;
   }
}
