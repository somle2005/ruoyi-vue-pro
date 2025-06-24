package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ValuePic {


	@SerializedName("pic_value")
	@OpField(desc = "规格值图片内容", example = "#FFFF")
	private String picValue;

	@SerializedName("pic_type")
	@OpField(desc = "规格值图片类型rgb和url", example = "rgb")
	private String picType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPicValue(String picValue){
		this.picValue = picValue;
	}

	
	public String getPicValue(){
		return this.picValue;
	}

	
	public void setPicType(String picType){
		this.picType = picType;
	}

	
	public String getPicType(){
		return this.picType;
	}

}