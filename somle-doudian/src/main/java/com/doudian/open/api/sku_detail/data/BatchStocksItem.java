package com.doudian.open.api.sku_detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class BatchStocksItem {


	@SerializedName("batch_stock_items")
	@OpField(desc = "批次库存项", example = "")
	private List<BatchStockItemsItem> batchStockItems;

	@SerializedName("out_warehouse_id")
	@OpField(desc = "外部仓编码，区域库存模式有值", example = "FOURPLTEST")
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