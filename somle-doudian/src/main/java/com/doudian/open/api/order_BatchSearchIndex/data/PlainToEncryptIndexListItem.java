package com.doudian.open.api.order_BatchSearchIndex.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PlainToEncryptIndexListItem {


	@SerializedName("plain")
	@OpField(desc = "明文", example = "13117428564")
	private String plain;

	@SerializedName("search_index")
	@OpField(desc = "索引串", example = "asdfsadfasdfasdasf")
	private String searchIndex;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPlain(String plain){
		this.plain = plain;
	}

	
	public String getPlain(){
		return this.plain;
	}

	
	public void setSearchIndex(String searchIndex){
		this.searchIndex = searchIndex;
	}

	
	public String getSearchIndex(){
		return this.searchIndex;
	}

}