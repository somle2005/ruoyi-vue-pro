package com.doudian.open.api.antispam_userLogin.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class Decision {


	@SerializedName("decision")
	@OpField(desc = "动作", example = "BLOCK")
	private String decision;

	@SerializedName("decision_detail")
	@OpField(desc = "详情", example = "Too many incorrect attempts")
	private String decisionDetail;

	@SerializedName("hit_status")
	@OpField(desc = "状态", example = "hit")
	private String hitStatus;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setDecision(String decision){
		this.decision = decision;
	}

	
	public String getDecision(){
		return this.decision;
	}

	
	public void setDecisionDetail(String decisionDetail){
		this.decisionDetail = decisionDetail;
	}

	
	public String getDecisionDetail(){
		return this.decisionDetail;
	}

	
	public void setHitStatus(String hitStatus){
		this.hitStatus = hitStatus;
	}

	
	public String getHitStatus(){
		return this.hitStatus;
	}

}