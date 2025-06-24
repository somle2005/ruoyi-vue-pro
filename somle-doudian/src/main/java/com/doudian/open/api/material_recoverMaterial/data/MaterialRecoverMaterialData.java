package com.doudian.open.api.material_recoverMaterial.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;
import java.util.Map;

//auto generated, do not edit

public class MaterialRecoverMaterialData {


	@SerializedName("success_ids")
	@OpField(desc = "成功操作的素材id列表", example = "[7000291764753940780]")
	private List<String> successIds;

	@SerializedName("failed_map")
	@OpField(desc = "失败素材列表及失败原因", example = "")
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