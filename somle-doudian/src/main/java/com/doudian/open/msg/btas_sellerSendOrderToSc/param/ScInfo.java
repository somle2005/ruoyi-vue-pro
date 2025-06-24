package com.doudian.open.msg.btas_sellerSendOrderToSc.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ScInfo {


	@SerializedName("sc_addr")
	@OpField(required = false , desc = "质检机构地址", example= "浙江省杭州市")
	private String scAddr;

	@SerializedName("sc_id")
	@OpField(required = false , desc = "质检机构ID", example= "2")
	private Long scId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setScAddr(String scAddr){
		this.scAddr = scAddr;
	}

	
	public String getScAddr(){
		return this.scAddr;
	}

	
	public void setScId(Long scId){
		this.scId = scId;
	}

	
	public Long getScId(){
		return this.scId;
	}

}