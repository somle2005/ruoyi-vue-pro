package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class LowPriceProduct {


	@SerializedName("sku_specs")
	@OpField(desc = "规格", example = "")
	private List<SkuSpecsItem> skuSpecs;

	@SerializedName("product_id")
	@OpField(desc = "聚合商品id", example = "374893578943")
	private Long productId;

	@SerializedName("sku_id")
	@OpField(desc = "聚合商品skuid", example = "3789354")
	private Long skuId;

	@SerializedName("product_name")
	@OpField(desc = "商品名称", example = "测试商品")
	private String productName;

	@SerializedName("img")
	@OpField(desc = "聚合商品图片", example = "https://p6-aio.ecombdimg.com/obj/ecom-shop-material/wYxIpQzK_m_5e47ebab4b3ca5681b89114c96a50666_sx_298973_www800-800")
	private String img;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSkuSpecs(List<SkuSpecsItem> skuSpecs){
		this.skuSpecs = skuSpecs;
	}

	
	public List<SkuSpecsItem> getSkuSpecs(){
		return this.skuSpecs;
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

	
	public void setProductName(String productName){
		this.productName = productName;
	}

	
	public String getProductName(){
		return this.productName;
	}

	
	public void setImg(String img){
		this.img = img;
	}

	
	public String getImg(){
		return this.img;
	}

}