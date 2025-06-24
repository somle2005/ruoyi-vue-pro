package com.doudian.open.api.order_getServiceList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderGetServiceListData {


	@SerializedName("total")
	@OpField(desc = "总数", example = "1122")
	private Long total;

	@SerializedName("list")
	@OpField(desc = "列表", example = "")
	private List<ListItem> list;


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

	
	public void setList(List<ListItem> list){
		this.list = list;
	}

	
	public List<ListItem> getList(){
		return this.list;
	}

}