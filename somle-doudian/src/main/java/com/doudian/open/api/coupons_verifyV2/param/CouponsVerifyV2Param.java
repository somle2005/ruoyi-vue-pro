package com.doudian.open.api.coupons_verifyV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class CouponsVerifyV2Param {


	@SerializedName("cert_no")
	@OpField(required = true , desc = "卡券号码", example= "123456")
	private String certNo;

	@SerializedName("verify_time")
	@OpField(required = false , desc = "核销时间", example= "2021-03-04 00:00：00")
	private String verifyTime;

	@SerializedName("batch_no")
	@OpField(required = false , desc = "幂等请求id", example= "3")
	private String batchNo;

	@SerializedName("verify_count")
	@OpField(required = false , desc = "当次核销的次数", example= "12345")
	private Long verifyCount;

	@SerializedName("cert_key")
	@OpField(required = false , desc = "卡券密码", example= "12345")
	private String certKey;

	@SerializedName("cert_type")
	@OpField(required = false , desc = "卡券类型：0-三方卡券，1-即时零售提货券，默认是0", example= "123")
	private Long certType;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店Id（提货券核销必传）", example= "123")
	private Long storeId;

	@SerializedName("verify_order_id")
	@OpField(required = false , desc = "三方订单Id", example= "123123")
	private String verifyOrderId;

	@SerializedName("check_verify_order_id")
	@OpField(required = false , desc = "是否检查订单Id（verify_order_id）和卡券号码（cert_no）的关联关系", example= "false")
	private Boolean checkVerifyOrderId;


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

	
	public void setVerifyTime(String verifyTime){
		this.verifyTime = verifyTime;
	}

	
	public String getVerifyTime(){
		return this.verifyTime;
	}

	
	public void setBatchNo(String batchNo){
		this.batchNo = batchNo;
	}

	
	public String getBatchNo(){
		return this.batchNo;
	}

	
	public void setVerifyCount(Long verifyCount){
		this.verifyCount = verifyCount;
	}

	
	public Long getVerifyCount(){
		return this.verifyCount;
	}

	
	public void setCertKey(String certKey){
		this.certKey = certKey;
	}

	
	public String getCertKey(){
		return this.certKey;
	}

	
	public void setCertType(Long certType){
		this.certType = certType;
	}

	
	public Long getCertType(){
		return this.certType;
	}

	
	public void setStoreId(Long storeId){
		this.storeId = storeId;
	}

	
	public Long getStoreId(){
		return this.storeId;
	}

	
	public void setVerifyOrderId(String verifyOrderId){
		this.verifyOrderId = verifyOrderId;
	}

	
	public String getVerifyOrderId(){
		return this.verifyOrderId;
	}

	
	public void setCheckVerifyOrderId(Boolean checkVerifyOrderId){
		this.checkVerifyOrderId = checkVerifyOrderId;
	}

	
	public Boolean getCheckVerifyOrderId(){
		return this.checkVerifyOrderId;
	}

}