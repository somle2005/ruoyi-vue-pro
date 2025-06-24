package com.doudian.open.api.material_getFolderInfo.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class VideoInfo {


	@SerializedName("format")
	@OpField(desc = "视频格式", example = "mp3")
	private String format;

	@SerializedName("duration")
	@OpField(desc = "视频时长", example = "12")
	private Double duration;

	@SerializedName("vid")
	@OpField(desc = "视频云vid，根据该字段获取视频播放信息等https://op.jinritemai.com/docs/api-docs/69/2164", example = "123456789")
	private String vid;

	@SerializedName("video_cover_url")
	@OpField(desc = "视频封面", example = "https://xxxx.xxx")
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

	
	public void setVideoCoverUrl(String videoCoverUrl){
		this.videoCoverUrl = videoCoverUrl;
	}

	
	public String getVideoCoverUrl(){
		return this.videoCoverUrl;
	}

}