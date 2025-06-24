package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class TimeSkuPresellWithNormalRule {


	@SerializedName("support")
	@OpField(desc = "是否支持", example = "true")
	private Boolean support;

	@SerializedName("time_sku_spec_name")
	@OpField(desc = "发货时效规格名称", example = "发货时效")
	private String timeSkuSpecName;

	@SerializedName("time_sku_spec_detial")
	@OpField(desc = "发货时效规格选项", example = "")
	private List<TimeSkuSpecDetialItem> timeSkuSpecDetial;

	@SerializedName("min_presell_price")
	@OpField(desc = "预售门槛价，单位分", example = "2000")
	private Long minPresellPrice;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSupport(Boolean support){
		this.support = support;
	}

	
	public Boolean getSupport(){
		return this.support;
	}

	
	public void setTimeSkuSpecName(String timeSkuSpecName){
		this.timeSkuSpecName = timeSkuSpecName;
	}

	
	public String getTimeSkuSpecName(){
		return this.timeSkuSpecName;
	}

	
	public void setTimeSkuSpecDetial(List<TimeSkuSpecDetialItem> timeSkuSpecDetial){
		this.timeSkuSpecDetial = timeSkuSpecDetial;
	}

	
	public List<TimeSkuSpecDetialItem> getTimeSkuSpecDetial(){
		return this.timeSkuSpecDetial;
	}

	
	public void setMinPresellPrice(Long minPresellPrice){
		this.minPresellPrice = minPresellPrice;
	}

	
	public Long getMinPresellPrice(){
		return this.minPresellPrice;
	}

}