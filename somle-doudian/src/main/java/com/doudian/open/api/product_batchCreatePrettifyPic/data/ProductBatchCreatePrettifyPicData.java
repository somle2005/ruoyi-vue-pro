package com.doudian.open.api.product_batchCreatePrettifyPic.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductBatchCreatePrettifyPicData {


	@SerializedName("prettify_pic_list")
	@OpField(desc = "返回内容，与入参顺序对应", example = "")
	private List<PrettifyPicListItem> prettifyPicList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPrettifyPicList(List<PrettifyPicListItem> prettifyPicList){
		this.prettifyPicList = prettifyPicList;
	}

	
	public List<PrettifyPicListItem> getPrettifyPicList(){
		return this.prettifyPicList;
	}

}