package com.doudian.open.msg.material_auditResultForShop.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PhotoInfo {


	@SerializedName("format")
	@OpField(required = false , desc = "图片格式，支持png，jpg，gif", example= "png")
	private String format;

	@SerializedName("height")
	@OpField(required = false , desc = "图片高度，单位px", example= "800")
	private Long height;

	@SerializedName("width")
	@OpField(required = false , desc = "图片宽度，单位px", example= "800")
	private Long width;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setFormat(String format){
		this.format = format;
	}

	
	public String getFormat(){
		return this.format;
	}

	
	public void setHeight(Long height){
		this.height = height;
	}

	
	public Long getHeight(){
		return this.height;
	}

	
	public void setWidth(Long width){
		this.width = width;
	}

	
	public Long getWidth(){
		return this.width;
	}

}