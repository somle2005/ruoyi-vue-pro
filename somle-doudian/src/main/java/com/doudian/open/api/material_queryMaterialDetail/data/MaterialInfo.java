package com.doudian.open.api.material_queryMaterialDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class MaterialInfo {


	@SerializedName("material_id")
	@OpField(desc = "素材id；可使用【/material/batchUploadImageSync】【/material/uploadImageSync】【/material/searchMaterial  】接口获取", example = "70072571115707435960250")
	private String materialId;

	@SerializedName("folder_id")
	@OpField(desc = "文件夹id", example = "70072571115706780601250")
	private String folderId;

	@SerializedName("origin_url")
	@OpField(desc = "开发者上传时传入的公网可访问地址", example = "")
	private String originUrl;

	@SerializedName("byte_url")
	@OpField(desc = "图片url；当audit_status=3时获取byte_url；有值返回；", example = "")
	private String byteUrl;

	@SerializedName("materil_name")
	@OpField(desc = "素材名称", example = "名称")
	private String materilName;

	@SerializedName("material_type")
	@OpField(desc = "素材类型，photo-图片；video-视频；", example = "video")
	private String materialType;

	@SerializedName("operate_status")
	@OpField(desc = "素材状态，0-待下载；1-有效； 4-在回收站中；", example = "0")
	private Integer operateStatus;

	@SerializedName("audit_status")
	@OpField(desc = "审核状态，1-待审核 2-审核中 3-通过 4-拒绝；注意：只有AuditStatus=3时ByteUrl才会返回；", example = "5")
	private Integer auditStatus;

	@SerializedName("audit_reject_desc")
	@OpField(desc = "审核失败的原因", example = "文件大小超出限制")
	private String auditRejectDesc;

	@SerializedName("size")
	@OpField(desc = "大小，单位为byte", example = "1234")
	private Long size;

	@SerializedName("photo_info")
	@OpField(desc = "图片信息", example = "")
	private PhotoInfo photoInfo;

	@SerializedName("video_info")
	@OpField(desc = "视频信息", example = "")
	private VideoInfo videoInfo;

	@SerializedName("create_time")
	@OpField(desc = "素材创建时间", example = "2021-09-12 12:23:23")
	private String createTime;

	@SerializedName("update_time")
	@OpField(desc = "素材最近一次修改时间", example = "2021-09-12 12:23:23")
	private String updateTime;

	@SerializedName("delete_time")
	@OpField(desc = "素材移动到回收站的时间，只有在回收站中，该字段才有意义", example = "0")
	private String deleteTime;


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

	
	public void setOriginUrl(String originUrl){
		this.originUrl = originUrl;
	}

	
	public String getOriginUrl(){
		return this.originUrl;
	}

	
	public void setByteUrl(String byteUrl){
		this.byteUrl = byteUrl;
	}

	
	public String getByteUrl(){
		return this.byteUrl;
	}

	
	public void setMaterilName(String materilName){
		this.materilName = materilName;
	}

	
	public String getMaterilName(){
		return this.materilName;
	}

	
	public void setMaterialType(String materialType){
		this.materialType = materialType;
	}

	
	public String getMaterialType(){
		return this.materialType;
	}

	
	public void setOperateStatus(Integer operateStatus){
		this.operateStatus = operateStatus;
	}

	
	public Integer getOperateStatus(){
		return this.operateStatus;
	}

	
	public void setAuditStatus(Integer auditStatus){
		this.auditStatus = auditStatus;
	}

	
	public Integer getAuditStatus(){
		return this.auditStatus;
	}

	
	public void setAuditRejectDesc(String auditRejectDesc){
		this.auditRejectDesc = auditRejectDesc;
	}

	
	public String getAuditRejectDesc(){
		return this.auditRejectDesc;
	}

	
	public void setSize(Long size){
		this.size = size;
	}

	
	public Long getSize(){
		return this.size;
	}

	
	public void setPhotoInfo(PhotoInfo photoInfo){
		this.photoInfo = photoInfo;
	}

	
	public PhotoInfo getPhotoInfo(){
		return this.photoInfo;
	}

	
	public void setVideoInfo(VideoInfo videoInfo){
		this.videoInfo = videoInfo;
	}

	
	public VideoInfo getVideoInfo(){
		return this.videoInfo;
	}

	
	public void setCreateTime(String createTime){
		this.createTime = createTime;
	}

	
	public String getCreateTime(){
		return this.createTime;
	}

	
	public void setUpdateTime(String updateTime){
		this.updateTime = updateTime;
	}

	
	public String getUpdateTime(){
		return this.updateTime;
	}

	
	public void setDeleteTime(String deleteTime){
		this.deleteTime = deleteTime;
	}

	
	public String getDeleteTime(){
		return this.deleteTime;
	}

}