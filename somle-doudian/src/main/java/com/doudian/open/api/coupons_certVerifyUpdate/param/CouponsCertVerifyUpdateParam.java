package com.doudian.open.api.coupons_certVerifyUpdate.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CouponsCertVerifyUpdateParam {


	@SerializedName("cert_no")
	@OpField(required = true , desc = "卡号券码", example= "123456")
	private String certNo;

	@SerializedName("update_time")
	@OpField(required = true , desc = "更新时间", example= "2021-03-04 00:00:00")
	private String updateTime;

	@SerializedName("update_verify_count")
	@OpField(required = true , desc = "更新核销次数", example= "4")
	private Long updateVerifyCount;

	@SerializedName("batch_no")
	@OpField(required = true , desc = "幂等请求编号", example= "1231414234245")
	private String batchNo;

	@SerializedName("extra")
	@OpField(required = false , desc = "额外信息", example= "扩展信息")
	private String extra;


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

	
	public void setUpdateTime(String updateTime){
		this.updateTime = updateTime;
	}

	
	public String getUpdateTime(){
		return this.updateTime;
	}

	
	public void setUpdateVerifyCount(Long updateVerifyCount){
		this.updateVerifyCount = updateVerifyCount;
	}

	
	public Long getUpdateVerifyCount(){
		return this.updateVerifyCount;
	}

	
	public void setBatchNo(String batchNo){
		this.batchNo = batchNo;
	}

	
	public String getBatchNo(){
		return this.batchNo;
	}

	
	public void setExtra(String extra){
		this.extra = extra;
	}

	
	public String getExtra(){
		return this.extra;
	}

}