package com.doudian.open.api.material_queryMaterialDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class VideoInfo {


	@SerializedName("format")
	@OpField(desc = "视频格式", example = "mp3")
	private String format;

	@SerializedName("duration")
	@OpField(desc = "视频时长，单位秒", example = "12")
	private Double duration;

	@SerializedName("vid")
	@OpField(desc = "vid，用于获取视频播放地址，接口文档见：https://op.jinritemai.com/docs/api-docs/69/2164", example = "12345678")
	private String vid;

	@SerializedName("height")
	@OpField(desc = "视频高度", example = "32")
	private Integer height;

	@SerializedName("width")
	@OpField(desc = "视频宽度", example = "23")
	private Integer width;

	@SerializedName("video_cover_url")
	@OpField(desc = "视频封面地址", example = "www.xxxxxxx.com")
	private String videoCoverUrl;


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

	
	public void setDuration(Double duration){
		this.duration = duration;
	}

	
	public Double getDuration(){
		return this.duration;
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

	
	public void setVideoCoverUrl(String videoCoverUrl){
		this.videoCoverUrl = videoCoverUrl;
	}

	
	public String getVideoCoverUrl(){
		return this.videoCoverUrl;
	}

}