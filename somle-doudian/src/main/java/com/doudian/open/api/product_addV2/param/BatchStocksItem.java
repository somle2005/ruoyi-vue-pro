package com.doudian.open.api.product_addV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class BatchStocksItem {


	@SerializedName("batch_stock_items")
	@OpField(required = false , desc = "批次库存项", example= "")
	private List<BatchStockItemsItem> batchStockItems;

	@SerializedName("out_warehouse_id")
	@OpField(required = false , desc = "外部仓id，区域库存模式填写", example= "FOURPLTEST")
	private String outWarehouseId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setBatchStockItems(List<BatchStockItemsItem> batchStockItems){
		this.batchStockItems = batchStockItems;
	}

	
	public List<BatchStockItemsItem> getBatchStockItems(){
		return this.batchStockItems;
	}

	
	public void setOutWarehouseId(String outWarehouseId){
		this.outWarehouseId = outWarehouseId;
	}

	
	public String getOutWarehouseId(){
		return this.outWarehouseId;
	}

}