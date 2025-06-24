package com.doudian.open.api.product_applyMainPicVideo.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductApplyMainPicVideoParam {


	@SerializedName("product_id")
	@OpField(required = true , desc = "商品ID", example= "3506108675121111111")
	private Long productId;

	@SerializedName("material_video_id")
	@OpField(required = true , desc = "主图视频vid，可以先通过https://op.jinritemai.com/docs/api-docs/69/1617接口上传视频，获取审核通过的视频素材ID进行传入", example= "v03ecag10000csdkfffog65p65tkkao0")
	private String materialVideoId;


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

	
	public void setMaterialVideoId(String materialVideoId){
		this.materialVideoId = materialVideoId;
	}

	
	public String getMaterialVideoId(){
		return this.materialVideoId;
	}

}