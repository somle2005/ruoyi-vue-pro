package com.doudian.open.api.sku_syncStockBatch.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class StockMapItem {


	@SerializedName("batch_stock_items")
	@OpField(required = false , desc = "批次库存项", example= "")
	private List<BatchStockItemsItem> batchStockItems;

	@SerializedName("out_warehouse_id")
	@OpField(required = true , desc = "仓id或到店自提门店id，场景①仓id，超市小时达子品传storeId。到店自提传入store_id（门店id）", example= "123")
	private String outWarehouseId;

	@SerializedName("stock_num")
	@OpField(required = true , desc = "库存数量", example= "10")
	private Long stockNum;


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

	
	public void setStockNum(Long stockNum){
		this.stockNum = stockNum;
	}

	
	public Long getStockNum(){
		return this.stockNum;
	}

}