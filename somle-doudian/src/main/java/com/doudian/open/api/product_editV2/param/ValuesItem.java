package com.doudian.open.api.product_editV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ValuesItem {


	@SerializedName("suffix")
	@OpField(required = false , desc = "后缀，如-", example= "“标题后缀”")
	private String suffix;

	@SerializedName("prefix")
	@OpField(required = false , desc = "前缀，示例中为空", example= "“标题前缀”")
	private String prefix;

	@SerializedName("unit_name")
	@OpField(required = false , desc = "单位名称，如g", example= "单位名称")
	private String unitName;

	@SerializedName("unit_id")
	@OpField(required = false , desc = "单位id", example= "单位id")
	private Long unitId;

	@SerializedName("value")
	@OpField(required = false , desc = "值内容，如13", example= "规格值")
	private String value;

	@SerializedName("module_id")
	@OpField(required = false , desc = "模块id", example= "1")
	private Long moduleId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
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

	
	public void setValue(String value){
		this.value = value;
	}

	
	public String getValue(){
		return this.value;
	}

	
	public void setModuleId(Long moduleId){
		this.moduleId = moduleId;
	}

	
	public Long getModuleId(){
		return this.moduleId;
	}

}