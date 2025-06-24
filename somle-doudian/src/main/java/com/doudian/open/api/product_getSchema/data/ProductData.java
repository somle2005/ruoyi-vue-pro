package com.doudian.open.api.product_getSchema.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductData {


	@SerializedName("status")
	@OpField(desc = "商品在店铺中状态: 0-在线；1-下线；2-删除；详见商品状态机：https://op.jinritemai.com/docs/question-docs/92/2070", example = "3")
	private Long status;

	@SerializedName("check_status")
	@OpField(desc = "商品审核状态: 1-未提交；2-待审核；3-审核通过；4-审核未通过；5-封禁；7-审核通过待上架；详见商品状态机：https://op.jinritemai.com/docs/question-docs/92/2070", example = "3")
	private Long checkStatus;

	@SerializedName("draft_status")
	@OpField(desc = "草稿状态；0-无草稿,1-未提审,2-待审核,3-审核通过,4-审核未通过。详见：https://op.jinritemai.com/docs/question-docs/92/2070", example = "0")
	private Long draftStatus;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setStatus(Long status){
		this.status = status;
	}

	
	public Long getStatus(){
		return this.status;
	}

	
	public void setCheckStatus(Long checkStatus){
		this.checkStatus = checkStatus;
	}

	
	public Long getCheckStatus(){
		return this.checkStatus;
	}

	
	public void setDraftStatus(Long draftStatus){
		this.draftStatus = draftStatus;
	}

	
	public Long getDraftStatus(){
		return this.draftStatus;
	}

}