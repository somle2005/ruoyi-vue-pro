package com.doudian.open.api.sku_syncStockBatchMultiProducts.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ItemsItem {


	@SerializedName("store_code")
	@OpField(required = false , desc = "相对于 store_id 是平台侧的门店 id，store_code 是外部门店编码，使用上，选择其中一个，优先使用 store_id", example= "123sdfaseq")
	private String storeCode;

	@SerializedName("sku_code")
	@OpField(required = false , desc = "sku 商家编码，开发者在创建或更新商品时设置的，商家自行要保证一个商品下的所有 sku 编码唯一，否则通过 sku_code+商品 id 无法准确定位唯一的sku，会导致更新库存至非预期内的sku 上", example= "123sdfaseq")
	private String skuCode;

	@SerializedName("outer_product_id")
	@OpField(required = false , desc = "外部商品id；开发者在创建或更新商品时设置的，是out_product_id的字符串形式", example= "123sdfaseq")
	private String outerProductId;

	@SerializedName("store_id")
	@OpField(required = false , desc = "即时零售小时达店铺更新配送门店商品库存，抖店自提店铺用于设置商品自提门店库存", example= "12345")
	private Long storeId;

	@SerializedName("out_sku_id")
	@OpField(required = false , desc = "外部skuid，开发者在创建或更新商品时设置。", example= "44354354")
	private Long outSkuId;

	@SerializedName("out_product_id")
	@OpField(required = false , desc = "外部商品id；开发者在创建或更新商品时设置的。", example= "36116949497011600")
	private Long outProductId;

	@SerializedName("product_id")
	@OpField(required = false , desc = "商品ID", example= "3587155767318456791")
	private Long productId;

	@SerializedName("sku_id")
	@OpField(required = false , desc = "商品规格ID；一次请求最大支持50个sku更新", example= "1751540901742600")
	private Long skuId;

	@SerializedName("out_warehouse_id")
	@OpField(required = false , desc = "外部仓库id编码，开发者自定义；如传入传值表示更新区域库存，不传默认更新普通库存。可以使用【/warehouse/list】接口响应参数【out_warehouse_id】字段获取。超市小时达店铺类型，需传入store_id字段，store_id可以使用【/shop/batchCreateStore】创建成功后获取", example= "hh")
	private String outWarehouseId;

	@SerializedName("stock_num")
	@OpField(required = false , desc = "现货库存数", example= "1")
	private Long stockNum;

	@SerializedName("step_stock_num")
	@OpField(required = false , desc = "阶梯库存数", example= "2")
	private Long stepStockNum;

	@SerializedName("uniq_id")
	@OpField(required = false , desc = "批量请求中item的唯一标识", example= "uniqId1")
	private String uniqId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setStoreCode(String storeCode){
		this.storeCode = storeCode;
	}

	
	public String getStoreCode(){
		return this.storeCode;
	}

	
	public void setSkuCode(String skuCode){
		this.skuCode = skuCode;
	}

	
	public String getSkuCode(){
		return this.skuCode;
	}

	
	public void setOuterProductId(String outerProductId){
		this.outerProductId = outerProductId;
	}

	
	public String getOuterProductId(){
		return this.outerProductId;
	}

	
	public void setStoreId(Long storeId){
		this.storeId = storeId;
	}

	
	public Long getStoreId(){
		return this.storeId;
	}

	
	public void setOutSkuId(Long outSkuId){
		this.outSkuId = outSkuId;
	}

	
	public Long getOutSkuId(){
		return this.outSkuId;
	}

	
	public void setOutProductId(Long outProductId){
		this.outProductId = outProductId;
	}

	
	public Long getOutProductId(){
		return this.outProductId;
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

	
	public void setSkuId(Long skuId){
		this.skuId = skuId;
	}

	
	public Long getSkuId(){
		return this.skuId;
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

	
	public void setStepStockNum(Long stepStockNum){
		this.stepStockNum = stepStockNum;
	}

	
	public Long getStepStockNum(){
		return this.stepStockNum;
	}

	
	public void setUniqId(String uniqId){
		this.uniqId = uniqId;
	}

	
	public String getUniqId(){
		return this.uniqId;
	}

}