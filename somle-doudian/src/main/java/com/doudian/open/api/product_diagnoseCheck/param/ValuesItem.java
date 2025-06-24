package com.doudian.open.api.product_diagnoseCheck.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ValuesItem {


	@SerializedName("prefix")
	@OpField(required = false , desc = "前缀：如日用", example= "日用")
	private String prefix;

	@SerializedName("module_id")
	@OpField(required = false , desc = "模块ID", example= "122")
	private Long moduleId;

	@SerializedName("value")
	@OpField(required = false , desc = "值：如10", example= "10")
	private String value;

	@SerializedName("unit_id")
	@OpField(required = false , desc = "单位ID", example= "23")
	private Long unitId;

	@SerializedName("unit_name")
	@OpField(required = false , desc = "单位名称：如抽", example= "抽")
	private String unitName;

	@SerializedName("suffix")
	@OpField(required = false , desc = "后缀：如*", example= "*")
	private String suffix;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPrefix(String prefix){
		this.prefix = prefix;
	}

	
	public String getPrefix(){
		return this.prefix;
	}

	
	public void setModuleId(Long moduleId){
		this.moduleId = moduleId;
	}

	
	public Long getModuleId(){
		return this.moduleId;
	}

	
	public void setValue(String value){
		this.value = value;
	}

	
	public String getValue(){
		return this.value;
	}

	
	public void setUnitId(Long unitId){
		this.unitId = unitId;
	}

	
	public Long getUnitId(){
		return this.unitId;
	}

	
	public void setUnitName(String unitName){
		this.unitName = unitName;
	}

	
	public String getUnitName(){
		return this.unitName;
	}

	
	public void setSuffix(String suffix){
		this.suffix = suffix;
	}

	
	public String getSuffix(){
		return this.suffix;
	}

}