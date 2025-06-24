package com.doudian.open.api.product_recommendProperties.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.Map;

//auto generated, do not edit

public class ValuesItem {


	@SerializedName("extra")
	@OpField(required = false , desc = "自定义度量衡扩展信息", example= "{:}")
	private Map<String,String> extra;

	@SerializedName("module_id")
	@OpField(required = false , desc = "模块id", example= "1")
	private Long moduleId;

	@SerializedName("value")
	@OpField(required = false , desc = "值内容", example= "值内容")
	private String value;

	@SerializedName("unit_id")
	@OpField(required = false , desc = "度量衡单位id", example= "1")
	private Long unitId;

	@SerializedName("unit_name")
	@OpField(required = false , desc = "度量衡单位名称", example= "度量衡单位名称")
	private String unitName;

	@SerializedName("prefix")
	@OpField(required = false , desc = "前缀", example= "前缀")
	private String prefix;

	@SerializedName("suffix")
	@OpField(required = false , desc = "后缀", example= "后缀")
	private String suffix;

	@SerializedName("value_required")
	@OpField(required = false , desc = "是否必填", example= "false")
	private Boolean valueRequired;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setExtra(Map<String,String> extra){
		this.extra = extra;
	}

	
	public Map<String,String> getExtra(){
		return this.extra;
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

	
	public void setValueRequired(Boolean valueRequired){
		this.valueRequired = valueRequired;
	}

	
	public Boolean getValueRequired(){
		return this.valueRequired;
	}

}