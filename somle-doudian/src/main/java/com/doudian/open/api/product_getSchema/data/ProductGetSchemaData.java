package com.doudian.open.api.product_getSchema.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductGetSchemaData {


	@SerializedName("model")
	@OpField(desc = "schem数据、json格式", example = "{}")
	private String model;

	@SerializedName("product_data")
	@OpField(desc = "商品数据", example = "")
	private ProductData productData;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setModel(String model){
		this.model = model;
	}

	
	public String getModel(){
		return this.model;
	}

	
	public void setProductData(ProductData productData){
		this.productData = productData;
	}

	
	public ProductData getProductData(){
		return this.productData;
	}

}