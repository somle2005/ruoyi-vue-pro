package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ValueModulesItem {


	@SerializedName("module_id")
	@OpField(desc = "模块id", example = "1")
	private Long moduleId;

	@SerializedName("prefix")
	@OpField(desc = "前缀", example = "")
	private String prefix;

	@SerializedName("suffix")
	@OpField(desc = "后缀", example = "")
	private String suffix;

	@SerializedName("input_type")
	@OpField(desc = "输入类型：枚举 enum, 输入 input， enum_diy 枚举可输入", example = "input")
	private String inputType;

	@SerializedName("values")
	@OpField(desc = "度量衡值选项", example = "")
	private List<ValuesItem> values;

	@SerializedName("units")
	@OpField(desc = "度量衡单位", example = "")
	private List<UnitsItem> units;

	@SerializedName("validate_rule")
	@OpField(desc = "度量衡规则", example = "")
	private ValidateRule validateRule;


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

	
	public void setInputType(String inputType){
		this.inputType = inputType;
	}

	
	public String getInputType(){
		return this.inputType;
	}

	
	public void setValues(List<ValuesItem> values){
		this.values = values;
	}

	
	public List<ValuesItem> getValues(){
		return this.values;
	}

	
	public void setUnits(List<UnitsItem> units){
		this.units = units;
	}

	
	public List<UnitsItem> getUnits(){
		return this.units;
	}

	
	public void setValidateRule(ValidateRule validateRule){
		this.validateRule = validateRule;
	}

	
	public ValidateRule getValidateRule(){
		return this.validateRule;
	}

}