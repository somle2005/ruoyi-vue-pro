package com.doudian.open.api.material_searchMaterial.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PhotoInfo {


	@SerializedName("height")
	@OpField(desc = "图片高度，单位px", example = "255")
	private Integer height;

	@SerializedName("width")
	@OpField(desc = "图片宽度，单位px", example = "255")
	private Integer width;

	@SerializedName("format")
	@OpField(desc = "图片格式", example = "jpg")
	private String format;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setHeight(Integer height){
		this.height = height;
	}

	
	public Integer getHeight(){
		return this.height;
	}

	
	public void setWidth(Integer width){
		this.width = width;
	}

	
	public Integer getWidth(){
		return this.width;
	}

	
	public void setFormat(String format){
		this.format = format;
	}

	
	public String getFormat(){
		return this.format;
	}

}