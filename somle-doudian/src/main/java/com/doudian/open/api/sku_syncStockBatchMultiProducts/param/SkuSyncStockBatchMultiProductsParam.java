package com.doudian.open.api.sku_syncStockBatchMultiProducts.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SkuSyncStockBatchMultiProductsParam {


	@SerializedName("items")
	@OpField(required = true , desc = "请求列表", example= "")
	private List<ItemsItem> items;

	@SerializedName("idempotent_id")
	@OpField(required = true , desc = "幂等ID，平台会校验校验成功的idempotent_id值，请保证24小时内在店铺下唯一性，建议使用年月日时分秒+随机数生成。重复的idempotent_id会触发“Token已被使用”报错", example= "123k")
	private String idempotentId;

	@SerializedName("incremental")
	@OpField(required = true , desc = "库存更新方式，必填字段；true-增量更新，同时stock_num和step_stock_num字段可以为正数或负数；false-全量更新，同时stock_num和step_stock_num字段只能为正数数", example= "true")
	private Boolean incremental;

	@SerializedName("source")
	@OpField(required = false , desc = "请求来源，开发者自定义；", example= "123sdfaseq")
	private String source;

	@SerializedName("allow_partial_success")
	@OpField(required = false , desc = "是否允许部分成功失败，默认接口级别成功失败", example= "false")
	private Boolean allowPartialSuccess;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setItems(List<ItemsItem> items){
		this.items = items;
	}

	
	public List<ItemsItem> getItems(){
		return this.items;
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

	
	public void setSource(String source){
		this.source = source;
	}

	
	public String getSource(){
		return this.source;
	}

	
	public void setAllowPartialSuccess(Boolean allowPartialSuccess){
		this.allowPartialSuccess = allowPartialSuccess;
	}

	
	public Boolean getAllowPartialSuccess(){
		return this.allowPartialSuccess;
	}

}