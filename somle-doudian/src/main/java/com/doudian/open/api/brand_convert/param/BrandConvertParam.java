package com.doudian.open.api.brand_convert.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class BrandConvertParam {


	@SerializedName("related_id")
	@OpField(required = true , desc = "品牌关系id，即/shop/brandList返回的id", example= "12345")
	private Long relatedId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setRelatedId(Long relatedId){
		this.relatedId = relatedId;
	}

	
	public Long getRelatedId(){
		return this.relatedId;
	}

}