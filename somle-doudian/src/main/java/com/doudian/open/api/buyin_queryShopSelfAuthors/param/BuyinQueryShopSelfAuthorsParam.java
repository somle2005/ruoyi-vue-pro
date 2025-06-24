package com.doudian.open.api.buyin_queryShopSelfAuthors.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class BuyinQueryShopSelfAuthorsParam {


	@SerializedName("page")
	@OpField(required = false , desc = "分页 从1开始", example= "1")
	private Long page;

	@SerializedName("page_size")
	@OpField(required = false , desc = "分页大小 最大20", example= "10")
	private Long pageSize;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPage(Long page){
		this.page = page;
	}

	
	public Long getPage(){
		return this.page;
	}

	
	public void setPageSize(Long pageSize){
		this.pageSize = pageSize;
	}

	
	public Long getPageSize(){
		return this.pageSize;
	}

}