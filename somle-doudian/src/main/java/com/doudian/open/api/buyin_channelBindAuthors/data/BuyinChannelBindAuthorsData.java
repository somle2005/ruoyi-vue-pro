package com.doudian.open.api.buyin_channelBindAuthors.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class BuyinChannelBindAuthorsData {


	@SerializedName("is_all")
	@OpField(desc = "是否绑定了全部达人/全部店播达人", example = "false")
	private Boolean isAll;

	@SerializedName("total")
	@OpField(desc = "绑定的达人数量", example = "20")
	private Long total;

	@SerializedName("authors")
	@OpField(desc = "绑定的达人信息", example = "")
	private List<AuthorsItem> authors;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setIsAll(Boolean isAll){
		this.isAll = isAll;
	}

	
	public Boolean getIsAll(){
		return this.isAll;
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