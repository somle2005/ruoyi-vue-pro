package com.doudian.open.api.product_listV2.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AuditRejectSuggestion {


	@SerializedName("pic34_suggestion")
	@OpField(desc = "34主图建议", example = "")
	private Pic34Suggestion pic34Suggestion;

	@SerializedName("pic_suggestion")
	@OpField(desc = "1:1主图建议", example = "")
	private PicSuggestion picSuggestion;

	@SerializedName("name_suggestion")
	@OpField(desc = "标题建议", example = "")
	private NameSuggestion nameSuggestion;

	@SerializedName("reject_reason")
	@OpField(desc = "驳回原因", example = "驳回原因")
	private String rejectReason;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPic34Suggestion(Pic34Suggestion pic34Suggestion){
		this.pic34Suggestion = pic34Suggestion;
	}

	
	public Pic34Suggestion getPic34Suggestion(){
		return this.pic34Suggestion;
	}

	
	public void setPicSuggestion(PicSuggestion picSuggestion){
		this.picSuggestion = picSuggestion;
	}

	
	public PicSuggestion getPicSuggestion(){
		return this.picSuggestion;
	}

	
	public void setNameSuggestion(NameSuggestion nameSuggestion){
		this.nameSuggestion = nameSuggestion;
	}

	
	public NameSuggestion getNameSuggestion(){
		return this.nameSuggestion;
	}

	
	public void setRejectReason(String rejectReason){
		this.rejectReason = rejectReason;
	}

	
	public String getRejectReason(){
		return this.rejectReason;
	}

}