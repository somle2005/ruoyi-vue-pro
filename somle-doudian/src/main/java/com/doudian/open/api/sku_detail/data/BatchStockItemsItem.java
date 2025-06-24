package com.doudian.open.api.sku_detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class BatchStockItemsItem {


	@SerializedName("batch_type")
	@OpField(desc = "批次库存类型：1为唯一码", example = "1")
	private Long batchType;

	@SerializedName("stock_num")
	@OpField(desc = "批次库存数量", example = "1")
	private Long stockNum;

	@SerializedName("unique_id")
	@OpField(desc = "唯一码", example = "356303487400309")
	private String uniqueId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setBatchType(Long batchType){
		this.batchType = batchType;
	}

	
	public Long getBatchType(){
		return this.batchType;
	}

	
	public void setStockNum(Long stockNum){
		this.stockNum = stockNum;
	}

	
	public Long getStockNum(){
		return this.stockNum;
	}

	
	public void setUniqueId(String uniqueId){
		this.uniqueId = uniqueId;
	}

	
	public String getUniqueId(){
		return this.uniqueId;
	}

}