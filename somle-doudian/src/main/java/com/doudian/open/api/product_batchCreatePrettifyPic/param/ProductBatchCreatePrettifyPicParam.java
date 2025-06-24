package com.doudian.open.api.product_batchCreatePrettifyPic.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductBatchCreatePrettifyPicParam {


	@SerializedName("prettify_pic_data_list")
	@OpField(required = true , desc = "数组 用于批量构建图片。每批需要小于5", example= "")
	private List<PrettifyPicDataListItem> prettifyPicDataList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPrettifyPicDataList(List<PrettifyPicDataListItem> prettifyPicDataList){
		this.prettifyPicDataList = prettifyPicDataList;
	}

	
	public List<PrettifyPicDataListItem> getPrettifyPicDataList(){
		return this.prettifyPicDataList;
	}

}