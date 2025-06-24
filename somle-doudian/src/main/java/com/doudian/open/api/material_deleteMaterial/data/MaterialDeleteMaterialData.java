package com.doudian.open.api.material_deleteMaterial.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;
import java.util.Map;

//auto generated, do not edit

public class MaterialDeleteMaterialData {


	@SerializedName("success_ids")
	@OpField(desc = "操作成功的素材id", example = "[123]")
	private List<String> successIds;

	@SerializedName("failed_map")
	@OpField(desc = "操作失败的素材id和原因", example = "")
	private Map<String,FailedMapItem> failedMap;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSuccessIds(List<String> successIds){
		this.successIds = successIds;
	}

	
	public List<String> getSuccessIds(){
		return this.successIds;
	}

	
	public void setFailedMap(Map<String,FailedMapItem> failedMap){
		this.failedMap = failedMap;
	}

	
	public Map<String,FailedMapItem> getFailedMap(){
		return this.failedMap;
	}

}