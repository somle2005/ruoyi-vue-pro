package com.doudian.open.api.material_get_cap_info.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class EquityInfoItem {


	@SerializedName("equity_type")
	@OpField(desc = "权益类型", example = "B")
	private String equityType;

	@SerializedName("equity_type_desc")
	@OpField(desc = "权益描述", example = "B类商家权益")
	private String equityTypeDesc;

	@SerializedName("begin_time")
	@OpField(desc = "权益开始时间", example = "1641034518")
	private Long beginTime;

	@SerializedName("end_time")
	@OpField(desc = "权益结束时间", example = "1672570518")
	private Long endTime;

	@SerializedName("total_capacity")
	@OpField(desc = "该权益对应的总容量，单位KB", example = "41943040")
	private Long totalCapacity;

	@SerializedName("photo_capacity")
	@OpField(desc = "该权益对应的图片总容量，单位KB", example = "20971520")
	private Long photoCapacity;

	@SerializedName("video_capacity")
	@OpField(desc = "该权益对应的视频总容量，单位KB", example = "20971520")
	private Long videoCapacity;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setEquityType(String equityType){
		this.equityType = equityType;
	}

	
	public String getEquityType(){
		return this.equityType;
	}

	
	public void setEquityTypeDesc(String equityTypeDesc){
		this.equityTypeDesc = equityTypeDesc;
	}

	
	public String getEquityTypeDesc(){
		return this.equityTypeDesc;
	}

	
	public void setBeginTime(Long beginTime){
		this.beginTime = beginTime;
	}

	
	public Long getBeginTime(){
		return this.beginTime;
	}

	
	public void setEndTime(Long endTime){
		this.endTime = endTime;
	}

	
	public Long getEndTime(){
		return this.endTime;
	}

	
	public void setTotalCapacity(Long totalCapacity){
		this.totalCapacity = totalCapacity;
	}

	
	public Long getTotalCapacity(){
		return this.totalCapacity;
	}

	
	public void setPhotoCapacity(Long photoCapacity){
		this.photoCapacity = photoCapacity;
	}

	
	public Long getPhotoCapacity(){
		return this.photoCapacity;
	}

	
	public void setVideoCapacity(Long videoCapacity){
		this.videoCapacity = videoCapacity;
	}

	
	public Long getVideoCapacity(){
		return this.videoCapacity;
	}

}