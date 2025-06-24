package com.doudian.open.api.brand_convert.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class BrandConvertData {


	@SerializedName("brand_id")
	@OpField(desc = "品牌id，对应商品发布接口standard_brand_id字段", example = "12345")
	private Long brandId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setBrandId(Long brandId){
		this.brandId = brandId;
	}

	
	public Long getBrandId(){
		return this.brandId;
	}

}