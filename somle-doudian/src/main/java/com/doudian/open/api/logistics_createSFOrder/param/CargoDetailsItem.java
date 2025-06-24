package com.doudian.open.api.logistics_createSFOrder.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CargoDetailsItem {


	@SerializedName("name")
	@OpField(required = false , desc = "货物名称，如果需要生成电子运单，则为必填", example= "1")
	private String name;

	@SerializedName("currency")
	@OpField(required = false , desc = "货物单价的币别：参照附录币别代码附件", example= "1")
	private String currency;

	@SerializedName("count")
	@OpField(required = false , desc = "货物数量, 跨境件报关需要填写", example= "1")
	private Long count;

	@SerializedName("unit")
	@OpField(required = false , desc = "货物单位，如：个、台、本，跨境件报关需要填写。", example= "1")
	private String unit;

	@SerializedName("amount")
	@OpField(required = false , desc = "货物单价，精确到小数点后10位，跨境件报关需要填写", example= "1")
	private String amount;

	@SerializedName("weight")
	@OpField(required = false , desc = "订单货物单位重量，包含子母件，单位千克，精确到小数点后6位跨境件报关需要填写", example= "1")
	private String weight;

	@SerializedName("source_area")
	@OpField(required = false , desc = "原产地国别，跨境件报关需要填写", example= "1")
	private String sourceArea;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setCurrency(String currency){
		this.currency = currency;
	}

	
	public String getCurrency(){
		return this.currency;
	}

	
	public void setCount(Long count){
		this.count = count;
	}

	
	public Long getCount(){
		return this.count;
	}

	
	public void setUnit(String unit){
		this.unit = unit;
	}

	
	public String getUnit(){
		return this.unit;
	}

	
	public void setAmount(String amount){
		this.amount = amount;
	}

	
	public String getAmount(){
		return this.amount;
	}

	
	public void setWeight(String weight){
		this.weight = weight;
	}

	
	public String getWeight(){
		return this.weight;
	}

	
	public void setSourceArea(String sourceArea){
		this.sourceArea = sourceArea;
	}

	
	public String getSourceArea(){
		return this.sourceArea;
	}

}