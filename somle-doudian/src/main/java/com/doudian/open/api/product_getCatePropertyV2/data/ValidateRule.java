package com.doudian.open.api.product_getCatePropertyV2.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ValidateRule {


	@SerializedName("unit_rules")
	@OpField(desc = "不同单位下的值约束", example = "")
	private List<UnitRulesItem> unitRules;

	@SerializedName("time_format")
	@OpField(desc = "date_type = date 时，有值，如YYYY-MM-DD", example = "YYYY-MM-DD")
	private String timeFormat;

	@SerializedName("max")
	@OpField(desc = "最大值", example = "10")
	private Double max;

	@SerializedName("min")
	@OpField(desc = "最小值", example = "2")
	private Double min;

	@SerializedName("precision")
	@OpField(desc = "小数位数，当data_type为float时有值", example = "2")
	private Long precision;

	@SerializedName("data_type")
	@OpField(desc = "填写值的数据格式：integer, float, date", example = "integer")
	private String dataType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setUnitRules(List<UnitRulesItem> unitRules){
		this.unitRules = unitRules;
	}

	
	public List<UnitRulesItem> getUnitRules(){
		return this.unitRules;
	}

	
	public void setTimeFormat(String timeFormat){
		this.timeFormat = timeFormat;
	}

	
	public String getTimeFormat(){
		return this.timeFormat;
	}

	
	public void setMax(Double max){
		this.max = max;
	}

	
	public Double getMax(){
		return this.max;
	}

	
	public void setMin(Double min){
		this.min = min;
	}

	
	public Double getMin(){
		return this.min;
	}

	
	public void setPrecision(Long precision){
		this.precision = precision;
	}

	
	public Long getPrecision(){
		return this.precision;
	}

	
	public void setDataType(String dataType){
		this.dataType = dataType;
	}

	
	public String getDataType(){
		return this.dataType;
	}

}