package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class BatchDetailItem {


	@SerializedName("stock_num")
	@OpField(desc = "扣减库存数量", example = "1")
	private Long stockNum;

	@SerializedName("arrive_time")
	@OpField(desc = "时效批次: X天后返货，只有库存类型为预售，该字段有意义。", example = "5")
	private Long arriveTime;

	@SerializedName("arrive_time_type")
	@OpField(desc = "时效类型：0-绝对时效，1-相对时效，只有库存类型为预售该字段有意义，目前只有相对时效", example = "1")
	private Long arriveTimeType;

	@SerializedName("inventory_type")
	@OpField(desc = "库存类型：现货/0、预售/1", example = "1")
	private Long inventoryType;

	@SerializedName("batch_id")
	@OpField(desc = "库存批次信息", example = "146533163111263693")
	private Long batchId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setStockNum(Long stockNum){
		this.stockNum = stockNum;
	}

	
	public Long getStockNum(){
		return this.stockNum;
	}

	
	public void setArriveTime(Long arriveTime){
		this.arriveTime = arriveTime;
	}

	
	public Long getArriveTime(){
		return this.arriveTime;
	}

	
	public void setArriveTimeType(Long arriveTimeType){
		this.arriveTimeType = arriveTimeType;
	}

	
	public Long getArriveTimeType(){
		return this.arriveTimeType;
	}

	
	public void setInventoryType(Long inventoryType){
		this.inventoryType = inventoryType;
	}

	
	public Long getInventoryType(){
		return this.inventoryType;
	}

	
	public void setBatchId(Long batchId){
		this.batchId = batchId;
	}

	
	public Long getBatchId(){
		return this.batchId;
	}

}