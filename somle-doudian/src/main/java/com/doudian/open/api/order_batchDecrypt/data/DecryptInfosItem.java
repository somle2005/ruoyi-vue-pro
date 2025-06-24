package com.doudian.open.api.order_batchDecrypt.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class DecryptInfosItem {


	@SerializedName("auth_id")
	@OpField(desc = "业务标识；解密抖音官方密文数据使用订单号即可。如果开发者使用【/order/batchEncrypt】加密接口自定义auth_id值，需要传自己定义的标识。", example = "4933609365066313446")
	private String authId;

	@SerializedName("cipher_text")
	@OpField(desc = "密文值，具体内容参考[数据安全加密对接文档](https://op.jinritemai.com/docs/guide-docs/56/589)", example = "$c0qBj0QrZm9qae50eoBTInPj8PWvCjUyafxWt5cELI0=$pExhpmm6cJ5VuSkvduc3QrdA4THYUZjuoENdITyvkWbRm44PiY8HsHWEXzxQ77kBM7xzNMxoLzfIUnxxxJ/P6uautZu7FjzmjUAkXvbFWlM+*CgkIARCtHCABKAESPgo82qRAg0QjFELjtKxb8xUtm1YUGo6/9spO0OEG2j7RCutuqWHOYJpEdvPZIqsirv5F4byTrHMVDwn+9Bz4GgA=$1$$,#ML3B#0BB1W4adLHYf+1s8VI3eLeeK0Kq0kc8zLLZ0B9WFvKWLZHIU5mf2HF23PCR+z0aYj7R7CCv6DymAy8Mzpa+olZkPYr1PoWmJ*CgkIARCtHCABKAESPgo8YToGx4Xhzb2dDxYMRP1ZEDGC+8STVmEMRed/naetKeJTUXwnWv0P3lgEgPPP/UFHZ2LTzUKIX2ticBvHGgA=#1##")
	private String cipherText;

	@SerializedName("decrypt_text")
	@OpField(desc = "解密后明文信息；手机号场景下规则：当is_virtual_tel=fasle时，decrypt_text返回值明文手机号，当is_virtual_tel=true时，并且解密入参是手机号时，decrypt_text返回值为虚拟号主机(phone_no_a)-虚拟号分机号(phone_no_b)的拼接值，返回示例值：”18400913965-7576”", example = "12317428564")
	private String decryptText;

	@SerializedName("err_no")
	@OpField(desc = "错误码", example = "300003")
	private Long errNo;

	@SerializedName("err_msg")
	@OpField(desc = "错误描述", example = "解密失败：当前密文不属于信封加密的数据")
	private String errMsg;

	@SerializedName("data_type")
	@OpField(desc = "加密类型 1、 地址加密类型 2、 姓名加密类型 3、 手机号加密类型 4、身份证类型 5、手机号加密类型(不会返回虚拟号)", example = "1")
	private Long dataType;

	@SerializedName("is_virtual_tel")
	@OpField(desc = "手机号描述；false-真实手机号，true-虚拟手机号", example = "false")
	private Boolean isVirtualTel;

	@SerializedName("expire_time")
	@OpField(desc = "虚拟号过期时间（商家自有呼叫中心记录，在到期后还需要则再次请求获取）", example = "1653396024")
	private Long expireTime;

	@SerializedName("phone_no_a")
	@OpField(desc = "虚拟号主机号；当is_virtual_tel=true时，有值返回，当is_virtual_tel=fasle时，返回为空；", example = "12317428564")
	private String phoneNoA;

	@SerializedName("phone_no_b")
	@OpField(desc = "虚拟号分机号；当is_virtual_tel=true时，有值返回，当is_virtual_tel=fasle时，返回为空；", example = "5643")
	private String phoneNoB;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAuthId(String authId){
		this.authId = authId;
	}

	
	public String getAuthId(){
		return this.authId;
	}

	
	public void setCipherText(String cipherText){
		this.cipherText = cipherText;
	}

	
	public String getCipherText(){
		return this.cipherText;
	}

	
	public void setDecryptText(String decryptText){
		this.decryptText = decryptText;
	}

	
	public String getDecryptText(){
		return this.decryptText;
	}

	
	public void setErrNo(Long errNo){
		this.errNo = errNo;
	}

	
	public Long getErrNo(){
		return this.errNo;
	}

	
	public void setErrMsg(String errMsg){
		this.errMsg = errMsg;
	}

	
	public String getErrMsg(){
		return this.errMsg;
	}

	
	public void setDataType(Long dataType){
		this.dataType = dataType;
	}

	
	public Long getDataType(){
		return this.dataType;
	}

	
	public void setIsVirtualTel(Boolean isVirtualTel){
		this.isVirtualTel = isVirtualTel;
	}

	
	public Boolean getIsVirtualTel(){
		return this.isVirtualTel;
	}

	
	public void setExpireTime(Long expireTime){
		this.expireTime = expireTime;
	}

	
	public Long getExpireTime(){
		return this.expireTime;
	}

	
	public void setPhoneNoA(String phoneNoA){
		this.phoneNoA = phoneNoA;
	}

	
	public String getPhoneNoA(){
		return this.phoneNoA;
	}

	
	public void setPhoneNoB(String phoneNoB){
		this.phoneNoB = phoneNoB;
	}

	
	public String getPhoneNoB(){
		return this.phoneNoB;
	}

}