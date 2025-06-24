package com.doudian.open.api.material_mGetPlayInfo.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SuccessMapItem {


	@SerializedName("Vid")
	@OpField(desc = "vid，素材中心搜索素材或者查素材详情接口返回的vid字段", example = "asdas123")
	private String vid;

	@SerializedName("Height")
	@OpField(desc = "视频高度", example = "23")
	private Integer height;

	@SerializedName("Width")
	@OpField(desc = "视频宽度", example = "32")
	private Integer width;

	@SerializedName("Format")
	@OpField(desc = "视频格式", example = "mp4")
	private String format;

	@SerializedName("Size")
	@OpField(desc = "视频大小，单位B", example = "91226112")
	private Long size;

	@SerializedName("URI")
	@OpField(desc = "视频原地址", example = "www.xxxxxxx.com")
	private String uRI;

	@SerializedName("Duration")
	@OpField(desc = "视频长度(s)", example = "532.651")
	private Double duration;

	@SerializedName("VideoCoverUrl")
	@OpField(desc = "视频封面地址", example = "www.xxxxxxx.com")
	private String videoCoverUrl;

	@SerializedName("MainUrl")
	@OpField(desc = "视频播放地址", example = "www.xxxxxxx.com")
	private String mainUrl;

	@SerializedName("MainUrlExpire")
	@OpField(desc = "视频播放地址和视频封面地址的过期时间", example = "1657616683")
	private Long mainUrlExpire;


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

	
	public void setSize(Long size){
		this.size = size;
	}

	
	public Long getSize(){
		return this.size;
	}

	
	public void setURI(String uRI){
		this.uRI = uRI;
	}

	
	public String getURI(){
		return this.uRI;
	}

	
	public void setDuration(Double duration){
		this.duration = duration;
	}

	
	public Double getDuration(){
		return this.duration;
	}

	
	public void setVideoCoverUrl(String videoCoverUrl){
		this.videoCoverUrl = videoCoverUrl;
	}

	
	public String getVideoCoverUrl(){
		return this.videoCoverUrl;
	}

	
	public void setMainUrl(String mainUrl){
		this.mainUrl = mainUrl;
	}

	
	public String getMainUrl(){
		return this.mainUrl;
	}

	
	public void setMainUrlExpire(Long mainUrlExpire){
		this.mainUrlExpire = mainUrlExpire;
	}

	
	public Long getMainUrlExpire(){
		return this.mainUrlExpire;
	}

}