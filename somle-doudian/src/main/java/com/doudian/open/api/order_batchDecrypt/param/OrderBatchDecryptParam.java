package com.doudian.open.api.order_batchDecrypt.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderBatchDecryptParam {


	@SerializedName("cipher_infos")
	@OpField(required = true , desc = "待解密值集合，最大支持一次解密50条。待解密的密文列表示例，入参结构{cipher_infos:[{auth_id”:”订单号”,”cipher_text”:”待解密值”},{“auth_id”:”订单号”,”cipher_text”:”待解密值”}]}", example= "")
	private List<CipherInfosItem> cipherInfos;

	@SerializedName("account_id")
	@OpField(required = false , desc = "服务商账号体系中，商户的账户ID，每个ISV下需要保证唯一，可选格式:独立生成的账户唯一标识", example= "dy1001")
	private String accountId;

	@SerializedName("account_type")
	@OpField(required = false , desc = "商户的账户ID类型；服务商账号中的主-main_account；子账号-sub_account；", example= "main_account")
	private String accountType;

	@SerializedName("need_virtual_phone")
	@OpField(required = false , desc = "1表示不走代拍虚拟号逻辑", example= "1")
	private Long needVirtualPhone;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCipherInfos(List<CipherInfosItem> cipherInfos){
		this.cipherInfos = cipherInfos;
	}

	
	public List<CipherInfosItem> getCipherInfos(){
		return this.cipherInfos;
	}

	
	public void setAccountId(String accountId){
		this.accountId = accountId;
	}

	
	public String getAccountId(){
		return this.accountId;
	}

	
	public void setAccountType(String accountType){
		this.accountType = accountType;
	}

	
	public String getAccountType(){
		return this.accountType;
	}

	
	public void setNeedVirtualPhone(Long needVirtualPhone){
		this.needVirtualPhone = needVirtualPhone;
	}

	
	public Long getNeedVirtualPhone(){
		return this.needVirtualPhone;
	}

}