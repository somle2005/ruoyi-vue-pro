package com.doudian.open.api.material_mGetPlayInfo.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.Map;

//auto generated, do not edit

public class MaterialMGetPlayInfoData {


	@SerializedName("success_map")
	@OpField(desc = "获取成功map，key为vid，value是视频的播放信息", example = "")
	private Map<String,SuccessMapItem> successMap;

	@SerializedName("failed_map")
	@OpField(desc = "获取失败map，key为vid", example = "")
	private Map<String,FailedMapItem> failedMap;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSuccessMap(Map<String,SuccessMapItem> successMap){
		this.successMap = successMap;
	}

	
	public Map<String,SuccessMapItem> getSuccessMap(){
		return this.successMap;
	}

	
	public void setFailedMap(Map<String,FailedMapItem> failedMap){
		this.failedMap = failedMap;
	}

	
	public Map<String,FailedMapItem> getFailedMap(){
		return this.failedMap;
	}

}