package com.doudian.open.api.spu_QuerySpu.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SpuQuerySpuData {


	@SerializedName("total")
	@OpField(desc = "查询到的总数据量", example = "80")
	private Long total;

	@SerializedName("spuList")
	@OpField(desc = "SPU信息", example = "")
	private List<SpuListItem> spuList;


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

	
	public void setSpuList(List<SpuListItem> spuList){
		this.spuList = spuList;
	}

	
	public List<SpuListItem> getSpuList(){
		return this.spuList;
	}

}