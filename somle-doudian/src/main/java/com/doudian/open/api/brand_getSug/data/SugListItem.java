package com.doudian.open.api.brand_getSug.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;
import java.util.Map;

//auto generated, do not edit

public class SugListItem {


	@SerializedName("brand_id")
	@OpField(desc = "品牌ID", example = "324234234")
	private Long brandId;

	@SerializedName("brand_name_c_n")
	@OpField(desc = "品牌中文名", example = "苹果")
	private String brandNameCN;

	@SerializedName("brand_name_e_n")
	@OpField(desc = "品牌英文名", example = "apple")
	private String brandNameEN;

	@SerializedName("level")
	@OpField(desc = "品牌等级", example = "0")
	private Integer level;

	@SerializedName("status")
	@OpField(desc = "品牌状态：在线", example = "1")
	private Integer status;

	@SerializedName("brand_alias")
	@OpField(desc = "品牌别名", example = "苹果/apple")
	private List<String> brandAlias;

	@SerializedName("create_timestamp")
	@OpField(desc = "创建时间", example = "1636011982")
	private Long createTimestamp;

	@SerializedName("update_timestamp")
	@OpField(desc = "修改时间", example = "1636011982")
	private Long updateTimestamp;

	@SerializedName("audit_status")
	@OpField(desc = "审核情况 1. 审核中 2. 审核通过 3. 审核拒绝 4. 送审失败", example = "2")
	private Integer auditStatus;

	@SerializedName("biz_type")
	@OpField(desc = "业务线类型: 0. 国内品牌 1. 跨境品牌 3. 广告", example = "0")
	private Integer bizType;

	@SerializedName("logo")
	@OpField(desc = "品牌logo", example = "url地址")
	private String logo;

	@SerializedName("extra")
	@OpField(desc = "额外信息", example = "")
	private Map<String,String> extra;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setBrandId(Long brandId){
		this.brandId = brandId;
	}

	
	public Long getBrandId(){
		return this.brandId;
	}

	
	public void setBrandNameCN(String brandNameCN){
		this.brandNameCN = brandNameCN;
	}

	
	public String getBrandNameCN(){
		return this.brandNameCN;
	}

	
	public void setBrandNameEN(String brandNameEN){
		this.brandNameEN = brandNameEN;
	}

	
	public String getBrandNameEN(){
		return this.brandNameEN;
	}

	
	public void setLevel(Integer level){
		this.level = level;
	}

	
	public Integer getLevel(){
		return this.level;
	}

	
	public void setStatus(Integer status){
		this.status = status;
	}

	
	public Integer getStatus(){
		return this.status;
	}

	
	public void setBrandAlias(List<String> brandAlias){
		this.brandAlias = brandAlias;
	}

	
	public List<String> getBrandAlias(){
		return this.brandAlias;
	}

	
	public void setCreateTimestamp(Long createTimestamp){
		this.createTimestamp = createTimestamp;
	}

	
	public Long getCreateTimestamp(){
		return this.createTimestamp;
	}

	
	public void setUpdateTimestamp(Long updateTimestamp){
		this.updateTimestamp = updateTimestamp;
	}

	
	public Long getUpdateTimestamp(){
		return this.updateTimestamp;
	}

	
	public void setAuditStatus(Integer auditStatus){
		this.auditStatus = auditStatus;
	}

	
	public Integer getAuditStatus(){
		return this.auditStatus;
	}

	
	public void setBizType(Integer bizType){
		this.bizType = bizType;
	}

	
	public Integer getBizType(){
		return this.bizType;
	}

	
	public void setLogo(String logo){
		this.logo = logo;
	}

	
	public String getLogo(){
		return this.logo;
	}

	
	public void setExtra(Map<String,String> extra){
		this.extra = extra;
	}

	
	public Map<String,String> getExtra(){
		return this.extra;
	}

}