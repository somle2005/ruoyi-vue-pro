package com.doudian.open.api.address_getAreasByProvince.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class DataItem {


	@SerializedName("code")
	@OpField(desc = "省ID", example = "41")
	private Long code;

	@SerializedName("father_code")
	@OpField(desc = "父ID", example = "8")
	private Long fatherCode;

	@SerializedName("name")
	@OpField(desc = "省名称", example = "河南省")
	private String name;

	@SerializedName("level")
	@OpField(desc = "地址等级", example = "Province")
	private String level;

	@SerializedName("sub_districts")
	@OpField(desc = "响应结果", example = "")
	private List<SubDistrictsItem_3> subDistricts;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCode(Long code){
		this.code = code;
	}

	
	public Long getCode(){
		return this.code;
	}

	
	public void setFatherCode(Long fatherCode){
		this.fatherCode = fatherCode;
	}

	
	public Long getFatherCode(){
		return this.fatherCode;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setLevel(String level){
		this.level = level;
	}

	
	public String getLevel(){
		return this.level;
	}

	
	public void setSubDistricts(List<SubDistrictsItem_3> subDistricts){
		this.subDistricts = subDistricts;
	}

	
	public List<SubDistrictsItem_3> getSubDistricts(){
		return this.subDistricts;
	}

}