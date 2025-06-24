package com.doudian.open.api.material_get_cap_info.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class MaterialGetCapInfoData {


	@SerializedName("total_capacity")
	@OpField(desc = "总容量，单位KB", example = "188743680")
	private Long totalCapacity;

	@SerializedName("total_capacity_used")
	@OpField(desc = "已使用容量，单位KB", example = "681717")
	private Long totalCapacityUsed;

	@SerializedName("photo_capacity")
	@OpField(desc = "图片总容量，单位KB", example = "83886080")
	private Long photoCapacity;

	@SerializedName("photo_capacity_used")
	@OpField(desc = "图片已使用容量，单位KB", example = "74280")
	private Long photoCapacityUsed;

	@SerializedName("video_capacity")
	@OpField(desc = "视频总容量，单位KB", example = "104857600")
	private Long videoCapacity;

	@SerializedName("video_capacity_used")
	@OpField(desc = "视频已使用容量，单位KB", example = "607437")
	private Long videoCapacityUsed;

	@SerializedName("equity_info")
	@OpField(desc = "当前生效的权益列表", example = "")
	private List<EquityInfoItem> equityInfo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTotalCapacity(Long totalCapacity){
		this.totalCapacity = totalCapacity;
	}

	
	public Long getTotalCapacity(){
		return this.totalCapacity;
	}

	
	public void setTotalCapacityUsed(Long totalCapacityUsed){
		this.totalCapacityUsed = totalCapacityUsed;
	}

	
	public Long getTotalCapacityUsed(){
		return this.totalCapacityUsed;
	}

	
	public void setPhotoCapacity(Long photoCapacity){
		this.photoCapacity = photoCapacity;
	}

	
	public Long getPhotoCapacity(){
		return this.photoCapacity;
	}

	
	public void setPhotoCapacityUsed(Long photoCapacityUsed){
		this.photoCapacityUsed = photoCapacityUsed;
	}

	
	public Long getPhotoCapacityUsed(){
		return this.photoCapacityUsed;
	}

	
	public void setVideoCapacity(Long videoCapacity){
		this.videoCapacity = videoCapacity;
	}

	
	public Long getVideoCapacity(){
		return this.videoCapacity;
	}

	
	public void setVideoCapacityUsed(Long videoCapacityUsed){
		this.videoCapacityUsed = videoCapacityUsed;
	}

	
	public Long getVideoCapacityUsed(){
		return this.videoCapacityUsed;
	}

	
	public void setEquityInfo(List<EquityInfoItem> equityInfo){
		this.equityInfo = equityInfo;
	}

	
	public List<EquityInfoItem> getEquityInfo(){
		return this.equityInfo;
	}

}