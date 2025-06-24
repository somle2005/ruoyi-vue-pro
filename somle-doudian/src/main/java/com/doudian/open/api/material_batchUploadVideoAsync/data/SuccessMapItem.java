package com.doudian.open.api.material_batchUploadVideoAsync.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SuccessMapItem {


	@SerializedName("MaterialId")
	@OpField(desc = "素材id，素材中心对素材的唯一编号", example = "123")
	private String materialId;

	@SerializedName("Name")
	@OpField(desc = "素材名称，长度限制为50个字符", example = "这是一个视频")
	private String name;

	@SerializedName("FolderId")
	@OpField(desc = "文件夹id，“0”表示将素材上传到了素材中心根目录", example = "0")
	private String folderId;

	@SerializedName("OriginUrl")
	@OpField(desc = "上传素材时，传入参数url的取值", example = "https://origin/xxxx")
	private String originUrl;

	@SerializedName("AuditStatus")
	@OpField(desc = "审核状态 0-下载中 1-待审核 2-审核中 3-审核通过 4-审核拒绝", example = "1")
	private Integer auditStatus;

	@SerializedName("IsNew")
	@OpField(desc = "是否为新建的素材，true-表示新建", example = "false")
	private Boolean isNew;


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

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setFolderId(String folderId){
		this.folderId = folderId;
	}

	
	public String getFolderId(){
		return this.folderId;
	}

	
	public void setOriginUrl(String originUrl){
		this.originUrl = originUrl;
	}

	
	public String getOriginUrl(){
		return this.originUrl;
	}

	
	public void setAuditStatus(Integer auditStatus){
		this.auditStatus = auditStatus;
	}

	
	public Integer getAuditStatus(){
		return this.auditStatus;
	}

	
	public void setIsNew(Boolean isNew){
		this.isNew = isNew;
	}

	
	public Boolean getIsNew(){
		return this.isNew;
	}

}