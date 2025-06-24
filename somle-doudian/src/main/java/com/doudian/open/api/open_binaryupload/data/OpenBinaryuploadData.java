package com.doudian.open.api.open_binaryupload.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OpenBinaryuploadData {


	@SerializedName("store_uri")
	@OpField(desc = "上传二进制文件的uri", example = "tos-cn-i-7veqoeduo3/fb4613ec70694bf2ad0c548e946af583")
	private String storeUri;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setStoreUri(String storeUri){
		this.storeUri = storeUri;
	}

	
	public String getStoreUri(){
		return this.storeUri;
	}

}