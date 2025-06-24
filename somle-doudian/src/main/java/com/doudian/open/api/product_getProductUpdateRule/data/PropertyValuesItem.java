package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PropertyValuesItem {


	@SerializedName("sell_property_value_id")
	@OpField(desc = "规格值id", example = "1234")
	private Long sellPropertyValueId;

	@SerializedName("sell_property_value_name")
	@OpField(desc = "规格值名称", example = "红色")
	private String sellPropertyValueName;

	@SerializedName("value_pic")
	@OpField(desc = "规格值图片", example = "")
	private ValuePic valuePic;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSellPropertyValueId(Long sellPropertyValueId){
		this.sellPropertyValueId = sellPropertyValueId;
	}

	
	public Long getSellPropertyValueId(){
		return this.sellPropertyValueId;
	}

	
	public void setSellPropertyValueName(String sellPropertyValueName){
		this.sellPropertyValueName = sellPropertyValueName;
	}

	
	public String getSellPropertyValueName(){
		return this.sellPropertyValueName;
	}

	
	public void setValuePic(ValuePic valuePic){
		this.valuePic = valuePic;
	}

	
	public ValuePic getValuePic(){
		return this.valuePic;
	}

}