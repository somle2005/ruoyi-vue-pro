package com.doudian.open.api.sku_syncStock.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SkuSyncStockParam {


	@SerializedName("code")
	@OpField(required = false , desc = "sku编码", example= "dy001")
	private String code;

	@SerializedName("sku_id")
	@OpField(required = false , desc = "规格id；抖店系统生成，商品id下唯一。", example= "1737398770243598")
	private Long skuId;

	@SerializedName("out_sku_id")
	@OpField(required = false , desc = "外部skuid，开发者在创建或更新商品时设置。", example= "44354354")
	private Long outSkuId;

	@SerializedName("product_id")
	@OpField(required = false , desc = "商品ID，抖店系统生成，店铺下唯一；长度19位。", example= "3539925204033339668")
	private Long productId;

	@SerializedName("out_product_id")
	@OpField(required = false , desc = "外部商品id；开发者在创建或更新商品时设置的。", example= "435243654356")
	private Long outProductId;

	@SerializedName("out_warehouse_id")
	@OpField(required = false , desc = "外部仓库id编码，开发者自定义；如传入传值表示更新区域库存，不传默认更新普通库存。可以使用【/warehouse/list】接口响应参数【out_warehouse_id】字段获取。超市小时达店铺类型，需传入store_id字段，store_id可以使用【/shop/batchCreateStore】创建成功后获取", example= "dy123")
	private String outWarehouseId;

	@SerializedName("supplier_id")
	@OpField(required = false , desc = "供应商ID", example= "1")
	private String supplierId;

	@SerializedName("incremental")
	@OpField(required = false , desc = "库存更新方式；true-增量更新，同时idempotent_id字段必填；false-全量更新；默认为false", example= "false")
	private Boolean incremental;

	@SerializedName("idempotent_id")
	@OpField(required = false , desc = "幂等ID，当incremental=true时该参数必传", example= "202206021500001001")
	private String idempotentId;

	@SerializedName("stock_num")
	@OpField(required = true , desc = "库存值；可以设置为0，不能小于0，当incremental=true时stock_num支持加/减库存。支持传入“-”，例如：-5表示减5个库存；加库存例：原商品库存是10个，接口传入5个，执行成功商品库存是15个。减库存例：原商品库存是10个，接口stock_num传入-5，执行成功商品库存是5个。注意：减库存时【商品现库存-即将减少库存数不能<0】，否则会报错系统错误:更新库存数失败: 库存不足；", example= "100")
	private Long stockNum;

	@SerializedName("step_stock_num")
	@OpField(required = false , desc = "阶梯库存", example= "100")
	private Long stepStockNum;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店id①即时零售连锁版，通过传入主品id+门店id对该门店下的子品进行操作，即时零售单店版，无需使用②抖店服饰自提场景，通过传入主品id+门店id更新门店商品库存", example= "12345")
	private Long storeId;

	@SerializedName("multi_time_stocks")
	@OpField(required = false , desc = "时效库存", example= "")
	private List<MultiTimeStocksItem> multiTimeStocks;

	@SerializedName("batch_stock_items")
	@OpField(required = false , desc = "批次库存项", example= "")
	private List<BatchStockItemsItem> batchStockItems;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCode(String code){
		this.code = code;
	}

	
	public String getCode(){
		return this.code;
	}

	
	public void setSkuId(Long skuId){
		this.skuId = skuId;
	}

	
	public Long getSkuId(){
		return this.skuId;
	}

	
	public void setOutSkuId(Long outSkuId){
		this.outSkuId = outSkuId;
	}

	
	public Long getOutSkuId(){
		return this.outSkuId;
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

	
	public void setOutProductId(Long outProductId){
		this.outProductId = outProductId;
	}

	
	public Long getOutProductId(){
		return this.outProductId;
	}

	
	public void setOutWarehouseId(String outWarehouseId){
		this.outWarehouseId = outWarehouseId;
	}

	
	public String getOutWarehouseId(){
		return this.outWarehouseId;
	}

	
	public void setSupplierId(String supplierId){
		this.supplierId = supplierId;
	}

	
	public String getSupplierId(){
		return this.supplierId;
	}

	
	public void setIncremental(Boolean incremental){
		this.incremental = incremental;
	}

	
	public Boolean getIncremental(){
		return this.incremental;
	}

	
	public void setIdempotentId(String idempotentId){
		this.idempotentId = idempotentId;
	}

	
	public String getIdempotentId(){
		return this.idempotentId;
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

	
	public void setStoreId(Long storeId){
		this.storeId = storeId;
	}

	
	public Long getStoreId(){
		return this.storeId;
	}

	
	public void setMultiTimeStocks(List<MultiTimeStocksItem> multiTimeStocks){
		this.multiTimeStocks = multiTimeStocks;
	}

	
	public List<MultiTimeStocksItem> getMultiTimeStocks(){
		return this.multiTimeStocks;
	}

	
	public void setBatchStockItems(List<BatchStockItemsItem> batchStockItems){
		this.batchStockItems = batchStockItems;
	}

	
	public List<BatchStockItemsItem> getBatchStockItems(){
		return this.batchStockItems;
	}

}