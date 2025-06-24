package com.doudian.open.api.order_PackageProcessSuccess.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CertListItem {


	@SerializedName("cert_no")
	@OpField(required = true , desc = "订单号与上面订单号保持一致", example= "123456")
	private String certNo;

	@SerializedName("status")
	@OpField(required = true , desc = "卡券状态", example= "固定值传2")
	private Long status;

	@SerializedName("grant_time")
	@OpField(required = true , desc = "发券时间,格式:时间戳,0则用当前时间", example= "当前时间戳，秒级")
	private Long grantTime;


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

	
	public void setStatus(Long status){
		this.status = status;
	}

	
	public Long getStatus(){
		return this.status;
	}

	
	public void setGrantTime(Long grantTime){
		this.grantTime = grantTime;
	}

	
	public Long getGrantTime(){
		return this.grantTime;
	}

}