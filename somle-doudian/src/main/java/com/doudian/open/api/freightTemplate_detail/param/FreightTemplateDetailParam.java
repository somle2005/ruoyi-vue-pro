package com.doudian.open.api.freightTemplate_detail.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class FreightTemplateDetailParam {


	@SerializedName("freight_id")
	@OpField(required = true , desc = "模板id", example= "3748974")
	private Long freightId;

	@SerializedName("query_option")
	@OpField(required = false , desc = "查询请求", example= "")
	private QueryOption queryOption;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setFreightId(Long freightId){
		this.freightId = freightId;
	}

	
	public Long getFreightId(){
		return this.freightId;
	}

	
	public void setQueryOption(QueryOption queryOption){
		this.queryOption = queryOption;
	}

	
	public QueryOption getQueryOption(){
		return this.queryOption;
	}

}