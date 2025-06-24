package com.doudian.open.api.material_batchUploadImageSync.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.Map;

//auto generated, do not edit

public class MaterialBatchUploadImageSyncData {


	@SerializedName("success_map")
	@OpField(desc = "成功上传的素材，key为参数中的request_id", example = "")
	private Map<String,SuccessMapItem> successMap;

	@SerializedName("failed_map")
	@OpField(desc = "失败的素材，key为参数中的request_id", example = "")
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