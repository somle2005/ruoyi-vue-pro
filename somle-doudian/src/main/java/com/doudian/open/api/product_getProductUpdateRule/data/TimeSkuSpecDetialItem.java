package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TimeSkuSpecDetialItem {


	@SerializedName("spec_value")
	@OpField(desc = "规格值", example = "48小时内发货")
	private String specValue;

	@SerializedName("is_presell_spec")
	@OpField(desc = "是否预售时效", example = "false")
	private Boolean isPresellSpec;

	@SerializedName("spec_code")
	@OpField(desc = "product_time_spec_same_day 当日发/次日发 product_time_spec_next_day 次日发 product_time_spec_48h  48小时内发货 product_time_spec_5d  5天内发货 product_time_spec_15d  15天内发货 product_time_spec_45d  45天内发货", example = "product_time_spec_48h")
	private String specCode;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSpecValue(String specValue){
		this.specValue = specValue;
	}

	
	public String getSpecValue(){
		return this.specValue;
	}

	
	public void setIsPresellSpec(Boolean isPresellSpec){
		this.isPresellSpec = isPresellSpec;
	}

	
	public Boolean getIsPresellSpec(){
		return this.isPresellSpec;
	}

	
	public void setSpecCode(String specCode){
		this.specCode = specCode;
	}

	
	public String getSpecCode(){
		return this.specCode;
	}

}