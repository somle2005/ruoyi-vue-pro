package com.doudian.open.api.material_recoverFolder.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;
import java.util.Map;

//auto generated, do not edit

public class MaterialRecoverFolderData {


	@SerializedName("success_ids")
	@OpField(desc = "操作成功的文件夹列表", example = "[7000254886243746092, 7000254886243746093]")
	private List<String> successIds;

	@SerializedName("failed_map")
	@OpField(desc = "操作失败的文件夹及失败的详情", example = "")
	private Map<Long,FailedMapItem> failedMap;


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

	
	public void setFailedMap(Map<Long,FailedMapItem> failedMap){
		this.failedMap = failedMap;
	}

	
	public Map<Long,FailedMapItem> getFailedMap(){
		return this.failedMap;
	}

}