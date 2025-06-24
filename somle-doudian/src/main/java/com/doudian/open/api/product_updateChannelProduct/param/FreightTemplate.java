package com.doudian.open.api.product_updateChannelProduct.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class FreightTemplate {


	@SerializedName("freight_follow_main")
	@OpField(required = false , desc = "渠道品运费模板是否与主品保持一致", example= "true")
	private Boolean freightFollowMain;

	@SerializedName("freight_id")
	@OpField(required = false , desc = "渠道品定制运费模板ID，当设置了freight_follow_main=true时与主品运费模板保持一致；否则需要传渠道品定制运费模板。", example= "0")
	private Long freightId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setFreightFollowMain(Boolean freightFollowMain){
		this.freightFollowMain = freightFollowMain;
	}

	
	public Boolean getFreightFollowMain(){
		return this.freightFollowMain;
	}

	
	public void setFreightId(Long freightId){
		this.freightId = freightId;
	}

	
	public Long getFreightId(){
		return this.freightId;
	}

}