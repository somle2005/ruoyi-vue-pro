package com.doudian.open.api.product_listV2.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class RectificationInfo {


	@SerializedName("pic_list")
	@OpField(desc = "整改图片明细", example = "")
	private List<PicListItem> picList;

	@SerializedName("sku_list")
	@OpField(desc = "整改sku明细", example = "")
	private List<SkuListItem> skuList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPicList(List<PicListItem> picList){
		this.picList = picList;
	}

	
	public List<PicListItem> getPicList(){
		return this.picList;
	}

	
	public void setSkuList(List<SkuListItem> skuList){
		this.skuList = skuList;
	}

	
	public List<SkuListItem> getSkuList(){
		return this.skuList;
	}

}