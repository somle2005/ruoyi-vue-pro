package com.doudian.open.api.product_detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SpecPicsItem {


	@SerializedName("spec_detail_id")
	@OpField(desc = "id", example = "1695459998447656")
	private Long specDetailId;

	@SerializedName("pic")
	@OpField(desc = "规格图片uri", example = "temai/b637513c50b994f4c89de56a17886caca5d6569awww800-800")
	private String pic;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSpecDetailId(Long specDetailId){
		this.specDetailId = specDetailId;
	}

	
	public Long getSpecDetailId(){
		return this.specDetailId;
	}

	
	public void setPic(String pic){
		this.pic = pic;
	}

	
	public String getPic(){
		return this.pic;
	}

}