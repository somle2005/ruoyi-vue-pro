package com.doudian.open.api.address_getAreasByProvince.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SubDistrictsItem_4 {


	@SerializedName("code")
	@OpField(desc = "区县ID", example = "410522")
	private Long code;

	@SerializedName("father_code")
	@OpField(desc = "父ID", example = "410500")
	private Long fatherCode;

	@SerializedName("name")
	@OpField(desc = "区县名称", example = "安阳县")
	private String name;

	@SerializedName("level")
	@OpField(desc = "地址等级", example = "District")
	private String level;

	@SerializedName("sub_districts")
	@OpField(desc = "响应结果", example = "")
	private List<SubDistrictsItem> subDistricts;


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

	
	public void setSubDistricts(List<SubDistrictsItem> subDistricts){
		this.subDistricts = subDistricts;
	}

	
	public List<SubDistrictsItem> getSubDistricts(){
		return this.subDistricts;
	}

}