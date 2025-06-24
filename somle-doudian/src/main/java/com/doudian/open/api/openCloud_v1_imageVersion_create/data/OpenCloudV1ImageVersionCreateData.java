package com.doudian.open.api.openCloud_v1_imageVersion_create.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OpenCloudV1ImageVersionCreateData {


	@SerializedName("version_id")
	@OpField(desc = "镜像版本id", example = "7241903236771234092")
	private String versionId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setVersionId(String versionId){
		this.versionId = versionId;
	}

	
	public String getVersionId(){
		return this.versionId;
	}

}