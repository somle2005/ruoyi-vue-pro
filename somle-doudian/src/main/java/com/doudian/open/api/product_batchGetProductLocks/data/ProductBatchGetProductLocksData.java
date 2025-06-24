package com.doudian.open.api.product_batchGetProductLocks.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductBatchGetProductLocksData {


	@SerializedName("product_lock_infos")
	@OpField(desc = "商品锁信息", example = "")
	private List<ProductLockInfosItem> productLockInfos;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProductLockInfos(List<ProductLockInfosItem> productLockInfos){
		this.productLockInfos = productLockInfos;
	}

	
	public List<ProductLockInfosItem> getProductLockInfos(){
		return this.productLockInfos;
	}

}