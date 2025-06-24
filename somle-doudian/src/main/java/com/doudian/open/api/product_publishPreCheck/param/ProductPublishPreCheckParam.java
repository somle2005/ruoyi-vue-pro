package com.doudian.open.api.product_publishPreCheck.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductPublishPreCheckParam {


	@SerializedName("check_types")
	@OpField(required = true , desc = "校验类型，需要进行哪些校验，可以支持部分校验。店铺发品门槛校验：shop_publish_product_access，不需要传其他字段；店铺使用类目权限校验：shop_use_category_access，需要传category_id字段", example= "[shop_publish_product_access,shop_use_category_access,shop_out_product_id_unique]")
	private List<String> checkTypes;

	@SerializedName("category_id")
	@OpField(required = false , desc = "叶子类目id", example= "20219")
	private Long categoryId;

	@SerializedName("out_product_id")
	@OpField(required = false , desc = "外部商品编码，对应商品outer_product_id字段", example= "123456678")
	private String outProductId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCheckTypes(List<String> checkTypes){
		this.checkTypes = checkTypes;
	}

	
	public List<String> getCheckTypes(){
		return this.checkTypes;
	}

	
	public void setCategoryId(Long categoryId){
		this.categoryId = categoryId;
	}

	
	public Long getCategoryId(){
		return this.categoryId;
	}

	
	public void setOutProductId(String outProductId){
		this.outProductId = outProductId;
	}

	
	public String getOutProductId(){
		return this.outProductId;
	}

}