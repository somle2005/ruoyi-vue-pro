package com.doudian.open.msg.material_auditResultForShop.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class VideoInfo {


	@SerializedName("vid")
	@OpField(required = false , desc = "vid，用于获取视频播放地址，接口文档见：https://op.jinritemai.com/docs/api-docs/69/2164", example= "xxxxxxxx")
	private String vid;

	@SerializedName("height")
	@OpField(required = false , desc = "视频高度，单位px", example= "300")
	private Integer height;

	@SerializedName("width")
	@OpField(required = false , desc = "视频宽度，单位px", example= "400")
	private Integer width;

	@SerializedName("format")
	@OpField(required = false , desc = "视频格式", example= "mp4")
	private String format;

	@SerializedName("duration")
	@OpField(required = false , desc = "视频时长，单位s", example= "25")
	private Double duration;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setVid(String vid){
		this.vid = vid;
	}

	
	public String getVid(){
		return this.vid;
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

	
	public void setDuration(Double duration){
		this.duration = duration;
	}

	
	public Double getDuration(){
		return this.duration;
	}

}