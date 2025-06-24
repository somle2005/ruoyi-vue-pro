package com.doudian.open.api.coupons_abandon.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CouponsAbandonParam {


	@SerializedName("cert_no")
	@OpField(required = true , desc = "卡号券码", example= "12314123")
	private String certNo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCertNo(String certNo){
		this.certNo = certNo;
	}

	
	public String getCertNo(){
		return this.certNo;
	}

}