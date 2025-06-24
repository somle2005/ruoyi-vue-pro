package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ValidateRule {


	@SerializedName("data_type")
	@OpField(desc = "数据类型，integer、float", example = "integer")
	private String dataType;

	@SerializedName("precision")
	@OpField(desc = "小数位数，data_type为float时有值", example = "0")
	private Long precision;

	@SerializedName("min")
	@OpField(desc = "最小值", example = "2")
	private Double min;

	@SerializedName("max")
	@OpField(desc = "最大值", example = "100")
	private Double max;

	@SerializedName("unit_rules")
	@OpField(desc = "单位规则明细", example = "")
	private List<UnitRulesItem> unitRules;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setDataType(String dataType){
		this.dataType = dataType;
	}

	
	public String getDataType(){
		return this.dataType;
	}

	
	public void setPrecision(Long precision){
		this.precision = precision;
	}

	
	public Long getPrecision(){
		return this.precision;
	}

	
	public void setMin(Double min){
		this.min = min;
	}

	
	public Double getMin(){
		return this.min;
	}

	
	public void setMax(Double max){
		this.max = max;
	}

	
	public Double getMax(){
		return this.max;
	}

	
	public void setUnitRules(List<UnitRulesItem> unitRules){
		this.unitRules = unitRules;
	}

	
	public List<UnitRulesItem> getUnitRules(){
		return this.unitRules;
	}

}