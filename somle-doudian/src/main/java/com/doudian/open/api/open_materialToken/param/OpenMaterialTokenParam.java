package com.doudian.open.api.open_materialToken.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OpenMaterialTokenParam {


	@SerializedName("upload_num")
	@OpField(required = true , desc = "需要上传的素材数量", example= "2")
	private Long uploadNum;

	@SerializedName("file_extension")
	@OpField(required = false , desc = "文件后缀名称，必须以.开头", example= ".xlsx")
	private String fileExtension;

	@SerializedName("biz_type")
	@OpField(required = false , desc = "业务类型，  1: 素材中心 。 2: ImageX", example= "2")
	private Integer bizType;

	@SerializedName("store_keys_array_json")
	@OpField(required = false , desc = "当 biz_type 为 2，则可以自定义路径名", example= "666/1.jpg")
	private String storeKeysArrayJson;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setUploadNum(Long uploadNum){
		this.uploadNum = uploadNum;
	}

	
	public Long getUploadNum(){
		return this.uploadNum;
	}

	
	public void setFileExtension(String fileExtension){
		this.fileExtension = fileExtension;
	}

	
	public String getFileExtension(){
		return this.fileExtension;
	}

	
	public void setBizType(Integer bizType){
		this.bizType = bizType;
	}

	
	public Integer getBizType(){
		return this.bizType;
	}

	
	public void setStoreKeysArrayJson(String storeKeysArrayJson){
		this.storeKeysArrayJson = storeKeysArrayJson;
	}

	
	public String getStoreKeysArrayJson(){
		return this.storeKeysArrayJson;
	}

}