package com.doudian.open.api.product_addV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ValuesItem {


	@SerializedName("module_id")
	@OpField(required = false , desc = "模块id", example= "354")
	private Long moduleId;

	@SerializedName("value")
	@OpField(required = false , desc = "度量衡值", example= "10")
	private String value;

	@SerializedName("unit_id")
	@OpField(required = false , desc = "度量衡单位id", example= "2")
	private Long unitId;

	@SerializedName("unit_name")
	@OpField(required = false , desc = "度量衡单位名称", example= "g")
	private String unitName;

	@SerializedName("prefix")
	@OpField(required = false , desc = "度量衡值前缀", example= "")
	private String prefix;

	@SerializedName("suffix")
	@OpField(required = false , desc = "度量衡后缀", example= "-")
	private String suffix;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
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

	
	public void setPrefix(String prefix){
		this.prefix = prefix;
	}

	
	public String getPrefix(){
		return this.prefix;
	}

	
	public void setSuffix(String suffix){
		this.suffix = suffix;
	}

	
	public String getSuffix(){
		return this.suffix;
	}

}