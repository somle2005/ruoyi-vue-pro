package com.doudian.open.api.antispam_orderSend.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AntispamOrderSendData {


	@SerializedName("decision")
	@OpField(desc = "决策", example = "-")
	private Decision decision;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setDecision(Decision decision){
		this.decision = decision;
	}

	
	public Decision getDecision(){
		return this.decision;
	}

}