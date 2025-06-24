package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class LowPriceProduct {


	@SerializedName("product_id")
	@OpField(desc = "聚合商品id", example = "3435495646")
	private Long productId;

	@SerializedName("product_name")
	@OpField(desc = "聚合商品名称", example = "超值购商品")
	private String productName;

	@SerializedName("sku_specs")
	@OpField(desc = "聚合商品规格", example = "")
	private List<SkuSpecsItem> skuSpecs;

	@SerializedName("sku_id")
	@OpField(desc = "聚合商品skuid", example = "37489375")
	private Long skuId;

	@SerializedName("img")
	@OpField(desc = "超值购聚合商品图片（用户下单时看到的图片）", example = "https://p6-aio.ecombdimg.com/obj/ecom-shop-material/wYxIpQzK_m_5e47ebab4b3ca5681b89114c96a50666_sx_298973_www800-800")
	private String img;


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

	
	public void setProductName(String productName){
		this.productName = productName;
	}

	
	public String getProductName(){
		return this.productName;
	}

	
	public void setSkuSpecs(List<SkuSpecsItem> skuSpecs){
		this.skuSpecs = skuSpecs;
	}

	
	public List<SkuSpecsItem> getSkuSpecs(){
		return this.skuSpecs;
	}

	
	public void setSkuId(Long skuId){
		this.skuId = skuId;
	}

	
	public Long getSkuId(){
		return this.skuId;
	}

	
	public void setImg(String img){
		this.img = img;
	}

	
	public String getImg(){
		return this.img;
	}

}