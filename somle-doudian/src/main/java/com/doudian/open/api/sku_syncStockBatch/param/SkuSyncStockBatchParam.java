package com.doudian.open.api.sku_syncStockBatch.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SkuSyncStockBatchParam {


	@SerializedName("product_id")
	@OpField(required = true , desc = "商品ID，整型格式", example= "3337589750809921129")
	private Long productId;

	@SerializedName("idempotent_id")
	@OpField(required = false , desc = "幂等ID，仅incremental=true时有用", example= "2")
	private String idempotentId;

	@SerializedName("incremental")
	@OpField(required = true , desc = "true表示增量库存，false表示全量库存，默认为false", example= "true")
	private Boolean incremental;

	@SerializedName("sku_sync_list")
	@OpField(required = true , desc = "需要批量提交的skuid及对应的库存和仓；接口规则全部成功或全部失败，例：批量更新10个skuid库存，其中一个skuid信息不正确，这样整个请求都会失败，10个skuid都未更新成功。", example= "")
	private List<SkuSyncListItem> skuSyncList;

	@SerializedName("outer_product_id")
	@OpField(required = false , desc = "推荐使用，外部商家编码，支持字符串。", example= "232334")
	private String outerProductId;

	@SerializedName("store_id")
	@OpField(required = false , desc = "即时零售连锁版，通过传入主品id+门店id对该门店下的子品进行操作，即时零售单店版，无需使用", example= "12345")
	private Long storeId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

	
	public void setIdempotentId(String idempotentId){
		this.idempotentId = idempotentId;
	}

	
	public String getIdempotentId(){
		return this.idempotentId;
	}

	
	public void setIncremental(Boolean incremental){
		this.incremental = incremental;
	}

	
	public Boolean getIncremental(){
		return this.incremental;
	}

	
	public void setSkuSyncList(List<SkuSyncListItem> skuSyncList){
		this.skuSyncList = skuSyncList;
	}

	
	public List<SkuSyncListItem> getSkuSyncList(){
		return this.skuSyncList;
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

}