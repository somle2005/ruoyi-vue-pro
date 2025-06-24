package com.doudian.open.api.sku_syncStockBatch.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SkuSyncListItem {


	@SerializedName("batch_stock_items")
	@OpField(required = false , desc = "批次库存项", example= "")
	private List<BatchStockItemsItem> batchStockItems;

	@SerializedName("multi_time_stocks")
	@OpField(required = false , desc = "时效库存", example= "")
	private List<MultiTimeStocksItem> multiTimeStocks;

	@SerializedName("outer_sku_id")
	@OpField(required = false , desc = "外部sku编码，需要结合outer_product_id进行使用", example= "232331")
	private String outerSkuId;

	@SerializedName("sku_id")
	@OpField(required = true , desc = "skuid", example= "99758050")
	private Long skuId;

	@SerializedName("sku_type")
	@OpField(required = true , desc = "库存类型：0普通库存，1区域库存,10阶梯库存。 超市小时达子品传区域库存", example= "1")
	private Long skuType;

	@SerializedName("stock_num")
	@OpField(required = false , desc = "普通库存数量", example= "10")
	private Long stockNum;

	@SerializedName("step_stock_num")
	@OpField(required = false , desc = "阶梯库存数量", example= "10")
	private Long stepStockNum;

	@SerializedName("stock_map")
	@OpField(required = false , desc = "区域库存配置", example= "")
	private List<StockMapItem> stockMap;

	@SerializedName("supplier_id")
	@OpField(required = false , desc = "供应商ID", example= "1")
	private String supplierId;


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

	
	public void setMultiTimeStocks(List<MultiTimeStocksItem> multiTimeStocks){
		this.multiTimeStocks = multiTimeStocks;
	}

	
	public List<MultiTimeStocksItem> getMultiTimeStocks(){
		return this.multiTimeStocks;
	}

	
	public void setOuterSkuId(String outerSkuId){
		this.outerSkuId = outerSkuId;
	}

	
	public String getOuterSkuId(){
		return this.outerSkuId;
	}

	
	public void setSkuId(Long skuId){
		this.skuId = skuId;
	}

	
	public Long getSkuId(){
		return this.skuId;
	}

	
	public void setSkuType(Long skuType){
		this.skuType = skuType;
	}

	
	public Long getSkuType(){
		return this.skuType;
	}

	
	public void setStockNum(Long stockNum){
		this.stockNum = stockNum;
	}

	
	public Long getStockNum(){
		return this.stockNum;
	}

	
	public void setStepStockNum(Long stepStockNum){
		this.stepStockNum = stepStockNum;
	}

	
	public Long getStepStockNum(){
		return this.stepStockNum;
	}

	
	public void setStockMap(List<StockMapItem> stockMap){
		this.stockMap = stockMap;
	}

	
	public List<StockMapItem> getStockMap(){
		return this.stockMap;
	}

	
	public void setSupplierId(String supplierId){
		this.supplierId = supplierId;
	}

	
	public String getSupplierId(){
		return this.supplierId;
	}

}