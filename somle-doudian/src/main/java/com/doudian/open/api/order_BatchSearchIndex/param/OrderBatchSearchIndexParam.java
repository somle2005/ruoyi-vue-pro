package com.doudian.open.api.order_BatchSearchIndex.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderBatchSearchIndexParam {


	@SerializedName("plain_text_list")
	@OpField(required = true , desc = "明文列表", example= "")
	private List<PlainTextListItem> plainTextList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPlainTextList(List<PlainTextListItem> plainTextList){
		this.plainTextList = plainTextList;
	}

	
	public List<PlainTextListItem> getPlainTextList(){
		return this.plainTextList;
	}

}