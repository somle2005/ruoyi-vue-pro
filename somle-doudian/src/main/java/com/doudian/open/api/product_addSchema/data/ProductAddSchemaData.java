package com.doudian.open.api.product_addSchema.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductAddSchemaData {


	@SerializedName("product_id")
	@OpField(desc = "商品ID", example = "123")
	private Long productId;

	@SerializedName("sku")
	@OpField(desc = "sku信息", example = "")
	private List<SkuItem> sku;


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

	
	public void setSku(List<SkuItem> sku){
		this.sku = sku;
	}

	
	public List<SkuItem> getSku(){
		return this.sku;
	}

}