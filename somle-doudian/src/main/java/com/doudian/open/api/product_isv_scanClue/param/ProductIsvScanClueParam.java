package com.doudian.open.api.product_isv_scanClue.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductIsvScanClueParam {


	@SerializedName("clue_id")
	@OpField(required = true , desc = "线索Id（游标id）", example= "123")
	private Long clueId;

	@SerializedName("source_channel_code")
	@OpField(required = true , desc = "渠道code，搜索热招：competitive，蓝海：query_none_less，行业趋势：industry_selected，低价：choice_low_price", example= "[query_none_less,industry_selected]")
	private List<String> sourceChannelCode;

	@SerializedName("page_size")
	@OpField(required = true , desc = "限制200", example= "100")
	private Long pageSize;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setClueId(Long clueId){
		this.clueId = clueId;
	}

	
	public Long getClueId(){
		return this.clueId;
	}

	
	public void setSourceChannelCode(List<String> sourceChannelCode){
		this.sourceChannelCode = sourceChannelCode;
	}

	
	public List<String> getSourceChannelCode(){
		return this.sourceChannelCode;
	}

	
	public void setPageSize(Long pageSize){
		this.pageSize = pageSize;
	}

	
	public Long getPageSize(){
		return this.pageSize;
	}

}