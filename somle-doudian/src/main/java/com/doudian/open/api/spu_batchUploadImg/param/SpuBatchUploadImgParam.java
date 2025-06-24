package com.doudian.open.api.spu_batchUploadImg.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SpuBatchUploadImgParam {


	@SerializedName("image_url_list")
	@OpField(required = true , desc = "图片列表", example= "")
	private List<ImageUrlListItem> imageUrlList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setImageUrlList(List<ImageUrlListItem> imageUrlList){
		this.imageUrlList = imageUrlList;
	}

	
	public List<ImageUrlListItem> getImageUrlList(){
		return this.imageUrlList;
	}

}