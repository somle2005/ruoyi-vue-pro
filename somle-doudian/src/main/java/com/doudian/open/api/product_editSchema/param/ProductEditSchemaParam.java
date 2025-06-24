package com.doudian.open.api.product_editSchema.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.Map;

//auto generated, do not edit

public class ProductEditSchemaParam {


	@SerializedName("product_id")
	@OpField(required = true , desc = "商品ID", example= "123")
	private Long productId;

	@SerializedName("commit")
	@OpField(required = true , desc = "是否提审 true提审、false保存草稿", example= "true")
	private Boolean commit;

	@SerializedName("token")
	@OpField(required = true , desc = "商品发布token", example= "1234")
	private String token;

	@SerializedName("model")
	@OpField(required = true , desc = "schema数据", example= "")
	private String model;

	@SerializedName("recommend_ids")
	@OpField(required = false , desc = "预测记录id，类目预测记录key=category_recommend_id", example= "{category_recommend_id:qwrqrw12341}")
	private Map<String,String> recommendIds;


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

	
	public void setCommit(Boolean commit){
		this.commit = commit;
	}

	
	public Boolean getCommit(){
		return this.commit;
	}

	
	public void setToken(String token){
		this.token = token;
	}

	
	public String getToken(){
		return this.token;
	}

	
	public void setModel(String model){
		this.model = model;
	}

	
	public String getModel(){
		return this.model;
	}

	
	public void setRecommendIds(Map<String,String> recommendIds){
		this.recommendIds = recommendIds;
	}

	
	public Map<String,String> getRecommendIds(){
		return this.recommendIds;
	}

}