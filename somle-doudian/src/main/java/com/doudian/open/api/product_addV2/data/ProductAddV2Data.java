package com.doudian.open.api.product_addV2.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductAddV2Data {


	@SerializedName("product_id")
	@OpField(desc = "product_id", example = "product_id")
	private Long productId;

	@SerializedName("out_product_id")
	@OpField(desc = "out_product_id", example = "out_product_id")
	private Long outProductId;

	@SerializedName("outer_product_id")
	@OpField(desc = "outer_product_id", example = "outer_product_id")
	private String outerProductId;

	@SerializedName("create_time")
	@OpField(desc = "create_time", example = "create_time")
	private String createTime;

	@SerializedName("sku")
	@OpField(desc = "1", example = "")
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

	
	public void setOutProductId(Long outProductId){
		this.outProductId = outProductId;
	}

	
	public Long getOutProductId(){
		return this.outProductId;
	}

	
	public void setOuterProductId(String outerProductId){
		this.outerProductId = outerProductId;
	}

	
	public String getOuterProductId(){
		return this.outerProductId;
	}

	
	public void setCreateTime(String createTime){
		this.createTime = createTime;
	}

	
	public String getCreateTime(){
		return this.createTime;
	}

	
	public void setSku(List<SkuItem> sku){
		this.sku = sku;
	}

	
	public List<SkuItem> getSku(){
		return this.sku;
	}

}