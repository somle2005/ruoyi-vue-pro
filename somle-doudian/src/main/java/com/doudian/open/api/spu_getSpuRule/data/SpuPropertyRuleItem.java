package com.doudian.open.api.spu_getSpuRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SpuPropertyRuleItem {


	@SerializedName("property_name")
	@OpField(desc = "属性名", example = "书名")
	private String propertyName;

	@SerializedName("property_id")
	@OpField(desc = "属性ID", example = "1831")
	private Long propertyId;

	@SerializedName("is_required")
	@OpField(desc = "是否必填，0:非必填，1:必填", example = "1")
	private Long isRequired;

	@SerializedName("value_type")
	@OpField(desc = "输入类型 select:单选，multi_select:多选，text:输入框，timestamp:时间戳，timeframe:时间区间", example = "select")
	private String valueType;

	@SerializedName("property_type")
	@OpField(desc = "属性类型，0 绑定属性 1关键属性 2销售属性", example = "0")
	private Long propertyType;

	@SerializedName("diy_type")
	@OpField(desc = "是否支持枚举可输入", example = "0")
	private Long diyType;

	@SerializedName("max_select_num")
	@OpField(desc = "最大可选数量，多选时需要用", example = "0")
	private Long maxSelectNum;

	@SerializedName("values")
	@OpField(desc = "属性值", example = "")
	private List<ValuesItem> values;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPropertyName(String propertyName){
		this.propertyName = propertyName;
	}

	
	public String getPropertyName(){
		return this.propertyName;
	}

	
	public void setPropertyId(Long propertyId){
		this.propertyId = propertyId;
	}

	
	public Long getPropertyId(){
		return this.propertyId;
	}

	
	public void setIsRequired(Long isRequired){
		this.isRequired = isRequired;
	}

	
	public Long getIsRequired(){
		return this.isRequired;
	}

	
	public void setValueType(String valueType){
		this.valueType = valueType;
	}

	
	public String getValueType(){
		return this.valueType;
	}

	
	public void setPropertyType(Long propertyType){
		this.propertyType = propertyType;
	}

	
	public Long getPropertyType(){
		return this.propertyType;
	}

	
	public void setDiyType(Long diyType){
		this.diyType = diyType;
	}

	
	public Long getDiyType(){
		return this.diyType;
	}

	
	public void setMaxSelectNum(Long maxSelectNum){
		this.maxSelectNum = maxSelectNum;
	}

	
	public Long getMaxSelectNum(){
		return this.maxSelectNum;
	}

	
	public void setValues(List<ValuesItem> values){
		this.values = values;
	}

	
	public List<ValuesItem> getValues(){
		return this.values;
	}

}