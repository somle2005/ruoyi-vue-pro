package com.doudian.open.api.product_addV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class RecruitInfo {


	@SerializedName("recruit_source")
	@OpField(required = false , desc = "发品源", example= "isv.appid")
	private String recruitSource;

	@SerializedName("recruit_follow_id")
	@OpField(required = true , desc = "线索ID", example= "122332")
	private String recruitFollowId;

	@SerializedName("recruit_type")
	@OpField(required = true , desc = "招商类型", example= "0")
	private String recruitType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setRecruitSource(String recruitSource){
		this.recruitSource = recruitSource;
	}

	
	public String getRecruitSource(){
		return this.recruitSource;
	}

	
	public void setRecruitFollowId(String recruitFollowId){
		this.recruitFollowId = recruitFollowId;
	}

	
	public String getRecruitFollowId(){
		return this.recruitFollowId;
	}

	
	public void setRecruitType(String recruitType){
		this.recruitType = recruitType;
	}

	
	public String getRecruitType(){
		return this.recruitType;
	}

}