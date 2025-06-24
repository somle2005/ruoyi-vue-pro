package com.doudian.open.api.open_binaryupload.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OpenBinaryuploadParam {


	@SerializedName("file_content")
	@OpField(required = true , desc = "二进制内容，utf-8编码", example= "1234")
	private String fileContent;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setFileContent(String fileContent){
		this.fileContent = fileContent;
	}

	
	public String getFileContent(){
		return this.fileContent;
	}

}