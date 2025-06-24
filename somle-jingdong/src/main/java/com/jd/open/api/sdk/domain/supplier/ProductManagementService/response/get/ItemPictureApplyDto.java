package com.jd.open.api.sdk.domain.supplier.ProductManagementService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ItemPictureApplyDto implements Serializable {
   private String applyId;
   private String yn;
   private Integer state;
   private String createBy;
   private String modifyBy;
   private String createTime;
   private String modifyTime;
   private String applyTime;
   private String wareId;
   private String name;
   private Integer brandId;
   private Integer categoryId;
   private String vendorCode;
   private List<ItemPicSkuDto> skuList;
   private List<ItemPicSkuDtoLong> skuListLong;
   private List<ItemPicSkuDtoLucency> skuListLucency;
   private String brandName;
   private Integer saleState;
   private String categoryName;
   private String saleStateName;
   private String stateName;
   private ItemPicAuditDto itemPicAuditDto;
   private Integer isPublishSchedule;
   private Date publishTime;
   private ItemPicAuditDto keeperItemPicAuditDto;
   private List<ItemPicSkuDtoGuide> skuListGuide;

   @JsonProperty("apply_id")
   public void setApplyId(String applyId) {
      this.applyId = applyId;
   }

   @JsonProperty("apply_id")
   public String getApplyId() {
      return this.applyId;
   }

   @JsonProperty("yn")
   public void setYn(String yn) {
      this.yn = yn;
   }

   @JsonProperty("yn")
   public String getYn() {
      return this.yn;
   }

   @JsonProperty("state")
   public void setState(Integer state) {
      this.state = state;
   }

   @JsonProperty("state")
   public Integer getState() {
      return this.state;
   }

   @JsonProperty("create_by")
   public void setCreateBy(String createBy) {
      this.createBy = createBy;
   }

   @JsonProperty("create_by")
   public String getCreateBy() {
      return this.createBy;
   }

   @JsonProperty("modify_by")
   public void setModifyBy(String modifyBy) {
      this.modifyBy = modifyBy;
   }

   @JsonProperty("modify_by")
   public String getModifyBy() {
      return this.modifyBy;
   }

   @JsonProperty("create_time")
   public void setCreateTime(String createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("create_time")
   public String getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("modify_time")
   public void setModifyTime(String modifyTime) {
      this.modifyTime = modifyTime;
   }

   @JsonProperty("modify_time")
   public String getModifyTime() {
      return this.modifyTime;
   }

   @JsonProperty("apply_time")
   public void setApplyTime(String applyTime) {
      this.applyTime = applyTime;
   }

   @JsonProperty("apply_time")
   public String getApplyTime() {
      return this.applyTime;
   }

   @JsonProperty("ware_id")
   public void setWareId(String wareId) {
      this.wareId = wareId;
   }

   @JsonProperty("ware_id")
   public String getWareId() {
      return this.wareId;
   }

   @JsonProperty("name")
   public void setName(String name) {
      this.name = name;
   }

   @JsonProperty("name")
   public String getName() {
      return this.name;
   }

   @JsonProperty("brand_id")
   public void setBrandId(Integer brandId) {
      this.brandId = brandId;
   }

   @JsonProperty("brand_id")
   public Integer getBrandId() {
      return this.brandId;
   }

   @JsonProperty("category_id")
   public void setCategoryId(Integer categoryId) {
      this.categoryId = categoryId;
   }

   @JsonProperty("category_id")
   public Integer getCategoryId() {
      return this.categoryId;
   }

   @JsonProperty("vendor_code")
   public void setVendorCode(String vendorCode) {
      this.vendorCode = vendorCode;
   }

   @JsonProperty("vendor_code")
   public String getVendorCode() {
      return this.vendorCode;
   }

   @JsonProperty("sku_list")
   public void setSkuList(List<ItemPicSkuDto> skuList) {
      this.skuList = skuList;
   }

   @JsonProperty("sku_list")
   public List<ItemPicSkuDto> getSkuList() {
      return this.skuList;
   }

   @JsonProperty("sku_list_long")
   public void setSkuListLong(List<ItemPicSkuDtoLong> skuListLong) {
      this.skuListLong = skuListLong;
   }

   @JsonProperty("sku_list_long")
   public List<ItemPicSkuDtoLong> getSkuListLong() {
      return this.skuListLong;
   }

   @JsonProperty("sku_list_lucency")
   public void setSkuListLucency(List<ItemPicSkuDtoLucency> skuListLucency) {
      this.skuListLucency = skuListLucency;
   }

   @JsonProperty("sku_list_lucency")
   public List<ItemPicSkuDtoLucency> getSkuListLucency() {
      return this.skuListLucency;
   }

   @JsonProperty("brand_name")
   public void setBrandName(String brandName) {
      this.brandName = brandName;
   }

   @JsonProperty("brand_name")
   public String getBrandName() {
      return this.brandName;
   }

   @JsonProperty("sale_state")
   public void setSaleState(Integer saleState) {
      this.saleState = saleState;
   }

   @JsonProperty("sale_state")
   public Integer getSaleState() {
      return this.saleState;
   }

   @JsonProperty("category_name")
   public void setCategoryName(String categoryName) {
      this.categoryName = categoryName;
   }

   @JsonProperty("category_name")
   public String getCategoryName() {
      return this.categoryName;
   }

   @JsonProperty("sale_state_name")
   public void setSaleStateName(String saleStateName) {
      this.saleStateName = saleStateName;
   }

   @JsonProperty("sale_state_name")
   public String getSaleStateName() {
      return this.saleStateName;
   }

   @JsonProperty("state_name")
   public void setStateName(String stateName) {
      this.stateName = stateName;
   }

   @JsonProperty("state_name")
   public String getStateName() {
      return this.stateName;
   }

   @JsonProperty("item_pic_audit_dto")
   public void setItemPicAuditDto(ItemPicAuditDto itemPicAuditDto) {
      this.itemPicAuditDto = itemPicAuditDto;
   }

   @JsonProperty("item_pic_audit_dto")
   public ItemPicAuditDto getItemPicAuditDto() {
      return this.itemPicAuditDto;
   }

   @JsonProperty("is_publishSchedule")
   public void setIsPublishSchedule(Integer isPublishSchedule) {
      this.isPublishSchedule = isPublishSchedule;
   }

   @JsonProperty("is_publishSchedule")
   public Integer getIsPublishSchedule() {
      return this.isPublishSchedule;
   }

   @JsonProperty("publish_time")
   public void setPublishTime(Date publishTime) {
      this.publishTime = publishTime;
   }

   @JsonProperty("publish_time")
   public Date getPublishTime() {
      return this.publishTime;
   }

   @JsonProperty("keeper_item_pic_audit_dto")
   public void setKeeperItemPicAuditDto(ItemPicAuditDto keeperItemPicAuditDto) {
      this.keeperItemPicAuditDto = keeperItemPicAuditDto;
   }

   @JsonProperty("keeper_item_pic_audit_dto")
   public ItemPicAuditDto getKeeperItemPicAuditDto() {
      return this.keeperItemPicAuditDto;
   }

   @JsonProperty("sku_list_guide")
   public void setSkuListGuide(List<ItemPicSkuDtoGuide> skuListGuide) {
      this.skuListGuide = skuListGuide;
   }

   @JsonProperty("sku_list_guide")
   public List<ItemPicSkuDtoGuide> getSkuListGuide() {
      return this.skuListGuide;
   }
}
