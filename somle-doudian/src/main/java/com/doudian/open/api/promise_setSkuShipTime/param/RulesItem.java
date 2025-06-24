package com.doudian.open.api.promise_setSkuShipTime.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class RulesItem {


	@SerializedName("sku_id")
	@OpField(required = true , desc = "skuid", example= "12312")
	private String skuId;

	@SerializedName("out_warehouse_id")
	@OpField(required = true , desc = "外部仓库id", example= "abc")
	private String outWarehouseId;

	@SerializedName("pre_sell_type")
	@OpField(required = true , desc = "0表示现货模式，1表示全款预售模式", example= "0")
	private Integer preSellType;

	@SerializedName("delay_day")
	@OpField(required = true , desc = "发货延迟时间：0表示当天发货，1表示24小时发货；当全款预售时，需传入值为(2,15)，即2-15中的任意值", example= "2")
	private Integer delayDay;

	@SerializedName("pre_sell_end_time")
	@OpField(required = true , desc = "全款预售截止时间，和PreSellType=1时组合使用", example= "1622776641")
	private Long preSellEndTime;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSkuId(String skuId){
		this.skuId = skuId;
	}

	
	public String getSkuId(){
		return this.skuId;
	}

	
	public void setOutWarehouseId(String outWarehouseId){
		this.outWarehouseId = outWarehouseId;
	}

	
	public String getOutWarehouseId(){
		return this.outWarehouseId;
	}

	
	public void setPreSellType(Integer preSellType){
		this.preSellType = preSellType;
	}

	
	public Integer getPreSellType(){
		return this.preSellType;
	}

	
	public void setDelayDay(Integer delayDay){
		this.delayDay = delayDay;
	}

	
	public Integer getDelayDay(){
		return this.delayDay;
	}

	
	public void setPreSellEndTime(Long preSellEndTime){
		this.preSellEndTime = preSellEndTime;
	}

	
	public Long getPreSellEndTime(){
		return this.preSellEndTime;
	}

}