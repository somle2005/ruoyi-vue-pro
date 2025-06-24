package com.doudian.open.api.rights_info.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class RightsInfoData {


	@SerializedName("expire_time")
	@OpField(desc = "权益到期时间", example = "2022-02-01 11:22:11")
	private String expireTime;

	@SerializedName("rights_type")
	@OpField(desc = "0-试用版，1-正式版", example = "1")
	private Integer rightsType;

	@SerializedName("spec_type")
	@OpField(desc = "规格类型，0-版本，其他待定", example = "1")
	private Integer specType;

	@SerializedName("spec_val")
	@OpField(desc = "规格名称", example = "高级版")
	private String specVal;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setExpireTime(String expireTime){
		this.expireTime = expireTime;
	}

	
	public String getExpireTime(){
		return this.expireTime;
	}

	
	public void setRightsType(Integer rightsType){
		this.rightsType = rightsType;
	}

	
	public Integer getRightsType(){
		return this.rightsType;
	}

	
	public void setSpecType(Integer specType){
		this.specType = specType;
	}

	
	public Integer getSpecType(){
		return this.specType;
	}

	
	public void setSpecVal(String specVal){
		this.specVal = specVal;
	}

	
	public String getSpecVal(){
		return this.specVal;
	}

}