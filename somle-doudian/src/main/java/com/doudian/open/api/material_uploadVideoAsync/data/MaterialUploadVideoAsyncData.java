package com.doudian.open.api.material_uploadVideoAsync.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class MaterialUploadVideoAsyncData {


	@SerializedName("material_id")
	@OpField(desc = "素材id", example = "7000254886243811628")
	private String materialId;

	@SerializedName("folder_id")
	@OpField(desc = "素材所在文件夹id，0-素材中心的根目录", example = "0")
	private String folderId;

	@SerializedName("is_new")
	@OpField(desc = "是否是新建，false-重复请求 true-新建", example = "true")
	private Boolean isNew;

	@SerializedName("audit_status")
	@OpField(desc = "素材审核状态 0-下载中 1-等待审核 2-审核中 3-通过 4-拒绝", example = "1")
	private Integer auditStatus;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMaterialId(String materialId){
		this.materialId = materialId;
	}

	
	public String getMaterialId(){
		return this.materialId;
	}

	
	public void setFolderId(String folderId){
		this.folderId = folderId;
	}

	
	public String getFolderId(){
		return this.folderId;
	}

	
	public void setIsNew(Boolean isNew){
		this.isNew = isNew;
	}

	
	public Boolean getIsNew(){
		return this.isNew;
	}

	
	public void setAuditStatus(Integer auditStatus){
		this.auditStatus = auditStatus;
	}

	
	public Integer getAuditStatus(){
		return this.auditStatus;
	}

}