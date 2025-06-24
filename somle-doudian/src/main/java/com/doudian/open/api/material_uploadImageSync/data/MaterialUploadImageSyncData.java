package com.doudian.open.api.material_uploadImageSync.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class MaterialUploadImageSyncData {


	@SerializedName("material_id")
	@OpField(desc = "素材id；MaterialId调用【/material/queryMaterialDetail】接口，当audit_status=3时获取byte_url；", example = "7000254886243811628")
	private String materialId;

	@SerializedName("folder_id")
	@OpField(desc = "素材所在文件夹id，0-素材中心的根目录；其他值-表示对应的文件夹id；", example = "2")
	private String folderId;

	@SerializedName("is_new")
	@OpField(desc = "是否是新建，true-新建", example = "true")
	private Boolean isNew;

	@SerializedName("audit_status")
	@OpField(desc = "素材审核状态; 1-等待审核; 2-审核中; 3-通过; 4-拒绝;注意：只有AuditStatus=3时ByteUrl才会返回；", example = "2")
	private Integer auditStatus;

	@SerializedName("byte_url")
	@OpField(desc = "【已下线】新的URL可使用下列方式获取：方式一：可监听【店铺使用doudian_material_auditResultForShop】或【供应商使用doudian_material_auditResultForBSCP】audit_status=3时可以使用byte_url；方式二：根据响应参数MaterialId调用【/material/queryMaterialDetail】接口，当audit_status=3时获取byte_url；", example = "https://xxx.xx")
	private String byteUrl;


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

	
	public void setByteUrl(String byteUrl){
		this.byteUrl = byteUrl;
	}

	
	public String getByteUrl(){
		return this.byteUrl;
	}

}