package com.doudian.open.api.order_downloadShopAccountItemFile.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderDownloadShopAccountItemFileParam {


	@SerializedName("download_id")
	@OpField(required = true , desc = "下载id，有效期24小时；", example= "DL202111041446472412450342")
	private String downloadId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setDownloadId(String downloadId){
		this.downloadId = downloadId;
	}

	
	public String getDownloadId(){
		return this.downloadId;
	}

}