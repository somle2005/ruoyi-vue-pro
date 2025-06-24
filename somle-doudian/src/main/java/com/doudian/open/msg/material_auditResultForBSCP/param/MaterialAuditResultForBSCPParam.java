package com.doudian.open.msg.material_auditResultForBSCP.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class MaterialAuditResultForBSCPParam {


	@SerializedName("video_info")
	@OpField(required = false , desc = "视频信息", example= "")
	private VideoInfo videoInfo;

	@SerializedName("update_time")
	@OpField(required = false , desc = "最近一次更新素材的时间，格式：yyyy-MM-dd HH:mm:ss", example= "2022-01-01 17:23:31")
	private String updateTime;

	@SerializedName("material_type")
	@OpField(required = false , desc = "素材类型 photo-图片 video-视频", example= "photo")
	private String materialType;

	@SerializedName("name")
	@OpField(required = false , desc = "素材名称", example= "xxx.jpg")
	private String name;

	@SerializedName("delete_time")
	@OpField(required = false , desc = "移动到回收站的时间，格式：yyyy-MM-dd HH:mm:ss", example= "2022-01-01 17:23:31")
	private String deleteTime;

	@SerializedName("origin_url")
	@OpField(required = false , desc = "创建素材时传入的url", example= "https://xxx")
	private String originUrl;

	@SerializedName("folder_id")
	@OpField(required = false , desc = "文件夹ID", example= "101")
	private String folderId;

	@SerializedName("byte_url")
	@OpField(required = false , desc = "素材中心返回的url，该字段只对审核通过的图片有效；如果想获取视频播放信息，请参考video_info/vid字段介绍", example= "https://xxx")
	private String byteUrl;

	@SerializedName("operate_status")
	@OpField(required = false , desc = "素材状态，0-待下载 1-有效 4-回收站中 6-已删除", example= "1")
	private Long operateStatus;

	@SerializedName("audit_status")
	@OpField(required = false , desc = "审核状态，3-通过 4-拒绝", example= "4")
	private Long auditStatus;

	@SerializedName("audit_status_desc")
	@OpField(required = false , desc = "审核驳回原因。若url无效则检查url是否可公网访问，若素材库不足请检查素材库容量，若涉嫌违规请检查素材风险", example= "图片涉嫌违规")
	private String auditStatusDesc;

	@SerializedName("size")
	@OpField(required = false , desc = "素材大小，单位KB，图片最大10MB，视频最大200MB", example= "10")
	private Long size;

	@SerializedName("material_id")
	@OpField(required = false , desc = "素材ID", example= "71554047039343004600335")
	private String materialId;

	@SerializedName("create_time")
	@OpField(required = false , desc = "素材创建时间，格式：yyyy-MM-dd HH:mm:ss", example= "2022-01-01 17:23:31")
	private String createTime;

	@SerializedName("photo_info")
	@OpField(required = false , desc = "图片信息", example= "")
	private PhotoInfo photoInfo;

	@SerializedName("supplier_id")
	@OpField(required = false , desc = "供应商ID", example= "12345")
	private String supplierId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setVideoInfo(VideoInfo videoInfo){
		this.videoInfo = videoInfo;
	}

	
	public VideoInfo getVideoInfo(){
		return this.videoInfo;
	}

	
	public void setUpdateTime(String updateTime){
		this.updateTime = updateTime;
	}

	
	public String getUpdateTime(){
		return this.updateTime;
	}

	
	public void setMaterialType(String materialType){
		this.materialType = materialType;
	}

	
	public String getMaterialType(){
		return this.materialType;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setDeleteTime(String deleteTime){
		this.deleteTime = deleteTime;
	}

	
	public String getDeleteTime(){
		return this.deleteTime;
	}

	
	public void setOriginUrl(String originUrl){
		this.originUrl = originUrl;
	}

	
	public String getOriginUrl(){
		return this.originUrl;
	}

	
	public void setFolderId(String folderId){
		this.folderId = folderId;
	}

	
	public String getFolderId(){
		return this.folderId;
	}

	
	public void setByteUrl(String byteUrl){
		this.byteUrl = byteUrl;
	}

	
	public String getByteUrl(){
		return this.byteUrl;
	}

	
	public void setOperateStatus(Long operateStatus){
		this.operateStatus = operateStatus;
	}

	
	public Long getOperateStatus(){
		return this.operateStatus;
	}

	
	public void setAuditStatus(Long auditStatus){
		this.auditStatus = auditStatus;
	}

	
	public Long getAuditStatus(){
		return this.auditStatus;
	}

	
	public void setAuditStatusDesc(String auditStatusDesc){
		this.auditStatusDesc = auditStatusDesc;
	}

	
	public String getAuditStatusDesc(){
		return this.auditStatusDesc;
	}

	
	public void setSize(Long size){
		this.size = size;
	}

	
	public Long getSize(){
		return this.size;
	}

	
	public void setMaterialId(String materialId){
		this.materialId = materialId;
	}

	
	public String getMaterialId(){
		return this.materialId;
	}

	
	public void setCreateTime(String createTime){
		this.createTime = createTime;
	}

	
	public String getCreateTime(){
		return this.createTime;
	}

	
	public void setPhotoInfo(PhotoInfo photoInfo){
		this.photoInfo = photoInfo;
	}

	
	public PhotoInfo getPhotoInfo(){
		return this.photoInfo;
	}

	
	public void setSupplierId(String supplierId){
		this.supplierId = supplierId;
	}

	
	public String getSupplierId(){
		return this.supplierId;
	}

}