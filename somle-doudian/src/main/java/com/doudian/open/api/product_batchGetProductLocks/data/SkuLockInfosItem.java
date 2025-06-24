package com.doudian.open.api.product_batchGetProductLocks.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SkuLockInfosItem {


	@SerializedName("sku_id")
	@OpField(desc = "sku id", example = "3659180521350528")
	private Long skuId;

	@SerializedName("sku_locks")
	@OpField(desc = "sku锁。1000: 单sku规格锁1001: 单sku价格锁1002: 单sku规格图锁1003: 单sku库存类型锁1004: 单sku库存增加锁1005: 单sku库存减少锁1006: 单sku库存区域仓锁", example = "[1004]")
	private List<Long> skuLocks;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSkuId(Long skuId){
		this.skuId = skuId;
	}

	
	public Long getSkuId(){
		return this.skuId;
	}

	
	public void setSkuLocks(List<Long> skuLocks){
		this.skuLocks = skuLocks;
	}

	
	public List<Long> getSkuLocks(){
		return this.skuLocks;
	}

}