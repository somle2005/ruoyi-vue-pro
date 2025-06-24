package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ArbitrateEvidence {


	@SerializedName("images")
	@OpField(desc = "仲裁图片", example = "仲裁图片示例")
	private List<String> images;

	@SerializedName("describe")
	@OpField(desc = "仲裁图片描述", example = "仲裁描述")
	private String describe;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setImages(List<String> images){
		this.images = images;
	}

	
	public List<String> getImages(){
		return this.images;
	}

	
	public void setDescribe(String describe){
		this.describe = describe;
	}

	
	public String getDescribe(){
		return this.describe;
	}

}