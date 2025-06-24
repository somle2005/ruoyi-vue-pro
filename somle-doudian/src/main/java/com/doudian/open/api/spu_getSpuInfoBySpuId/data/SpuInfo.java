package com.doudian.open.api.spu_getSpuInfoBySpuId.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SpuInfo {


	@SerializedName("spu_name")
	@OpField(desc = "spuName", example = "苹果/iphone11")
	private String spuName;

	@SerializedName("upc_code")
	@OpField(desc = "产品编码", example = "A1001")
	private String upcCode;

	@SerializedName("category_id")
	@OpField(desc = "类目id", example = "31860")
	private Long categoryId;

	@SerializedName("brand_id")
	@OpField(desc = "品牌id", example = "1001")
	private Long brandId;

	@SerializedName("status")
	@OpField(desc = "在线状态 1-生效（默认） 2-失效", example = "1")
	private Long status;

	@SerializedName("update_time")
	@OpField(desc = "更新时间", example = "2020-11-11 11:00:00")
	private String updateTime;

	@SerializedName("create_time")
	@OpField(desc = "创建时间", example = "2020-11-11 11:00:00")
	private String createTime;

	@SerializedName("spu_id")
	@OpField(desc = "spuId", example = "6950545601998242092")
	private String spuId;

	@SerializedName("op_status")
	@OpField(desc = "审核状态 -1-删除 0-待审核，1-审核中，2-审核不通过 ，3-审核通过4-撤销", example = "0")
	private Long opStatus;

	@SerializedName("audit_time")
	@OpField(desc = "审核时间", example = "2020-11-11 11:00:00")
	private String auditTime;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSpuName(String spuName){
		this.spuName = spuName;
	}

	
	public String getSpuName(){
		return this.spuName;
	}

	
	public void setUpcCode(String upcCode){
		this.upcCode = upcCode;
	}

	
	public String getUpcCode(){
		return this.upcCode;
	}

	
	public void setCategoryId(Long categoryId){
		this.categoryId = categoryId;
	}

	
	public Long getCategoryId(){
		return this.categoryId;
	}

	
	public void setBrandId(Long brandId){
		this.brandId = brandId;
	}

	
	public Long getBrandId(){
		return this.brandId;
	}

	
	public void setStatus(Long status){
		this.status = status;
	}

	
	public Long getStatus(){
		return this.status;
	}

	
	public void setUpdateTime(String updateTime){
		this.updateTime = updateTime;
	}

	
	public String getUpdateTime(){
		return this.updateTime;
	}

	
	public void setCreateTime(String createTime){
		this.createTime = createTime;
	}

	
	public String getCreateTime(){
		return this.createTime;
	}

	
	public void setSpuId(String spuId){
		this.spuId = spuId;
	}

	
	public String getSpuId(){
		return this.spuId;
	}

	
	public void setOpStatus(Long opStatus){
		this.opStatus = opStatus;
	}

	
	public Long getOpStatus(){
		return this.opStatus;
	}

	
	public void setAuditTime(String auditTime){
		this.auditTime = auditTime;
	}

	
	public String getAuditTime(){
		return this.auditTime;
	}

}