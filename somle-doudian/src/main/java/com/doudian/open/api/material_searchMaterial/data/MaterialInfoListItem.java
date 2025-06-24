package com.doudian.open.api.material_searchMaterial.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class MaterialInfoListItem {


	@SerializedName("material_id")
	@OpField(desc = "素材id", example = "7000291764753940780")
	private String materialId;

	@SerializedName("folder_id")
	@OpField(desc = "父文件夹id", example = "6999834643465781548")
	private String folderId;

	@SerializedName("origin_url")
	@OpField(desc = "创建素材时传入的url", example = "")
	private String originUrl;

	@SerializedName("byte_url")
	@OpField(desc = "素材中心返回的url，该字段只对图片有效；如果想获取视频播放信息，请参考video_info/vid字段介绍", example = "")
	private String byteUrl;

	@SerializedName("material_name")
	@OpField(desc = "素材名称", example = "素材名")
	private String materialName;

	@SerializedName("material_type")
	@OpField(desc = "photo-图片 video-视频", example = "photo")
	private String materialType;

	@SerializedName("operate_status")
	@OpField(desc = "素材状态，0-待下载 1-有效 4-回收站中 6-已删除", example = "1")
	private Integer operateStatus;

	@SerializedName("audit_status")
	@OpField(desc = "审核状态 1-待审核 2-审核中 3-通过 4-拒绝", example = "1")
	private Integer auditStatus;

	@SerializedName("audit_reject_desc")
	@OpField(desc = "审核失败的原因", example = "不符合")
	private String auditRejectDesc;

	@SerializedName("size")
	@OpField(desc = "文件大小，单位KB", example = "1234")
	private Long size;

	@SerializedName("create_time")
	@OpField(desc = "创建素材的时间，格式：yyyy-MM-dd HH:mm:ss", example = "2021-08-12 12:00:12")
	private String createTime;

	@SerializedName("update_time")
	@OpField(desc = "最近一次更新素材的时间，格式：yyyy-MM-dd HH:mm:ss", example = "2021-08-12 12:00:12")
	private String updateTime;

	@SerializedName("delete_time")
	@OpField(desc = "移动到回收站的时间，格式：yyyy-MM-dd HH:mm:ss", example = "2021-08-12 12:00:12")
	private String deleteTime;

	@SerializedName("photoInfo")
	@OpField(desc = "图片信息", example = "图片信息")
	private PhotoInfo photoInfo;

	@SerializedName("videoInfo")
	@OpField(desc = "视频信息", example = "")
	private VideoInfo videoInfo;


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

	
	public void setMaterialName(String materialName){
		this.materialName = materialName;
	}

	
	public String getMaterialName(){
		return this.materialName;
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

}