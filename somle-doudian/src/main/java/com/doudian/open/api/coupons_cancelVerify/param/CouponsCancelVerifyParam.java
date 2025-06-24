package com.doudian.open.api.coupons_cancelVerify.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CouponsCancelVerifyParam {


	@SerializedName("cert_no")
	@OpField(required = true , desc = "卡号券码", example= "231342sdd")
	private String certNo;

	@SerializedName("batch_no")
	@OpField(required = false , desc = "幂等请求编号", example= "123123")
	private String batchNo;

	@SerializedName("cancel_verify_count")
	@OpField(required = false , desc = "取消核销总次数", example= "3")
	private Long cancelVerifyCount;


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

	
	public void setBatchNo(String batchNo){
		this.batchNo = batchNo;
	}

	
	public String getBatchNo(){
		return this.batchNo;
	}

	
	public void setCancelVerifyCount(Long cancelVerifyCount){
		this.cancelVerifyCount = cancelVerifyCount;
	}

	
	public Long getCancelVerifyCount(){
		return this.cancelVerifyCount;
	}

}