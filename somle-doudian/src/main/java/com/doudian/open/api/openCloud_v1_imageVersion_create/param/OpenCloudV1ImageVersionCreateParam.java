package com.doudian.open.api.openCloud_v1_imageVersion_create.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OpenCloudV1ImageVersionCreateParam {


	@SerializedName("cs_id")
	@OpField(required = true , desc = "容器服务id", example= "7239708175753249068")
	private String csId;

	@SerializedName("version_name")
	@OpField(required = true , desc = "版本名称", example= "v1.0")
	private String versionName;

	@SerializedName("remark")
	@OpField(required = true , desc = "备注", example= "测试")
	private String remark;

	@SerializedName("file_uri")
	@OpField(required = true , desc = "程序包上传素材中心后返回的uri", example= "http://p-ecom-open-boe-sign.bytedance.net/tos-boe-i-39cvtodz2w/1bc0a0ad0abf4b06abd4161064d99050.jar?x-orig-authkey=ak39cvtodz2w&x-orig-expires=1685623279&x-orig-sign=DXC0yu4DmMiQFRPKzsbhMP%2B1sLI%3D")
	private String fileUri;

	@SerializedName("file_name")
	@OpField(required = true , desc = "文件名称", example= "demo.jar")
	private String fileName;

	@SerializedName("cs_name")
	@OpField(required = true , desc = "容器名称", example= "mar-pod")
	private String csName;

	@SerializedName("volc_account_id")
	@OpField(required = false , desc = "如果是强管控、跨境、微应用等租户，需要传火山账号id", example= "2100384108")
	private Long volcAccountId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCsId(String csId){
		this.csId = csId;
	}

	
	public String getCsId(){
		return this.csId;
	}

	
	public void setVersionName(String versionName){
		this.versionName = versionName;
	}

	
	public String getVersionName(){
		return this.versionName;
	}

	
	public void setRemark(String remark){
		this.remark = remark;
	}

	
	public String getRemark(){
		return this.remark;
	}

	
	public void setFileUri(String fileUri){
		this.fileUri = fileUri;
	}

	
	public String getFileUri(){
		return this.fileUri;
	}

	
	public void setFileName(String fileName){
		this.fileName = fileName;
	}

	
	public String getFileName(){
		return this.fileName;
	}

	
	public void setCsName(String csName){
		this.csName = csName;
	}

	
	public String getCsName(){
		return this.csName;
	}

	
	public void setVolcAccountId(Long volcAccountId){
		this.volcAccountId = volcAccountId;
	}

	
	public Long getVolcAccountId(){
		return this.volcAccountId;
	}

}