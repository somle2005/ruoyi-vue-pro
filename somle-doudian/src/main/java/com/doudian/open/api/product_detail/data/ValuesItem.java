package com.doudian.open.api.product_detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ValuesItem {


	@SerializedName("value")
	@OpField(desc = "度量衡值", example = "10")
	private String value;

	@SerializedName("unit_name")
	@OpField(desc = "度量衡单位名称", example = "g")
	private String unitName;

	@SerializedName("unit_id")
	@OpField(desc = "度量衡单位id", example = "2")
	private Long unitId;

	@SerializedName("suffix")
	@OpField(desc = "度量衡后缀", example = "")
	private String suffix;

	@SerializedName("prefix")
	@OpField(desc = "度量衡前缀", example = "-")
	private String prefix;

	@SerializedName("module_id")
	@OpField(desc = "度量衡模块id", example = "123")
	private Long moduleId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setValue(String value){
		this.value = value;
	}

	
	public String getValue(){
		return this.value;
	}

	
	public void setUnitName(String unitName){
		this.unitName = unitName;
	}

	
	public String getUnitName(){
		return this.unitName;
	}

	
	public void setUnitId(Long unitId){
		this.unitId = unitId;
	}

	
	public Long getUnitId(){
		return this.unitId;
	}

	
	public void setSuffix(String suffix){
		this.suffix = suffix;
	}

	
	public String getSuffix(){
		return this.suffix;
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

}