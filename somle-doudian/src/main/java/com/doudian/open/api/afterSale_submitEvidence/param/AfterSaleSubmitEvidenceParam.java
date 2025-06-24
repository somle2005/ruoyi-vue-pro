package com.doudian.open.api.afterSale_submitEvidence.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class AfterSaleSubmitEvidenceParam {


	@SerializedName("aftersale_id")
	@OpField(required = true , desc = "售后单ID ，通过[/trade/refundListSearch](https://op.jinritemai.com/docs/api-docs/17/254) 或者 [/afterSale/refundProcessDetail](https://op.jinritemai.com/docs/api-docs/17/96) 获取  ", example= "1122")
	private Long aftersaleId;

	@SerializedName("comment")
	@OpField(required = true , desc = "备注", example= "备注")
	private String comment;

	@SerializedName("evidence")
	@OpField(required = true , desc = "[https://xxxx.jpg](https://xxxx.jpg/) | 凭证，最多四张", example= "[https://xxxx.jpg]")
	private List<String> evidence;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAftersaleId(Long aftersaleId){
		this.aftersaleId = aftersaleId;
	}

	
	public Long getAftersaleId(){
		return this.aftersaleId;
	}

	
	public void setComment(String comment){
		this.comment = comment;
	}

	
	public String getComment(){
		return this.comment;
	}

	
	public void setEvidence(List<String> evidence){
		this.evidence = evidence;
	}

	
	public List<String> getEvidence(){
		return this.evidence;
	}

}