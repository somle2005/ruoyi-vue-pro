package com.doudian.open.api.buyin_promotionStrategyList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class KolInfosItem {


	@SerializedName("buyin_id")
	@OpField(desc = "百应ID", example = "70987654321")
	private Long buyinId;

	@SerializedName("avatar_url")
	@OpField(desc = "达人头像", example = "http://alliance.jinritemai.com/")
	private String avatarUrl;

	@SerializedName("account_name")
	@OpField(desc = "达人昵称", example = "测试达人")
	private String accountName;

	@SerializedName("add_time")
	@OpField(desc = "添加时间", example = "2020-05-19 00:00:00")
	private String addTime;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setBuyinId(Long buyinId){
		this.buyinId = buyinId;
	}

	
	public Long getBuyinId(){
		return this.buyinId;
	}

	
	public void setAvatarUrl(String avatarUrl){
		this.avatarUrl = avatarUrl;
	}

	
	public String getAvatarUrl(){
		return this.avatarUrl;
	}

	
	public void setAccountName(String accountName){
		this.accountName = accountName;
	}

	
	public String getAccountName(){
		return this.accountName;
	}

	
	public void setAddTime(String addTime){
		this.addTime = addTime;
	}

	
	public String getAddTime(){
		return this.addTime;
	}

}