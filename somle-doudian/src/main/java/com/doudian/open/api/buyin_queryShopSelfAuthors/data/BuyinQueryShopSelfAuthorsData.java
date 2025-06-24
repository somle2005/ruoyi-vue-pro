package com.doudian.open.api.buyin_queryShopSelfAuthors.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class BuyinQueryShopSelfAuthorsData {


	@SerializedName("total")
	@OpField(desc = "总数量", example = "10")
	private Long total;

	@SerializedName("authors")
	@OpField(desc = "达人信息", example = "")
	private List<AuthorsItem> authors;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTotal(Long total){
		this.total = total;
	}

	
	public Long getTotal(){
		return this.total;
	}

	
	public void setAuthors(List<AuthorsItem> authors){
		this.authors = authors;
	}

	
	public List<AuthorsItem> getAuthors(){
		return this.authors;
	}

}