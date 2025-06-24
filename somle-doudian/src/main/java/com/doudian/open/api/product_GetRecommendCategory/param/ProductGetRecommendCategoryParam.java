package com.doudian.open.api.product_GetRecommendCategory.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;
import java.util.Map;

//auto generated, do not edit

public class ProductGetRecommendCategoryParam {


	@SerializedName("scene")
	@OpField(required = true , desc = "category_infer: 基于标题、图片等推断商品类目；product_info: 表示基于商品内容进行类目错放判断，需要传入商品类目、属性等；smart_publish: 表示图片预测类目，需要传入商品主图；", example= "product_info")
	private String scene;

	@SerializedName("pic")
	@OpField(required = false , desc = "商品主图图片url，scene为smart_publish时必传", example= "")
	private List<PicItem> pic;

	@SerializedName("category_leaf_id")
	@OpField(required = false , desc = "商品类目id，scene为product_info时必传", example= "20415")
	private Long categoryLeafId;

	@SerializedName("name")
	@OpField(required = false , desc = "商品标题，scene为category_infer时必填; sense为product_info时选填", example= "商品标题")
	private String name;

	@SerializedName("product_format_new")
	@OpField(required = false , desc = "商品类目属性", example= "1")
	private Map<Long,List<ProductFormatNewItem>> productFormatNew;

	@SerializedName("standard_brand_id")
	@OpField(required = false , desc = "品牌id", example= "30241")
	private Long standardBrandId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setScene(String scene){
		this.scene = scene;
	}

	
	public String getScene(){
		return this.scene;
	}

	
	public void setPic(List<PicItem> pic){
		this.pic = pic;
	}

	
	public List<PicItem> getPic(){
		return this.pic;
	}

	
	public void setCategoryLeafId(Long categoryLeafId){
		this.categoryLeafId = categoryLeafId;
	}

	
	public Long getCategoryLeafId(){
		return this.categoryLeafId;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setProductFormatNew(Map<Long,List<ProductFormatNewItem>> productFormatNew){
		this.productFormatNew = productFormatNew;
	}

	
	public Map<Long,List<ProductFormatNewItem>> getProductFormatNew(){
		return this.productFormatNew;
	}

	
	public void setStandardBrandId(Long standardBrandId){
		this.standardBrandId = standardBrandId;
	}

	
	public Long getStandardBrandId(){
		return this.standardBrandId;
	}

}