package com.doudian.open.api.product_getCatePropertyV2.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ValueModulesItem {


	@SerializedName("value_required")
	@OpField(desc = "模块是否必填，为false时表示这个模块可以不填", example = "true")
	private Boolean valueRequired;

	@SerializedName("validate_rule")
	@OpField(desc = "填写规则", example = "")
	private ValidateRule validateRule;

	@SerializedName("units")
	@OpField(desc = "可选单位，可为空", example = "")
	private List<UnitsItem> units;

	@SerializedName("values")
	@OpField(desc = "值的可选项，如材质属性可能会有：棉、麻等选项", example = "")
	private List<ValuesItem> values;

	@SerializedName("input_type")
	@OpField(desc = "输入类型： 枚举、输入、枚举可输入： enum, input, enum_diy", example = "input")
	private String inputType;

	@SerializedName("suffix")
	@OpField(desc = "后缀", example = "")
	private String suffix;

	@SerializedName("prefix")
	@OpField(desc = "前缀", example = "")
	private String prefix;

	@SerializedName("module_id")
	@OpField(desc = "模块id", example = "123")
	private Long moduleId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setValueRequired(Boolean valueRequired){
		this.valueRequired = valueRequired;
	}

	
	public Boolean getValueRequired(){
		return this.valueRequired;
	}

	
	public void setValidateRule(ValidateRule validateRule){
		this.validateRule = validateRule;
	}

	
	public ValidateRule getValidateRule(){
		return this.validateRule;
	}

	
	public void setUnits(List<UnitsItem> units){
		this.units = units;
	}

	
	public List<UnitsItem> getUnits(){
		return this.units;
	}

	
	public void setValues(List<ValuesItem> values){
		this.values = values;
	}

	
	public List<ValuesItem> getValues(){
		return this.values;
	}

	
	public void setInputType(String inputType){
		this.inputType = inputType;
	}

	
	public String getInputType(){
		return this.inputType;
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