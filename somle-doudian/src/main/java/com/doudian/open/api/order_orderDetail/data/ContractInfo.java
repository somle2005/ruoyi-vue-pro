package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ContractInfo {


	@SerializedName("contract_id")
	@OpField(desc = "合约ID", example = "62e7af251e41002c")
	private String contractId;

	@SerializedName("mobile_no")
	@OpField(desc = "办理合约的手机号", example = "13888888888")
	private String mobileNo;

	@SerializedName("encrypt_mobile_no")
	@OpField(desc = "办理合约的手机号", example = "13888888888")
	private String encryptMobileNo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setContractId(String contractId){
		this.contractId = contractId;
	}

	
	public String getContractId(){
		return this.contractId;
	}

	
	public void setMobileNo(String mobileNo){
		this.mobileNo = mobileNo;
	}

	
	public String getMobileNo(){
		return this.mobileNo;
	}

	
	public void setEncryptMobileNo(String encryptMobileNo){
		this.encryptMobileNo = encryptMobileNo;
	}

	
	public String getEncryptMobileNo(){
		return this.encryptMobileNo;
	}

}