package com.doudian.open.api.product_diagnoseCheck.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SkuListItem {


	@SerializedName("price")
	@OpField(required = false , desc = "价格", example= "1000")
	private Long price;

	@SerializedName("name")
	@OpField(required = false , desc = "sku名称用属性项和属性值拼接组成，格式：规格项1:规格值1;规格项2:规格值2;", example= "颜色分类:红色;尺码:M;")
	private String name;

	@SerializedName("stock")
	@OpField(required = false , desc = "库存", example= "100")
	private Long stock;

	@SerializedName("image_url")
	@OpField(required = false , desc = "规格图片", example= "ecom-shop-material/jpeg_m_bb06b738f66a8e34355a2f6d65856010_sx_592497_www800-800")
	private String imageUrl;

	@SerializedName("sku_id")
	@OpField(required = false , desc = "skuid", example= "232323")
	private Long skuId;

	@SerializedName("spec_detail_ids")
	@OpField(required = false , desc = "规格id列表", example= "[                1825226749200409,                1825226749202489            ]")
	private List<String> specDetailIds;

	@SerializedName("sku_classification_type")
	@OpField(required = false , desc = "sku分类", example= "无")
	private String skuClassificationType;

	@SerializedName("sell_properties")
	@OpField(required = false , desc = "销售属性", example= "")
	private List<SellPropertiesItem> sellProperties;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPrice(Long price){
		this.price = price;
	}

	
	public Long getPrice(){
		return this.price;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setStock(Long stock){
		this.stock = stock;
	}

	
	public Long getStock(){
		return this.stock;
	}

	
	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	
	public String getImageUrl(){
		return this.imageUrl;
	}

	
	public void setSkuId(Long skuId){
		this.skuId = skuId;
	}

	
	public Long getSkuId(){
		return this.skuId;
	}

	
	public void setSpecDetailIds(List<String> specDetailIds){
		this.specDetailIds = specDetailIds;
	}

	
	public List<String> getSpecDetailIds(){
		return this.specDetailIds;
	}

	
	public void setSkuClassificationType(String skuClassificationType){
		this.skuClassificationType = skuClassificationType;
	}

	
	public String getSkuClassificationType(){
		return this.skuClassificationType;
	}

	
	public void setSellProperties(List<SellPropertiesItem> sellProperties){
		this.sellProperties = sellProperties;
	}

	
	public List<SellPropertiesItem> getSellProperties(){
		return this.sellProperties;
	}

}