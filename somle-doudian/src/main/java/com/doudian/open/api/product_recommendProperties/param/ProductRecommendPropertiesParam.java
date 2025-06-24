package com.doudian.open.api.product_recommendProperties.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;
import java.util.Map;

//auto generated, do not edit

public class ProductRecommendPropertiesParam {


	@SerializedName("category_id")
	@OpField(required = true , desc = "叶子类目ID", example= "20172")
	private Long categoryId;

	@SerializedName("material_ids")
	@OpField(required = false , desc = "素材ID列表，用于属性预测。material_ids与img_urls选传其中一个即可。", example= "[72986162310573755150419]")
	private List<String> materialIds;

	@SerializedName("img_urls")
	@OpField(required = false , desc = "图片URL列表，用于属性预测。material_ids与img_urls选传其中一个即可。", example= "[https://p3-aio.ecombdimg.com/obj/ecom-shop-material/v1_GhxlaZ_72986162310573755150419_6fcc92a698215567a8963cb1861e1945_sx_818278_www2143-2143]")
	private List<String> imgUrls;

	@SerializedName("name")
	@OpField(required = false , desc = "商品标题", example= "商品标题")
	private String name;

	@SerializedName("product_format")
	@OpField(required = false , desc = "商家自填属性；传入可以触发对自填属性值的判准", example= "")
	private Map<Long,List<ProductFormatItem>> productFormat;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCategoryId(Long categoryId){
		this.categoryId = categoryId;
	}

	
	public Long getCategoryId(){
		return this.categoryId;
	}

	
	public void setMaterialIds(List<String> materialIds){
		this.materialIds = materialIds;
	}

	
	public List<String> getMaterialIds(){
		return this.materialIds;
	}

	
	public void setImgUrls(List<String> imgUrls){
		this.imgUrls = imgUrls;
	}

	
	public List<String> getImgUrls(){
		return this.imgUrls;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setProductFormat(Map<Long,List<ProductFormatItem>> productFormat){
		this.productFormat = productFormat;
	}

	
	public Map<Long,List<ProductFormatItem>> getProductFormat(){
		return this.productFormat;
	}

}