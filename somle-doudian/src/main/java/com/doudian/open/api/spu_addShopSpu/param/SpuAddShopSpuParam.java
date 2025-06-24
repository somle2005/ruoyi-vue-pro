package com.doudian.open.api.spu_addShopSpu.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SpuAddShopSpuParam {


	@SerializedName("spu_name")
	@OpField(required = true , desc = "spuName", example= "Apple/Iphone11")
	private String spuName;

	@SerializedName("upc_code")
	@OpField(required = false , desc = "产品唯一标识，没有填写空字符串", example= "A1001")
	private String upcCode;

	@SerializedName("category_id")
	@OpField(required = true , desc = "类目id", example= "31860")
	private Long categoryId;

	@SerializedName("brand_id")
	@OpField(required = true , desc = "品牌id", example= "1001")
	private Long brandId;

	@SerializedName("property_infos")
	@OpField(required = true , desc = "属性信息", example= "")
	private List<PropertyInfosItem> propertyInfos;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSpuName(String spuName){
		this.spuName = spuName;
	}

	
	public String getSpuName(){
		return this.spuName;
	}

	
	public void setUpcCode(String upcCode){
		this.upcCode = upcCode;
	}

	
	public String getUpcCode(){
		return this.upcCode;
	}

	
	public void setCategoryId(Long categoryId){
		this.categoryId = categoryId;
	}

	
	public Long getCategoryId(){
		return this.categoryId;
	}

	
	public void setBrandId(Long brandId){
		this.brandId = brandId;
	}

	
	public Long getBrandId(){
		return this.brandId;
	}

	
	public void setPropertyInfos(List<PropertyInfosItem> propertyInfos){
		this.propertyInfos = propertyInfos;
	}

	
	public List<PropertyInfosItem> getPropertyInfos(){
		return this.propertyInfos;
	}

}