package com.doudian.open.api.buyin_channelBindAuthors.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AuthorsItem {


	@SerializedName("author_app")
	@OpField(desc = "达人帐号的客户端1128：抖音2329：抖音极速版1112：火山13：头条", example = "1128")
	private Long authorApp;

	@SerializedName("author_id")
	@OpField(desc = "达人uid", example = "123456789")
	private Long authorId;

	@SerializedName("author_type")
	@OpField(desc = "0:店铺官方帐号 1:店铺渠道授权帐号 2: 普通达人帐号", example = "1")
	private Integer authorType;

	@SerializedName("buyin_id")
	@OpField(desc = "达人的百应id", example = "123456789")
	private Long buyinId;

	@SerializedName("account_name")
	@OpField(desc = "账户名称", example = "测试账户")
	private String accountName;

	@SerializedName("avatar_url")
	@OpField(desc = "达人头像", example = "https://www.")
	private String avatarUrl;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAuthorApp(Long authorApp){
		this.authorApp = authorApp;
	}

	
	public Long getAuthorApp(){
		return this.authorApp;
	}

	
	public void setAuthorId(Long authorId){
		this.authorId = authorId;
	}

	
	public Long getAuthorId(){
		return this.authorId;
	}

	
	public void setAuthorType(Integer authorType){
		this.authorType = authorType;
	}

	
	public Integer getAuthorType(){
		return this.authorType;
	}

	
	public void setBuyinId(Long buyinId){
		this.buyinId = buyinId;
	}

	
	public Long getBuyinId(){
		return this.buyinId;
	}

	
	public void setAccountName(String accountName){
		this.accountName = accountName;
	}

	
	public String getAccountName(){
		return this.accountName;
	}

	
	public void setAvatarUrl(String avatarUrl){
		this.avatarUrl = avatarUrl;
	}

	
	public String getAvatarUrl(){
		return this.avatarUrl;
	}

}