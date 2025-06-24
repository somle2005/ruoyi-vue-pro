package com.doudian.open.msg.material_auditResultForBSCP.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class VideoInfo {


	@SerializedName("duration")
	@OpField(required = false , desc = "视频时长，单位s", example= "3.15")
	private Double duration;

	@SerializedName("format")
	@OpField(required = false , desc = "视频格式", example= "mp4")
	private String format;

	@SerializedName("height")
	@OpField(required = false , desc = "视频高度", example= "300")
	private Long height;

	@SerializedName("vid")
	@OpField(required = false , desc = "vid，用于获取视频播放地址，接口文档见：https://op.jinritemai.com/docs/api-docs/69/2164", example= "xxxxxxxx")
	private String vid;

	@SerializedName("width")
	@OpField(required = false , desc = "视频宽度", example= "400")
	private Long width;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setDuration(Double duration){
		this.duration = duration;
	}

	
	public Double getDuration(){
		return this.duration;
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

	
	public void setVid(String vid){
		this.vid = vid;
	}

	
	public String getVid(){
		return this.vid;
	}

	
	public void setWidth(Long width){
		this.width = width;
	}

	
	public Long getWidth(){
		return this.width;
	}

}